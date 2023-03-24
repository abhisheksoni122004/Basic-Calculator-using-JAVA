import java.util.Scanner;
import java.util.Vector;

import javax.swing.text.DefaultEditorKit.CutAction;
public class product {
int id;
private float price;
product(int id,float price)
 {
    this.id=id;
    this.price=price;
 }
 public  String toString()
 {
    return "ID:" + id  + "PRICE" + price;
 }
 float getPrice()
 {
    return price;
 }

}
class ShoppingCart
{
    int custid;
    Vector<E> itemsv;
    ShoppingCart(int custid)
    {
        this.custid=custid;
        itemsv = new Vector();
    }
    public void additem(ProductItem pit)
    {
        itemsv.addElement(pit);
    }
    public void removeItem(ProductItem)

}






