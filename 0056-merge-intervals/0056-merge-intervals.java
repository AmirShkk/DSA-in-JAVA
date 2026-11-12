class Solution {
    public int[][] merge(int[][] intervals) {
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    int minval=Integer.MAX_VALUE;
    int maxval=Integer.MIN_VALUE;
    for(int i=0;i<intervals.length;i++){
        if(intervals[i][0]>maxval && maxval!=Integer.MIN_VALUE){
            List<Integer> innerarr=new ArrayList<>();
            innerarr.add(minval);innerarr.add(maxval);
            ans.add(innerarr);
            minval=intervals[i][0];
            maxval=intervals[i][1];
            continue;
        }
        if(intervals[i][0]<minval && intervals[i][1]>maxval){
            minval=intervals[i][0];
            maxval=intervals[i][1];
        }
        else if(intervals[i][0]<minval) minval=intervals[i][0];
        else if(intervals[i][1]>maxval) maxval=intervals[i][1];
    }
    List<Integer> innerarr=new ArrayList<>();
    innerarr.add(minval);innerarr.add(maxval);
    ans.add(innerarr);
    int [][]arr=new int[ans.size()][2];
    for(int i=0;i<ans.size();i++){
        arr[i][0]=ans.get(i).get(0);
        arr[i][1]=ans.get(i).get(1);
    }
    return arr;   
    }
}