package br.com.academy.ratkovski.demo.messaging;
import br.com.academy.ratkovski.demo.domain.Json;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PublicadorDeJson {

    private final AmazonSQS amazonSQS;
    private final ObjectMapper objectMapper;

    /**
     * @SneakyThrows pode ser usado para lançar exceções verificadas
     * sem realmente declarar isso na throws cláusula do seu método
     */

    @SneakyThrows
    public void publicar(final Json json) {
        String queueUrl = amazonSQS.getQueueUrl("fila_dados").getQueueUrl();

        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(objectMapper.writeValueAsString(json))
                .withDelaySeconds(5);

        amazonSQS.sendMessage(send_msg_request);
    }

}
