package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // this is the outer class. Outer class can never be static.
    // to be static needs to belong to a class.

    static class class1 { // this is a nested class. This is the inner class. Is member of another class.

    }

    public static int num = 100; //this is a variable

    public static void method() { //this is a methods

    }

    static { //this is a blocks

    }
}

    class A { // outer class

        static class B { // inner class

            public static void method1() {

            }

        }
    }

        class C {
            public static void main(String[] args) {
                A.B.method1();
            }
        }


        class X {

        }

        class Y {

        }

        class Z {
            static class Q {

            }


        }




