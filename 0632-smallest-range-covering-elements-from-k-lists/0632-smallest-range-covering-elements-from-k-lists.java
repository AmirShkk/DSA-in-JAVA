class triplet implements Comparable<triplet>{
    int val;
    int row;
    int col;
    triplet(int val,int row,int col){
        this.val=val;
        this.row=row;
        this.col=col;
    }
    public int compareTo(triplet other){
        return Integer.compare(this.val,other.val);
    }

}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
    PriorityQueue<triplet> minpq=new PriorityQueue<>();
    int max=Integer.MIN_VALUE;
    int i=0;
    while(i<nums.size()){
        minpq.add(new triplet(nums.get(i).get(0),i,0));
        max=Math.max(max,nums.get(i).get(0));
        i++;
    }
    int minrange=minpq.peek().val;
    int maxrange=max;
    while(minpq.peek().col+1<nums.get(minpq.peek().row).size()){
        triplet t=minpq.remove();
        int row=t.row;
        int col=t.col;
        int ele=nums.get(row).get(col+1);
        minpq.add(new triplet(ele,row,col+1));
        max=Math.max(max,ele);
        int minele=minpq.peek().val;
        if((max-minele)<(maxrange-minrange)){
            minrange=minele;
            maxrange=max;
        } 
    }
    int [] ans=new int[2];
    ans[0]=minrange;
    ans[1]=maxrange;
    return ans;
    }
}