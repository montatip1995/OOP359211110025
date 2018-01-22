package ooplab7;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carengsize;
    private String carmaxspeed;
    private String carcounofori;

    public SuperCar(){}

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarengsize() {
        return carengsize;
    }

    public void setCarengsize(String carengsize) {
        this.carengsize = carengsize;
    }

    public String getCarmaxspeed() {
        return carmaxspeed;
    }

    public void setCarmaxspeed(String carmaxspeed) {
        this.carmaxspeed = carmaxspeed;
    }

    public String getCarcounofori() {
        return carcounofori;
    }

    public void setCarcounofori(String carcounofori) {
        this.carcounofori = carcounofori;
    }

    public SuperCar (String cbd, String ccl, String ces, String csp, String cco) {
        this.carbrand = cbd;
        this.carcolor=ccl;
        this.carengsize=ces;
        this.carmaxspeed=csp;
        this.carcounofori=cco;


    }//constructor
    public void getSupercarInfo() {
        System.out.println("SuperCarInfo");
        System.out.println("CarBrand : "+ this.carbrand);
        System.out.println("CarColor : "+ this.carcolor);
        System.out.println("CarEnginesize : "+ this.carengsize);
        System.out.println("CarMaxspeed : "+ this.carmaxspeed);
        System.out.println("CountryofOrigin : "+ this.carcounofori);
    }

}//class
