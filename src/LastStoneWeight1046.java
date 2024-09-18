import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {
    public static int lastStoneWeight(int[] stones) {
        // Create a max-heap using a priority queue with reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Process the stones until at most one is left
        while (maxHeap.size() > 1) {
            // Get the two heaviest stones
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            // If they are not equal, push the difference back into the heap
            if (stone1 != stone2) {
                maxHeap.add(stone1 - stone2);
            }
        }

        // Return the weight of the last stone, or 0 if no stones are left
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones)); // Output: 1
    }
}
