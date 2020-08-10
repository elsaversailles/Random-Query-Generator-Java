package com.fhzr;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class random {
	public static void main(String[] args)
	{
		for (int i=0;i<1;i++){
			rndFunc();
			}
		}
			public static void rndFunc(){
		Scanner myObj = new Scanner(System.in);
		System.out.println ("WELCOME TO RANDOM PORN QUERY GENERATOR!");
		System.out.println ("--------------");
		System.out.println ("Hello, Pornbuff!");
		System.out.println ("--------------");
		System.out.println ("--------------");
		System.out.println ("Written by Elsa Versailles, GNU General Public License v3.0");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("Press ENTER to Generate Query");
		
		String userName =
myObj.nextLine(); 
		System.out.println(userName);
		
		String[]p1= new String[]{"Popular With Women", "Verified", "Amateurs", "Verified Models", "Virtual Reality", "60FPS", "Amateur", "Anal", "Arab", "Asian", "Babe", "Babysitter", "BBW", "Behind The Scenes", "Big Ass", "Big Dick", "Big Tits", "Bisexual Male", "Blonde", "Blowjob", "Bondage", "Brazilian", "British", "Brunette", "Bukkake", "Cartoon", "Casting","Celebrity", "Closed Captions", "College", "Compilation", "Cosplay", "Creampie", "Cuckold", "Cumshot", "Czech", "Described Video", "Double Penetration", "Ebony", "Euro", "Exclusive", "Feet", "Female Orgasm", "Fetish", "Fingering", "Fisting", "French", "Funny", "Gangbang", "Gay", "German", "Handjob", "Hardcore", "HDPorn", "Hentai", "Indian", "Interactive", "Interracial", "Italian", "Japanese", "Korean", "Latina", "Lesbian", "Massage", "Masturbation", "Mature,", "MILF", "Muscular Men", "Music", "Old/Young", "Orgy", "Parody", "Party", "Pissing", "Pornstar", "POV", "Public", "Pussy Licking", "Reality", "Red Head", "Role Play", "Romantic", "Rough Sex", "School", "Scissoring", "SFW", "Small Tits", "Smoking", "Solo Female", "Solo Male", "Squirt", "Step Fantasy", "Strap On", "Striptease", "Tattooed Women", "Teen", "Threesome", "Toys", "Trans Male", "Trans With Girl", "Trans With Guy", "Transgender","Verified Couples", "Vintage", "Webcam"};
		String[]p2= new String[]{"Philippines/Pinay", "South Africa", "United States", "Ukraine/Ukranian", "Canada/Canadian", "United Kingdom", "France/French", "Argentina", "Netherlands", "Australia/Australian", "Poland/Polish", "Germany", "Sweden/Swedish", "Mexico/Mexican", "Italy/Italian","Spain/Spanish", "Brazil/Brazillian", "Japan/Japanesse", "India/Indian", "Russia/Russian", "Czech", "Algeria", "Morocco", "Sri Lanka/Sri Lankan", "Fiji", "Latvia", "Ethiopia", "Hongkong", "China/Chinese", "Korea/Korean", "Taiwan/Taiwanesse", "Greece/Greek", "Iceland", "Austria", "Cyprus","Belarus", "Columbia", "Bulgaria", "Finland"};
		String[]p3= new String[]{"Big tits", "Petite", "Red head", "Black", "Tall", "Brunette", "White", "Small tits"};
		String[]p4= new String[]{"Cop", "Doctor", "Teacher", "Driver", "Instructor", "Student", "Mother", "Father", "Writer", "Pornstar", "Actor", "Actress"};
		String[]p5= new String[]{"Foot Fetish", "Glass Fetish", "Hair Fetish", "Pee Fetish", "Latex", "Navel", "Shoe Fetishism", "Underwear Fetishism", "Erotic Asphyxiation", "Stimming", "Looning", "Dendrophillia", "Clothing Fetishism", "Leather", "Adult Breastfeeding"};
		String[]p6= new String[]{"Hardcore", "Softcore", "3some", "Orgy", "Group sex", "Underwater sex", "Brutal", "kinky", "Gangbang", "BDSM", "Masturbation"};
		Random rnd= new Random();
		System.out.println("Resultant Query:");
		System.out.println("|--------------|");
		System.out.println("");
		System.out.println("Category:");
		System.out.println("");
		//First block
		System.out.println(p1[rnd.nextInt(p1.length)]);
		System.out.println("         ");
		//second block
		System.out.println("Country:");
		System.out.println("");
		System.out.println(p2[rnd.nextInt(p2.length)]);
		System.out.println ("");
		//Third block
		System.out.println("Characteristics:");
		System.out.println("");
		System.out.println(p3[rnd.nextInt(p3.length)]);
		System.out.println("");
		//Fourth block
		System.out.println("Profession:");
		System.out.println("");
		System.out.println(p4[rnd.nextInt(p4.length)]);
		System.out.println("");
		//Fifth block
		System.out.println("Fetish");
		System.out.println("");
		System.out.println(p5[rnd.nextInt(p5.length)]);
		System.out.println("");
		//sixth block
		System.out.println("Action:");
		System.out.println("");
		System.out.println(p6[rnd.nextInt(p6.length)]);
		System.out.println("");
		System.out.println("|------------|");
		System.out.println("       ");
		System.out.println("For documentation and support visit http://bit.ly/2honreb");
		System.out.println("Ver 2.0");
	}
}
