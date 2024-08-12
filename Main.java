// 円周率に定数を利用する（エラー）
public class Main {
  public static void main(String[] args) {
    // 定数として円周率を宣言
    final double pi = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、" );
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    // コンパイルエラーになる
    pi = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、" );
    System.out.println(pie * pie * pi);
  }
}