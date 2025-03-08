// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n=sc.nextInt();
//       for(int i=1;i<11;i++){
//         System.out.println(i*n);
//       }
//       //output
//       System.out.println("Hello World");
//       System.out.println("*");
//       System.out.println("**");
//       System.out.println("***");
//       System.out.println("****");
//       System.out.println("*****");

//       //variables
//       int a=10;
//       int b = 25;
//       int sum = a +b;
//       System.out.println(sum);
//       int diff = b-a;
//       System.out.println(diff);

//       //for loop
//       //i++ =>i = i + 1
//       for(int i=0;i<10;i++){
//         System.out.println(i);
//       }

//       //while loop
//       int i=0;
//       while(i<11){
//         System.out.println(i);
//         i++;
//       }
      
//       //do-while  atleast 1 time work
//       int o=0;
//       do{
//         System.out.println(o);
//         o=o+1;
//       }while(i<11);
//     }
//   }
    


//patterns

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int n=sc.nextInt();
    //   for(int i=1;i<=n;i++){
    //     System.out.println("*");
    //   }


        // for(int i=0;i<=4;i++){
        //     for(int j=0;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1||j==1||i==4||j==5){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=i;j++){
        //     System.out.print(j+" ");
        //   }
        //   System.out.println();
        // }


        
        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=n-i+1;j++){
        //     System.out.print(j);
        //   }
        //   System.out.println();
        // }


        // int number=1;
        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=i;j++){
        //     System.out.print(number+" ");
        //     number++;
        //   }
        //   System.out.println();
        // }



        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=i;j++){
        //     int sum=i+j;
        //     if(sum%2==0){
        //       System.out.print("1 ");
        //     }
        //     else{
        //       System.out.print("0 ");
        //     }
        //   }
        //   System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //   }
        //   for(int j=1;j<=2*(n-i);j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }
        //   for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //       System.out.print("*");
        //     }
        //     for(int j=1;j<=2*(n-i);j++){
        //       System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //       System.out.print("*");
        //     }
        //   System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1;j<=5;j++){
        //     System.out.print("*");
        //   }
        
        // System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1;j<=i;j++){
        //     System.out.print(i+" ");
        //   }
        //   System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //   for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=i;j>=1;j--){
        //     System.out.print(j);
        //   }
        //   for(int j=2;j<=i;j++){
        //     System.out.print(j);
        //   }
        //   System.out.println();
        // }


    //     for(int i=1;i<=n;i++){
    //       for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //       }
    //       for(int j=1;j<=2*i-1;j++){
    //         System.out.print("*");
    //       }
    //       System.out.println();
    //     }
    //     for(int i=n;i>=1;i--){
    //       for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //       }
    //       for(int j=1;j<=2*i-1;j++){
    //         System.out.print("*");
    //       }
    //       System.out.println();
    //     }
    //   }    
    // }



    //functions
    // import java.util.*; 
    // import java.util.Scanner;
     
    // public class Main {
    //   public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    //   }
    // public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //   int name=sc.nextInt();
    //   printMyName(name);   //call kiya fuction ko


    // public class Main {
    //   public static int calculateSum(int a ,int b){
    //     int sum = a+b;
    //     return sum;
    //   }
    // public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //   int a=sc.nextInt();
    //   int b=sc.nextInt();
    //   int sum = calculateSum(a,b);
    //   System.out.println(sum);


    // public class Main {
    //   public static int calculateProduct(int a ,int b){
    //     int prod = a*b;
    //     return prod;
    //   }
    // public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //   int a=sc.nextInt();
    //   int b=sc.nextInt();
    //   int prod = calculateProduct(a,b);
    //   System.out.println(prod);


  //   public class Main {
  //     public static void calculateFactorial(int n){
  //       if(n<0){
  //         System.out.println("invalid number");
  //         return;
  //       }
  //       int factorial = 1;
  //       for(int i=n;i>1;i--){
  //         factorial = factorial * i;

  //       }
  //       System.out.println(factorial);
  //       return;
  //     }
  //   public static void main(String[] args) {
  //     Scanner sc = new Scanner(System.in);
  //     int n=sc.nextInt();
  //     calculateFactorial(n);
  //   }
  // }



//arrays
import java.util.*; 
public class Main {
    public static void main(String[] args) {
        // int[]marks=new int[3];
        // int marks[]=new int[3];
        // int marks[]={97,98,99}// declared before
        // marks[0]=98;
        // marks[1]=97;
        // marks[2]=92;
        // System.out.println(marks[0]);
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }


        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for(int i=0;i<size;i++){
          numbers[i]=sc.nextInt();
        }
        //find value x
        int x=sc.nextInt();

        // //output
        // for(int i=0;i<size;i++){
        //   System.out.println(numbers[i]);
        // }


         //output(find x index)
         for(int i=0;i<numbers.length;i++){
          if(numbers[i]==x){
            System.out.println("x found at index : "+i);
          }
          
         }
    }}






  


