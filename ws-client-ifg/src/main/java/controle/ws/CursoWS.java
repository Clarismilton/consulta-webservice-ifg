package controle.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import bean.Disciplina;

public class CursoWS {

	public static List<Disciplina> buscarWs(String codCurso) {
		List<Disciplina> result = new ArrayList<Disciplina>();
		try {

			ObjectMapper mapper = new ObjectMapper();

			URL url = new URL("http://cursos.ifg.edu.br/ws_spring/select_corpo_docente/" + codCurso); //Essa linha muda

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			while ((output = br.readLine()) != null) {
				result = mapper.readValue(output, new TypeReference<List<Disciplina>>() { //Essa linha muda
				});
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return result;
	}

}
