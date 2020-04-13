/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CustomerProvider {
    public Customer createCustomer(){
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Имя клиента: ");
        customer.setName(scanner.nextLine());
        System.out.println("Фамилия клиента: ");
        customer.setLastname(scanner.nextLine());
        System.out.println("Электронная почта: ");
        customer.setEmail(scanner.nextLine());
        System.out.println("Количество денег: ");
        customer.setMoney(Integer.parseInt(scanner.nextLine()));
        return customer;
        
    }
    
}