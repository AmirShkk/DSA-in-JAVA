class Solution {
    public int maximalrect(int[] arr){
        int maxarea=Integer.MIN_VALUE;
        Stack<Integer> st1=new Stack<>();
        int []prevsmallest=new int[arr.length];
        prevsmallest[0]=0;
        st1.push(0);
        for(int i=1;i<arr.length;i++){
            while(st1.size()!=0 && arr[i]<=arr[st1.peek()]) st1.pop();
            if(st1.size()==0) prevsmallest[i]=i;
            else prevsmallest[i]=i-st1.peek()-1;
            st1.push(i);
        }
        Stack<Integer> st2=new Stack<>();
        int [] nextsmallest=new int[arr.length];
        nextsmallest[arr.length-1]=0;
        st2.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(st2.size()!=0 && arr[i]<=arr[st2.peek()]) st2.pop();
            if(st2.size()==0) nextsmallest[i]=arr.length-1-i;
            else nextsmallest[i]=st2.peek()-i-1;
            st2.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int width=prevsmallest[i]+nextsmallest[i]+1;
            int area=arr[i]*width;
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
    public int maximalRectangle(char[][] matrix) {
    int [][] arr=new int[matrix.length][matrix[0].length];
    int max=Integer.MIN_VALUE;
    for(int j=0;j<matrix[0].length;j++){
        int prefixsum=0;
        for(int i=0;i<matrix.length;i++){
          if(matrix[i][j]=='1')prefixsum++;
          else prefixsum=0;
          arr[i][j]=prefixsum;
        }
    }
    for(int i=0;i<matrix.length;i++){
        max=Math.max(max,maximalrect(arr[i]));
        System.out.println(max);
    }    
    return max;
    }
}