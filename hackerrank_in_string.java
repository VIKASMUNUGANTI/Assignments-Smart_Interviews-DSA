//Question link : https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true

public static String hackerrankInString(String s) {
    String ch="hackerrank";
    int j=0;
    for(int i=0;i<s.length();i++)
    {
        while(j<10)
        {
            if(s.charAt(i) == ch.charAt(j))
            {
                j++;
                break;
            }
            else{
                break;
            }
        }
    }
    if(j==10) return "YES";
    return "NO";
    
}

}

