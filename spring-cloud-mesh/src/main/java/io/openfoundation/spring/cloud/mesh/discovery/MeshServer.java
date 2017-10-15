package io.openfoundation.spring.cloud.mesh.discovery;

import com.netflix.loadbalancer.Server;

public class MeshServer extends Server {
    public MeshServer(String host, int port) {
        super(host, port);
    }
}
