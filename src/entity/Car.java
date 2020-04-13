/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Car implements Serializable{
    private String marka;
    private String model;
    private int year;
    private int price;
    private int quantity;
    private int count;

    public Car() {
    }

    public Car(String marka, String model, int year, int price, int quantity) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
        this.count = quantity;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCount() {
        return count;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.setCount(quantity - this.quantity + count);
        this.quantity = quantity;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" + "marka=" + marka + ", model=" + model + ", year=" + year + ", price=" + price + ", quantity=" + quantity + ", count=" + count + '}';
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


//
///* To change this license header, choose License Headers in Project Properties.
//
//* To change this template file, choose Tools | Templates
//
//* and open the template in the editor.
//
//*/
//
//package entity;
//
//import java.io.Serializable;
//
//import java.util.Objects;
//
//import javax.persistence.Column;
//
//import javax.persistence.Entity;
//
//import javax.persistence.GeneratedValue;
//
//import javax.persistence.GenerationType;
//
//import javax.persistence.Id;
//
///**
//
//*
//
//* @author 
//
//*/
//
//@Entity
//public class Car implements Serializable {
////private static final long serialVersionUID = 1L;
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long id;
//@Column(unique = true)
//private String marka;
//private String model;
//private Integer year;
//private Integer price;
//private Integer quantity;
//private Integer count;
//public Car() {
//}
//public Car(String marka, String model, Integer year, Integer price, Integer quantity, Integer count) {
//
//this.marka = marka;
//this.model = model;
//this.year = year;
//this.price = price;
//this.quantity = quantity;
//this.count = count;
//}
//public Long getId() {
//return id;
//}
//public void setId(Long id) {
//this.id = id;
//}
//public String getModel() {
//return model;
//}
//public void setModel(String name) {
//this.model = model;
//}
//public String getMarka() {
//return marka;
//}
//public void setMarka(String name) {
//this.marka = marka;
//}
//public Integer getYear() {
//return year;
//}
//public void setYear(String name) {
//this.year = year;
//}
//public Integer getPrice() {
//return price;
//}
//public void setPrice(Integer price) {
//this.price = price;
//}
//public Integer getQuantity() {
//return quantity;
//}
//public void setQuantity(Integer quantity) {
//this.quantity = quantity;
//}
//public Integer getCount() {
//return quantity;
//}
//public void setCount(Integer count) {
////this.quantity = quantity;
//this.count = count;
//}
//
//@Override
//public int hashCode() {
//int hash = 5;
//hash = 89 * hash + Objects.hashCode(this.id);
//hash = 89 * hash + Objects.hashCode(this.marka);
//hash = 89 * hash + Objects.hashCode(this.model);
//hash = 89 * hash + Objects.hashCode(this.year);
//hash = 89 * hash + Objects.hashCode(this.price);
//hash = 89 * hash + Objects.hashCode(this.quantity);
//hash = 89 * hash + Objects.hashCode(this.count);
//return hash;
//}
//@Override
//
//public boolean equals(Object obj) {
//if (this == obj) {
//return true;
//}
//if (obj == null) {
//return false;
//}
//if (getClass() != obj.getClass()) {
//return false;
//}
//final Car other = (Car) obj;
//if (!Objects.equals(this.marka, other.marka)) {
//return false;
//}
//if (!Objects.equals(this.model, other.model)) {
//return false;
//}
//if (!Objects.equals(this.id, other.id)) {
//return false;
//}
//if (!Objects.equals(this.year, other.year)) {
//return false;
//}
//if (!Objects.equals(this.price, other.price)) {
//return false;
//}
//if (!Objects.equals(this.quantity, other.quantity)) {
//return false;
//}
//if (!Objects.equals(this.count, other.count)) {
//return false;
//}
//return true;
//}
//@Override
//public String toString() {
//return "Product{" + "id=" + id + ", marka=" + marka + ", model=" + model + ", year=" + year + ", price=" + price + ", quantity=" + quantity + ", count=" + count +'}';
//
//}
//}
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package entity;
//
//import java.io.Serializable;
//import java.util.Objects;
//import javax.annotation.Generated;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
///**
// *
// * @author User
// */
//@Entity
//public class Car implements Serializable{
//    
//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String marka;
//    private String model;
//    private int year;
//    private int price;
//    //private int quantity;
//    private int count;
//
//    public Car() {
//    }
//
//    public Car(String marka, String model, int year, int price, int quantity) {
//        this.marka = marka;
//        this.model = model;
//        this.year = year;
//        this.price = price;
//        //this.quantity = quantity;
//        //this.count = quantity;
//        this.count = count;
//    }
//
//    public String getMarka() {
//        return marka;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
////    public int getQuantity() {
////        return quantity;
////    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setMarka(String marka) {
//        this.marka = marka;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
////    public void setQuantity(int quantity) {
////        this.setCount(quantity - this.quantity + count);
////        this.quantity = quantity;
////    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//    @Override
//      public String toString() {
//        return "Car{" + "marka=" + marka + ", model=" + model + ", year=" + year + ", price=" + price + ", count=" + count + '}';
//    }
//    
//    
////
////    @Override
////    public String toString() {
////        return "Car{" + "marka=" + marka + ", model=" + model + ", year=" + year + ", price=" + price + ", quantity=" + quantity + ", count=" + count + '}';
////    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 53 * hash + Objects.hashCode(this.id);
//        hash = 53 * hash + Objects.hashCode(this.marka);
//        hash = 53 * hash + Objects.hashCode(this.model);
//        hash = 53 * hash + this.year;
//        //hash = 53 * hash + this.quantity;
//        hash = 53 * hash + this.count;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Car other = (Car) obj;
//        if (this.year != other.year) {
//            return false;
//        }
////        if (this.quantity != other.quantity) {
////            return false;
////        }
//        if (this.count != other.count) {
//            return false;
//        }
//        if (!Objects.equals(this.marka, other.marka)) {
//            return false;
//        }
//        if (!Objects.equals(this.model, other.model)) {
//            return false;
//        }
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//    
//}
