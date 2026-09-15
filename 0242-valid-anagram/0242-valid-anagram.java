class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

            if(s.length()!=t.length()){
                return false;
            }
        
        for(int i=0;i<s.length();i++){

            if(map1.containsKey(s.charAt(i))){
                int a = map1.get(s.charAt(i));
                map1.put(s.charAt(i),a+1);
            }
            else{
                map1.put(s.charAt(i),1);
            }
            if(map2.containsKey(t.charAt(i))){
                int a = map2.get(t.charAt(i));
                map2.put(t.charAt(i),a+1);
            }
            else{
                map2.put(t.charAt(i),1);
            }
        }

        for(int j=0;j<s.length();j++){
            char a = s.charAt(j);
            if(map2.containsKey(a) == false){
                return false;
            }
            else{
                if(!map1.get(a).equals(map2.get(a))){
                    return false;
                }
            }
        }
        return true;
    }
}