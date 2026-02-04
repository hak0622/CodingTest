class Solution {
    public String solution(String phone_number) {
        String last4 = phone_number.substring(phone_number.length()-4);
        String star = "*".repeat(phone_number.length() - 4);
        return star + last4;
    }
}