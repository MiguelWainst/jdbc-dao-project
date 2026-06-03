package application;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");

        Seller seller = new Seller(21, "Miguel", "miguel@gmail.com", LocalDate.now(), 727.0, department);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}