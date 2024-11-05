package emailservice.myapp.Controller

import emailservice.myapp.Service.EmailService
  import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
 import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/email")
@Validated
class EmailController(private val emailService: EmailService) {
    @PostMapping("/send")
    fun send() {
    val email="moraesmauricio@discente.ufg.br";
        val subject="Teste";
        val textBod="Teste Teste"
        emailService.sendEmailVerify(email,subject,textBod);

    }
}