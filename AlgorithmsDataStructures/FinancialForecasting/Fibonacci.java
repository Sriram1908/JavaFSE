package AlgorithmsDataStructures.FinancialForecasting;


import java.util.*;

public class Fibonacci {

   static int levels = 0;
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int recursion = helper(num);
        int fib = dp(num );

        System.out.println("Recursion levels " + levels);
        System.out.println(recursion);
        System.out.println(fib + " TC is "+num);
    }

    static int helper(int num )
    {
        if (num <= 2)
            return num;
        levels++;
        return helper(num -1) + helper(num-2);
    }
    static int dp (int num)
    {
        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[num];
    }
}


//output

//Recursion levels 2178308
//        3524578
//        2178309 TC is 32