import java.util.*;
import java.io.*;

public class ShortTerm implements BuildContract {
    private String contractID;
    private String tenantID;
    private String propertyID;
    private double rentAmout;

    @Override
    public void buildContractID(String contractID) {
        this.contractID = contractID;        
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;        
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmout = rentAmount;        
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;        
    }

    @Override
    public Contract signContract() {
        return  new Contract(contractID, propertyID, tenantID, rentAmout);
    }

    
}
