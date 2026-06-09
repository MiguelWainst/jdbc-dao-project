package application;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Teste 1: department findById ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== Teste 2: department findAll ===");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

        System.out.println("\n=== Teste 3: department insert ===");
        Department department1 = new Department(null, "Games");
        departmentDao.insert(department1);
        System.out.println("Inserido novo department de id: " + department1.getName());

        System.out.println("\n=== Teste 4: department deleteById ===");
        System.out.print("Escolha um id para excluir: ");
        int delete = sc.nextInt();
        departmentDao.deleteById(delete);
        System.out.println("Deleted!");

        System.out.println("\n=== Teste 5: seller update ===");
        department = departmentDao.findById(3);
        department.setName("Construction");
        departmentDao.update(department);
        System.out.println("Update completo!");

        sc.close();
    }
}