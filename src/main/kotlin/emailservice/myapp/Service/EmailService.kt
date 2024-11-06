package emailservice.myapp.Service

 import org.springframework.beans.factory.annotation.Autowired
 import org.springframework.beans.factory.annotation.Value
  import org.springframework.mail.javamail.JavaMailSender
 import org.springframework.mail.javamail.MimeMessageHelper
 import org.springframework.stereotype.Service


@Service
class EmailService(
    @Autowired
    private val mailSender: JavaMailSender,
    @Value("\${spring.mail.username}") private val remetente: String
) {

    fun sendEmail(to: String, subject: String, body: String) {
        try {
            val message = mailSender.createMimeMessage()
            val helper = MimeMessageHelper(message, true)

            helper.setFrom(remetente)
            helper.setTo(to)
            helper.setSubject(subject)
            helper.setText(body, true)

            mailSender.send(message)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}
