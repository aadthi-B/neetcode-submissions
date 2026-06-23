class TimeMap {
    HashMap<String,List<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
      if(!map.containsKey(key)){
        map.put(key,new ArrayList<>());
      }
      
        map.get(key).add(new Pair(value,timestamp));
      
    }
    
    public String get(String key, int timestamp) {
          if (!map.containsKey(key)) return "";


        int l = 0;
        int r = map.get(key).size() - 1;
        String res = "";

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (map.get(key).get(mid).timestamp <= timestamp) {
                res = map.get(key).get(mid).value;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return res;
    }
        
    }
    class Pair{
        String value;
        int timestamp;

        Pair(String value,int timestamp){
            this.value=value;
            this.timestamp=timestamp;
        }
    }

