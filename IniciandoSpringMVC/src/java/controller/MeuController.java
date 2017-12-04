
package controller;

import javax.enterprise.inject.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeuController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/cadastrarAlguem")
    public String cadastroPessoa(){
        return "pessoas/cadastroPessoa";
    }
    
    @RequestMapping("/cadastrarConta")
    public String cadastroConta(Model model, @RequestParam("nome") String nome){
        
      
        
        return "contas/cadastroConta";
    }
}
