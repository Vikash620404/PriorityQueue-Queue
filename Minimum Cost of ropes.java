 long minCost(long arr[], int n) 
    {
      PriorityQueue<Long> pq = new PriorityQueue<>();
       for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long ans=0;
        while(pq.size()>1){
            long first=pq.poll();
            long second=pq.poll();
            long sum=first+second;
            ans+=sum;
            pq.add(sum);
            
        }
        return ans;
    }



//O(NLogN)
//O(N)
