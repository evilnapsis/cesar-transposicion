/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t;

/**
 *
 * @author evilnapsis
 */
public class MetodoTransposicion {
    public static int shift =3;
    public static String alphl = "bcdfghjklmnpqrstvwxyz";
    public static String alphu = "BCDFGHJKLMNPQRSTVWXYZ";
    public static String vocall = "aeiou";
    public static String vocalu = "AEIOU";
    
    
    public boolean is_lower(char x){
        boolean is = false;
        for(int i=0;i<alphl.length();i++){
            if(alphl.toCharArray()[i]==x){
            is=true;
            }
        }
        return is;
    }

        public boolean is_vlower(char x){
        boolean is = false;
        for(int i=0;i<vocall.length();i++){
            if(vocall.toCharArray()[i]==x){
            is=true;
            }
        }
        return is;
    }

    
    
    public boolean is_upper(char x){
        boolean is = false;
        for(int i=0;i<alphu.length();i++){
            if(alphu.toCharArray()[i]==x){
            is=true;
            }
        }
        return is;
    }
    
    public boolean is_vupper(char x){
        boolean is = false;
        for(int i=0;i<vocalu.length();i++){
            if(vocalu.toCharArray()[i]==x){
            is=true;
            }
        }
        return is;
    }
    
    
    public String get_alphabeth(char x){
        String alphabeth="";
        if(is_lower(x)){ alphabeth = alphl; }
        else if(is_upper(x)){ alphabeth = alphu; }
        else if(is_vlower(x)){ alphabeth= vocall; }
        else if(is_vupper(x)){ alphabeth= vocalu; }
        return alphabeth;
    }
    
    
    public int get_index(char x){
        int n=-1;
        String alphabeth = get_alphabeth(x);
        for(int i=0;i<alphabeth.length();i++){
            if(x==alphabeth.toCharArray()[i]){
                n=i;
            }
        }
        
        return n;
    }


    public char internchange(char x){
        String alphabeth = get_alphabeth(x);
        char r = 0;
        if(alphabeth==alphl||alphabeth==alphu){
        
        if(get_index(x)<alphabeth.length()-shift){
            r = alphabeth.toCharArray()[get_index(x)+shift];
        }else{
            r = alphabeth.toCharArray()[get_index(x)-alphabeth.length()+shift];
        }
        
        }else if(alphabeth==vocall||alphabeth==vocalu){
        
            int n = get_index(x);
            switch(n){
                case 0 : r ='1';break;
                case 1 : r ='2';break;
                case 2 : r ='3';break;
                case 3 : r ='4';break;
                case 4 : r ='5';break;
      
            }
        
        }

        
        return r;
        
    }

    
    public char rinternchange(char x){
        String alphabeth = get_alphabeth(x);
        char r = 0;
        if(alphabeth==alphl||alphabeth==alphu){
        if((get_index(x)-shift)>=0){         
                 r = alphabeth.toCharArray()[get_index(x)-shift];
        }else{
            r = alphabeth.toCharArray()[get_index(x)+alphabeth.length()-shift];
        }
        }else {
        
            // int n = get_index(x);
            switch(x){
                case '1' : r ='a';break;
                case '2' : r ='e';break;
                case '3' : r ='i';break;
                case '4' : r ='o';break;
                case '5' : r ='u';break;
      
            }
        
        }


        
        return r;
        
    }

   
    public String cipher(String plain){
    String result = "";
    for(int i=0;i<plain.length();i++){
        result += internchange(plain.toCharArray()[i]);
    }
    return result;
    }

       public String descipher(String plain){
    String result = "";
    for(int i=0;i<plain.length();i++){
        result += rinternchange(plain.toCharArray()[i]);
    }
    return result;
    }

    
}
