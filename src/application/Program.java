package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "livro");
		System.out.println(obj);
		
		Seller seller = new Seller(22, "bob", "bob@gmail.com", new Date(), 333.24, obj);
		
		System.out.println(seller);

	}

}
