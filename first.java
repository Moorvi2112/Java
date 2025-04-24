// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter size of array:");
//         int n=sc.nextInt();
//         int[] array = new int[n];
//         System.out.println("enter "+ n + " elements");
//         for(int i=0;i<n;i++){
//             array[i]=sc.nextInt();
//         }
//         int sum =0;
//         for(int i=0;i<n;i++){
//         sum = sum + array[i];
//     }
//         System.out.println("sum of array is "+sum);
         
//     }
// }

//dec 4

// import java.util.Scanner;
// public class first{
//     public static void main(String[] args){
//         System.out.println("Moorvi");
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//         System.out.println(args[2]);
//         Scanner scan = new Scanner(System.in);
//         String Name = scan.next();
//         String fullname = scan.nextLine();
//         System.out.println(Name);
//         System.out.println(fullname);
//         scan.close();
        
//     }
// }

//dec5

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         int a = s.nextInt();
//         int b=s.nextInt();
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a/b);
//         System.out.println(a%b);
//         System.out.println(a*b);
//         int abc=1;
//         int Abc=2;
//         System.out.println(abc);
//         System.out.println(Abc);
//         byte a=127;
//         a++;
//         System.out.println(a);
//         final int ab; //cannot change its value ,if we not initialize its value iot will give error
//         ab=1;
//         System.out.println(ab);
//         int m=10;
//         int n=m++;
//         System.out.println(n);
//         int x=10;
//         int y=++x;
//         System.out.println(y);
//     }
// }



//dec 9

// // import java.util.Scanner;
// public class first{
//      public static void main(String[] args){
//         // Scanner s =new Scanner(System.in);
//         // int a=s.nextInt();
//         // if(a%2==0){
//         //     System.out.println("a is even");
//         // }
//         // else{
//         //     System.out.println("a is odd");
//         // }      
//         // if(a>90){
//         //     System.out.println("A");
//         // }
//         // else if (a>=80&&a<=90) {
//         //     if(a>85){
//         //     System.out.println("A-");     
//         // }
//         // }
//         // else{
//         //     System.out.println("B+");     
//         // }
//         // int a=2;
//         // while(a<=20){
//         //     System.out.println(a);
//         //     a+=2;
//         // }
//         // for(int i=2;i<20;i+=2){
//         //     System.out.println(i);
//         // }
//         // int a=10;
//         // do{
//         //     System.out.println("a is greater than 20");
//         //     a++;//10 times loop 
//         // }
//         // // while(a>20);
//         // while(a<20);//infinite loop
//         // // s.close();

//         for(int i=1;i<=10;i++){
//             if(i==5){
//                 break;
//             }
//             if(i%2==1){
//                 continue;
//             }
//             System.out.println(i);
//         }
//         return;
//      }
//   }


// import java.util.*;

// public class first{
//     public static void main(String args[]) {
//         // INSERT AN ELEMENT
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the size of the array : ");
//         int size = scan.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter the elements : ");
//         for (int i = 0; i < size; i++) {
//         arr[i] = scan.nextInt();
//         }
//         System.out.println("Enter the index : ");
//         int index = scan.nextInt();
//         System.out.println("Enter the number to insert : ");
//         int insert = scan.nextInt();
//         for (int i = arr.length - 1; i >= index; i--) {
//         arr[i] = arr[i - 1];
//         }
//         arr[index] = insert;
//         System.out.println("The altered array is : ");
//         for (int i : arr) {
//         System.out.println(i + " ");
//         }

//         CREATE 2D ARRAY
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int rows = scan.nextInt();
//         System.out.println("Enter the number of columns : ");
//         int col = scan.nextInt();
//         int[][] arr = new int[rows][col];
//         System.out.println("Enter the elements : ");
//         for (int i = 0; i < rows; i++) {
//         for (int j = 0; j < col; j++) {
//         arr[i][j] = scan.nextInt();
//         }
//         }
//         System.out.println("The array is : ");
//         for (int i = 0; i < rows; i++) {
//         for (int j = 0; j < col; j++) {
//         System.out.println(arr[i][j]);
//         }
//         }

