package lhama;
public class Pessoa {
    private String email;
    private String nome;
    private String password;
    private String CPF;
    private String data;
    private String telefone;
    
    public Pessoa(String email, String nome, String password, String CPF, String data, String telefone){
        this.email = email;
        this.nome = nome;
        this.password = password;
        this.CPF = CPF;
        this.data = data;
        this.telefone = telefone;
    }
    public void setAll(String a, String b, String c, String d, String e, String f){
     email = a;
     nome = b;
     password = c;
     CPF = d;
     data = e;
     telefone = f;
    }
    
    public boolean verifLogin(String a, String b){
        if(a.equals(this.email) && b.equals(this.password)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void PrintPessoa(){
        System.out.println("========================");
        System.out.println(this.email);
        System.out.println(this.nome);
        System.out.println(this.password);
        System.out.println(this.CPF);
        System.out.println(this.data);
        System.out.println(this.telefone);
        System.out.println("========================");
    }
}
