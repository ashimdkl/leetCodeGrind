package mediumProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int [] topKFrequent(int [] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // frequency (var solo) = key, represents the element from the array.
        // the method call on the freqMap = value that is stored in the map under frequency. 
        // this represents the count.
        for (int frequency : nums) {
            frequencyMap.put(frequency, frequencyMap.getOrDefault(frequency,0)+1);
        }
        
        /*declare PQ that stores <Int>. PQ = elements ordered by natural ordering or cmparator.

        lambda expr to implement the comparator interface.
        
        n1/n2 are 2 ints from q, it gets the freq of n1/n2 respectively.
        then, we use get(n1) - get(n2) to dictate the order of the q.

        If the result is negative, n1 is considered less than n2.
        If the result is positive, n1 is considered greater than n2.
        If the result is zero, n1 and n2 are considered equal.
        */

        PriorityQueue<Integer> heap = 
            new PriorityQueue<>((n1,n2) -> frequencyMap.get(n1) - frequencyMap.get(n2));

        // now, we need to only keep the k most frequent elements, and we can remove others.

        for (int n : frequencyMap.keySet()) {
            heap.add(n);
            if(heap.size() > k) {
                heap.poll(); // remove the least frequent elements / end of the heap.
            }
        }

        // now we just need to output it.
        int[] topKFrequent = new int[k];
        for (int i = 0; i < k; i++) {
            topKFrequent[i] = heap.poll();
        }
        
        return topKFrequent;

    }
}
