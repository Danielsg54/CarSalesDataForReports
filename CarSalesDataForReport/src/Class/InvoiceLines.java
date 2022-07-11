package Class;

// Clase InvoiceLines que hereda los objetos y metodos de la clase Invoices
public class InvoiceLines extends Invoices{
    
    //Objetos de la clase InvoiceLines segun el excel CarSalesDataForReports
    private float SalePrice;
    private int LineItem;
    private Stock stock;

    //Constructor sin parametros
    public InvoiceLines() {
    }

    //Constructor con parametros de la clase InvoiceLines que hereda los objetos de Invoices(InvoiceNumber, InvoiceDate, TotalDiscount, DeliveryCharge, InvoiceDateKey, ClientName, Address1, Adress2, Town, PostCode, Region, OuterPostode, ClientType, ClientSize, ClientSince, IsCreditWorthy, IsDealer, CountryName, CountryISOCode)
    public InvoiceLines(float SalePrice, int LineItem, Stock stock, String InvoiceNumber, String InvoiceDate, float TotalDiscount, float DeliveryCharge, double InvoiceDateKey, String ClientName, String Address1, String Adress2, String Town, String PostCode, String Region, String OuterPostode, String ClientType, String ClientSize, String ClientSince, Boolean IsCreditWorthy, Boolean IsDealer, String CountryName, String CountryISOCode) {
        super(InvoiceNumber, InvoiceDate, TotalDiscount, DeliveryCharge, InvoiceDateKey, ClientName, Address1, Adress2, Town, PostCode, Region, OuterPostode, ClientType, ClientSize, ClientSince, IsCreditWorthy, IsDealer, CountryName, CountryISOCode);
        this.SalePrice = SalePrice;
        this.LineItem = LineItem;
        this.stock = new Stock();
    }

    
    //GETS Y SETS DE LA CLASE InvoiceLines
    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public float getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(float SalePrice) {
        this.SalePrice = SalePrice;
    }

    public int getLineItem() {
        return LineItem;
    }

    public void setLineItem(int LineItem) {
        this.LineItem = LineItem;
    }
    
    
    
}
