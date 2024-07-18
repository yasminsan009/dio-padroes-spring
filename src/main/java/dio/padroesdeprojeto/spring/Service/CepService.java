package dio.padroesdeprojeto.spring.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.padroesdeprojeto.spring.Model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface CepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}