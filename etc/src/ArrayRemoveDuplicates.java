public class ArrayRemoveDuplicates {
    public static void main(String[] args){
        int[] arr={3,4,6,1,2,5,1,2,3,2,5};

        //카운팅
        int[] counter=new int[arr.length];

        for(int i=0; i<arr.length; i++){
            counter[arr[i]]++;
        }

        //중복제거(카운터의 값이 1이상이면 출력)
        for(int i=0; i<counter.length; i++){
            if(counter[i]>0)
                System.out.print(i+",");
        }

        System.out.println();

        //정렬(카운터의 값만큼 카운터의 인덱스를 출력)
        for(int i=0; i<counter.length; i++){
            for(int j=0; j<counter[i]; j++)
                System.out.print(i+",");
        }

    }
    
}
