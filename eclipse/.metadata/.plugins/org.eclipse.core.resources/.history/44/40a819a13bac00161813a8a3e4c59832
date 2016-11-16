package br.furb.principal;

import java.net.URI;

import org.glassfish.jersey.server.ResourceConfig;

import com.sun.net.httpserver.HttpServer;
import com.sun.security.sasl.ServerFactoryImpl;

public class Servidor {

	public static void main(String[] args) {
		HttpServer server = inicializaServidor();
		System.out.println("Servidor rodando.");
		System.in.read();
		server.stop();
	}

	private static HttpServer inicializaServidor() {
		URI uri = URI.create("http://localhost:8080");
		ResourceConfig config = new ResourceConfig();
		ServerFactoryImpl imp = new ServerFactoryImpl();
		imp.
//		config.register(new CORSFilter());
//		config.packages("servicos");
//		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		return server;
	}

}
