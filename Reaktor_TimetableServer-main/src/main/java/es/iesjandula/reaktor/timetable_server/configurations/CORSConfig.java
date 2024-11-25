package es.iesjandula.reaktor.timetable_server.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Esta clase es la que habilita que una dirección IP remota pueda hacer llamadas al backend
 * @author Pablo Ruiz
 */
@Configuration
@EnableWebMvc
public class CORSConfig implements WebMvcConfigurer
{
	/** URL permitida de CORS */
	@Value("${urlCors}")
	private String[] urlCors;
	
	/**
	 * @param registry información del Cors Registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/**")
				.allowedOrigins(urlCors)
				.allowedMethods("GET","POST","PUT","DELETE")
				.allowedHeaders("*");
	}
}
