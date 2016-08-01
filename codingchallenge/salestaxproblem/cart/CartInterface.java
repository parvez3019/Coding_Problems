package salestaxproblem.cart;

import salestaxproblem.item.ItemInterface;

/**
 * Created by parvez on 1/8/16.
 */
public interface CartInterface {
    void addItemToCart(ItemInterface item);
    void calculateAndPrintReceiptWithTax();
    float getTotalCost();
    float getSalesTax();
}