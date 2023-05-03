          

          program in java,,
        =====================
        =====================
          1,, // int float string value print in java //

class Main{
    public static void main(String arry[]){

        System.out.print("suraj singh rawat");

    int a=10;
     System.out.println("value of a is" + a);
     
     float f=3.14f;
      System.out.println("value of f is" + f);

     String st = "rawat";
     System.out.println("value of st is" + st);
   }
}
==================================================================
2,,  // area calculet in java //

class Main{
    public static void main(String arry[])
{
int lanth,hight,area;
lanth=30;
hight=20;

area=lanth *hight;
System.out.println("value of area is" + area);
}
}
=====================================================================
3,,  //  user input in java //
import java.util.Scanner;

class Main{
    public static void main(String arry[])
{
int a;
System.out.println("enter a no");
Scanner ob = new Scanner(System.in);
a= ob.nextInt();
System.out.println("you entered"+a);


}
}
=================================================================
4,,  // input 1 number in java //

import java.util.Scanner;

class Main{
    public static void main(String arry[])
{
float a;
System.out.println("enter a no");
Scanner ob = new Scanner(System.in);
a= ob.nextFloat();
System.out.println("you entered"+a);


}
}

===============================================================
5,,  // input 2 number in java //

import java.util.Scanner;

class Main{
    public static void main(String arry[])
{
int a , b ;
Scanner ob = new Scanner(System.in);
System.out.println("enter a no");

a= ob.nextInt();

System.out.println("enter 2 no");
b= ob.nextInt();

System.out.println("you entered  "+a +"  And  " + b);


}
}
===============================================================