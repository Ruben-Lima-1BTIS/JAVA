class Car {
  private int id;
  private int year;
  private double CC;
  private String brand;
  private String model;
  private String color;
  private boolean isAutomatic;

  public Car(int id, int year, double CC, String brand, String model, String color, boolean isAutomatic) {
    this.id = id;
    this.year = year;
    this.CC = CC;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.isAutomatic = isAutomatic;
  }

  public int getYear() {return year;}
  public double getCC() {return CC;}
  public String getColor() {return color;}

  public String getDetails() {
    StringBuilder sb = new StringBuilder();
    sb.append("Brand: ").append(brand).append("\n");
    sb.append("Model: ").append(model).append("\n");
    sb.append("Color: ").append(color).append("\n");
    sb.append("CC: ").append(CC).append("\n");
    sb.append("Gear: ").append(isAutomatic ? "Automatic" : "Manual").append("\n");
    sb.append("ID: ").append(id).append("\n");
    sb.append("Year: ").append(year).append("\n");

    switch (brand.toLowerCase()) {
      case "audi":
      case "bmw":
      case "mercedes":
        sb.append("German Car\n");
        break;
      case "toyota":
      case "honda":
      case "nissan":
        sb.append("Japanese Car\n");
        break;
      case "ford":
      case "chevrolet":
      case "tesla":
        sb.append("American Car\n");
        break;
      case "fiat":
      case "ferrari":
      case "lamborghini":
        sb.append("Italian Car\n");
        break;
      case "peugeot":
      case "renault":
      case "citroen":
        sb.append("French Car\n");
        break;
      default:
        sb.append("Other Manufacturer\n");
    }
    sb.append(CC >= 2.0 ? "Very good car" : "Mid car");
    return sb.toString();
  }
}