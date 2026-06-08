package application;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 1: seller findById ===");
        Seller seller = sellerDao.findById(8);
        System.out.println(seller);

        System.out.println("\n=== Teste 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== Teste 3: seller findAll ===");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== Teste 4: seller findAll ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido! Novo id: " + newSeller.getId());

        System.out.println("\n=== Teste 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Update completo!");

        System.out.println("\n=== Teste 6: delete ===");
        System.out.print("Entre com o ID: ");
        int idDelete = sc.nextInt();
        sellerDao.deleteById(idDelete);
        System.out.println("Deletado!");

        sc.close();
    }
}