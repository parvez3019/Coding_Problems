package salestaxproblem.tax;

/**
 * Created by parvez on 1/8/16.
 */
public class TaxDefine {
        public enum TaxType{
            NA(0),
            BASIC(10.0f/100),
            IMPORTED(5.0f/100),
            BOTH(BASIC.getApplicableTax() + IMPORTED.getApplicableTax());
            private float applicableTax;
            TaxType(float tax){
                applicableTax = tax;
            }
            public float getApplicableTax() {
                return applicableTax;
            }
        }

}
