package br.com.viagens.app_viagens.services;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.viagens.app_viagens.models.Hotel;;

@RestController
@RequestMapping(path="/hoteis")
public class HotelService{

    private Map<Integer, Hotel> hoteis;

    @PostConstruct
    private void init(){
        this.hoteis = new HashMap<>();
        Hotel h1 = new Hotel();
        h1.setId(1);
        h1.setNome("Céu Palace Hotel");
        h1.setEndereco("Avenida Teotônio Segurado");
        hoteis.put(1, h1);
    }
    @RequestMapping(path="/{id}")
    public Hotel findById(@PathVariable("id") Integer id) {
        return hoteis.get(id);
    }

    @RequestMapping(path="get")
    public String get() {
        return "hoteis.get(id)";
    }
    
}