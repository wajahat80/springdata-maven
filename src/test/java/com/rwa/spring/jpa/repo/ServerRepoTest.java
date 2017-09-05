package com.rwa.spring.jpa.repo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.rwa.spring.jpa.conf.JPAConfig;
import com.rwa.spring.jpa.entity.Server;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { JPAConfig.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class,
		DbUnitTestExecutionListener.class })
@PropertySource("classpath:application-test.properties")
public class ServerRepoTest {
	@Autowired
	private ServerRepo repository;

	@Test
	public void typeAnnotations() {
		// ServerPK spk = new ServerPK((short) 30, "127.0.0.1");

		// Server server = repository.findOne(spk);

		// System.out.println(server.toString());
		/*
		 * assertEquals(3, Affiliate.class.getAnnotations().length);
		 * 
		 * assertTrue(Affiliate.class.isAnnotationPresent(Entity.class));
		 * assertTrue(Affiliate.class.isAnnotationPresent(Table.class));
		 * assertTrue(Affiliate.class.isAnnotationPresent(NamedQuery.class));
		 */

		List<Server> servers = repository.findAll();

		// List<Server> filteredServers =
		// servers.parallelStream().filter(p->p.getServerStatus().equals("A")).collect(Collectors.toList());

		// System.out.println("servers size:"+servers.size()+"\nfilteredServers
		// size:"+filteredServers.size());

		// filteredServers.forEach(System.out::println);
	}

}