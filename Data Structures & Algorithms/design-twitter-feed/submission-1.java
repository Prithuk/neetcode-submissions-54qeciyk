

class Tweet{
  int id; 
        int time; 
        Tweet next;


        public Tweet(int id, int time){
                this.id = id; 
                this.time =time; 
                this.next = null;
              
        }
}

    class Twitter {

    Map<Integer, Tweet> tweetMap;
    Map<Integer, Set<Integer>> followMap; 
    int time; 


    public Twitter() { 
       tweetMap = new HashMap<>(); 
       followMap = new HashMap<>(); 
       time =0; 
    }
   
    public void postTweet(int userId, int tweetId) {
     Tweet tweet = new Tweet(tweetId, time ++); 
     tweet.next = tweetMap.get(userId); 
     tweetMap.put(userId, tweet); 
    }

    public void follow(int followerId, int followeeId) {
       followMap.putIfAbsent(followerId, new HashSet<>());
       followMap.get(followerId).add(followeeId); 

    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)){
            followMap.get(followerId).remove(followeeId); 
        }

    }

   public List<Integer> getNewsFeed(int userId) {
    List<Integer> res = new ArrayList<>();

    followMap.putIfAbsent(userId, new HashSet<>());
    followMap.get(userId).add(userId);

    PriorityQueue<Tweet> pq =
        new PriorityQueue<>((a, b) -> b.time - a.time);

    for (int followee : followMap.get(userId)) {
        if (tweetMap.containsKey(followee)) {
            pq.add(tweetMap.get(followee));
        }
    }

    while (!pq.isEmpty() && res.size() < 10) {
        Tweet t = pq.poll();
        res.add(t.id);

        if (t.next != null) {
            pq.add(t.next);
        }
    }
    return res;
}
}