//         DELETE AN ELEMENT
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the size of the array : ");
//         int size = scan.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter the elements : ");
//         for (int i = 0; i < size; i++) {
//         arr[i] = scan.nextInt();
//         }
//         System.out.println("Enter the index to be deleted : ");
//         int index = scan.nextInt();

//         for (int i = index; i < size - 1; i++) {
//         arr[i] = arr[i + 1];
//         }
//         arr[size - 1] = 0;

//         System.out.println("The altered array is : ");
//         for (int i : arr) {
//         System.out.println(i);
//         }

//         FINDING ONE SURROUNDED BY ZEROES

//         Scanner scan = new Scanner(System.in);
//         int[][] arr = { { 0, 1, 1, 0 }, { 0, 1, 0, 1 }, { 1, 0, 1, 0 } };
//         int rows = arr.length;
//         int cols = arr[0].length;
//         int row_index = -1;
//         int col_index = -1;

//         for (int i = 1; i < rows - 1; i++) {
//         for (int j = 1; j < cols - 1; j++) {
//         if (arr[i][j] == 0) {
//         if (arr[i][j - 1] == 1 && arr[i][j + 1] == 1 && arr[i - 1][j] == 1 && arr[i +
//         1][j] == 1) {
//         row_index = i;
//         col_index = j;
//         }
//         }
//         }
//         }
//         System.out.println(" index is : [" + row_index + "]" + "[" + col_index +
//         "]");
//         scan.close();
//     }
// }

//dec 10

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("No. of rows: ");
//         int rows=sc.nextInt();
//         System.out.println("no. of columns: ");
//         int columns=sc.nextInt();
//         int[][] arr=new int[rows][columns];
//         System.out.println("enter the elements: ");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }
//     System.out.println("array is: ");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//             System.out.println(arr[i][j]);
    
//     }
// }
//     }
// }


// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no. of rows");
//         int rows=sc.nextInt();
//         System.out.println("enter no. of columns");
//         int col=sc.nextInt();
//         int[][] arr=new int[rows][col];
//         System.out.println("enter o's and x's");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<col;j++){
//             arr[i][j]=sc.nextInt();
//         }
  
//     }


//     }
// }


//java
//Fibonacci Series

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int a= 0;
//         int b= 1;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=3;i<=n;i++){
//         int c=a+b;
//         System.out.println(c);
//         a=b;
//         b=c;
// }
//     }
// }

