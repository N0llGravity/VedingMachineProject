import java.net.DatagramSocketImplFactory;
import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDespenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Product item1 = new Product(346, 5, "Nishtyaks", 1234);
        Product item2 = new Product(234, 8, "Mars", 1234);
        Product item3 = new Product(12, 12, "Cola", 1234);
        Product item4 = new Product(250, 15, "<Milky>", 1234);
        Product item5 = new Product(123, 9, "Vorontsovskie", 1234);
        Product item6 = new Product(332, 2, "Nuts", 1234);
        Bottle item7 = new Bottle(332, 7, "Cola", 1034, 0.5f);
        HotDrink item8 = new HotDrink(15, 23, "cappuccino", 1345, 80);
        HotDrink item9 = new HotDrink(15, 23, "raf", 13745, 75);

        Holder hold = new Holder();
        CoinDespenser coin = new CoinDespenser();
        Display disp = new Display();
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(item1);
        listProduct.add(item2);
        listProduct.add(item3);
        listProduct.add(item4);
        listProduct.add(item5);
        listProduct.add(item6);
        listProduct.add(item7);
        listProduct.add(item8);
        listProduct.add(item9);
        

        VendingMachine vm = new VendingMachine(hold, coin, disp, listProduct);
        
        for(Product p : vm.getAssort()){
            System.out.println(p);
        }

       

    }
}
