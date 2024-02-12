

public class Bus{
     private  int busNo;
    private  int capacity;

    public Bus(int no,int cap)
    {
        this.busNo=no;
        this.capacity=cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public  void displayBusInfo(){
        System.out.println("busno "+ busNo+" capacity "+capacity);
    }
}