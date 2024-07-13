package com.company;

import java.util.*;
import java.io.*;
public class Test
{
    public static void main(String args[])
    {
        String text ="mmMNNn";
        String res="";
        String out="";
        int x=0;
        char c = 0;
        Map<String,String> occurence = new HashMap<>();
        for(int i=0;i<text.length();i++)
        {
            for(int j=text.length()-1;j>i;j--)
            {
                if(text.charAt(j)==(text.charAt(i))||(text.charAt(j)==(text.charAt(i)-32))||(text.charAt(j)==(text.charAt(i)+32)))
                {
                    x++;
                    c=text.charAt(j);
                }
            }
            out = out+String.valueOf(c);
            if(x!=0)
            {
                occurence.put("occurence of "+out +" is ",x+" times ");
            }
            x=0;
            out="";
        }
        System.out.println(occurence);
    }
}