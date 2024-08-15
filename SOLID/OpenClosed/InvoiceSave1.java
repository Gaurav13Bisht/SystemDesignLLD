package SOLID.OpenClosed;

import SOLID.SingleResponsibility.Invoice2;

    /* This design do not follow OPEN/CLOSED Principle because it states that:
        Design should be OPEN for extension but CLOSED for modification
       but here if we need another feature to save the invoice to FILE system, then since the existing code
       which is saving to DB only, is already well tested and has gone live will have to be tested again since
       new code has been added to it.
     */

public class InvoiceSave1 {
    private Invoice2 invoice;

    public InvoiceSave1(Invoice2 invoice) {
        this.invoice = invoice;
    }

    public void saveInvoiceToDB(){
        // Code for save to DB
    }

    // New feature added later after product gone live
    public void saveInvoiceToFile(){
        // Code for save to File
    }
}