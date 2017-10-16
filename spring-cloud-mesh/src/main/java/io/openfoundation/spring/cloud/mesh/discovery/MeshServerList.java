package io.openfoundation.spring.cloud.mesh.discovery;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractServerList;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
/**
 * @author henryz
 */
public class MeshServerList extends AbstractServerList<MeshServer> {

    private String host;
    private int port;

    public MeshServerList(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public List<MeshServer> getInitialListOfServers() {
        return getServers();
    }

    @Override
    public List<MeshServer> getUpdatedListOfServers() {
        return getServers();
    }

    private List<MeshServer> getServers() {
        List<MeshServer> servers = new ArrayList<>();
        servers.add(new MeshServer(host, port));
        return servers;
    }
}
