package application;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 1: seller findById ===");
        Seller seller = sellerDao.findById(8);

        System.out.println(seller);
    }
}