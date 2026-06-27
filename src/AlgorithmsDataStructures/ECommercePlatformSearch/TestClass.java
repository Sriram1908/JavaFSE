package AlgorithmsDataStructures.ECommercePlatformSearch;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

    static void main() {

        //we can create objects from user input for better clear i keppt like this

        Product p1 = new Product(1 , "ear phones" , "Wired");
        Product p2 = new Product(2 , "head set" , "bluetooth");

        Product p3 = new Product(0 , "laptop" , "Dell");
        Product p4 = new Product(4 , "charger" , "type - c");

        Product[] P = new Product[4];
        P[0] = p1;  P[2] = p3;

        P[1] = p2; P[3] = p4;

            Scanner sc  = new Scanner(System.in);
        System.out.println("Enter element u wanna search");
        int search = sc.nextInt();

        System.out.println(linearSearch(P , search));

        Arrays.sort(P, (a, b) -> Integer.compare(a.pid, b.pid));

        System.out.println(BinarySearch(P , search , 0 , P.length-1));
    }


    static boolean linearSearch(Product[] nums , int k)
    {
        for(int i = 0; i<nums.length; i++)
        {
            if (nums[i].pid == k)
            {
                return true;
            }
        }
        return false;
    }

    static boolean BinarySearch(Product[] nums , int k , int start , int end)
    {
        if(start > end) return false;

        int mid = start + (end-start)/2;

        if(k == nums[mid].pid) return true;
        else if (mid > nums[mid].pid)
            return BinarySearch(nums , k , start , mid);
        else
            return BinarySearch(nums , k , mid+1 , end);
    }
}

