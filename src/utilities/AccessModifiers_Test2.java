package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicData);
    // System.out.println(AccessModifiers.defaultData); -> it's in a different package. Access only in the same package.
    // System.out.println(AccessModifiers.privateData); -> available only in the same class53


        AccessModifiers.method1();
     // AccessModifiers.method2(); different packages
     // AccessModifiers.method3();



    }

}
