package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("***TEST 1: SELLER FINDBYID***\n");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n***TEST 2: SELLER FINDBYDEPARTMENT***\n");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n***TEST 3: SELLER FINDALLT***\n");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n***TEST 4: SELLER INSERT***\n");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3750.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n***TEST 5: SELLER UPDATE***\n");
		seller = sellerDao.findById(1);
		seller.setName("Marta Oliveira");
		seller.setEmail("marta@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed");

	}

}
