import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {

    public int tour(int[] petrol, int[] distance) {
        int n = petrol.length;
        int total_surplus = 0;
        int current_surplus = 0;
        int start = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            total_surplus += petrol[i] - distance[i];
            current_surplus += petrol[i] - distance[i];
            queue.offer(i);
            
            // If we run out of petrol (current_surplus becomes negative), try a new start
            while (current_surplus < 0 && !queue.isEmpty()) {
                int pump = queue.poll();
                start = pump + 1;  // Move start point to the next pump
                current_surplus = 0;  // Reset current surplus as we start fresh
                queue.clear();  // Clear the queue for a new tour attempt
            }
        }
        
        return total_surplus >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        CircularTour tour = new CircularTour();
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int start = tour.tour(petrol, distance);

        if (start == -1) {
            System.out.println("No valid starting point");
        } else {
            System.out.println("The starting pump is at index: " + start);
        }
    }
}
