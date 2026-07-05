package Advanced_JUnit_Testing.Exercise2;

import Advanced_JUnit_Testing.Exercise1.EvenCheckerTest;
import Advanced_JUnit_Testing.Exercise2.BankAccountTest;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({
        BankAccountTest.class,
        EvenCheckerTest.class
})

public class AllTest {


}
