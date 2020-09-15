public class BowlingGame {
    public int calculateTotalScore(int[] scores) throws Exception {
        int totalscore = 0;
        int frame = 0;
        for (int i = 0;i < scores.length;i++) {
            //每轮分数
            int oneframescore = 0;
            //全中
            if (scores[i] == 10 && i < scores.length-2) {
                oneframescore = 10 + scores[i+1] + scores[i+2];
                if (i == scores.length-3)
                {
                    i += 2;
                }
            }//补中
            else if ((scores[i] + scores[i+1] == 10) && i < scores.length-2) {
                oneframescore = 10 + scores[i+2];
                if(i == scores.length-3) {
                    i += 1;
                }
                i++;
            } //其它结果
            else {
                oneframescore = scores[i] + scores[i+1];
                i++;
            }
            frame++;
            if(frame > 10){
                throw new Exception("投球轮数不能超过10轮！");
            }
            totalscore += oneframescore;
        }
        return totalscore;
    }
}



