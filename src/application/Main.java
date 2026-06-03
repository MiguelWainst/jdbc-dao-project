package application;

import model.Department;
import model.Seller;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");

        Seller seller = new Seller(21, "Miguel", "miguel@gmail.com", LocalDate.now(), 727.0, department);

        System.out.println(seller);
    }
}