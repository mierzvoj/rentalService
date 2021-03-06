package com.example.reantalservice1.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

import static org.springframework.http.HttpStatus.Series.CLIENT_ERROR;
import static org.springframework.http.HttpStatus.Series.SERVER_ERROR;

@Component
public class RestTemplateResponseErrorHandler
        implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse httpResponse)
            throws IOException {

        return (httpResponse.getStatusCode().series() == CLIENT_ERROR
                || httpResponse.getStatusCode().series() == SERVER_ERROR);
    }

    @Override
    public void handleError(ClientHttpResponse httpResponse)
            throws IOException {

        if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
        }
        if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
            if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
                throw new NotFoundEx();
            }
            if (httpResponse.getStatusCode() == HttpStatus.GATEWAY_TIMEOUT) {
                throw new GatewayTimeOutEx();
            }
            if (httpResponse.getStatusCode() == HttpStatus.BAD_REQUEST) {
                throw new BadRequestEx();
            }
            if (httpResponse.getStatusCode() == HttpStatus.BAD_GATEWAY) {
                throw new BadGatewayEx();
            }
        }
    }
}
