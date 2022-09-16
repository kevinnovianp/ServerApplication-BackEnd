package io.gertarrays.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.gertarrays.server.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
