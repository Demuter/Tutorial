package OOP_nestedclasses;

class MyClass extends BaseClass {
    public class Nested {
        public void methodFromNested() {
            System.out.println("Метод Nested класса.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Nested instance2 = new MyClass().new Nested();
        instance2.methodFromNested();
    }
}