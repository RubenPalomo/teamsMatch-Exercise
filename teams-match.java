class Result {
    private static boolean verification(int num1, int num2, int total) {
        if (total - num1 >= 0 && ((total - num1) % num1 == 0 || (total - num1) % num2 == 0))
            return true;
        else
            return false;
    }

    public static int countTeams(int teamSize_1, int teamSize_2, int p) {
        int teams = 0;
        
        while (p > 0) {
            if (p - teamSize_1 < 0 && p - teamSize_2 < 0)
                return -1;
                
            if (teamSize_1 > teamSize_2) {
                if (verification(teamSize_1, teamSize_2, p))
                    p -= teamSize_1;
                else
                    p -= teamSize_2;
            }
            else {
                if (verification(teamSize_2, teamSize_1, p))
                    p -= teamSize_2;
                else
                    p -= teamSize_1;
            }
            teams++;
        }
        return teams;
    }
}
