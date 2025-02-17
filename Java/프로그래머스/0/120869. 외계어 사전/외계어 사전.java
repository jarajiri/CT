class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            int answer = 0;
            String word = dic[i];
            for (int j = 0; j < spell.length; j++) {
                if (word.contains(spell[j])) answer++;
            }
            if (answer == spell.length) return 1;
        }
        return 2;
    }
}