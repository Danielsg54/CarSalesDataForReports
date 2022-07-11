package Class;

//Clase Countries
public class Countries {
    
    //Objetos de la clase Countries segun el excel CarSalesDataForReports
    private String CountryName;
    private String CountryISOCode;

    //Constructor sin parametros
    public Countries() {
    }

    //Constructor con parametros de la clase Countries
    public Countries(String CountryName, String CountryISOCode) {
        this.CountryName = CountryName;
        this.CountryISOCode = CountryISOCode;
    }
    

    //SETS Y GETS DE LA CLASE COUNTRIES
    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryISOCode() {
        return CountryISOCode;
    }

    public void setCountryISOCode(String CountryISOCode) {
        this.CountryISOCode = CountryISOCode;
    }
    
    
    
}
