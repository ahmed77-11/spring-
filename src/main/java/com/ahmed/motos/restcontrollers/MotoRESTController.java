package com.ahmed.motos.restcontrollers;

import java.util.List;

import com.ahmed.motos.entities.Moto;
import com.ahmed.motos.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
@CrossOrigin
public class MotoRESTController {

    @Autowired
    MotoService motoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Moto> getAllMotos(){
        System.out.println("ffffffff");
        return motoService.getAllMotos();
    }
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Moto getMotoById(@PathVariable("id") Long id){
        return motoService.getMoto(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Moto createMoto(@RequestBody Moto moto) {
        System.out.println("ffffffff");
         return motoService.saveMoto(moto);

    }
    @RequestMapping(method = RequestMethod.PUT)
    public Moto updateProduit(@RequestBody Moto moto) {
    	return motoService.updateMoto(moto);
    }


}
