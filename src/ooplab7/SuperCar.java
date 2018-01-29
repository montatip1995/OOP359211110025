package ooplab7;

public class SuperCar {
    private String carBrand;
    private String carColor;
    private String engSize;
    private String carmaxspeed;
    private String carcounofori;
    //constructor
    public SuperCar(){}
    public SuperCar(String b,String c, String e,String f,String g){

        this.carBrand = b;
        this.carColor = c;
        this.engSize =e;
        this.carmaxspeed = f;
        this.carcounofori =g;
    }

    public String carmaxspeed() {
        return carmaxspeed;
    }

    public String carcounofori() {
        return carcounofori;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    //getter and setter methods
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }



    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engSize='" + engSize + '\'' +
                ", carmaxspeed='" + carmaxspeed + '\'' +
                ", carcounofori='" + carcounofori + '\'' +
                '}';
    }//getSuperCarInfo
}//class