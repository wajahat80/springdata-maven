package com.rwa.spring.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The primary key class for the server database table.
 * 
 */
@Embeddable
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServerPK implements Serializable {
    // default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name = "server_id")
    private short serverId;

    @Column(name = "server_address")
    private String serverAddress;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerPK)) {
            return false;
        }
        ServerPK castOther = (ServerPK) other;
        return (this.serverId == castOther.serverId) && this.serverAddress.equals(castOther.serverAddress);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) this.serverId);
        hash = hash * prime + this.serverAddress.hashCode();
        
        return hash;
    }

}