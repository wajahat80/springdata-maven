package com.rwa.spring.jpa.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * The persistent class for the server database table.
 * 
 */
@Entity
@Table(name = "server")
@NamedQuery(name = "Server.findAll", query = "SELECT s FROM Server s")
@Data
@Getter
@Setter
@RequiredArgsConstructor
public class Server implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ServerPK id;

    @Column(name = "monitor_sitngo")
    private byte monitorSitngo;

    @Column(name = "server_name")
    private String serverName;


}