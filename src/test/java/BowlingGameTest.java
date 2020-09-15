import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
      @Test
      void should_return_0_when_all_frames_are_0_points() throws Exception{
          //given
          BowlingGame bowlingGameScore = new BowlingGame();
          //when
          int[] scores = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
          int result =bowlingGameScore.calculateTotalScore(scores);
          //when
          assertEquals(0,result);
      }

      @Test
      void should_return_300_when_all_frames_are_10_points() throws Exception{
          //given
          BowlingGame bowlingGameScore = new BowlingGame();
          //when
          int[] scores = {10,10,10,10,10,10,10,10,10,10,10,10};
          int result =bowlingGameScore.calculateTotalScore(scores);
          //when
          assertEquals(300,result);
      }

      @Test
      void should_return_the_bowling_scoring_test1() throws Exception{
          //given
          BowlingGame bowlingGameScore = new BowlingGame();
          //when
          int[] scores = {9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0};
          int result =bowlingGameScore.calculateTotalScore(scores);
          //when
          assertEquals(90,result);
      }


      @Test
      void should_return_the_bowling_scoring_test2() throws Exception{
          //given
          BowlingGame bowlingGameScore = new BowlingGame();
          //when
          int[] scores = {1,9,10,10,5,3,10,7,2,10,2,8,10,0,10};
          int result =bowlingGameScore.calculateTotalScore(scores);
          //when
          assertEquals(159,result);
    }


    @Test
    void should_return_the_bowling_scoring_test3() throws Exception{
        //given
        BowlingGame bowlingGameScore = new BowlingGame();
        //when
        int[] scores = {1,2,3,4,5,3,6,7,6,8,2,5,6,5,6,7,8,10,8,9};
        int result =bowlingGameScore.calculateTotalScore(scores);
        //when
        assertEquals(108,result);
    }



    @Test
       void should_return_the_bowling_scoring_test_exception() throws Exception{
           //given
           BowlingGame bowlingGameScore = new BowlingGame();
           //when
           int[] scores = {9,0,9,0,9,0,9,0,9,0,9,0,9,0,2,3,4,5,6,7,8,9};
           int result =bowlingGameScore.calculateTotalScore(scores);
           //when
           assertEquals("投球轮数不能超过10轮!",result);

    }
}
