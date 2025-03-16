/*
ABC Company pays an employee $8.25 an hour plus 1.5 times the standard payment for overtime duty.
An employee's standard working hours are 40 hours per week.
Write a Java program to calculate the payment of an employee who worked 47 hours last week.
*/
public class Problem_5 {
    public static void main(String[] args)
    {
        double workHour = 47, payment = 8.25, overtimePaymentRate = 1.5, Tot = 0, overTimeHour, overTimePayment;
        overTimeHour = workHour-40;
        workHour -= overTimeHour;

        overTimePayment = payment*overtimePaymentRate*overTimeHour;
        payment = payment*workHour;

        Tot = overTimePayment+payment;
        System.out.println(Tot);
    }
}