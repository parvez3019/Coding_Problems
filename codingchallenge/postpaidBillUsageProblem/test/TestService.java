package codingchallenge.postpaidBillUsageProblem.test;

import org.junit.Test;
import service.CalculateUsage;

/**
 * Created by parvez on 8/8/16.
 */
public class TestService {
    public static void main(String[] args){
        new CalculateUsage().calculateUsage("1000 mins isd call to abcd");
    }
}
