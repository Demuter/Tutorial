package map;

import java.util.HashMap;
import java.util.Map;

class MyDictionary<TKey, TValue> {
    Map<TKey, TValue> dictionary = new HashMap<TKey, TValue>();

    public Map<TKey, TValue> getDictionary() {
        return dictionary;
    }

    public void addMeth(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    public TValue indexOfMeth(TKey key) {
        return dictionary.get(key);

    }

    public int count() {
        return dictionary.size();
    }

    public static void main(String[] args) {

        MyDictionary<String, String> dict = new MyDictionary<>();
        dict.addMeth("123", "Hello");
        dict.addMeth("234", "World");

        System.out.println(dict.getDictionary());
        System.out.println("Index = " + dict.indexOfMeth("123"));
        System.out.println("Count = " + dict.count());
    }

}
