package pkg04_two_dimension_ex;

public class Ex01 {

  public static void main(String[] args) {
    // 2단부터 9단까지 구구단의 전체 결과를 2차원 배열에 저장하기
    
    int [][] gugudan = new int[8][9];
    
    /*
     gugudan[0][0] = 2 * 1
     gugudan[0][1] = 2 * 2
     gugudan[0][2] = 2 * 3
     gugudan[0][3] = 2 * 4
     gugudan[0][4] = 2 * 5
     gugudan[0][5] = 2 * 6
     gugudan[0][6] = 2 * 7
     */
    
    for(int i = 0;i < gugudan[i].length; i++) {
      for(int j = 0; j < gugudan[j].length; j++) {
        gugudan[i][j] = (i+2)*(j+1);
        System.out.print(String.format("%3d", gugudan[i][j]));
      }
      System.out.println();
    }
  }

}
