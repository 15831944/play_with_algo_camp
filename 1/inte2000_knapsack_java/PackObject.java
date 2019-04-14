class PackObject
{
    public int weight;
    public int price;
    public int status;  //0:δѡ�У�1:��ѡ�У�2:�Ѿ�����ѡ

    public PackObject(int weight, int price, int status) {
        this.weight = weight;
        this.price = price;
        this.status = status;
    }
    public PackObject(PackObject w) {
        this.weight = w.weight;
        this.price = w.price;
        this.status = w.status;
    }
}