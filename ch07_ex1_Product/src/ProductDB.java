public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object

        Product product = new Product();
        
        // fill the Product object with data
        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
           product = new Product("java", "Murach's Java Programming", 57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
        	product = new Product("jsp", "Murach's Java for Serious People", 75.00);
        } else if (productCode.equalsIgnoreCase("mysql")) {
        	product =new Product("mysql", "Murach's MySql Programming", 54.50);
        } else if (productCode.equalsIgnoreCase("hstry")) {
        	product =new Product("hstry", "Murach's History Book", 58.00);
        } else {
        	product =new Product("n/a", "None", 0.00);
        }
		return product;
    }
}
