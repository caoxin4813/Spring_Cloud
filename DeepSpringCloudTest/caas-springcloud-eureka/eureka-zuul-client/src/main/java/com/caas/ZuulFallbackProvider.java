package com.caas;

import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by caoxin on 2018/4/2.
 */
public interface ZuulFallbackProvider {
    public String getRoute();
    public ClientHttpResponse fallbackResponse();
}