//prime numbers

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=2;i<=n;i++){
//             boolean is_prime = true;
//             for(int j=2;j<i;j++){
//                 if(i%j==0){
//                     is_prime=false;
//                     break;
//                 }
//                 if(is_prime){
//                     System.out.println(i);
//                 }
//             }
//         }
        
//     }
// }

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int a=0;
//         int r;
//         while(n!=0){
//         r=n%10;
//         a=a*10+r;
//         n=n/10;
//     }
//     System.out.println(a);
// }
// }



// import java.util.Scanner;

// public class CharacterGrid {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Define grid dimensions
//         int rows = 3;
//         int cols = 3;

//         // Create a 2D character array
//         char[][] grid = new char[rows][cols];

//         System.out.println("Enter characters to fill the grid:");

//         // Input loop to populate the grid
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print("Enter character for position (" + i + ", " + j + "): ");
//                 grid[i][j] = scanner.next().charAt(0);
//             }
//         }

//         // Display the filled grid
//         System.out.println("\nThe filled grid is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(grid[i][j]);
//                 if (j < cols - 1) System.out.print(" | ");
//             }
//             System.out.println();
//         }

//         scanner.close();
//     }
// }


//dec11
//tic tac toe

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows=3;
//         int cols=3;
//         char[][]grid=new char[rows][cols];
//         System.out.println("enter characters to fill the grid:");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.println("Enter character for position (" + i + ", " + j + "): ");
//                 grid[i][j]=sc.next().charAt(0);
//             }
//         }
//     }
//     }



//diamond problem

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=(n+1)/2;
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=m-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
//         for(int i=m-1;i>0;i--){
//             for(int j=1;j<=m-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
//     }
// }

//functions

// public class first{
//          public static void main(String[] args){
//             int a=10;
//             int b=20;
//             // int temp = 10;
//             int ans=sum(a,b);
//             // System.out.println(ans);
//             // first obj=new first();
//             // obj.sum(a, b);
//             // sum(a,b);if we write static before int sum no error will come
//             System.out.println(a);
//             System.out.println(b);
//         }
//         static void swap(int a , int b){
//             int t=b;
//             b=a;
//             a=t;
//         }
//         static int sum(int a,int b){
//             int sum_num=a+b;
//             return sum_num;
//         }
//         }


// dec12

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println("length of array:");
//         System.out.println(arr.length);


//         //dowhile not work in array
//         do{
//             System.out.println(arr[i]);
//         }
//         while(i<10);

//         max element
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//         int max=arr[0];
//         for(int i=1;i<n;i++){
//             if(max<arr[i])
//             {
//                 max=arr[i];
//             }
//         }
//         System.out.println(max);

//         array with one indexing
//         int n=sc.nextInt();
//         int[] arr=new int[n+1];
//         sc.close();
//    }

// }


//dec17

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n+1];
//         for(int i=0;i<=n;i++){
//         arr[i]=sc.nextInt();
//         }
//         int sum=n*(n-1)/2;
//         int array_sum=0;
//         for(int val : arr){//foreach
//             array_sum+=val;
//         } 
//         int diff=array_sum-sum;
//         System.out.println(diff);
//     }

// }


//dec18

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         // int[]arr=new int [n+3];
//         // for(int i=0;i<=n+2;i++){
//         //     arr[i]=sc.nextInt();
//         // }
//         // for(int i=1;i<=n+2;i++){
//         //     arr[Math.abs(arr[i])]*=-1;
//         // }
//         // for(int i=1;i<=n;i++){
//         //     if(arr[i]>0){
//         //         System.out.println(i);
//         //     }
//         // }

//         // int[][] arr = new int[3][];
//         // for(int i=0;i<n;i++){
//         //     int col=sc.nextInt();
//         //     arr[i]=new int[col];
//         // }


//         int[][]arr=new int[3][];
//         arr[0]=new int[3];
//         arr[1]=new int[4];
//         arr[2]=new int[2];
//     }

// }



//dec19

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int[][]arr=new int[3][];
//         arr[0]=new int[3];
//         arr[1]=new int[4];
//         arr[2]=new int[2];

//         //input and print 2d array
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//     }

// }


//dec24

//spiral pattern do
//wave pattern

// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         int rows = 4;
//         int cols = 4; 
//         int[][] wave = new int[rows][cols];
//         int num = 1;
//         for (int col = 0; col < cols; col++) {
//             if (col % 2 == 0) {
//                 for (int row = 0; row < rows; row++) {
//                     wave[row][col] = num++;
//                 }
//             } else {
//                 for (int row = rows - 1; row >= 0; row--) {
//                     wave[row][col] = num++;
//                 }
//             }
//         }
//         for (int row = 0; row < rows; row++) {
//             for (int col = 0; col < cols; col++) {
//                 System.out.print(wave[row][col] + "\t");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
//         public class first{
//         public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = scanner.nextInt();
//         int[][]arr=new int[rows][cols];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 arr[i][j]=scanner.nextInt();
//             }        }
//         for (int row = 0; row < rows; row++) {
//             if (row % 2 == 0) {
//                 for (int col = 0; col < cols; col++) {
//                     System.out.print(arr[row][col] + "\t");
//                 }
//             } else {
//                 for (int col = cols - 1; col >= 0; col--) {
//                     System.out.print(arr[row][col] + "\t");
//                 }
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }
// }



