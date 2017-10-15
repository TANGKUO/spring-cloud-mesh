package io.openfoundation.spring.cloud.mesh;

import feign.Client;
import feign.Request;
import feign.Response;

import java.io.IOException;
import java.net.URI;
import java.util.*;

public class MeshFeignClient implements Client {

    private final Client delegate;

    public MeshFeignClient(Client delegate) {
        this.delegate = delegate;
    }


    @Override
    public Response execute(Request request, Request.Options options) throws IOException {
        return this.delegate.execute(request, options);
    }
}
