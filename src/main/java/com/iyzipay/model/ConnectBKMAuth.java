package com.iyzipay.model;

import com.iyzipay.HttpClient;
import com.iyzipay.Options;
import com.iyzipay.request.RetrieveBKMAuthRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ConnectBKMAuth extends ConnectPaymentAuth {

    private String token;
    private String callbackUrl;
    private String paymentStatus;

    public static ConnectBKMAuth retrieve(RetrieveBKMAuthRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/iyziconnect/bkm/auth/detail",
                getHttpHeaders(request, options),
                request,
                ConnectBKMAuth.class)
                .getBody();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}