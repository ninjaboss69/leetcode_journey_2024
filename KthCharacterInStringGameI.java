class Solution {
    public char kthCharacter(int k) {
        int[] arr = new int[500];
        int index = 0;
        arr[0]=97;
        for(int i=1;i<500;i++){
            if((i&(i-1))==0){
                index=0;
            }
            arr[i] = arr[index]+1;
            index++;
        }
       
       
        return (char)arr[k-1];
    }
}