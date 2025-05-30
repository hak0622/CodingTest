import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //1. 중복제거
        HashSet<String>reportSet = new HashSet<>();
        for(String rep : report){
            reportSet.add(rep);
        }
        //2.notifyList 만들기
        HashMap<String,ArrayList<String>>notifyLists = new HashMap<>();
        for(String rep : reportSet){
            int blank = rep.indexOf(" ");
            String reporter = rep.substring(0,blank);
            String reportee = rep.substring(blank+1);
            
            ArrayList<String>reporterList = notifyLists.getOrDefault(reportee,null);
            if(reporterList == null){
                reporterList = new ArrayList<>();
            }
            reporterList.add(reporter);
            notifyLists.put(reportee,reporterList);
        }
        
        //3. notifyList 기반으로 reporterHash 만들기
        HashMap<String,Integer> reporterHash = new HashMap<>();
        for(ArrayList<String>notifyList : notifyLists.values()){
            if(notifyList.size()>=k){
                for(String reporter : notifyList){
                    reporterHash.put(reporter,reporterHash.getOrDefault(reporter,0)+1);
                }
            }
        }
        //4.reporterHash를 기반으로 answer 배열을 채운다.
        for(int i=0; i<id_list.length; i++){
            answer[i] = reporterHash.getOrDefault(id_list[i],0);
        }
        return answer;
    }
}