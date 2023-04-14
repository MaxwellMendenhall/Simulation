public class RandomBirthday {

    public static void main(String[] args) {
            double p = 0.0;
            int n = 1;
            while (p <= 0.5) {
                    n++;
                    double t = 0.0;
                    for (int i = 1; i <= 100; i++) {
                            int[] birthdays = new int[366]; // including leap
                            for (int j = 1; j <= n; j++) {
                                    Person temp = new Person();
                                    birthdays[temp.getBirthday()]++;
                            }
                            for (int j = 0; j < 366; j++) {
                                    if (birthdays[j] == 2) {
                                            t++;
                                    }
                            }
                    }
                    p = t / 100;
            }
            System.out.println(n + " is the number of people that are needed for p to be >0.5");
            System.out.println("RandomBirthday: Correct");
    }

}
