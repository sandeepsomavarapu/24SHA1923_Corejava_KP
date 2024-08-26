package com.kpmg.exceptions;

class Excep1
{
	 public static void main(String[] args)
 {
  try
  {
   int arr[]={1,2,3,4};
   arr[2]=10/2;//ArrayIndexOutOfBoundsException
   int a=10;
   int b=2;
   int c=a/b;
   String s=null;
   System.out.println(s.length());
  } 
  catch(ArithmeticException e1)//jvm
  {
	  System.out.println(e1);
   System.out.println("dont enter zero as denominator");
  } 
  catch(ArrayIndexOutOfBoundsException e)
  {
	  System.out.println("please enter valid array index ");
  }
  catch(Exception e)
  {
	  System.out.println("dont know ..... ");
  }
 System.out.println("remaining lines");
 }
}