class Solution {
    public int largestRectangleArea(int[] heights) {
    Stack<Integer> st1=new Stack<>();
    int [] prevsmallest=new int[heights.length];
    st1.push(0);
    prevsmallest[0]=0;
    for(int i=1;i<heights.length;i++){
        while(st1.size()!=0 && heights[i]<=heights[st1.peek()])  st1.pop();
        if(st1.size()==0) prevsmallest[i]=i;
        else prevsmallest[i]=i-st1.peek()-1;
        st1.push(i);
    }
    Stack<Integer> st2=new Stack<>();
    st2.push(heights.length-1);
    for(int i=heights.length-2;i>=0;i--){
        while(st2.size()!=0 && heights[i]<=heights[st2.peek()]) st2.pop();
        if(st2.size()==0) prevsmallest[i]+=heights.length-1-i;
        else  prevsmallest[i]+=st2.peek()-i-1;
        st2.push(i);
    }
    int maxarea=Integer.MIN_VALUE;
    for(int i=0;i<heights.length;i++){
        int width=prevsmallest[i]+1;
        int area=width*heights[i];
        maxarea=Math.max(area,maxarea);
    }
    return maxarea;
        }
    }