public class wildcardMatching {
    public boolean isMatch(String string, String pattern) {
        boolean match[][] = new boolean[string.length()+1][pattern.length()+1];
        match[0][0] = true;
        for (int i = 1; i<=pattern.length(); i++) {
            if (pattern.charAt(i-1) == '*') {
                match[0][i] = match[0][i-1];
            } else match[0][i] = false;
        }

        for (int i = 1; i<=string.length(); i++) {
            match[i][0] = false;
        }

        for (int i=1; i<= string.length(); i++) {
            for (int j = 1; j<= pattern.length(); j++) {
                if (pattern.charAt(j-1) == '?' || string.charAt(i-1) == pattern.charAt(j-1)) {
                    match[i][j] = match[i-1][j-1];
                }
                if (pattern.charAt(j-1) == '*') {
                    match[i][j] = match[i-1][j] || match[i][j-1];
                }
            }
        }
        return match[string.length()][pattern.length()];
    }

    public static void main(String [] args) {
        System.out.println(new wildcardMatching().isMatch("adceb", "*a*b"));
    }
}
