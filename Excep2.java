package com.kpmg.exceptions;

class Excep2
{
 public static void main(String[] args)
 {
  try
  {
   int arr[]={5,0,1,2};
      try
      {
     int x=arr[3]/arr[1];
      }
       catch(ArithmeticException ae)
     {
     System.out.println("dont enter zero as denominator");
      }
        arr[4]=3;
  }
  finally
  {
	  System.out.println("conneciton closed");
  }
 }
}
