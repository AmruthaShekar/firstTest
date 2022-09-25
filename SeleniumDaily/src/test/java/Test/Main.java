package Test;

import java.util.*; 
import java.io.*;

public class Main {

  public static String MissingDigit(String str) {
    // code goes here  

    String[] split = str.split(str);
    String symbol = split[1];
    String firstNumber = split[0];
    String SecondNumber = split[2];
    String result = split[4];

    int res = Integer.MIN_VALUE;

    String x = "";

    if(firstNumber.contains("x")){

      int resv = Integer.getInteger(result);
      x = firstNumber;
      int second = Integer.getInteger(SecondNumber);

      if(symbol.equals("+"))
        res = resv-second;
      else if(symbol.equals("-"))
        res = resv+second;
      else if(symbol.equals("*"))
        res = resv/second;
      else
        res = resv*second;  
    }else if(firstNumber.contains("x")){

      int resv = Integer.getInteger(result);
      x = SecondNumber;
      int first = Integer.getInteger(firstNumber);
      
      if(symbol.equals("+"))
        res = resv-first;
      else if(symbol.equals("-"))
        res = resv+first;
      else if(symbol.equals("*"))
        res = resv/first;
      else
        res = resv/first;  

    }else{

      x = result;
      int first = Integer.getInteger(firstNumber);
      int second = Integer.getInteger(SecondNumber);

      if(symbol.equals("+"))
        res = first + second;
      else if(symbol.equals("-"))
        res = first - second;
      else if(symbol.equals("*"))
        res = first*second;
      else
        res = first/second;  
    }

    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MissingDigit(s.nextLine())); 
  }

}