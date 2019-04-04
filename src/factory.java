/**
 * @auther tl
 * @create 2019-04-04 10:53
 */


public class factory {
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A"))
            product = new ProductA();
        else if (arg.equalsIgnoreCase("B"))
            product = new ProductB();


        return product;
    }
}