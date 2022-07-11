package Class;

// La clase Clients hereda los objetos y metodos de la clase Countries
public class Clients extends Countries{
    
    //Objetos de la clase Clients segun el Excel CarSalesDataForReports
    private String ClientName;
    private String Address1;
    private String Adress2;
    private String Town;
    private String PostCode;
    private String Region;
    private String OuterPostode;
    private String ClientType;
    private String ClientSize;
    private String ClientSince; //Se pone la fecha String y luego se coniverte a datetime para la base de datos
    private Boolean IsCreditWorthy;
    private Boolean IsDealer;
    
    //Constructor sin parametros
    public Clients() {
    }

    //Constructor con parametros de la clase Clients con los objetos heredados de Countries (CountryName, CountryISOCode)
    public Clients(String ClientName, String Address1, String Adress2, String Town, String PostCode, String Region, String OuterPostode, String ClientType, String ClientSize, String ClientSince, Boolean IsCreditWorthy, Boolean IsDealer, String CountryName, String CountryISOCode) {       
        super(CountryName, CountryISOCode);
        
        this.ClientName = ClientName;
        this.Address1 = Address1;
        this.Adress2 = Adress2;
        this.Town = Town;
        this.PostCode = PostCode;
        this.Region = Region;
        this.OuterPostode = OuterPostode;
        this.ClientType = ClientType;
        this.ClientSize = ClientSize;
        this.ClientSince = ClientSince;
        this.IsCreditWorthy = IsCreditWorthy;
        this.IsDealer = IsDealer;
    }

    //SETS Y GETS DE LOS OBJETOS DE Clients
    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAdress2() {
        return Adress2;
    }

    public void setAdress2(String Adress2) {
        this.Adress2 = Adress2;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getOuterPostode() {
        return OuterPostode;
    }

    public void setOuterPostode(String OuterPostode) {
        this.OuterPostode = OuterPostode;
    }

    public String getClientType() {
        return ClientType;
    }

    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    public String getClientSize() {
        return ClientSize;
    }

    public void setClientSize(String ClientSize) {
        this.ClientSize = ClientSize;
    }

    public String getClientSince() {
        return ClientSince;
    }

    public void setClientSince(String ClientSince) {
        this.ClientSince = ClientSince;
    }

    public Boolean getIsCreditWorthy() {
        return IsCreditWorthy;
    }

    public void setIsCreditWorthy(Boolean IsCreditWorthy) {
        this.IsCreditWorthy = IsCreditWorthy;
    }

    public Boolean getIsDealer() {
        return IsDealer;
    }

    public void setIsDealer(Boolean IsDealer) {
        this.IsDealer = IsDealer;
    }
    
    

    
    
    
    
}
