package jp.alhinc.m.takizawa;


class X {
	X() {
		System.out.println("[X]");
	}
	void a() {
		System.out.println("[x.a]");
	}
	void b() {
		System.out.println("[x.b]");
	}
}

class Y extends X {
	Y() {
		System.out.println("[Y]");
	}
	void a() {
		System.out.println("[y.a]");
	}
}

class InheritancePractice {
	public static void main(String[] args) {
		X x = new X();
		x.a();
		x.b();
		Y y = new Y();
		y.a();
		y.b();
	}
}


//SystemOutされるのは、
//[X]
//[x.a]
//[x.b]
//[X]
//[Y]
//[y.a] Yクラスでオーバーライドしたaメソッドを実行
//[x.b] Xクラスから継承したbメソッドを実行


//ポリモーフィズム
//スーパークラスを型とする変数にサブクラスのインスタンスを代入できる
//X x = new X();だが、
//X x = new Y();もできる。