//15jan
// //java..
// import java.util.Scanner;
// public class first{
//              public static void main(String[] args){
                // //String str = "hello"; //create string in string pool
                // String str = new String("Hello");//create string in heap memory
                // System.out.println(str);

                // String str1 = "Hello"; //create string in string pool
                // String str2 = new String("Hello");//create string in heap memory
                // System.out.println("String 1 : " + str1);
                // System.out.println("String 2 : " + str2);

                // //compare
                // System.out.println((str1.equals(str2)));
                // System.out.println(str1==str2);
                // String str3="Hello";
                // System.out.println(str1==str3);

            //     Scanner sc=new Scanner(System.in);
            //     String str=sc.nextLine();
            //     //all substrings starting from any particular index
            //     for(int i=0;i<str.length();i++){
            //         for(int j=i+1;j<=str.length();j++){
            //             System.out.println(str.substring(i, j));
            //         }
            //     }
            //     //all substrings ending at any particular index


            //  }}



//16 jan
//java..
// import java.util.Scanner;
// public class first{
//              public static void main(String[] args){
//                //  Scanner sc=new Scanner(System.in);
//                StringBuilder str=new StringBuilder("Hello");
//                //length
//                System.out.println(str.length());
//                //append
//                System.out.println(str.append(" str"));
//                System.out.println(str);
//                //char at index
//                str.charAt(2);
//                System.out.println(str.deleteCharAt(2));
//                //insert
//                str.insert(2, 'a');
//                //set char
//                str.setCharAt(2, 'a');
//  }}



//29jan
//dsa

// import java.util.Scanner;
// import java.util.Stack;
//  public class first{
//              public static void main(String[] args){
//                 Stack<Integer>st=new Stack<>();
//                 //these <>are template

//                 st.push(10); //pushes at top of stack
//                 st.push(20);
//                 st.push(30);
//                 st.push(40);
//                 System.out.println(st.peek());//returns the top elsement
//                 System.out.println(st.pop());//removes the top element and returns it
//                 System.out.println(st);//prints stack in form of array
//                 System.out.println(st.search(10));//searches from last to top nd if not found return -1
//                 System.out.println("is stack empty?"+st.isEmpty());


//              }}

// import java.util.Stack;
// public class first {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         stack.push(40);
//         System.out.println("Original Stack: " + stack);

//         Stack<Integer> tempStack = new Stack<>();
    
//         while (!stack.isEmpty()) {
//             tempStack.push(stack.pop());
//         }
//         stack.push(50);

//         while (!tempStack.isEmpty()) {
//             stack.push(tempStack.pop());
//         }

//         System.out.println("Stack after inserting 50 at the bottom: " + stack);
//     }
// }



// if(peek()>arr[i])print (peek())
// else{pop()until peek()<arr[i]}
// if stack is empty print -1
// at the end push arr[i]to the stack



//4FEB
//dsa
// find the next greater element of each element in an array
// import java.util.Stack;

// public class first {
//     public static int[] nextGreaterElement(int[] arr) {
//         int n = arr.length;
//         int[] nge = new int[n];
//         Stack<Integer> stack = new Stack<>();

//         for (int i = n - 1; i >= 0; i--) {
//             while (!stack.isEmpty() && stack.peek() <= arr[i]) {
//                 stack.pop();
//             }
            
//             nge[i] = stack.isEmpty() ? -1 : stack.peek();
//             stack.push(arr[i]);
//         }
//         return nge;
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 3, 4, 9, 7, 13};
//         int[] result = nextGreaterElement(arr);
        
//         System.out.println("Element -> Next Greater Element");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i] + " -> " + result[i]);
//         }
//     }
// }


// import java.util.Stack;

