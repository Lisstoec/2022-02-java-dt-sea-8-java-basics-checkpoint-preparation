package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;


public class Admin extends ITPerson {

    protected LocalDate lastCertified = LocalDate.now().minusMonths(4);
    
    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Admin here.
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
       
        LocalDate validCertificate = LocalDate.now().minusYears(1);
        
        if (lastCertified.isBefore(validCertificate)) return false;
        else return true;

    }
}
