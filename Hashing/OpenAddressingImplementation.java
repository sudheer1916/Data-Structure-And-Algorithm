class OpenAddressingImplementation{
    int arr[];
    int cap,size;
    OpenAddressingImplementation(int c){
        cap=c;
        size = 0;
        arr = new int[cap];
        for (int i = 0; i < cap; i++) {
            arr[i] = -1;
        }
    }
    int hashFun(int key){
        return key % cap;
    }
    boolean insert(int key){
        if(size == cap)
        return false;
        int i = hashFun(key);
        while (arr[i] != -1 && arr[i]!=-2 && arr[i]!=key) {
            i=(i+1)%cap;           //-1 = slot  empty,-2 = item deleted
        }
        if(arr[i]==key)
        return false;
        else{
            arr[i] = key;
            size++;
            return true;
        }
    }
    boolean search(int key){
        int h = hashFun(key);
        int i = h;
        while (arr[i] != -1) {
            if(arr[i] ==  key)
            return true;
            i = (i+1)%cap;
            if(i == h)
            return false;
        }
        return false;
    }
    boolean erase(int key){
        int h = hashFun(key);
        int i=h;
        while (arr[i]!=-1) {
            if (arr[i] == key) {
                arr[i] = -2;
                return true;
            }
            i=(i+1)%cap;
            if(i==h)
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        OpenAddressingImplementation hash = new OpenAddressingImplementation(7);
        hash.insert(49);
        hash.insert(56);
        hash.insert(72);
        if(hash.search(56) == true)
        System.out.println("yes");
        else
        System.out.println("no");

        hash.erase(56);
        
        if(hash.search(56) == true)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}