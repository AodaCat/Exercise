// 2.11 

/**
 * Exercise 1 (2)
 */
// public class Exercise{
//     int a;
//     char b;
//     public Exercise(){
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
//     public static void main(String[] args) {
//         new Exercise();
//     }
// }

/**
 * Exercise 2 (1)
 */
// public class Exercise{
//     public static void main(String[] args){
//         System.out.println("Hello, World");
//     }
// }

/**
 * Exercise 5 (1)
 */
// public class Exercise{
//     int i;
//     double d;
//     boolean b;
//     public void printData(){
//         System.out.println(i);
//         System.out.println(d);
//         System.out.println(b);
//     }
//     public static void main(String[] args){
//         Exercise e = new Exercise();
//         e.printData();
//         e.b = true;
//         e.d = 1.1;
//         e.i = 1;
//         e.printData();
//     }
// }

/**
 * Exercise 6 (2)
 */
// public class Exercise{
//     String s = "String 666";
//     public int slength(){
//         return s.length();
//     }
//     public void sprint(){
//         System.out.println(slength());
//     }
//     public static void main(String[] arga){
//         Exercise e = new Exercise();
//         e.sprint();
//     }
// }

/**
 * Exercise 10 (2)
 */
// public class Exercise{
//     /**
//      * 执行命令为：
//      * javac Exercise.java
//      * java Exercise 1 2 3
//      * 输出结果为：1 2 3
//      */
//     public static void main(String[] args) {
//         if(args.length < 3){
//             System.out.println("ding");
//             System.exit(1);
//         }
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//         System.out.println(args[2]);
//     }
// }