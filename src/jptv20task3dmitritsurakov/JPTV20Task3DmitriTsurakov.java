/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task3dmitritsurakov;

import java.util.Scanner;


public class JPTV20Task3DmitriTsurakov {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя и фамилию:");
        String name = scanner.nextLine();
        
        System.out.print("Введите год рождения:");
        String year = scanner.nextLine();
               
        System.out.print("Введите месяц рождения:");
        String month = scanner.nextLine();
        
        System.out.print("Введите день рождения:");
        String day = scanner.nextLine();
        
        System.out.println(name + "родился" + day + "" + month + "" + year + "года");
        
        
               
    }
    
}
