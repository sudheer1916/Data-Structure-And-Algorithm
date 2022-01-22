//print the frequencies of characters(in sorted order) in a string
class FrequenciesOfCharacter{
    public static void main(String[] args) {
        String str = "sudheer";             //T.C O(n)
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>0)
            System.out.println((char)(i+'a')+" "+count[i]);
        }
    }
}