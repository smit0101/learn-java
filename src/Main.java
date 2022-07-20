import java.util.List;

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

        List.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);


        Object smit = new User(9);
        if(smit instanceof User user && user.a() > 8){
            System.out.println("say");
        }
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


sealed class Plant permits  Mango{

}
sealed class Mango  extends  Plant permits Tulsi{

}

 final class Tulsi extends Mango{

}
//
//class Test{
//    public static void main(String[] args) {
//        Plant p = new Mango();
//        int a = switch (p){
//            case null -> -10;
//            case Tulsi t -> 9;
//            case Mango m -> 90;
//            case Plant pp -> 9;
//        };
//    }
//}