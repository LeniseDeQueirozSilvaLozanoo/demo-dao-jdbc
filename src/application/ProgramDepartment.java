package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartment();
		System.out.println("***TEST 1: DEPARTMENT INSERT***\n");
		Department newDepartment = new Department(null, "ADM");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("\n***TEST 2: DEPARTMENT FINDBYID***\n");
		Department department = departmentDao.findById(1);
		System.out.println(department);
	
		System.out.println("\n***TEST 2: DEPARTMENT UPDATE***\n");
		department = departmentDao.findById(7);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");
	
	
	}
}
