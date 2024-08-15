package SOLID.SingleResponsibility;

    /* A class should have only 1 responsibility ie work and only 1 reason to be changed.
    */

public class Invoice1 {

    /* This design do not follow the principle since:
        1. Its doing 3 work i.e. calculating total, printing invoice and saving invoice to DB.
        2. It has 3 reasons to be changed, either calculateTotal() might change if there is any change in tax,
            printInvoice() might change if formatting requirement is changed and saveInvoiceToDB() will
            change if lets say now the requirement is changed to saving to file.
     */

    private Marker marker;
    private Long quantity;

    private String billingAddress;

    public Invoice1(Marker marker, Long quantity, String billingAddress){
        this.marker = marker;
        this.quantity = quantity;
        this.billingAddress = billingAddress;
    }

    public Long calculateTotal(){
        return marker.getPrice() * quantity;
    }

    public void printInvoice(){
        // Code according to the required printing format
    }

    public void saveInvoiceToDB(){
        // Code for save to DB
    }

}