package com.example.Icecream.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_form")
public class order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	
	@Column(name="name1")
	private String Name;
	
	@Column(name="adress")
	private String Adress;
	
	
	@Column(name="mobileno")
	private Long Mobileno;
	
	@Column(name="date")
	private String Date;
	
	@Column(name="cocunut_quantity")
	private int Coconutquantity ;
	@Column(name="coconut_rate")
	private int Coconutrate =20;
	
	@Column(name="mango_quantity")
	private int Mangoquantity ;
	@Column(name="mango_rate")
	private int Mangorate = 15 ;
	
	@Column(name="kalajamun_quantity")
	private int kalajamunquantity ;
	@Column(name="klajamunt_rate")
	private int kalajamunrate = 30;
	
	@Column(name="strawberry_quantity")
	private int Strawberryquantity ;
	@Column(name="strawberry_rate")
	private int Strawberryrate = 10;
	
	@Column(name="pista_quantity ")
	private int Pistaquantity ;
	@Column(name="pista_rate")
	private int Pistarate = 25;
	
	@Column(name="gajarhalwa_quantity")
	private int Gajarhalwaquantity ;
	@Column(name="gajarhalwa_rate")
	private int Gajarhalwarate = 26;
	
	@Column(name="chocochips_quantity")
	private int Chocochipsquantity ;
	@Column(name="chocochips_rate")
	private int Chocochipsrate = 55;
	
	@Column(name="motichoor_quantity ")
	private int Motichoorquantity ;
	@Column(name="motichoor_rate")
	private int Motichoorrate =40 ;
	
	@Column(name="mixberries_quantity")
	private int Mixberriesquantity ;
	@Column(name="mixberries_rate")
	private int Mixberriesrate  = 65;
	
	@Column(name="sheerkhurma_quantity")
	private int sheerkhurmaquantity ;
	@Column(name="sheerkhurma_rate")
	private int sheerkhurmarate =50 ;
	
	@Column(name="total_price")
	private int totalprice ;

	public order() {

	}

	public order(String name, String adress, int id, Long mobileno, String date, int coconutquantity, int coconutrate,
			int mangoquantity, int mangorate, int kalajamunquantity, int kalajamunrate, int strawberryquantity,
			int strawberryrate, int pistaquantity, int pistarate, int gajarhalwaquantity, int gajarhalwarate,
			int chocochipsquantity, int chocochipsrate, int motichoorquantity, int motichoorrate,
			int mixberriesquantity, int mixberriesrate, int sheerkhurmaquantity, int sheerkhurmarate, int totalprice) {
		super();
		Name = name;
		Adress = adress;
		Id = id;
		Mobileno = mobileno;
		Date = date;
		Coconutquantity = coconutquantity;
		Coconutrate = coconutrate;
		Mangoquantity = mangoquantity;
		Mangorate = mangorate;
		this.kalajamunquantity = kalajamunquantity;
		this.kalajamunrate = kalajamunrate;
		Strawberryquantity = strawberryquantity;
		Strawberryrate = strawberryrate;
		Pistaquantity = pistaquantity;
		Pistarate = pistarate;
		Gajarhalwaquantity = gajarhalwaquantity;
		Gajarhalwarate = gajarhalwarate;
		Chocochipsquantity = chocochipsquantity;
		Chocochipsrate = chocochipsrate;
		Motichoorquantity = motichoorquantity;
		Motichoorrate = motichoorrate;
		Mixberriesquantity = mixberriesquantity;
		Mixberriesrate = mixberriesrate;
		this.sheerkhurmaquantity = sheerkhurmaquantity;
		this.sheerkhurmarate = sheerkhurmarate;
		this.totalprice = totalprice;
	}

	public order(String name, String adress, Long mobileno, String date, int coconutquantity, int coconutrate,
			int mangoquantity, int mangorate, int kalajamunquantity, int kalajamunrate, int strawberryquantity,
			int strawberryrate, int pistaquantity, int pistarate, int gajarhalwaquantity, int gajarhalwarate,
			int chocochipsquantity, int chocochipsrate, int motichoorquantity, int motichoorrate,
			int mixberriesquantity, int mixberriesrate, int sheerkhurmaquantity, int sheerkhurmarate, int totalprice) {
		super();
		Name = name;
		Adress = adress;
		Mobileno = mobileno;
		Date = date;
		Coconutquantity = coconutquantity;
		Coconutrate = coconutrate;
		Mangoquantity = mangoquantity;
		Mangorate = mangorate;
		this.kalajamunquantity = kalajamunquantity;
		this.kalajamunrate = kalajamunrate;
		Strawberryquantity = strawberryquantity;
		Strawberryrate = strawberryrate;
		Pistaquantity = pistaquantity;
		Pistarate = pistarate;
		Gajarhalwaquantity = gajarhalwaquantity;
		Gajarhalwarate = gajarhalwarate;
		Chocochipsquantity = chocochipsquantity;
		Chocochipsrate = chocochipsrate;
		Motichoorquantity = motichoorquantity;
		Motichoorrate = motichoorrate;
		Mixberriesquantity = mixberriesquantity;
		Mixberriesrate = mixberriesrate;
		this.sheerkhurmaquantity = sheerkhurmaquantity;
		this.sheerkhurmarate = sheerkhurmarate;
		this.totalprice = totalprice;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Long getMobileno() {
		return Mobileno;
	}

	public void setMobileno(Long mobileno) {
		Mobileno = mobileno;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getCoconutquantity() {
		return Coconutquantity;
	}

	public void setCoconutquantity(int coconutquantity) {
		Coconutquantity = coconutquantity;
	}

	public int getCoconutrate() {
		return Coconutrate;
	}

	public void setCoconutrate(int coconutrate) {
		Coconutrate = coconutrate;
	}

	public int getMangoquantity() {
		return Mangoquantity;
	}

	public void setMangoquantity(int mangoquantity) {
		Mangoquantity = mangoquantity;
	}

	public int getMangorate() {
		return Mangorate;
	}

	public void setMangorate(int mangorate) {
		Mangorate = mangorate;
	}

	public int getKalajamunquantity() {
		return kalajamunquantity;
	}

	public void setKalajamunquantity(int kalajamunquantity) {
		this.kalajamunquantity = kalajamunquantity;
	}

	public int getKalajamunrate() {
		return kalajamunrate;
	}

	public void setKalajamunrate(int kalajamunrate) {
		this.kalajamunrate = kalajamunrate;
	}

	public int getStrawberryquantity() {
		return Strawberryquantity;
	}

	public void setStrawberryquantity(int strawberryquantity) {
		Strawberryquantity = strawberryquantity;
	}

	public int getStrawberryrate() {
		return Strawberryrate;
	}

	public void setStrawberryrate(int strawberryrate) {
		Strawberryrate = strawberryrate;
	}

	public int getPistaquantity() {
		return Pistaquantity;
	}

	public void setPistaquantity(int pistaquantity) {
		Pistaquantity = pistaquantity;
	}

	public int getPistarate() {
		return Pistarate;
	}

	public void setPistarate(int pistarate) {
		Pistarate = pistarate;
	}

	public int getGajarhalwaquantity() {
		return Gajarhalwaquantity;
	}

	public void setGajarhalwaquantity(int gajarhalwaquantity) {
		Gajarhalwaquantity = gajarhalwaquantity;
	}

	public int getGajarhalwarate() {
		return Gajarhalwarate;
	}

	public void setGajarhalwarate(int gajarhalwarate) {
		Gajarhalwarate = gajarhalwarate;
	}

	public int getChocochipsquantity() {
		return Chocochipsquantity;
	}

	public void setChocochipsquantity(int chocochipsquantity) {
		Chocochipsquantity = chocochipsquantity;
	}

	public int getChocochipsrate() {
		return Chocochipsrate;
	}

	public void setChocochipsrate(int chocochipsrate) {
		Chocochipsrate = chocochipsrate;
	}

	public int getMotichoorquantity() {
		return Motichoorquantity;
	}

	public void setMotichoorquantity(int motichoorquantity) {
		Motichoorquantity = motichoorquantity;
	}

	public int getMotichoorrate() {
		return Motichoorrate;
	}

	public void setMotichoorrate(int motichoorrate) {
		Motichoorrate = motichoorrate;
	}

	public int getMixberriesquantity() {
		return Mixberriesquantity;
	}

	public void setMixberriesquantity(int mixberriesquantity) {
		Mixberriesquantity = mixberriesquantity;
	}

	public int getMixberriesrate() {
		return Mixberriesrate;
	}

	public void setMixberriesrate(int mixberriesrate) {
		Mixberriesrate = mixberriesrate;
	}

	public int getSheerkhurmaquantity() {
		return sheerkhurmaquantity;
	}

	public void setSheerkhurmaquantity(int sheerkhurmaquantity) {
		this.sheerkhurmaquantity = sheerkhurmaquantity;
	}

	public int getSheerkhurmarate() {
		return sheerkhurmarate;
	}

	public void setSheerkhurmarate(int sheerkhurmarate) {
		this.sheerkhurmarate = sheerkhurmarate;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "order [Name=" + Name + ", Adress=" + Adress + ", Id=" + Id + ", Mobileno=" + Mobileno + ", Date=" + Date
				+ ", Coconutquantity=" + Coconutquantity + ", Coconutrate=" + Coconutrate + ", Mangoquantity="
				+ Mangoquantity + ", Mangorate=" + Mangorate + ", kalajamunquantity=" + kalajamunquantity
				+ ", kalajamunrate=" + kalajamunrate + ", Strawberryquantity=" + Strawberryquantity
				+ ", Strawberryrate=" + Strawberryrate + ", Pistaquantity=" + Pistaquantity + ", Pistarate=" + Pistarate
				+ ", Gajarhalwaquantity=" + Gajarhalwaquantity + ", Gajarhalwarate=" + Gajarhalwarate
				+ ", Chocochipsquantity=" + Chocochipsquantity + ", Chocochipsrate=" + Chocochipsrate
				+ ", Motichoorquantity=" + Motichoorquantity + ", Motichoorrate=" + Motichoorrate
				+ ", Mixberriesquantity=" + Mixberriesquantity + ", Mixberriesrate=" + Mixberriesrate
				+ ", sheerkhurmaquantity=" + sheerkhurmaquantity + ", sheerkhurmarate=" + sheerkhurmarate
				+ ", totalprice=" + totalprice + "]";
	}

	
}
