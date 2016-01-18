package com.iyzipay.model;

import com.iyzipay.HttpClient;
import com.iyzipay.IyzipayResource;
import com.iyzipay.Options;
import com.iyzipay.request.CreateCrossBookingRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CrossBookingFromSubMerchant extends IyzipayResource {

    public static CrossBookingFromSubMerchant create(CreateCrossBookingRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/crossbooking/receive",
                getHttpHeaders(request, options),
                request,
                CrossBookingFromSubMerchant.class)
                .getBody();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
