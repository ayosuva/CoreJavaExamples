package com.example.package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class LoopsFileTryCatchDate {
    public static void main(String[] args) {

        //Try catch
        try {
            int a=10/0;
        }catch (Exception ex){
            ex.printStackTrace();
        }

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i+2);
        }

        String[] fruit={"apple","mango","orange"};
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

        for(String fruit1:fruit){
            System.out.println(fruit1);
        }

        List<String> list= new ArrayList<>();
        list.add("a");list.add("b");list.add("c");list.add("d");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(String abc: list){
            System.out.println(abc);
        }
        //While Loop
        int num1=1;
        while (num1<10){
            System.out.println(num1);
            num1=num1+1;
        }

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy");

        //String date= simpleDateFormat.format(new SimpleDateFormat("dd/MM/yyyy").parse("08/09/2022"));
        String date= simpleDateFormat.format(new Date());
        System.out.println(date);

        //File write
        File file= new File("report.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.append("Hello World");
            fileWriter.close();

            Scanner scanner= new Scanner(file);
            while(scanner.hasNextLine()){
                String str=scanner.nextLine();
                System.out.println("File content is:"+str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
