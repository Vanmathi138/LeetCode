import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(stones)); // Output: 1
    }

    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            maxHeap.add(stone);
        }
        while(maxHeap.size() > 1){
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if(stone1 != stone2){
                maxHeap.add(stone1-stone2);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll() ;
    }
}
