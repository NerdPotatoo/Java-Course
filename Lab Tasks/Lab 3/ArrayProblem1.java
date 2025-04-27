public class ArrayProblem1{
    public static void main(String[] args)
    {
        int[] seats = {1,0,0,1,1,0,0,1,1,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,1,0,0,1,1,0};

        int booked = 0, available = 0;
        for(int i = 0; i<30; i++)
        {
            if(seats[i] == 1) booked++;
            else available++;
        }
        System.out.println("Booked seats: " + booked);
        System.out.println("Available seats: " + available);
    }
}