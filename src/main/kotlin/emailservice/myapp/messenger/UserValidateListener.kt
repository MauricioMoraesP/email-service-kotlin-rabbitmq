package emailservice.myapp.messenger

import emailservice.myapp.DTO.EmailFormatDTO
import emailservice.myapp.Service.EmailService
import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class UserValidateListener(private val emailService: EmailService){

    @RabbitListener(queues = ["users.v1.user-validate"])
    public fun senMenssage(event:EmailFormatDTO) {
        try {
            emailService.sendEmail(event.email,event.title, event.message)
        }catch (e:Exception){
            println(e.message);
        }
     }
}