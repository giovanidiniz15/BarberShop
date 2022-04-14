/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Login;

/**
 *
 * @author giovani.diniz
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    
    public void entrarNoSistema(){
        //Pegar usuario da view
        //Pesquisar usuario no banco 
        //Se o usuario da view tiver o mesmo usuario e senha do banco redirecionar para menu principal
        //Senão mostrar uma mensagem ao usuario "usuario ou senha incorretos" 
        
        
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    
}
