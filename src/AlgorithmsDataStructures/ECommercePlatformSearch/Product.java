package AlgorithmsDataStructures.ECommercePlatformSearch;

//Explain Big O notation and how it helps in analyzing algorithms.
//Describe the best, average, and worst-case scenarios for search operations.


// so Big O notation  will describe the worst case time  of algorithm
// why worst  means simple we need to estimate the worst case possibility all time

//Best is Ω() for searching means above this much of time cant be true this is the final
// avg is 0() same the average TC for algos
// wost is as we discussed the worstt case that we assume to happen cant be more worse thant that O()



public class Product {

    int pid;
    String pname;
    String categ;


    Product(int pid , String pname , String categ)
    {
        this.pid = pid;
        this.pname = pname;
        this.categ = categ;
    }
}
