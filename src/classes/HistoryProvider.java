/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Car;
import entity.History;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */

public class HistoryProvider {
    Scanner scanner = new Scanner(System.in);
    public History createHistory(List<Car>listCars,List<Customer>listCustomers) {
        History history = new History();
        System.out.println("Список машин: ");
        for (int i = 0; i < listCars.size(); i++) {
            if (listCars.get(i).getCount() > 0) {
                System.out.printf("%d. Марка: %s, модель: %s, дата выпуска: %d, стоимость: %s%n",
                         i + 1,
                         listCars.get(i).getMarka(),
                         listCars.get(i).getModel(),
                         listCars.get(i).getYear(),
                         listCars.get(i).getPrice()
                );
            }
        }
       System.out.print("Выберите номер продаваемой машины:");
        int takeCarNum = scanner.nextInt();
        Car car = listCars.get(takeCarNum-1);
        car.setCount(car.getCount()-1);
        System.out.println("Список клиентов: ");
        int i=0;
        for(Customer r : listCustomers){
            System.out.printf("%d. Имя и фамилия клиента: %s %s, email: %s%n, количество денег: %s%n"
                    ,i+1
                    ,r.getName()
                    ,r.getLastname()
                    ,r.getEmail()
                    ,r.getMoney()
            );
            i++;
        }
            
            System.out.println("Выберите номер клиента: ");
            int customerNum = scanner.nextInt();
            Customer customer = listCustomers.get(customerNum-1);
             customer.setMoney(customer.getMoney()-car.getPrice());
            history.setCar(car);
        history.setCustomer(customer);
        history.setTakeOn(new Date());
        return history;
    }
    
    
    public void returnCar(List<History> listHistories){
        
        System.out.println("Список проданных машин: ");
        int i = 1;
        for(History h : listHistories){
                        if(h.getReturnDate() == null){
                            System.out.println(i+". "+h.toString());
                            i++;
                        }
                    }
                    
        
//        System.out.println("Список проданных машин: ");
//        int i=1;
//        for(History history : listHistories){
//            if(history.getReturnDate() == null 
//                    && history.getCar().getCount() < history.getCar().getQuantity()){
//                System.out.printf("%d. Клиент %s %s купил машину %s %s"
//                    ,i
//                    ,history.getCustomer().getName()
//                    ,history.getCustomer().getLastname()
//                    ,history.getCar().getMarka()
//                     ,history.getCar().getModel()   
//                );
//            }
//            i++;
//        }
//        System.out.println("Выберите возвращаемую машину: ");
//        int numHistory = scanner.nextInt();
//        listHistories.get(numHistory-1).getCar().setCount(listHistories.get(numHistory-1).getCar().getCount()+1);
//        listHistories.get(numHistory-1).setReturnDate(new Date());
//        System.out.println("Машина \""
//                +listHistories.get(numHistory-1).getCar().getMarka()
//                +"\" возвращена. Осталось машин "+listHistories.get(numHistory-1).getCar().getCount()
        //);
    }
}
   



//System.out.println("Выберите возвращаемую машину: ");
//        int numHistory = scanner.nextInt();
//        listHistories.get(numHistory-1).getCar().setCount(listHistories.get(numHistory-1).getCar().getCount()+1);
//        listHistories.get(numHistory-1).setReturnDate(new Date());
//        System.out.println("Машина \"" +listHistories.get(numHistory-1).getCar().getMarka()
//        +"\" возвращена. Осталось машин "+listHistories.get(numHistory-1).getCar().getCount());
//        listHistories.get(numHistory-1).getCastomer().setMoney(listHistories.get(numHistory-1).getCastomer().getMoney()+getCar.getPrice());
//        
//        System.out.println("Деньги \""
//                +listHistories.get(numHistory-1).getCastomer().getMoney()
//                +"\" возвращены. Осталось денег "+ listHistories.get(numHistory-1).getCar().getCount());   
//        
//        
//    }
//}