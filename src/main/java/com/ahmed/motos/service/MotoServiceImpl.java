package com.ahmed.motos.service;

import java.util.List;

import com.ahmed.motos.entities.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ahmed.motos.entities.Moto;
import com.ahmed.motos.repos.MotoRepository;

@Service
public class MotoServiceImpl implements MotoService {
	@Autowired
	MotoRepository motoRepository;
	@Override
	public Moto saveMoto(Moto m) {
		return motoRepository.save(m);
	}
	@Override
	public Moto updateMoto(Moto m) {
		return motoRepository.save(m);
	}
	@Override
	public void deleteMoto(Moto m) {
		motoRepository.delete(m);
	}
	@Override
	public void deleteMotoById(Long id) {
		motoRepository.deleteById(id);
	}
	@Override
	public Moto getMoto(Long id) {
		return motoRepository.findById(id).get();
	}
	@Override
	public List<Moto> getAllMotos() {
		return motoRepository.findAll();
	}

	@Override
	public List<Moto> findByMarqueMoto(String marque) {
		return this.motoRepository.findByMarqueMoto(marque);
	}

	@Override
	public List<Moto> findByMarqueMotoContains(String marque) {
		return this.motoRepository.findByMarqueMotoContains(marque);
	}

	@Override
	public List<Moto> findByMarquePrix(String marque, Double prix) {
		return this.motoRepository.findByMarquePrix(marque, prix);
	}

	@Override
	public List<Moto> findByModel(Model model) {
		return this.motoRepository.findByModel(model);
	}

	@Override
	public List<Moto> findByModelIdModel(Long id) {
		return this.motoRepository.findByModelIdModel(id);
	}

	@Override
	public List<Moto> findByOrderByMarqueMotoAsc() {
		return this.motoRepository.findByOrderByMarqueMotoAsc();
	}

	@Override
	public List<Moto> trierMotosMarquesPrix() {
		return this.motoRepository.trierMotosMarquesPrix();
	}
}


