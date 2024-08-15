package SOLID.SingleResponsibility;

    /* In this design, we have segregated each of the work/feature to a separate class which now is
        following the principle since each class has only 1 responsibility and 1 reason to be changed i.e.
        when the respective method/feature is changed.
     */

public class Invoice2 {
    private Marker marker;
    private Long quantity;
    private String billingAddress;

    public Invoice2(Marker marker, Long quantity, String billingAddress) {
        this.marker = marker;
        this.quantity = quantity;
        this.billingAddress = billingAddress;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
}

class InvoiceCalculate{
    private Invoice2 invoice;

    public InvoiceCalculate(Invoice2 invoice) {
        this.invoice = invoice;
    }

    public Long calculateTotal(){
        return invoice.getMarker().getPrice() * invoice.getQuantity();
    }
}

class InvoicePrint{
    private Invoice2 invoice;

    public InvoicePrint(Invoice2 invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        // Code according to the required printing format
    }
}

class InvoiceSave{
    private Invoice2 invoice;

    public InvoiceSave(Invoice2 invoice) {
        this.invoice = invoice;
    }

    public void saveInvoiceToDB(){
        // Code for save to DB
    }
}