package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("${app.name}")
    private String name;

    @Value("#{ ${invoice.amount}*0.2}")
    private double invoiceDiscount;
   @Value("#{'Creek Bridge Road'.toUpperCase()}")
    private String Streetname;
   @Value("#{bean2.hobby}")
   private String hobbyName;

   public  void print(){
       System.out.println("Name : "+name);
       System.out.println("DiscountInvoice :"+invoiceDiscount);
       System.out.println("StreetName :"+Streetname);
       System.out.println("HobbyName :"+hobbyName);
   }
}
