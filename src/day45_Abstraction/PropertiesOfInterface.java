package day45_Abstraction;

public interface PropertiesOfInterface {


    int a = 100; // static & final by default
    static int b = 200; // final by default

    //public PropertiesOfInterface(int a){
       // this.a = a;
   // }

    public default void method1(){ //this is an instance method
        System.out.println("Instance method");
    }

    public static void method2(){ // this is a static method
        System.out.println("Static method");
    }

    public abstract void method3();



}
