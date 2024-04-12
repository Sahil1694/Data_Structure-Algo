package Stack;


import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator implements Runnable {

    protected LocalDate birthDate;
    protected LocalDate currentDate;

    public AgeCalculator(LocalDate birthDate, LocalDate currentDate) {
        this.birthDate = birthDate;
        this.currentDate = currentDate;
    }

    public int calculateAge() {
        return Period.between(birthDate, currentDate).getYears();
    }

    public void displayAge() {
        System.out.println(Thread.currentThread().getName() + ", your age is " + calculateAge());
    }

    @Override
    public void run() {
        displayAge();
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2004, 9, 16);
        LocalDate currentDate = LocalDate.now();

        AgeCalculator calculator1 = new AgeCalculator(birthDate, currentDate) {
            public void displayAge() {
                System.out.println("Sahil, your age is " + calculateAge());
            }
        };

        AgeCalculator calculator2 = new AgeCalculator(birthDate, currentDate) {
            public void displayAge() {
                System.out.println("Ram, your age is " + calculateAge());
            }
        };

        AgeCalculator calculator3 = new AgeCalculator(birthDate, currentDate) {
            public void displayAge() {
                System.out.println("Om, your age is " + calculateAge());
            }
        };

        Thread thread1 = new Thread(calculator1);
        Thread thread2 = new Thread(calculator2);
        Thread thread3 = new Thread(calculator3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
