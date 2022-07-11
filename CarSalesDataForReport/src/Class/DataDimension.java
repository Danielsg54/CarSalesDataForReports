package Class;

//Clase DataDimension
public class DataDimension {
    
    //Objetos de la clase DataDimension segun el excel CarSalesDataForReports
    private String DataKey;
    private int Year;
    private int MonthNum;
    private String MonthFull;
    private String MonthAbbr;
    private int QuarterNum;
    private String QuarterFull;
    private String QuarterAbbr;
    private float YearAndQuarterNum;
    private String QuarterAbbrAndYear;
    private String MonthAbbrAndYear;
    private String MonthAndYear;
    private String MonthName;
    private String MonthNameAbbr;
    private String QuarterAndYear;
    private String QuarterAndYearAbbr2;
    private float YearAndMonthNum;

    
    //Constructor sin parametros
    public DataDimension() {
    }

    //Constructor con parametros de la clase DataDimension
    public DataDimension(String DataKey, int Year, int MonthNum, String MonthFull, String MonthAbbr, int QuarterNum, String QuarterFull, String QuarterAbbr, float YearAndQuarterNum, String QuarterAbbrAndYear, String MonthAbbrAndYear, String MonthAndYear, String MonthName, String MonthNameAbbr, String QuarterAndYear, String QuarterAndYearAbbr2, float YearAndMonthNum) {
        this.DataKey = DataKey;
        this.Year = Year;
        this.MonthNum = MonthNum;
        this.MonthFull = MonthFull;
        this.MonthAbbr = MonthAbbr;
        this.QuarterNum = QuarterNum;
        this.QuarterFull = QuarterFull;
        this.QuarterAbbr = QuarterAbbr;
        this.YearAndQuarterNum = YearAndQuarterNum;
        this.QuarterAbbrAndYear = QuarterAbbrAndYear;
        this.MonthAbbrAndYear = MonthAbbrAndYear;
        this.MonthAndYear = MonthAndYear;
        this.MonthName = MonthName;
        this.MonthNameAbbr = MonthNameAbbr;
        this.QuarterAndYear = QuarterAndYear;
        this.QuarterAndYearAbbr2 = QuarterAndYearAbbr2;
        this.YearAndMonthNum = YearAndMonthNum;
    }

    
    //SETS Y GETS DE LA CLASE DataDimension
    public String getDataKey() {
        return DataKey;
    }

    public void setDataKey(String DataKey) {
        this.DataKey = DataKey;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMonthNum() {
        return MonthNum;
    }

    public void setMonthNum(int MonthNum) {
        this.MonthNum = MonthNum;
    }

    public String getMonthFull() {
        return MonthFull;
    }

    public void setMonthFull(String MonthFull) {
        this.MonthFull = MonthFull;
    }

    public String getMonthAbbr() {
        return MonthAbbr;
    }

    public void setMonthAbbr(String MonthAbbr) {
        this.MonthAbbr = MonthAbbr;
    }

    public int getQuarterNum() {
        return QuarterNum;
    }

    public void setQuarterNum(int QuarterNum) {
        this.QuarterNum = QuarterNum;
    }

    public String getQuarterFull() {
        return QuarterFull;
    }

    public void setQuarterFull(String QuarterFull) {
        this.QuarterFull = QuarterFull;
    }

    public String getQuarterAbbr() {
        return QuarterAbbr;
    }

    public void setQuarterAbbr(String QuarterAbbr) {
        this.QuarterAbbr = QuarterAbbr;
    }

    public float getYearAndQuarterNum() {
        return YearAndQuarterNum;
    }

    public void setYearAndQuarterNum(float YearAndQuarterNum) {
        this.YearAndQuarterNum = YearAndQuarterNum;
    }

    public String getQuarterAbbrAndYear() {
        return QuarterAbbrAndYear;
    }

    public void setQuarterAbbrAndYear(String QuarterAbbrAndYear) {
        this.QuarterAbbrAndYear = QuarterAbbrAndYear;
    }

    public String getMonthAbbrAndYear() {
        return MonthAbbrAndYear;
    }

    public void setMonthAbbrAndYear(String MonthAbbrAndYear) {
        this.MonthAbbrAndYear = MonthAbbrAndYear;
    }

    public String getMonthAndYear() {
        return MonthAndYear;
    }

    public void setMonthAndYear(String MonthAndYear) {
        this.MonthAndYear = MonthAndYear;
    }

    public String getMonthName() {
        return MonthName;
    }

    public void setMonthName(String MonthName) {
        this.MonthName = MonthName;
    }

    public String getMonthNameAbbr() {
        return MonthNameAbbr;
    }

    public void setMonthNameAbbr(String MonthNameAbbr) {
        this.MonthNameAbbr = MonthNameAbbr;
    }

    public String getQuarterAndYear() {
        return QuarterAndYear;
    }

    public void setQuarterAndYear(String QuarterAndYear) {
        this.QuarterAndYear = QuarterAndYear;
    }

    public String getQuarterAndYearAbbr2() {
        return QuarterAndYearAbbr2;
    }

    public void setQuarterAndYearAbbr2(String QuarterAndYearAbbr2) {
        this.QuarterAndYearAbbr2 = QuarterAndYearAbbr2;
    }

    public float getYearAndMonthNum() {
        return YearAndMonthNum;
    }

    public void setYearAndMonthNum(float YearAndMonthNum) {
        this.YearAndMonthNum = YearAndMonthNum;
    }
    
    
    

    
}
