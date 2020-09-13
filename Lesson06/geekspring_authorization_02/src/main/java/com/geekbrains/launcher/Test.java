package com.geekbrains.launcher;

import java.io.*;
import java.util.Comparator;
import java.util.Stack;
import java.util.TreeSet;


// try catch finally throw throws


// transient volatile


// sleep()   wait()

// Arrays.sort()


public class Test {
    public static void main(String[] args) throws IOException {
        Test reverseLineInputStream = new Test();
        reverseLineInputStream.readAndPrintInReverseOrder();
    }

    public void readAndPrintInReverseOrder() throws IOException {

        String path = "123/test1.txt";

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(path));

            br = new BufferedReader(new FileReader(path));
            Stack<String> lines = new Stack<String>();
            String line = br.readLine();
            while (line != null) {
                lines.push(line);
                line = br.readLine();
            }

            while (!lines.empty()) {
                System.out.println(lines.pop());
            }

            // дописать код

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
    }
}


class MyCompUserDefine {

    public static void main(String a[]) {

        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
        salComp.add(new Empl("Ram", 3000));
        salComp.add(new Empl("John", 6000));
        salComp.add(new Empl("Crish", 2000));
        salComp.add(new Empl("Tom", 2400));
        for (Empl e : salComp) {
            e.info();
        }

    }
}

class MySalaryComp implements Comparator<Empl> {

    @Override
    public int compare(Empl e1, Empl e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Empl {
    private String name;
    private int salary;

    public Empl(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public int getSalary() {
        return salary;
    }

    public void info() {
        System.out.println(name + " " + salary);
    }
}


//     br = new BufferedReader(new FileReader(path));
//             Stack<String> lines = new Stack<String>();
//        String line = br.readLine();
//        while(line != null) {
//        lines.push(line);
//        line = br.readLine();
//        }
//
//        while(! lines.empty()) {
//        System.out.println(lines.pop());
//        }














// 1

//class MainThree {
//    public static void main(String[] args) {
//        int i = 0;
//        System.out.println(++i == i++);
//        System.out.println(i);
//        System.out.println(i++ == i++);
//        System.out.println(i);
//    }
//}
//










// 2 Являются ли массивы в java однородными


















// 3 В каком порядке должны размещаться следующие опертаторы


// 1 вариант
// Package statement
// Imports
// Class or interface definitions


// 2 вариант
// Imports
// Package statement
// Class or interface definitions

// 3 вариант
// в любом порядке







// 4
//class Test4{
//        public static void main(String[] args) {
//        String str = "abc";
//
//        switch (str) {
//            case "ab":
//                System.out.println("ab");
//            case "abc":
//                System.out.println("abc");
//            default:
//                System.out.println("break");
//            case "abcd":
//                System.out.println("abcd");
//        }
//    }
//
//}






//class Test5 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i += 2) {
//            System.out.println(i++);
//        }
//    }
//}


// 5
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i+=2) {
//            System.out.println(i++);
//        }
//    }





// 6
//
class Test6 {
    public static void main(String[] args) {
        String strA = "text";
        String strB = "text";
        strA += "1";
        strB += "1";
        System.out.println(strA == strB);
        strA = "text1";
        strB = "text1";
        System.out.println(strA == strB);
    }
}