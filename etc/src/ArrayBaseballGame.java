public class ArrayBaseballGame {
    public static void main(String args[]){
        int[] arr = new int[3];
        int[] arr2 = new int[3];

        int s=0;
        int b=0;

        //1. 각 배열의 크기만큼 난수 대입
        for(int i=0; i<arr.length; i++){
            arr[i]=(int)(Math.random()*9+1); //1~9 중 세개 대입
            arr2[i]=(int)(Math.random()*9+1);
        }
        
        //2. s계산, 자리가 같은 원소를 비교 같으면 s++
        for(int i=0; i<arr.length; i++){
            if(arr[i]==arr2[i])
                s++;
        }

        //3. b계산, 자리가 다른 원소를 비교 같으면 b++
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i!=j){//자리가 다른 원소가 비교하기 위해서 i랑 j랑 다를 때만 
                    if(arr[i]==arr2[j]){
                        b++;
                    }
                }
            }
        }



        //---------------

        System.out.print("arr=  ");
        for(int i: arr)
            System.out.print(+i);
        
        System.out.println();
        System.out.print("arr2= ");
        for(int i: arr2)
            System.out.print(i);
        
        System.out.println();
        System.out.printf("%dS %dB",s,b);

    }
}
