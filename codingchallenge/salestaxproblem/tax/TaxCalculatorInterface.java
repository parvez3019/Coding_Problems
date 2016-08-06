package codingchallenge.salestaxproblem.tax;

import codingchallenge.salestaxproblem.item.Item;
import codingchallenge.salestaxproblem.item.ItemDefine;
import codingchallenge.salestaxproblem.item.ItemInterface;

/**
 * Created by parvez on 1/8/16.
 */
public interface TaxCalculatorInterface {
    float calculateTax(ItemInterface itemType);
}
