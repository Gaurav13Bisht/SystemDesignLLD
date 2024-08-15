package SOLID.OpenClosed;

import SOLID.SingleResponsibility.Invoice2;

    /*  This is following OPEN/CLOSED principle since even if some new feature is to be added lets say
        save to different type of DB then we can just add another class which will implement InvoiceSave2
        interface and will not affect the already existing and well tested class.
        i.e. we are extending the feature not modifying current ones.
     */

public interface InvoiceSave2 {
    public void save(Invoice2 invoice);
}

class InvoiceSaveToDB implements InvoiceSave2{
    public void save(Invoice2 invoice){
        // Code for save to DB
    }
}

class InvoiceSaveToFile implements InvoiceSave2{
    public void save(Invoice2 invoice){
        // Code for save to FILE
    }
}