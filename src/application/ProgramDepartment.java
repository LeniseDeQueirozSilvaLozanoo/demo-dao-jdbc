
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartment();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***TEST 1: DEPARTMENT INSERT***\n");
		Department newDepartment = new Department(null, "ADM");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("\n***TEST 2: DEPARTMENT FINDBYID***\n");
		Department department = departmentDao.findById(1);
		System.out.println(department);
	
		System.out.println("\n***TEST 3: DEPARTMENT UPDATE***\n");
		department = departmentDao.findById(5);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n***TEST 4: DEPARTMENT FINDALLT***\n");
		List<Department>list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n***TEST 5: DEPARTMENT DELETE***\n\n"
				+ "Digite quantos departamentos irá deletar e em seguida o/os Id's!");
		List<Integer>deleteList = new ArrayList<>();
		int quant = sc.nextInt();
		
		for(int i = 0; i < quant; i++) {
		deleteList.add(sc.nextInt());
		departmentDao.deleteById(deleteList.get(i));	
		}
		
		System.out.println("Delete completed");
		
	
		sc.close();
	}
}
