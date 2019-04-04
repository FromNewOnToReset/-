/**
 * @auther tl
 * @create 2019-04-04 11:55
 */
//    简单工厂模式
/**
 *利用工厂类创建产品
 *据所传入的参数不同可以创建不同的产品
 */
public class client {
    public static void main(String[] args) {
        Product product=factory.getProduct("a");
        System.out.println(product.getClass().getName());
        System.out.println(product.getClass().getSuperclass().getName());


    }
}
