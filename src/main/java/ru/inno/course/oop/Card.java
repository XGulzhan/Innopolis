package ru.inno.course.oop;

public class Card {
 private String number;
 private String date;
 private String cvv;
 private String pinCode;
 public Card(String number, String date, String cvv, String pinCode){
     this.number = number;
     this.date = date;
     this.cvv = cvv;
     this.pinCode = pinCode;
    }
public void maskNumber(){
    System.out.println("**** **** **** "+number.substring(number.length()-4,number.length()));

}

public void pinCode(String enterpinCode){
    if (enterpinCode.equals(pinCode)) {
        System.out.println(number);

    }
    }

}
