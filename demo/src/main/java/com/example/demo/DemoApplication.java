package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(DemoApplication.class, args);

         int number,choose;
         double personNumber;
         char character;
         String words;
         boolean must;
         number=1922;
         personNumber=1.70;
         character='M';
         words="Muharrem";
         must=true;
         System.out.println("If you want print select 1,but if you want write select 2");
         System.out.println("Please your choose:");
         Scanner keyboard = new Scanner(System.in);
         choose = keyboard.nextInt();
         if(choose==1) {
             System.out.println(number);
             System.out.println(personNumber);
             System.out.println(character);
             System.out.println(words);
             System.out.println(must);
         }

        }
    }

