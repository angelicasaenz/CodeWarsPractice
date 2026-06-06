public class Possitive {

    public static int sum(int[] arr){
        
        int cont = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                cont += arr[i];
            }
        }
        return cont;
       
    }

    
}
