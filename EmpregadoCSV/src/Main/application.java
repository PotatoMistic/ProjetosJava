package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("Entre com o caminho do arquivo: ");
		String path = sc.next();

		System.out.println("Qual salário deseja usar de parametro?");
		Double salarySearch = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				list.add(new Employee(name, email, salary));
				br.readLine();
			}

			System.out.println("Email dos funcionários cujo salario é maior que R$" + salarySearch);
			List<String> emailsList = list.stream()
					.filter(x -> x.getSalary() < salarySearch)
					.map(p -> p.getEmail())
					.sorted().collect(Collectors.toList());

			emailsList.forEach(System.out::println);

			List<Double> salaryList = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.sorted().collect(Collectors.toList());

			Double salarySum = salaryList.stream().reduce(0.0, (x, y) -> x + y);

			System.out.println("Soma dos salários cujos funcionários comecam com 'M': " + salarySum);

		}

		catch (IOException e) {
			System.out.println("Erro no programa: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro no programa: " + e.getMessage());
		}
		sc.close();
	}

}
