package br.com.academy.ratkovski.demo.client;

import br.com.academy.ratkovski.demo.dto.JsonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "json", url = "https://jsonplaceholder.typicode.com/")
public interface JsonClient {

    @RequestMapping(method = RequestMethod.GET, value = "posts/{userId}", consumes = "application/json")
    JsonDto getUserId(@PathVariable("userId") String userId);
}
