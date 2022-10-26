public class Flowers {
    private String flowerName;
    private String country;
    private double cost;
    int lifeSpan;

    Flowers (String flowerName,String country, double cost){
        this.flowerName = flowerName;
        this.cost = cost;
        this.country = country;
        this.lifeSpan = lifeSpan;
        lifeSpan =3;
            if (country == null && country.isEmpty() && country.isBlank())
                System.out.println("Россия");
        }

    Flowers (String flowerName, double cost, int lifeSpan){
        this.flowerName = flowerName;
        this.cost = cost;
        this.country = country;
        this.lifeSpan = lifeSpan;
        this.country="Россия";
            if (country == null || country.isEmpty() ||country.isBlank())
                System.out.println("Россия");
        }

    Flowers (String flowerName, String country, double cost, int lifeSpan){
        this.flowerName = flowerName;
        this.cost = cost;
        this.country = country;
        this.lifeSpan = lifeSpan;
            if (country == null || country.isEmpty() ||country.isBlank())
                System.out.println("Россия");
        }
    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank())
            System.out.println("Ромашка");
        this.flowerName = flowerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() ||country.isBlank())
            System.out.println("Россия");
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if ( cost <= 0)
            System.out.println(0);
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if ( lifeSpan !=0 && lifeSpan% 1 == 0 && lifeSpan >0 ) {
            this.lifeSpan = lifeSpan;
        }else {
            System.out.println("значение может быть только целочисленным и только положительным числом");
            this.lifeSpan = lifeSpan;
        }
    }
    void  flowers(){
        System.out.println( " Название цветка " + getFlowerName() + " Страна происхождения " + getCountry()+ " Стоимость " + getCost() + " Срок стояния цветка " + lifeSpan);


    }
}
