class Box<T1, T2, T3> {
    private T1 length;
    private T2 width;
    private T3 depth;

    public Box(T1 length, T2 width, T3 depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public void print() {
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Depth : " + depth);
    }
}