package org.manoj.casandra.connection;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.querybuilder.QueryBuilder;

public class SimpleClient {

	private Cluster cluster;

	private void connection(String node) {
		cluster = Cluster.builder().addContactPoint(node).build();
		Metadata metadata = cluster.getMetadata();
		System.out.println("Connection to cluster ->" + metadata.getClusterName());
		for (Host host : metadata.getAllHosts()) {
			System.out.printf("Datatacenter: %s; Host: %s; Rack: %s\n", host.getDatacenter(), host.getAddress(),
					host.getRack());
		}

		Session session = cluster.connect("employe");

		Statement select = QueryBuilder.select().all().from("emp_details")/*.where()*/;

		ResultSet results = session.execute(select);

		for (Row row : results) {
			System.out.println("Rows " +" " +row.getUUID("emp_id") +" " + row.getString("name") +" " + row.getString("dep"));
		}
	}

	public void close() {
		cluster.close();
	}

	public static void main(String[] args) {
		SimpleClient client = new SimpleClient();
		System.out.println("client: " + client);
		client.connection("localhost");
		client.close();
	}
}
