public class CentralBank {
    void leasingRate() {
        System.out.println("30% bellow");
    }
}
class ComBank extends CentralBank {
    void housingLoan() {
        System.out.println("20% bellow");
    }
    void leasingRate() {
        System.out.println("25% bellow");
    }
}
class CommecialLeasing extends ComBank {
    void leasingRate() {
        System.out.println("23% bellow");
    }
}
class CommercialCredit extends ComBank {
    void housingLoan() {
        System.out.println("20% bellow");
    }
    void leasingRate() {
        System.out.println("22% bellow");
    }
}
class RatesOutput {
    public static void main(String[] args) {
        CentralBank cb = new CentralBank();
        CentralBank com = new ComBank();
        CentralBank cl = new CommecialLeasing();
        CentralBank cc = new CommercialCredit();
        ComBank ab, cd;
        ab = new ComBank();
        cd = new CommercialCredit();

        ab.housingLoan();
        cd.housingLoan();

        cb.leasingRate();
        com.leasingRate();
        cl.leasingRate();
        cc.leasingRate();
    }
}