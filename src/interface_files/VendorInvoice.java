package interface_files;

public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public void setAmountDue(double amountDue) {
        this.amountDue = Math.abs(amountDue);
    }

    public String getVendorName() {
        return vendorName;
    }
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    public double getAmountDue() {
        return amountDue;
    }

    @Override
    public void print() {
        System.out.println("Vendor Name: " + getVendorName());
        System.out.println("Invoice Number: " + getInvoiceNumber());
        System.out.println("Amount Due: $" + getAmountDue());
    }

    @Override
    public double calculatePayment() {
        return getAmountDue();
    }

    @Override
    public String getPayeeName() {
        return getVendorName();
    }
}
