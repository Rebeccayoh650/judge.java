public class judge {
    /**
     * this program takes a two dimenional array and a number
     * the array represents the people who trust each other
     * while the the number represents the amount of people in the town
     * @param N
     * @param trust
     * @return
     */

    //the function that finds the town judge by takinf in a two dimenional array and a number
    public int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for(int[] t : trust){
            count[t[0]]--;
            count[t[1]]++;
        }
        for(int i = 1; i<= N; i++){
            if(count[i] == N-1){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args){
        judge b = new judge();

        int trust_1[][] = {{1,3}, {2,3}};
        int trust_2[][] = {{1,3}, {2,3}, {3,1}};
        int trust_3[][] = {{1,2}, {2,3}};
        int trust_4[][] = {{1,3}, {2,4} ,{2,3}, {2,4}, {4,3}};
        System.out.println("judge for trust 1:" +b.findJudge(3,trust_1));
        System.out.println("-----------");
        System.out.println("judge for trust 2:" +b.findJudge(3,trust_2));
        System.out.println("-----------");
        System.out.println("judge for trust 3:" +b.findJudge(3,trust_3));
        System.out.println("-----------");
        System.out.println("judge for trust 4:" +b.findJudge(4,trust_4));
        System.out.println("-----------");


    }
}
