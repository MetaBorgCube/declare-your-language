class Foo {
    int x;
    Foo f() {return this;}
}

class Bar extends Foo {
    int x;
    Bar f() {return this;}
}

class Main {
    public static void main(String argv[]) {
	Bar b = new Bar();
	Bar y = b.f();
    }
}
