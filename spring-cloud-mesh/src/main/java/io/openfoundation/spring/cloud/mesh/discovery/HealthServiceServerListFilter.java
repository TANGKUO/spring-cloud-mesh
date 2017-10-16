package io.openfoundation.spring.cloud.mesh.discovery;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerListFilter;

import java.util.List;
/**
 * @author henryz
 */
public class HealthServiceServerListFilter implements ServerListFilter<Server> {
    @Override
    public List<Server> getFilteredListOfServers(List<Server> servers) {
        return servers;
    }
}
