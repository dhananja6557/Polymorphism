public class Sephain {
    void status() {
        System.out.println("Sephain is live object");
    }
}
class Human extends Sephain {
    void status() {
        System.out.println("Human is live object");
    }
}
class Man extends Human {
    void status() {
        System.out.println("Man is live object");
    }
}
class Dhana extends Man {
    void status() {
        System.out.println("Dhana is live object");
    }
}
class Test {


    public static void main(String[] args) {
        Sephain s = new Sephain();
        Sephain h = new Human();
        Sephain m = new Man();
        Sephain d = new Dhana();

        s.status();
        h.status();
        m.status();
        d.status();
    }
}