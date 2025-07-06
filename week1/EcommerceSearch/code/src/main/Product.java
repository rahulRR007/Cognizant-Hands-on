package main;

public class Product {
   int produxt_id;
   String product_name;
   String categeory;
   
   
   public Product(int produxt_id, String product_name, String categeory) {
	super();
	this.produxt_id = produxt_id;
	this.product_name = product_name;
	this.categeory = categeory;
}


   @Override
   public String toString() {
	return "Product [produxt_id=" + produxt_id + ", product_name=" + product_name + ", categeory=" + categeory + "]";
}
   
   
}
