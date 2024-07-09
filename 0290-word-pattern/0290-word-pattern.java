class Solution {
    public boolean wordPattern(String pattern, String s) {
        String res[]=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map1=new HashMap<>();
        if(pattern.length()!=res.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(res[i])){
                    return false;
                }
            }
            else{
                map.put(pattern.charAt(i),res[i]);
            }
            if(map1.containsKey(res[i])){
                if(!map1.get(res[i]).equals(pattern.charAt(i))){
                    return false;
                }

            }
            else{
                map1.put(res[i],pattern.charAt(i));
            }
        }

        return true;
        
    }
}