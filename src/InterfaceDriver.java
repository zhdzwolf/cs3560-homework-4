import interface_files.*;

public static void main(String[] args) {
    ArrayList<Payable> payables = new ArrayList<>();

    Freelancer freelancer1 = new Freelancer();
    freelancer1.setFirstName("John");
    freelancer1.setLastName("Destiny");
    freelancer1.setHourlyRate(47.54);
    freelancer1.setHoursWorked(63);
    payables.add(freelancer1);

    Freelancer freelancer2 = new Freelancer();
    freelancer2.setFirstName("John");
    freelancer2.setLastName("Warframe");
    freelancer2.setHourlyRate(12.18);
    freelancer2.setHoursWorked(532);
    payables.add(freelancer2);

    VendorInvoice vendorInvoice1 = new VendorInvoice();
    vendorInvoice1.setVendorName("void warlock");
    vendorInvoice1.setInvoiceNumber("#51965");
    vendorInvoice1.setAmountDue(18565);
    payables.add(vendorInvoice1);

    VendorInvoice vendorInvoice2 = new VendorInvoice();
    vendorInvoice2.setVendorName("xaku prime");
    vendorInvoice2.setInvoiceNumber("#13748");
    vendorInvoice2.setAmountDue(57);
    payables.add(vendorInvoice2);

    for (Payable payable : payables) {
        payable.print();
        System.out.println();
    }
}