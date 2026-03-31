class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            String filtered = "";

            for (char c : tree.toCharArray()) {
                if (skill.contains(String.valueOf(c))) {
                    filtered += c;
                }
            }

            if (skill.startsWith(filtered)) {
                answer++;
            }
        }

        return answer;
    }
}