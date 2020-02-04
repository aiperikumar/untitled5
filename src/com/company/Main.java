package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	HashMap<String, String[]> dictiaonary = new HashMap<>();
	dictiaonary.put("beautiful", new String[] {"wondergul", "pretty", "gorgeous", "lovely",});
	dictiaonary.put("bad", new String[] {"evil", "terrible", "awful", "horrible"});
	dictiaonary.put("smart", new String[]{"clever", "intelligent", " brilliant", "wise"});
	dictiaonary.put("stupid", new String[] {"fool", "silly", "bonehead", " dumb" });

        System.out.println("Tape words:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] words = a.split(" ");
        for (String word : words
             ) { String [] values = dictiaonary.get(word);
            if (values!= null){
                Random r = new Random();
                int l = r.nextInt(values.length);
                System.out.println(values[l] + " ");
            }else{
                System.out.println("There's no such a word");
            }

        }


    }
}
