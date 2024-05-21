import Contract;
import Permanent;
import LongTerm;
import ShortTerm;

public class Client {
    public static void main (String[] args) {
        BuildContract ct = new Permanent();
        ct.buildContractID("a");
        ct.buildPropertyID("b");
        ct.buildTenantID("c");
        ct.buildRentAmount(100);
        Contract permanentContract = ct.signContract();
        System.out.println(permanentContract + " " + ct.getClass().getName());
    }
}
