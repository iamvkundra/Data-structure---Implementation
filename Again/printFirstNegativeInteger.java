package com.company.SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class printFirstNegativeInteger {
    public long[] printFirstNegativeInteger(long arr[], int N, int k)
    {
        LinkedList<Long> Di = new LinkedList<>();
        List<Long> res = new ArrayList<>();
        long i=0;
        long j=0;
        while(i< arr.length){
            if(arr[(int) j] < 0){
                Di.add(arr[(int) j]);
            }
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                if(Di.size() == 0) {
                    res.add(0L);
                }else{
                    res.add(Di.getFirst());
                    if(arr[(int) i] == Di.getFirst()){
                        Di.removeFirst();
                    }
                }
                i++;
                j++;
            }
        }

        long ans[] = new long[res.size()];
        for(long m=0;m<ans.length;m++){
            ans[(int) m] = res.get((int) m);
        }
        return ans;
    }
}
