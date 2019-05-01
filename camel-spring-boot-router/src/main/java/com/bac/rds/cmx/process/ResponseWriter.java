package com.bac.rds.cmx.process;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

@Component("responseWriter")
public class ResponseWriter<T> implements  MessageBodyWriter<T>{

	public boolean isWriteable(Class type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return true;
	}

	public long getSize(Object object, Class type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return -1;
	}

	public void writeTo(Object object, Class type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		ObjectMapper json = new ObjectMapper();
		System.out.println("Entity:"+ entityStream.toString());
        json.writeValue(entityStream, object);
 
	}

}
