public String longestCommonPrefix(String[] strs) {
    String longestPrefix = "";
     if(strs.length>0){
         longestPrefix = strs[0];
     }
     for(int j=1; j<strs.length; j++){
         String analyzing = strs[j];
         int i=0;
         for( i<Math.min(longestPrefix.length(); strs[j].length()); i++){
             if(longestPrefix.charAt(i) != analyzing.charAt(i)){
                 break;
             }
         }
         longestPrefix = strs[j].substring(0, i);
     }
     return longestPrefix;
 }
