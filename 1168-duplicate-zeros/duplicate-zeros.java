class Solution {
    public void duplicateZeros(int[] arr) {
        int i=0;
        int[] temp = new int[arr.length];
        int j = 0;
        while(i<arr.length && j<temp.length){
            if(arr[i]==0){
                temp[j++]=0;
                if(j<arr.length)
                   temp[j++]=0;
                   i++;
            }
            else{
               // if((j+1)<arr.length)
                temp[j++]=arr[i++];
            }
        }
        for(int x=0;x<arr.length;x++){
            arr[x]=temp[x];
        }
        
    }
}