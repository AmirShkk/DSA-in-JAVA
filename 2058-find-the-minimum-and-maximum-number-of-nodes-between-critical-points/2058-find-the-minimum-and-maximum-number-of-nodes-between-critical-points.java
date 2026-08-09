class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int[] ans = {-1,-1};
        if(head == null || head.next == null || head.next.next == null) {
            return ans;
        }
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        int minDist = Integer.MAX_VALUE;
        int firstIdx = -1;
        int lastIdx = -1;
        int idx =1;
        while(c != null){
            if(b.val > c.val && b.val > a.val ||b.val < c.val && b.val < a.val ){
                if(firstIdx == -1) firstIdx = idx;
                if(lastIdx != -1){
                    int dist = idx - lastIdx;
                    minDist = Math.min(minDist,dist);
                }
                lastIdx = idx;
                
            }
           idx++;
           a = a.next;
           b =  b.next;
           c = c.next; 

        }
        int maxDist = lastIdx - firstIdx;
        if(maxDist == 0) maxDist = -1;
        if(minDist == Integer.MAX_VALUE) minDist = -1;
        ans[0] = minDist;
        ans[1] = maxDist;
        return ans;
    }
}