package assignment5;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {


    /**
     * Time Complexity : O(n)
     * Space Complexity : O(map) + O(n): (after split) + O(n) (stringBuilder length)
     */
    public String reformatDate(String date) {
        Map<String,String> hash=new HashMap<>();
        hash.put("Jan","01");
        hash.put("Feb","02");
        hash.put("Mar","03");
        hash.put("Apr","04");
        hash.put("May","05");
        hash.put("Jun","06");
        hash.put("Jul","07");
        hash.put("Aug","08");
        hash.put("Sep","09");
        hash.put("Oct","10");
        hash.put("Nov","11");
        hash.put("Dec","12");

        String da[]=date.split(" ");
        StringBuilder sb=new StringBuilder();
        sb.append(da[2]+"-");
        sb.append(""+hash.get(da[1])+"-");

        String day = da[0].replaceAll("[^0-9]", "");

        sb.append( (day.length()<2) ? ("0"+day): day);

        return sb.toString();

    }
}
