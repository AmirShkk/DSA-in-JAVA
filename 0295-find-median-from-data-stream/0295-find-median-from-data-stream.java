class MedianFinder {
    PriorityQueue<Integer> minhp;
    PriorityQueue<Integer> maxhp;
    int minsize;
    int maxsize;
    public MedianFinder() {
        this.minhp=new PriorityQueue<>();
        this.maxhp=new PriorityQueue<>(Collections.reverseOrder());
        this.minsize=0;
        this.maxsize=0;
    }
    
    public void addNum(int num) {
        if(minsize==0 || maxsize==0) {
            maxhp.add(num);
            maxsize++;
        }
        else if(num<maxhp.peek()) {
            maxhp.add(num);
            maxsize++;
        }
        else{
          minhp.add(num);
          minsize++;
        }
        if(Math.abs(maxsize-minsize)>1){
            if(maxsize>minsize) {
                minhp.add(maxhp.remove());
                minsize++;
                maxsize--;
            }
            else {
                maxhp.add(minhp.remove());
                maxsize++;
                minsize--;
        }
    }
    }
    
    public double findMedian() {
        if((minsize+maxsize)%2==0) return (minhp.peek()+maxhp.peek())/2.00;
        if(minsize>maxsize) return minhp.peek();
        return maxhp.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */