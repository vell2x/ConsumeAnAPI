package com.example.consumeanapilab.consumeanapilab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.consumeanapilab.consumeanapilab.model.CompleteList;
import com.example.consumeanapilab.consumeanapilab.model.TinyList;
import com.example.consumeanapilab.consumeanapilab.model.ListResponse;

@Component
public class ApiService {
	private RestTemplate restTemplate = new RestTemplate();
	private RestTemplate restTemplateWithUserAgent;
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<CompleteList> printCompleteList() {
		//List<CompleteList> list = new ArrayList<>();
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		ListResponse complete = restTemplate.getForObject(url, ListResponse.class);
		return complete.getComplete();
	}

	public List<TinyList> printTinyList() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		ListResponse tiny = restTemplate.getForObject(url, ListResponse.class);
		return tiny.getTiny();
	}
}
