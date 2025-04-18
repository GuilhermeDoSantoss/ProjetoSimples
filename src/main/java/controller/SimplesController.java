package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// tornei a classe SimplesController um Controller REST
// ou seja, vai expor os métodos na forma de URLs

@RestController
public class SimplesController {

    /*
    através desta anotação, temos um caminho de url definido
    http://localhost:8080/hello
    */

    /*
    GET - URL "simples" para consultar informações do noso BackEnd.

    POST - URL associada a alguma informação (que vai embutida no corpo da requisição) para
    que o browser possa enviar ao BackEnd.

    PUT -

    DELETE -
     */
    @GetMapping("/hello")
    public String saySimples(){
        return "Helo!! Bem vindo ao meu site, Guilherme, engenheiro de software";
    }

    @GetMapping("/hellohtml")
    public String sayHelloEmHTML(){
        return " <html>"
                + "<body>"
                + "    <h1> Ola <h1>"
                + "<hr>"
                + "<p> Sou Egenheiro de software <p>"
                + "</body>"
                + "</html>";
    }
}
