public class Product {
   String name;
   double price;

   public Product() {
      this.name = "";
      this.price = 0.0;
   }

   public String getName() {
      return name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
