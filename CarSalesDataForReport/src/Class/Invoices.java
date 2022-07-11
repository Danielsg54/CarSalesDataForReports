package Class;

//Clase Invoices que hereda los objetos y metodos de la clase Clients
public class Invoices extends Clients{
    
    //Objetos de la clase Invoices segun el excel CarSalesDataForReports
    private String InvoiceNumber;
    private String InvoiceDate; //Se pone la fecha String y luego se coniverte a datetime para la base de datos
    private float TotalDiscount;
    private float DeliveryCharge;
    private double InvoiceDateKey;

    //Constructor sin parametros
    public Invoices() {
    }

    //Constructor con parametros de la clase Invoices que hereda los objetos de Clients (ClientName, Address1, Adress2, Town, PostCode, Region, OuterPostode, ClientType, ClientSize, ClientSince, IsCreditWorthy, IsDealer, CountryName, CountryISOCode)
    public Invoices(String InvoiceNumber, String InvoiceDate, float TotalDiscount, float DeliveryCharge, double InvoiceDateKey, String ClientName, String Address1, String Adress2, String Town, String PostCode, String Region, String OuterPostode, String ClientType, String ClientSize, String ClientSince, Boolean IsCreditWorthy, Boolean IsDealer, String CountryName, String CountryISOCode) {
        super(ClientName, Address1, Adress2, Town, PostCode, Region, OuterPostode, ClientType, ClientSize, ClientSince, IsCreditWorthy, IsDealer, CountryName, CountryISOCode);
        this.InvoiceNumber = InvoiceNumber;
        this.InvoiceDate = InvoiceDate;
        this.TotalDiscount = TotalDiscount;
        this.DeliveryCharge = DeliveryCharge;
        this.InvoiceDateKey = InvoiceDateKey;
    }

    
    //SETS Y GETS DE LA CLASE Invoices
    public String getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(String InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public String getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(String InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public float getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(float TotalDiscount) {
        this.TotalDiscount = TotalDiscount;
    }

    public float getDeliveryCharge() {
        return DeliveryCharge;
    }

    public void setDeliveryCharge(float DeliveryCharge) {
        this.DeliveryCharge = DeliveryCharge;
    }

    public double getInvoiceDateKey() {
        return InvoiceDateKey;
    }

    public void setInvoiceDateKey(double InvoiceDateKey) {
        this.InvoiceDateKey = InvoiceDateKey;
    }
    
     

}
