class Solution {
    public int minimumRounds(int[] tasks) {
        int answer = 0;
        HashMap map = new HashMap();
        for(int i = 0; i < tasks.length; i++){
            if(map.containsKey(tasks[i])){
                int count = (int)map.get(tasks[i]);
                map.put(tasks[i], count+1);
            }else{
                map.put(tasks[i],1);
            }
        }
 
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            if((int)entry.getValue() == 1){
                return -1;
            }else{
                answer += ((int)entry.getValue()-1)/3+1;
            }
        }
        return answer;
    }
}
