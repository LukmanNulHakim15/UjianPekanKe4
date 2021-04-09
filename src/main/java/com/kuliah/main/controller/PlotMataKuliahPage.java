package com.kuliah.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kuliah.main.entity.PlotMataKuliah;
import com.kuliah.main.entity.Soal;
import com.kuliah.main.services.ModelDosen;
import com.kuliah.main.services.ModelMahasiswa;
import com.kuliah.main.services.ModelMataKuliah;
import com.kuliah.main.services.ModelPlotMataKuliah;
import com.kuliah.main.services.ModelSoal;

@Controller
public class PlotMataKuliahPage {
	
	@Autowired
	ModelPlotMataKuliah modelPlot;
	
	@Autowired
	ModelMahasiswa modelMahasiswa;
	
	@Autowired
	ModelDosen modelDosen;
	
	@Autowired
	ModelMataKuliah modelMatkul;
	
	@Autowired
	ModelSoal modelSoal;
	
	
	@GetMapping ("/view/plotmk")
	public String viewPlotMataKuliah (Model model) {
	
		model.addAttribute("listPlotMataKuliah",modelPlot.getAllPlotMataKuliah());
		model.addAttribute("active",5);
		
		return "view_plotmatakuliah";
		
	}
	
	@GetMapping("/add/plotmk")
	public String viewAddPlotMataKuliah(Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plot_mata_kuliah",new PlotMataKuliah());
		model.addAttribute("listMahasiswa", modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listDosen", modelDosen.getAllDosen());
		model.addAttribute("listMataKuliah", modelMatkul.getAllMataKuliah());
		model.addAttribute("listSoal", modelSoal.getAllSoal());
		
		return "add_plotmatakuliah";
	}
	
	/*@GetMapping("/add/plotmk")
	public String viewAddPlotMataKuliah2(Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plot_mata_kuliah",new PlotMataKuliah());
		model.addAttribute("listDosen", modelDosen.getAllDosen());
		
		return "add_plotmatakuliah";
	} */
	
	/* @GetMapping("/add/plotmk")
	public String viewAddPlotMataKuliah3(Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plot_mata_kuliah",new PlotMataKuliah());
		model.addAttribute("listMataKuliah", modelMatkul.getAllMataKuliah());
		
		return "add_plotmatakuliah"; */
	
	
	/*@GetMapping("/add/plotmk")
	public String viewAddPlotMataKuliah4(Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plot_mata_kuliah",new PlotMataKuliah());
		model.addAttribute("listSoal", modelSoal.getAllSoal());
		
		return "add_plotmatakuliah";
	} */
	
	/*@PostMapping("/plotmk/view")
	  public String addSoal(@ModelAttribute PlotMataKuliah plotmatakuliah, Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		this.modelPlot.addPlotMataKuliah(plotmatakuliah);
		model.addAttribute("listPlotMataKuliah",modelPlot.getAllPlotMataKuliah());
		
		
		
		return "redirect:/plotmk/view";
	}
	
	@GetMapping("/plotmk/update/{id}")
	public String viewUpdatePlotMataKuliah(@PathVariable String id, Model model) {
		
		PlotMataKuliah plotmatakuliah = modelPlot.getPlotMataKuliahById(id);
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plot_mata_kuliah", plotmatakuliah);
		
		return "add_plotmatakuliah";
	}
	
	@GetMapping("/plotmk/delete/{id}")
	public String deleteSoal(@PathVariable String id, Model model) {
		
		this.modelPlot.deletePlotMataKuliah(id);
		model.addAttribute("listPlotMataKuliah",modelPlot.getAllPlotMataKuliah());
		
		
		return "redirect:/plotmk/view";
	} */
	
}
