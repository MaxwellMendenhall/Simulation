public class HatCheckSimulation {
    public static void main(String[] args) {
        //1. create a new hatcheck
        Hatcheck hatcheck = new Hatcheck();
        //2. loop through each value of n: 2, 7, 12...47
        for (int n = 2; n <= 47; n += 5) {
            //2.1 let t=0.0
            double t = 0.0;
            //2.2 looping for 100 times (note: increase this value for more accurate results, like use a value like 10000
            // or above)
            int trials = 100;
            for (int i = 0; i < trials; i++) {
                //2.2.1 let match = false
                boolean match = false;
                //2.2.2 creating an array of n customers
                Customer array[] = new Customer[n];
                //2.2.3 looping through each customer in the array
                for (int j = 0; j < n; j++) {
                    //2.2.3.1 creating the customer
                    array[j] = new Customer();
                    //2.2.3.2 checking out the hat with the hatcheck object
                    hatcheck.check(array[j].getHat());
                }
                //2.2.4 looping through each customer in the array
                for (int j = 0; j < n; j++) {
                    //2.2.4.1 returning the hat from hatcheck, to see if it matches the customer's hat
                    //note: here we need to use == operator, because we are actually comparing the
                    //object references (i.e to see if they share the same memory address)
                    if (hatcheck.retrieveHat() == array[j].getHat()) {
                        //2.2.4.1.1 setting match to true
                        match = true;
                    }
                }
                //2.2.5 if match is true, then increment t by 1.0
                if (!match) {
                    t++;
                }

            }
            //2.3 finding p as t/trials
            double p = t / trials;
            //2.4 printing out the values of n and p
            System.out.println("n=" + n + "\t" + "p=" + p);
            //System.out.println("HatCheckSimulation: correct");
        }
        System.out.println("HatCheckSimulation: Correct");
    }
}
