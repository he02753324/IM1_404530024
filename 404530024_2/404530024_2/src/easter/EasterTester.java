/*
 * [A]90
 * [TA's Advise]
 * 1.看起來你是要寫Guass, 但似乎你有自己做一些精簡, 不過這樣出現了一些錯誤喔, 請試試看year=1777, 應該要是 3/30, 此部分扣10分.
 * 2.基本上沒什麼太大問題, 之後可以嘗試在javadoc中寫一些註解.
 * */

package easter;

public class EasterTester {
	public static void main(String[] args) {
		System.out.println(Easter.calculateEaster(2001));
		System.out.println(Easter.calculateEaster(2012));
	}
}
