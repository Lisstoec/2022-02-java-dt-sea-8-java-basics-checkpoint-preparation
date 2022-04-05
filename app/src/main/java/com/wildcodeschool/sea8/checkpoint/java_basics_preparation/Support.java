package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Support here.
        
        if (this.level == 0){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Support here.
        
        if (this.level == 2){
            return true;
        }
        else {
            return false;
        }
    }
}
