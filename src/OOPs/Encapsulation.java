package OOPs;

/**
 * Customer
 */
class Customer {
    private int cID;
    private String cName;
    private long cPhno;

    public void setcID(int cID) {
        this.cID = cID;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcPhno(long cPhno) {
        this.cPhno = cPhno;
    }

    public int getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public long getcPhno() {
        return cPhno;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setcID(91);
        c1.setcName("Sandy");
        c1.setcPhno(9324932294l);
        System.out.println(c1.getcID());
        System.out.println(c1.getcName());
        System.out.println(c1.getcPhno());

        Customer c2 = new Customer();

        System.out.println(c2.getcID());
        System.out.println(c2.getcName());
        System.out.println(c2.getcPhno());

    }
}
