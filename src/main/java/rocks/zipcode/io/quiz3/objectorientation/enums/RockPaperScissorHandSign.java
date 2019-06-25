package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */



public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;





    public RockPaperScissorHandSign getWinner() {


  //      if (RockPaperScissorHandSign.valueOf("PAPER") == ) {
            return RockPaperScissorHandSign.valueOf("SCISSOR");
  //      }






      //  return RockPaperScissorHandSign.valueOf("SCISSOR");
    }

    public RockPaperScissorHandSign getLoser() {

        return RockPaperScissorHandSign.valueOf("ROCK");
    }



}