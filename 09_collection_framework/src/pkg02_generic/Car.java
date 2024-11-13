package pkg02_generic;

public class Car{
  
  private String Model;
  private String Brand;
    
  
  public Car(String model, String brand) {
    super();
    this.Brand = brand;
    this.Model = model;
  }
  
  
  public String getModel() {
    return Model;
  }


  public void setModel(String model) {
    Model = model;
  }


  public String getBrand() {
    return Brand;
  }


  public void setBrand(String brand) {
    Brand = brand;
  }

  @Override
  public String toString() {
    return "Car [Model=" + Model + ", Brand=" + Brand + "]";
  }
  
  
  
  
  
  
}
