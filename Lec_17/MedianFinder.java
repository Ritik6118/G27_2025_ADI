package Lec_17;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    PriorityQueue<Integer> left=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right=new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
            if(left.size()==0 ||  left.peek()>=num){
                left.add(num);
            }
            else{
                right.add(num);
            }

            if(left.size()<right.size()){
                left.add(right.poll());
            }
            if(left.size()>right.size()+1){
                right.add(left.poll());
            }
    }
    
    public double findMedian    () {
        if(left.size()==right.size()){
            return (left.peek()+right.peek())*1.0/2.0;
        }
        return left.peek()*1.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */