package TaskScheduler621;

import java.util.*;

/**
 * Created by Think on 8/24/17.
 */
public class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> taskNum = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));
        for (char task: tasks) {
            taskNum.put(task, taskNum.getOrDefault(task, 0) + 1);
        }
        priorityQueue.addAll(taskNum.entrySet());
        int sum = 0;
        while (!priorityQueue.isEmpty()) {
            int k = n+1;
            List<Map.Entry<Character, Integer>> temp = new LinkedList<>();
            while (k > 0 && !priorityQueue.isEmpty()) {
                Map.Entry<Character, Integer> entry = priorityQueue.poll();
                if (entry.getValue() - 1 > 0) {
                    entry.setValue(entry.getValue()-1);
                    temp.add(entry);
                }
                --k;
                ++sum;
            }
            priorityQueue.addAll(temp);
            if (!priorityQueue.isEmpty())
                sum += k;
        }
        return sum;
    }
}
