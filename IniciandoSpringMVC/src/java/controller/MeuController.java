
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String cadastroConta(){
        return "contas/cadastroConta";
    }
}
