public class mars {

    static float  earthgravityKarimov=16;// 1float
    static float  marsgravityKarimov=0.38f;// 2float
    static double marsgravitydoubleKarimov;// 1double
    static int    marsgravityintKarimov;// 1 int
    static char   marsgravitycharKarimov;// 1char
    static int    marsgravity2intKarimov;// 2 integer



  public void main(String[] args) {

        marsgravityKarimov= earthgravityKarimov*marsgravityKarimov;// multiply user  value to 0.38 mars gravity

        System.out.println("converting input to float "+earthgravityKarimov);// converting user input to float
        marsgravitydoubleKarimov = marsgravityKarimov;// converting value to double
        System.out.println("converting value to double ");//print out for double
        System.out.printf("Your weight on Mars: %.4f\n",marsgravitydoubleKarimov);// the double  value
        marsgravityintKarimov=(int) marsgravitydoubleKarimov;// converting double to  int
        System.out.println("converting value to int "+  marsgravityintKarimov);// print out  int
        marsgravitycharKarimov=(char) marsgravitydoubleKarimov;// converting int to char
        marsgravity2intKarimov=marsgravitycharKarimov+10;
        System.out.println("converting value to int and adding (10) "+ marsgravity2intKarimov );// print out  int



    }

}
