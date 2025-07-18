package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.TaxPayer;
import entities.Company;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers:");
		int amount = sc.nextInt();
		sc.nextLine();
		
		
		List<TaxPayer> taxPayerList = new ArrayList<>();
		
		for(int i=1;i<=amount;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			String choose = sc.next().toLowerCase();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualInComing = sc.nextDouble();
			sc.nextLine();
			
			if(choose.equals("i")) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				
				Individual payer = new Individual(name,anualInComing,healthExpenditures);
				taxPayerList.add(payer);
			}
			
			if(choose.equals("c")) {
				
				System.out.print("Number of employees: ");
				int numberOfEmployers = sc.nextInt();
				sc.nextLine();
				
				Company payer = new Company(name,anualInComing,numberOfEmployers);
				taxPayerList.add(payer);
			}
		}
		
		
		double totalTaxValue = 0;
		System.out.println("\nTAXES PAID:");
		for(TaxPayer tp : taxPayerList) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f",tp.tax()));
			totalTaxValue += tp.tax();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxValue));
		
		
		
	
		
		sc.close();

	}

}
