package lhama;

import javax.swing.JOptionPane;

public class Lhama {

    public static void main(String[] args) {
        UILhamaLogin Login = new UILhamaLogin();
        UILhamaCad Cad = new UILhamaCad();
        Login.setVisible(true);
        do{
            if(Login.LoginAlo==1){
                break;
            }
            else{
                System.out.println(Login.LoginAlo);
            }
        }while(true);
        Cad.setVisible(true);
        Pessoa p1 = new Pessoa(Cad.Email, Cad.Nome, Cad.Senha, Cad.Cpf, Cad.Data, Cad.Telefone);
        p1.PrintPessoa();
        
        do{
            System.out.println(Cad.verifAlo());
            p1.setAll(Cad.Email, Cad.Nome, Cad.Senha, Cad.Cpf, Cad.Data, Cad.Telefone); 
            if(Cad.verifAlo() == true){
                Login.setVisible(true);
                break;
            }
                       
        }while(true);
        p1.PrintPessoa();
        do{
            System.out.println(Login.ButPre);
            if(Login.ButPre==1){
            if(p1.verifLogin(Login.email, Login.senha)==true){
                JOptionPane.showMessageDialog (null, "Login concluido, não temos uma pagina de usuario ainda, obrigado por testar!");
                Login.ButPre=0;
            }
          }
        }
        while(true);
         }  
    }
    
