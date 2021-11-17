package assignment7;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        dfs(ans,s,"",0,0);
        return ans;

    }

    public void dfs(List<String> ans,String s,String subS, int sec, int idx){
        if(sec>4) return;
        if(sec==4 && idx==s.length())
        {
            ans.add(subS);
            return;
        }
        for(int i=1;i<=3;i++){
            if(idx+i>s.length()) break;
            String s1 = s.substring(idx,idx+i);
            if(s1.startsWith("0") && s1.length()>1 || (i==3&& Integer.parseInt(s1)>=256)) continue;
            dfs(ans,s,subS+s1+(sec==3?"":".") ,sec+1,idx+i);
        }
    }
}
