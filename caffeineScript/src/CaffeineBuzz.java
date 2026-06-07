public class CaffeineBuzz {

    public static String caffeineBuzz(int n) {

        String resultado = "";
        if (n % 3 == 0 &&  n % 4 == 0){
            resultado = "Coffee";
        } else if (n % 3 == 0){
            resultado = "Java";
            
        }
        if(!resultado.equals("")  && n % 2 == 0){
            resultado += "Script";
            return resultado;
         } else if (resultado.equals("")) {
            resultado = "mocha_missing!";
         }  
         return resultado;
        
        
    }

}
