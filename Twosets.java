// import java.util.Scanner;

// public class Twosets {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();

//         long sum = (long) n * (n + 1) / 2;

//         if (sum % 2 != 0) {
//             System.out.println("NO");
//             return;
//         }

//         System.out.println("YES");

//         StringBuilder set1 = new StringBuilder();
//         StringBuilder set2 = new StringBuilder();
//         int count1 = 0, count2 = 0;
//         long target = sum / 2, currentSum = 0;

//         for (int i = n; i >= 1; i--) {
//             if (currentSum + i <= target) {
//                 set1.append(i).append(" ");
//                 currentSum += i;
//                 count1++;
//             } else {
//                 set2.append(i).append(" ");
//                 count2++;
//             }
//         }

//         System.out.println(count1);
//         System.out.println(set1);
//         System.out.println(count2);
//         System.out.println(set2);
//     }
// }

