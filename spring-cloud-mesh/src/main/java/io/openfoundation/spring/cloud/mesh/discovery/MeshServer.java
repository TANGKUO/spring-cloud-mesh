package io.openfoundation.spring.cloud.mesh.discovery;

import com.netflix.loadbalancer.Server;
/**
 * @author henryz
 */
public class MeshServer extends Server {
    public MeshServer(String host, int port) {
        super(host, port);
    }
}
