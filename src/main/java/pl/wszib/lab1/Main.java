package pl.wszib.lab1;

import pl.wszib.lab1.mypackage.MyExtendedClass;
import pl.wszib.lab1.mypackage.MyPackageClass;

public class Main {
    //public
    //protected
    //default/package-private
    //private

    public static void main(String[] args) {
        System.out.println("Hello World");

        MyClass.staticName = "StaticName";
        MyClass.staticName1 = "StaticName1";
        MyClass.staticName2 = "StaticName2";
//        MyClass.staticName3 = "StaticName3";
        MyClass.printStatic();

        MyClass myClass = new MyClass();
        myClass.name = "Name";
        myClass.name1 = "Name1";
        myClass.name2 = "Name2";
        myClass.print();
//        myClass.printStatic();

        MyClass myClass2 = new MyClass();
        myClass2.print();

        MyPackageClass myPackageClass = new MyPackageClass();
        myPackageClass.name = "Name";
        myPackageClass.print();

        MyExtendedClass myExtendedClass = new MyExtendedClass();
        MyClass myExtendedClass2 = myExtendedClass;
//        myExtendedClass.name2 = "asd";
        myExtendedClass2.name2 = "asd";
    }

}
