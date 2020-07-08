package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartment();
		System.out.println("\n***TEST 1: DEPARTMENT INSERT***\n");
		Department newDepartment = new Department(null, "Baby");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

	}

}