// public class first {
//     public static void main(String[] args) {
//find the next greater element of each element in an array
//using brute force
//        int[] arr = {3,2,4,7,5,9,13,11};
//        int[] ans = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            ans[i] = -1;
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i]<arr[j]){
//                    ans[i]=arr[j];
//                    break;
//                }
//            }
//        }
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(ans[i]+" ");
//        }


        //optimised approach using stack
//        int[] arr = {5,3,4,9,7,13};
//        int[] ans = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//        for(int i = arr.length - 1; i >= 0; i--) {
//                while(!st.isEmpty() &&arr[i]>st.peek()){
//                    st.pop();
//                }
//                if(!st.isEmpty()){
//
//                    ans[i] = st.peek();
//                }
//                else{
//                    ans[i] = -1;
//                }
//                st.push(arr[i]);
//
//        }
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(ans[i]+" ");
//        }


        //Variations of Next greater Element
        //-> Next Greater Element to the right
        //-> Next Greater Element to the left
        //-> Next Smaller Element to the right
        //-> Next Smaller Element to the left

        
//     }
// }



//11feb
//dsa


// import java.util.Stack;
// public class first {
//     private class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     private Node top;
//     private int size;

//     // Constructor name updated to match the class name
//     public first() {
//         top = null;
//         size = 0;
//     }

//     public void push(int item) {
//         Node newNode = new Node(item);
//         newNode.next = top;
//         top = newNode;
//         size++;
//     }

//     public int pop() {
//         if (isEmpty()) {
//             throw new IllegalStateException("Stack is Empty.");
//         }
//         int topData = top.data;
//         top = top.next;
//         size--;
//         return topData;
//     }

//     public int peek() {
//         if (isEmpty()) {
//             throw new IllegalStateException("Stack is Empty.");
//         }
//         return top.data;
//     }

//     public int size() {
//         return size;
//     }

//     public boolean isEmpty() {
//         return top == null;
//     }

//     public void display() {
//         Node curr = top;

//         while (curr != null) {
//             System.out.print(curr.data);
//             curr = curr.next;
//             if (curr != null)
//                 System.out.print(" -> ");
//         }

//         System.out.println();
//     }
// }




//12 feb
//dsa
//aggresive cows


//5mar
//java
//given a string find the first non repeating char in string
//eg: abcacefge  c fg

// import java.util.LinkedHashMap;
// import java.util.Map;

// public class first {
//     public static void main(String[] args) {
//         String str = "swiss";
//         Map<Character, Integer> charCount = new LinkedHashMap<>();

//         // Count character occurrences
//         for (char c : str.toCharArray()) {
//             charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//         }

//         // Find and print the first non-repeating character
//         for (char c : str.toCharArray()) {
//             if (charCount.get(c) == 1) {
//                 System.out.println("First non-repeating character: " + c);
//                 return;
//             }
//         }

//         System.out.println("No non-repeating character found.");
//     }
// }



//dsa
//two sets
//11 march

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// public class first{
//              public static void main(String[] args){
//                 Scanner sc=new Scanner(System.in);
//                 int n=sc.nextInt();
//                 sc.close();

//                 long sum = (long) n*(n+1)/2;

//                 if(sum%2 !=0){
//                         System.out.println("NO");
//                         return;
//                 }

//                 System.out.println("YES");

//         List<Integer> set1 = new ArrayList<>();
//         List<Integer> set2 = new ArrayList<>();
//         long target = sum / 2;
//         long currentSum = 0;

//         for (int i = n; i >= 1; i--) {
//             if (currentSum + i <= target) {
//                 set1.add(i);
//                 currentSum += i;
//             } else {
//                 set2.add(i);
//             }
//         }

//         System.out.println(set1.size());
//         for (int num : set1) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         System.out.println(set2.size());
//         for (int num : set2) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
        
//         }}

//java
//18 march

//import java.io.FileNotFoundException;
//import java.io.FileReader;

// public class throw_throws{
// static void function() throws FileNotFoundException{
//   FileReader file = new FileReader(fileName:"Test.txt");
//}
//
//   public static void main(String[] args){
//      function();
// }}






















