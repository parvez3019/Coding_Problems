package salestaxproblem.tax;

import salestaxproblem.item.Item;
import salestaxproblem.item.ItemDefine;
import salestaxproblem.item.ItemInterface;

/**
 * Created by parvez on 1/8/16.
 */
public interface TaxCalculatorInterface {
    float calculateTax(ItemInterface itemType);
}
