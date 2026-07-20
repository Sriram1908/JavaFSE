package AlgorithmsDataStructures.FinancialForecasting;


//Explain the concept of recursion and how it can simplify certain problems.

// a function that calls itself is called a recursive
//the main imp thing in recursion is the base case when to terminate the flow of recursion



public class TestClass {

    static void main()
    {
        double present = 10000;
        int rate = 2;
        int years = 5;

        double future = find(present , rate , years);

        System.out.println("Present Value:" + present);
        System.out.println("Growth Rate:"+rate);
        System.out.println("Future Value:" + future);
    }

    static double find(double present , int rate , int years)
    {
        if(years == 0)
            return present;

        double newAmount = present + (present*(rate)/100);
        return find(newAmount , rate , years-1);
    }
}


//time complexity the general complexity of recursion is 2^n
// the function calls nuntil year become zero so n = years 2^years


// we have standard approaches like memoization , tabulization called Dp
// simply it works in a way where all repeated values of the function is stored in a like memory (assume) and return it when they  called