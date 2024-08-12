// 書き換えてはいけない変数の値を上書きしてしまう
public class Main {
  public static void main(String[] args) {
    // 円周率を変数に代入する
    double pi = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、" );
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    // 誤り：代入すべきは変数pie
    pi = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、" );
    System.out.println(pie * pie * pi);
  }
}