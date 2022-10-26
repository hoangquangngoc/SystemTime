package Ngay10.thuchanhtrienkhailoplist;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPANY =10 ;
    private Object element[];
    public MyList(){
        element = new Object[DEFAULT_CAPANY];
    }
    private void ensureCapa(){
        int newSize = element.length*2;

    }
    public void add(E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    public E get(int i){
        if(i>=size|| i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }

       
        return (E)element[i];
    }

}

