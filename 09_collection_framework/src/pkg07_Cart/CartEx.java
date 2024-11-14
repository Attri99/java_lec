package pkg07_Cart;

public class CartEx {

  public static void main(String[] args) {
    Cart cart = new Cart(5);
    
    cart.addProduct(null);
    cart.addProduct(new Product("새우깡", 1000));
    cart.addProduct(new Product("TV", 2000));
    cart.addProduct(new Product("컵", 3000));
    cart.addProduct(new Product("낙지", 4000));
    cart.addProduct(new Product("카메라", 5000));
    cart.addProduct(new Product("책상", 6000));

    cart.removeProduct(0);
    cart.removeProduct(0);
    
    for(int i = 0; i < cart.getProducts().length; i++) {
      System.out.println(cart.getProducts()[i].getName());
      System.out.println("  " + cart.getProducts()[i].getPrice());
    }
  }

}
