class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0 ; i<strs.length ; i++){

            String a = strs[i];
            String b = strs[i];
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            a = new String(arr);

            if(map.containsKey(a))
                map.get(a).add(b);

            else {
                List<String> group = new ArrayList<>();
                group.add(b);
                map.put(a, group);
            }
        }

        return new ArrayList<>(map.values());
    }
}