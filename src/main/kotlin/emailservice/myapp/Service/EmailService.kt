package emailservice.myapp.Service

 import org.springframework.beans.factory.annotation.Autowired
 import org.springframework.beans.factory.annotation.Value
 import org.springframework.mail.SimpleMailMessage
 import org.springframework.mail.javamail.JavaMailSender
 import org.springframework.stereotype.Service
 import java.awt.SystemColor.text


@Service
class EmailService(
    @Autowired
    private val mailSender: JavaMailSender, @Value("\${spring.mail.username}") private val remetente:String
) {

    fun sendEmailVerify(to: String, subject: String, body: String) {
         try {
             val message = SimpleMailMessage()
             message.from = remetente
             message.setTo(to)
             message.subject = subject
             message.setText(body)
             mailSender.send(message)
         }catch (e:Exception){
             println(e.message);
         }
    }
}