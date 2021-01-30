package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Data;
import model.exceptions.DataException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de datas a serem criadas");
		int n = sc.nextInt();
		
		List<Data> list = new ArrayList<>();
		
		for(int i = 1; i <= n;i++) {
			try {
			System.out.print("Dia: ");
			int dia = sc.nextInt();
			sc.nextLine();
			System.out.print("Mês: ");
			int mes = sc.nextInt();
			sc.nextLine();
			System.out.print("Ano");
			int ano = sc.nextInt();
			sc.nextLine();
			
			Data d1 = new Data(dia,mes,ano);
			
			list.add(d1);
			}catch(DataException e) {
				System.out.print("Error: " + e.getMessage());
			}
		}
		for(Data d : list) {
			System.out.println(d);
		}
		sc.close();
	}
}
