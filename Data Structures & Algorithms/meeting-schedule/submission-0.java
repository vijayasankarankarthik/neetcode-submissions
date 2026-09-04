/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        // Sort intervals by start time
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        int i = 0;
        boolean overlap = false;

        while (i < intervals.size() - 1) {

            if (intervals.get(i).end <= intervals.get(i + 1).start) {
                i++;
            } else {
                overlap = true;
                break;
            }
        }

        if (overlap == true) {
            return false;
        } else {
            return true;
        }
    }
}