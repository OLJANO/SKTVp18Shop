/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Car;
import entity.History;
import entity.Customer;
import java.util.List;

/**
 *
 * @author user
 */
public interface Saveble {
    public void saveCars(List<Car> listCars);
    public List<Car> loadCars();
    public void saveCustomers(List<Customer> listCustomers);
    public List<Customer> loadCustomers();
    public void saveHistories(List<History> listHistories);
    public List<History> loadHistories();
}