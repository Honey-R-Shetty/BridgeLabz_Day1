public class DynamicArray{
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 5;
        data = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size == capacity) {
            resize();
        }
        data[size] = element;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index: " + index);
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray();
        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(40);
        myArray.add(50);
        myArray.add(60);
        System.out.println("Size: " + myArray.size());
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println("Element at index " + i + ": " + myArray.get(i));
        }
    }
}