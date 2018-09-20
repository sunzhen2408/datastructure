import java.util.*;
//报错：outofmemoryerror
public class OutOfMemoryError {
    static class Object{
        int a ;
    }
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        while(true){
            list.add(new Object());
        }
    }

}
