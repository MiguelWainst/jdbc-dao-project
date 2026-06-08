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

        System.out.println("=== Teste 1: department findById ===");;
        Department department = departmentDao.findById(2);
        System.out.println(department);

        sc.close();
    }
}