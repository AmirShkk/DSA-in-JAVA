class Solution {
    class Triplet implements Comparable<Triplet>{
        int x;
        int y;
        int dist;
        Triplet(int x,int y,int dist){
            this.x=x;this.y=y;this.dist=dist;
        }
        public int compareTo(Triplet t){
            return Integer.compare(this.dist,t.dist);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
     PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
     for(int [] ele:points){
        int x=ele[0];int y=ele[1];
        int dist=(x*x)+(y*y);
        pq.add(new Triplet(x,y,dist));
        if(pq.size()>k) pq.remove();
     }
    int [][] ans=new int[k][2];
    for(int i=0;i<k;i++){
        Triplet t=pq.remove();
        ans[i][0]=t.x;
        ans[i][1]=t.y;
    }
    return ans;
    }
}