
package carsalesdataforreport;
import Class.Stock;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CarSalesDataForReport {

    public static void main(String[] args) {
        
        // Se crea un objeto Stock agregar el vehiculo de transporte nuevo.
        Stock stock = new Stock();
        
        //Se crean los objetos que necesita la clase Stock
        String Make;
        String Model;
        String Color;
        String VehicleType;
        float CostPrice;
        float SpareParts;
        float LaborCost;
        String Registration_Date;
        float Mileage;
        String PurchaseDate;
        int VehicleAgeInYears;
        
        //Se usa Scanner para guardar los datos ingresados en la consola
        Scanner sc = new Scanner(System.in);
        
        //Se usa el LocalDateTime para registrar la hora actual de la computadora
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        //Se crea un DateTimeFormatter para cambiar el formato de la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        //Se crea un String formattedDateTime para cambiar el formato del LocalDateTime a string y asi digitarlo en el campo correspondiente
        String formattedDateTime = currentDateTime.format(formatter);

        //Funciones para Solicitar los datos
        System.out.println("Who made da Vehicle? \n");
        Make = sc.nextLine();
        
        System.out.println("What model is the vehicle?  \n");
        Model = sc.nextLine();
        
        System.out.println("What color is the Vehicle: \n");
        Color = sc.nextLine();
        
        System.out.println("What type of vehicle is it: \n");
        VehicleType = sc.nextLine();
        
        System.out.println("How much it cost? \n");
        CostPrice = sc.nextFloat();
        
        System.out.println("How much do spare parts cost? \n");
        SpareParts = sc.nextFloat();
        
        System.out.println("How much labor cost? \n");
        LaborCost = sc.nextFloat();
        
        System.out.println("How much mileage does it have \n");
        Mileage = sc.nextFloat();
        
        System.out.println("Purchase Date?  \n");
        PurchaseDate = sc.nextLine();
        
        System.out.println("How old is this vehicle? \n");
        VehicleAgeInYears = sc.nextInt();
        
        //Se le asigna al dato correspondiente el LocalDateTime transformado a String
        Registration_Date = formattedDateTime;
        
        //Se llama a los sets de la clase Stock para asignarles cada dato que se digto anteriormente
        stock.setMake(Make);
        stock.setModel(Model);
        stock.setColor(Color);
        stock.setVehicleType(VehicleType);
        stock.setCostPrice(CostPrice);
        stock.setSpareParts(SpareParts);
        stock.setLaborCost(LaborCost);
        stock.setRegistration_Date(Registration_Date);
        stock.setMileage(Mileage);
        stock.setPurchaseDate(PurchaseDate);
        stock.setVehicleAgeInYears(VehicleAgeInYears);
        
        //Se llama al metodo ShowData de la clase Stock para mostrar los datos guardados del vehiculo nuevo
        stock.showData();
    }
    
}
