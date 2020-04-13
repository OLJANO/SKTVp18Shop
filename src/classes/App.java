///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package classes;
//
//import entity.Customer;
//import entity.Car;
//import entity.History;
//import interfaces.Saveble;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// *
// * @author User
// */
//public class App {
//
//    List<Car> listCars = new ArrayList<>();
//    List<Customer> listCustomers = new ArrayList<>();
//    List<History> listHistories = new ArrayList<>();
// Saveble saveble;
//    public App(String flag) {
//        if(flag.equals("base")){
//            saveble = new SaveToBase();
//        }else if(flag.equals("file")){
//            saveble = new SaveToFile();
//        }else{
//            saveble = new SaveToBase();
//        }
//        
//        listCars = saveble.loadCars();
//        listCustomers = saveble.loadCustomers();
//        listHistories = saveble.loadHistories();
//    }
//        SaveToBase saveToBase = new SaveToBase();
//        listCars = saveToBase.loadCars();
//        listCustomers = saveToBase.loadCustomers();
//        listHistories = saveToBase.loadHistories();
//    }
//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        HistoryProvider historyProvider = new HistoryProvider();
//        //SaveToBase saveToBase = new SaveToBase();
//        boolean flagExit = true;
//        do {
//            System.out.println("Список задач: ");
//            System.out.println("0. Закрыть программу");
//            System.out.println("1. Новая машина");
//            System.out.println("2. Новый клиент");
//            System.out.println("3. Список машин:");
//            System.out.println("4. Список клиентов:");
//            System.out.println("5. Продажа машины");
//            System.out.println("6. Список проданных машин:");
//            System.out.println("Введите номер задачи:");
//            String numberTask = scanner.nextLine();
//            if (null != numberTask) {
//                switch (numberTask) {
//                    case "0":
//                        flagExit = false;
//                        System.out.println("Заканчиваем работу программы");
//                        break;
//                    case "1":
//                        System.out.println("Новая машина.");
//                        CarProvider carProvider = new CarProvider();
//                        Car car = carProvider.createCar();
//                        listCars.add(car);
//                       saveble.saveCars(listCars);
//                        //saveToBase.saveCars(listCars);
//                        for (Car c : listCars) {
//                            System.out.println(c.toString());
//                        }
//                        break;
//                    case "2":
//                        System.out.println("Новый клиент.");
//                        CustomerProvider CustomerProvider = new CustomerProvider();
//                        Customer customer = CustomerProvider.createCustomer();
//                        listCustomers.add(customer);
//                        saveble.saveCustomers(listCustomers);
//                        //saveToBase.saveCustomers(listCustomers);
//                        for (Customer s : listCustomers) {
//                            System.out.println(s.toString());
//                        }
//                        break;
//
//                    case "3":
//                        System.out.println("Список машин:");
//                        int i = 1;
//                        for (Car c : listCars) {
//                            System.out.println(i + ". " + c.toString());
//                            i++;
//                        }
//                        break;
//                    case "4":
//                        System.out.println("Список клиентов:");
//                        for (int j = 0; j < listCustomers.size(); j++) {
//                            System.out.println(j + 1 + ". " + listCustomers.get(j).toString());
//                        }
//                        break;
//                    case "5":
//                        System.out.println("Продажа машины");
//                        History history = historyProvider.createHistory(listCars, listCustomers);
//                        
//                        listHistories.add(history);
//                        //saveToBase.saveHistories(listHistories);
//                        saveble.saveHistories(listHistories);
//                        break;
//                         case "6":
//                        System.out.println("Возвращение машины");
//                    historyProvider.returnCar(listHistories);
//                    saveble.saveHistories(listHistories);
//                    break;
//                    case "7";
//                    System.out.println("Список купленных машин: ");
//                     i=1;
//                    for (History h : listHistories) {
//                    if(h.getReturnDate() == null){
//                            System.out.println(i+". "+h.toString());
//                            i++;
//                        }
//                    }
//                    
//                    if(i < 2){
//                        System.out.println("Нет купленных машин");
//                        System.out.println();
//                    }
//                    break;
//            }
//        }while(flagExit);
//    }
//}
////                        System.out.println(h.getCar().getMarka() + " " + h.getCar().getModel() + ", " + h.getCar().getPrice() + "eur, " + h.getTakeOn() + ", " + h.getCustomer().getName() + " " + h.getCustomer().getLastname() + ", Email: " + h.getCustomer().getEmail());
////                    }
////                    break;
////                
////                default:
////                    System.err.println("?");
////
////            }
////        }
////
////        } while (flagExit);
////}
////}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Car;
import entity.History;
import interfaces.Saveble;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class App {
    List<Car> listCars = new ArrayList<>();
    List<Customer> listCustomers = new ArrayList<>();
    List<History> listHistories = new ArrayList<>();
    public App() {
        SaveToFile saveToFile = new SaveToFile();
        listCars = saveToFile.loadCars();
        listCustomers = saveToFile.loadCustomers();
        listHistories = saveToFile.loadHistories();
    }

   
    public void run(){
        Scanner scanner = new Scanner(System.in);
        
        HistoryProvider historyProvider = new HistoryProvider();
        SaveToFile saveToFile = new SaveToFile();                    
        boolean flagExit = true;
        do{
            System.out.println("Список задач: ");
            System.out.println("0. Закрыть программу");
            System.out.println("1. Новая машина");
            System.out.println("2. Новый клиент");
            System.out.println("3. Список машин:");
            System.out.println("4. Список клиентов:");
            System.out.println("5. Продажа машины");
            //System.out.println("6. Возврат машины:");
            System.out.println("6. Список купленных машин");
            System.out.println("Введите номер задачи:");
            String numberTask = scanner.nextLine();
            if(null != numberTask)
            switch (numberTask) {
                case "0":
                    flagExit = false;
                    System.out.println("Заканчиваем работу программы");
                    break;
                case "1":
                    System.out.println("Новая машина.");
                    CarProvider carProvider = new CarProvider();
                    Car car = carProvider.createCar();
                    listCars.add(car);
                    saveToFile.saveCars(listCars);
                    for(Car c : listCars){
                       System.out.println(c.toString()); 
                    }
                    break;
                case "2":
                    System.out.println("Новый клиент.");
                    CustomerProvider сustomerProvider = new CustomerProvider();
                    Customer сustomer = сustomerProvider.createCustomer();
                    listCustomers.add(сustomer);
                    saveToFile.saveCustomers(listCustomers);
                    for(Customer r : listCustomers){
                       System.out.println(r.toString()); 
                    }
                    break;
                case "3":
                    System.out.println("Список машин:");
                    int i = 1;
                    for(Car c : listCars){
                        System.out.println(i+". "+c.toString());
                        i++;
                    }
                    break;
                case "4":
                    System.out.println("Список клиентов:");
                    for(int j=0;j<listCustomers.size();j++){
                        System.out.println(j+1+". "+listCustomers.get(j).toString());
                    }
                    break;
                case "5":
                    System.out.println("Продаём машину клиенту");
                    
                    History history = historyProvider.createHistory(listCars, listCustomers);
                    if(history != null){
                        listHistories.add(history);
                        saveToFile.saveHistories(listHistories); 
                    }else{
                        
                    }
                     System.out.println("Машина продана");  
                    break;
//                case "6":
//                    System.out.println("Возврат машины");
//                    historyProvider.returnCar(listHistories);
//                    saveToFile.saveHistories(listHistories);
//                    break;
                case "6":
                    System.out.println("Список проданных машин");
                    i = 1;
                    for(History h : listHistories){
                        if(h.getReturnDate() == null){
                            System.out.println(i+". "+h.toString());
                            i++;
                        }
                    }
                    if(i < 2){
                        System.out.println("Нет проданных машин");
                        System.out.println();
                    }
                    break;
            }
        }while(flagExit);
    }
}