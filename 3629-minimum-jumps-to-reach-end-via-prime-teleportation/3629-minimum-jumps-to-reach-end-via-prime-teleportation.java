class Solution {
    static final int max = 1_000_001;
    static boolean[] prime = new boolean[max];

    static {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int p = 2; p * p < max; p++) {
            if (prime[p]) {
                for (int i = p * p; i < max; i += p) {
                    prime[i] = false;
                }
            }
        }
    }
    public int minJumps(int[] nums) {

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        
        pq.add(new int[]{0,0});
        boolean[] vis=new boolean[nums.length];
        HashSet<Integer> set=new HashSet<>();

        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            if(curr[0]<0 || curr[0]>=nums.length) continue;
            if(vis[curr[0]]) continue;

            if(curr[0]==nums.length-1) return curr[1];

            vis[curr[0]]=true;

            pq.add(new int[]{curr[0]-1,curr[1]+1});
            pq.add(new int[]{curr[0]+1,curr[1]+1});

            if(prime[nums[curr[0]]] && !set.contains(nums[curr[0]])){
                int n=nums[curr[0]];
                set.add(n);
                for(int i=0;i*n<max;i++){
                    if(!map.containsKey(i*n)) continue;

                    for(int j:map.get(i*n)){
                        if(vis[j]) continue;
                        pq.add(new int[]{j,curr[1]+1});
                    }
                }
            }
        }

        return -1;
        
    }
}