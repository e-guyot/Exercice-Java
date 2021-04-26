import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class printArgs {
    
    public static void main(String[] args){
        String monTableau[ ] = new String[]{"Voici", "des", "arguments"};
        for(int i=0; i < monTableau.length; i++){
            System.out.println(monTableau[i]);
        }
        for (String unelement : monTableau){
            System.out.println(unelement);
        }
        
    }
}
