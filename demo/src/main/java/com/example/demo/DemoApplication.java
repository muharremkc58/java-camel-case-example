package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(DemoApplication.class, args);
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
         int number,choose;
         float length;
         char character;
         String word;
         boolean must;
         number=1922;
        length=1.70f;
         character='M';
         word="Muharrem";
         must=true;
         System.out.println("If you want print select 1,but if you want write select 2");
         System.out.println("Please your choose:");
         choose = keyboard.nextInt();
         if(choose==1) {
             System.out.println(number);
             System.out.println(length);
             System.out.println(character);
             System.out.println(word);
             System.out.println(must);
         }
         if(choose==2){
             System.out.print("Number:");
             number= keyboard.nextInt();
             System.out.print("Length:");
             length=keyboard.nextFloat();
             System.out.print("Character:");
             character= keyboard.next().charAt(0);
             System.out.print("Word:");
             word= keyboard.next();
               keyboard.close();

         }
        }
    }

