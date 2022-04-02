package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200; // access modifiers: default
    private static int privateData = 300; // access modifiers: private


    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);


    }

}
