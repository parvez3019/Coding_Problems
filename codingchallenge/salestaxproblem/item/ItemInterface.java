package codingchallenge.salestaxproblem.item;

/**
 * Created by parvez on 1/8/16.
 */
public interface ItemInterface {
    void setItemDescription(String description);
    String getItemDescription();
    void setItemType(ItemDefine.ItemType itemType);
    void setItemPrice(float price);
    float getItemPrice();

    Boolean isItemImported();
    Boolean isItemExempted();

    float getItemPriceWithTax();
    float getItemSalesTax();

}
