package io.openfoundation.spring.cloud.mesh.discovery;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
/**
 * @author henryz
 */
public class MeshPing implements IPing {

    @Override
    public boolean isAlive(Server server) {
        return true;
    }
}
