package Class;

//Clase Stock que hereda los objetos y metodos de la clase Colors
public class Stock extends Colors{
    
    //Objetos de la clase Stock segun el excel CarSalesDataForReports
    private String Make;
    private String Model;
    private String VehicleType;
    private float CostPrice;
    private float SpareParts;
    private float LaborCost;
    private String Registration_Date; //Se pone la fecha String y luego se coniverte a datetime para la base de datos
    private float Mileage;
    private String PurchaseDate; //Se pone la fecha String y luego se coniverte a datetime para la base de datos
    private int VehicleAgeInYears;

    //Constructor sin parametros
    public Stock() {
    }

    //Constructor con Parametros de la clase Stock que hereda los objetos de la clase Colors(Color)
    public Stock(String Make, String Model, String Color,String VehicleType, float CostPrice, float SpareParts, float LaborCost, String Registration_Date, float Mileage, String PurchaseDate, int VehicleAgeInYears) {
        super(Color);
        this.Make = Make;
        this.Model = Model;
        this.VehicleType = VehicleType;
        this.CostPrice = CostPrice;
        this.SpareParts = SpareParts;
        this.LaborCost = LaborCost;
        this.Registration_Date = Registration_Date;
        this.Mileage = Mileage;
        this.PurchaseDate = PurchaseDate;
        this.VehicleAgeInYears = VehicleAgeInYears;
    }
    
    //Metodo para mostrar los datos nuevos que solicita el ejercicio y que se muestran en la consola
    public void showData(){
        
        System.out.println("Make: " + Make +
                "\nModel: "+ Model +
                "\nColor: "+ getColor() +
                "\nVehicleType: "+ VehicleType +
                "\nCostPrice: " + CostPrice +
                "\nSpareParts: " + SpareParts +
                "\nLaborCost: " + LaborCost +
                "\nRegistration_Date: " + Registration_Date +
                "\nMileage: " + Mileage +
                "\nPurchaseDate: " + PurchaseDate +
                "\nVehicleAgeInYears: " + VehicleAgeInYears);
    } 

    //SETS Y GETS DE LA CLASE Stock
    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public float getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(float CostPrice) {
        this.CostPrice = CostPrice;
    }

    public float getSpareParts() {
        return SpareParts;
    }

    public void setSpareParts(float SpareParts) {
        this.SpareParts = SpareParts;
    }

    public float getLaborCost() {
        return LaborCost;
    }

    public void setLaborCost(float LaborCost) {
        this.LaborCost = LaborCost;
    }

    public String getRegistration_Date() {
        return Registration_Date;
    }

    public void setRegistration_Date(String Registration_Date) {
        this.Registration_Date = Registration_Date;
    }

    public float getMileage() {
        return Mileage;
    }

    public void setMileage(float Mileage) {
        this.Mileage = Mileage;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(String PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    public int getVehicleAgeInYears() {
        return VehicleAgeInYears;
    }

    public void setVehicleAgeInYears(int VehicleAgeInYears) {
        this.VehicleAgeInYears = VehicleAgeInYears;
    }
    
    

    
}
