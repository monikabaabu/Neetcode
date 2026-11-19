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
        for(int i=0;i<intervals.size();i++){
            Interval i1 = intervals.get(i);
            for(int j = i+1;j< intervals.size();j++){
                Interval i2 = intervals.get(j);
                if(Math.min(i1.end,i2.end) > Math.max(i2.start,i1.start)) return false;
            }
        }
        return true;
    }
}
