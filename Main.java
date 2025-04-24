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
// import java.util.*; 
// public class Main {
//     public static void main(String[] args) {
//         int[]marks=new int[3];
//         // int marks[]=new int[3];
//         marks[0]=98;
//         marks[1]=97;
//         marks[2]=92;
//         // System.out.println(marks[0]);
//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);
//         }
        
//     }}



//bit manipulation
// //get
// import java.util.*; 
// public class Main {
//     public static void main(String[] args) {
//       int n=5;
//       int pos=2;
//       int bitMask=1<<pos;

//       if((bitMask & n)==0){
//         System.out.println("bit was zero");
//       }
//       else{
//         System.out.println("bit was one");
//       }
//     }}

//set
// import java.util.*; 
// public class Main {
//     public static void main(String[] args) {
//       int n=5;
//       int pos=1;
//       int bitMask=1<<pos;

//       int newNumber = bitMask | n;
//         System.out.println(newNumber);
//     }}


//clear
// import java.util.*; 
// public class Main {
//     public static void main(String[] args) {
//       int n=5;
//       int pos=2;
//       int bitMask=1<<pos;
//       int notBitMask= ~(bitMask);

//       int newNumber = notBitMask & n;
//         System.out.println(newNumber);
//     }}


//updatE
// import java.util.*; 
// public class Main {
//     public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       int oper = sc.nextInt();
//       // oper=1: set      oper=0:clear
//       int n=5;//0101
//       int pos=1;
//       int bitMask= 1<<pos;

//       if(oper ==1){
//         //set
//         int newNumber=bitMask | n;
//         System.out.println(newNumber);
//       }
//       else{
//         //clear
//         int newBitMask= ~(bitMask);
//         int newNumber=newBitMask & n;
//         System.out.println(newNumber);
//       }
//     }}



//Sorting
//Bubble
// import java.util.*; 
// public class Main {
//   public static void printArray(int arr[]){
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//   }
//     public static void main(String[] args) {
//       int arr[]={7,8,3,1,2};
//       //time complexity=O(n^2)
//       //bubble sort
//       for(int i=0;i<arr.length-1;i++){ //outer loop for rounds  n-1
//         for(int j=0;j<arr.length-i-1;j++){//loop for comparing numbers  
//           if(arr[j]>arr[j+1]){
//             //swap
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//           }

//         }
//       }
//       printArray(arr);

//     }}


//selection sort

// import java.util.*; 
// public class Main {
//   public static void printArray(int arr[]){
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//   }
//     public static void main(String[] args) {
//       int arr[]={7,8,3,1,2};
//        //time complexity=O(n^2)
//       //selection sort
//       for(int i=0;i<arr.length-1;i++){
//         int smallest=i;
//         for(int j=i+1;j<arr.length;j++){
//           if(arr[smallest]>arr[j]){
//             smallest=j;
//           }
//         }
//         int temp =arr[smallest];
//         arr[smallest]=arr[i];
//         arr[i]=temp;
//       }
//     }}


//insertion sort

// import java.util.*; 
// public class Main {
//   public static void printArray(int arr[]){
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//   }
//     public static void main(String[] args) {
//       int arr[]={7,8,3,1,2};
//        //time complexity=O(n^2)
//       //insertion sort
//       for(int i=1;i<arr.length;i++){
//         int current=arr[i];
//         int j=i-1;
//         while(j>=0&& current<arr[j]){
//           arr[j+1]=arr[j];
//           j--;
//         }

//         //placement
//         arr[j+1]=current;
//       }
//     }}












  


