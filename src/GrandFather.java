public class GrandFather {
    void swim() {
        System.out.println("Swimming!");
    }
}
class Father extends GrandFather {
    void swim() {
        System.out.println("Swimming in river!");
    }
}
class Son extends Father {
    void swim() {
        System.out.println("Swimming in pool!");
    }

    public static void main(String[] args) {
        GrandFather gf, f, s;
        f = new Father();
        s = new Son();
        gf = new GrandFather();

        f.swim();
        s.swim();
        gf.swim();
    }
}
