public class Parent {
    void printData(){
        System.out.println("Method of parent class ");
    }
}
class Child extends Parent{
    void printData(){
        System.out.println("Method of child class");
    }
}
class Test{
    public static void main(String[] args) {
        Parent p = new Child();
        p.printData();
    }
}