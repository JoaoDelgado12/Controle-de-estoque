package controleestoque;

import javax.swing.JTextField;

/**
 *
 * @author Master
 */
public class Operacao {
    public static int cod=100, col, lin=0;
    int vlin;
    public String[][] tbDisciplina = new String[50][6];
    
    
    public void alterar(JTextField[] caixas){
        for(int i=0; i<6; i++){
            tbDisciplina[vlin][i] = caixas[i].getText();
        }  
    }
    
    public boolean consultar(String vcod, JTextField[] caixas){
        boolean enc=false;
        vlin=0;
        while(enc==false && vlin<lin){
            if (tbDisciplina[vlin][0].equals(vcod)){
                for(int i=0; i < 6; i++){
                    caixas[i].setText(tbDisciplina[vlin][i]);
                }
                enc=true;
            }else{
                vlin++;
            }
        }
        
        return enc;
    }
    
    public void limparcx(JTextField[] caixas){
        for(int i=0; i<6; i++){
            caixas[i].setText("");
        }
    }
    
}
