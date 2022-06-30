public class Main {
    public static void main(String[] args) {
        A a = new C();
        int value = switch (a){
            case null -> -1;
            case D d -> 8;
            case C c -> 9;
            case B b -> 7;
            case A obj -> 2;
        };
        System.out.println(value++);
    }
}

record User(int a){
    User(int a){
        this.a = a;
    }
    User(int a,int b){
        this(a);
    }
   static int aa = 10;
}

sealed class A{}
sealed class B extends A{}
sealed class C extends B{}
non-sealed class D extends C{}

class E extends  D{}