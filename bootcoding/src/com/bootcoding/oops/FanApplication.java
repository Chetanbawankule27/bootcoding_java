package com.bootcoding.oops;

import com.bootcoding.oops.FanEncapsulation;

public class FanApplication {

    public static void main(String[] args) {

        FanEncapsulation fe = new FanEncapsulation();
        //fe.speed= 2;
        fe.setSpeed(2);
        System.out.println(fe.getspeed());
       // System.out.println(fe.speed);
        //fe.noofblades = 3;
        fe.setNoofblades(3);
      //  System.out.println(fe.noofblades);
        System.out.println(fe.getNoofblades());
        //fe.Price =2000;
        fe.setPrice(2000);
        System.out.println(fe.getPrice());
        //System.out.println(fe.Price);
        //fe.company= "bajaj";
        fe.setCompany("bajaj");
        System.out.println(fe.getspeed());
     //   System.out.println(fe.company);
        fe.setColour("red");
        System.out.println(fe.colour);
        fe.setWarranty(2);
        System.out.println(fe.getWarranty());

    }
}
