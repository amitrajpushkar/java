import java.util.concurrent.Callable;

public class polymorphism {
    public static void main(String[] args) {
        parent human = new Child();
        human.dance();



    }
}
    class parent{

        public void dance(){
            System.out.println("baap nach rha hai");
        }
    }
     class Child extends parent{

        public void dance(){
            System.out.println("launda nach rha hai");
        }
    }

