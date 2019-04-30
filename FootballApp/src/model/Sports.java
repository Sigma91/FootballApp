package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sports {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int IdSports;
	private String sportsName;
	@OneToMany
	private List <Sports> ListOfSports = new ArrayList<Sports>();
	
	public int getIdSports() {
		return IdSports;
	}
	public void setIdSports(int idSports) {
		IdSports = idSports;
	}
	public String getName() {
		return sportsName;
	}
	public void setName(String name) {
		this.sportsName = name;
	}
	public List<Sports> getListOfSports() {
		return ListOfSports;
	}
	public void setListOfSports(List<Sports> listOfSports) {
		ListOfSports = listOfSports;
	}
	
	
}
