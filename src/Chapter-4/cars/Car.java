public class Car {
  String brand;
  String model;
  String numberPlate;
  String color;

  public Car(String brand, String model, String numberPlate, String color) {
    this.brand = brand;
    this.model = model;
    this.numberPlate = numberPlate;
    this.color = color;
  }

  public void other(String brand2, String model2, String numberPlate2, String color2) {
    this.brand = brand2;
    this.model = model2;
    this.numberPlate = numberPlate2;
    this.color = color2;

  }

  public String toString() {
    return this.brand + " " + this.model + ", " + this.color + " [" + this.numberPlate + "]";

  }

  public boolean equals(Car other) {
    return this.toString().equals(other.toString());
  }

  public boolean alike(Car other) {
    var alikeB = this.brand.equals(other.brand); 
    var alikeM = this.model.equals(other.model); 
    var alikeC = this.color.equals(other.color);
    if (alikeB && alikeM && alikeC ) {
    return true;
    }
    return false;
  }
}