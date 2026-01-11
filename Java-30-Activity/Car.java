class Car{
    String brand;
    String model;
    String color;
    int year;
    double value;

    Car(String brand,String model,String color,int year,double value){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.value = value;
    }

    void honk(){
        System.out.println("Honk");
    }
}

