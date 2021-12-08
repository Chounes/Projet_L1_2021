Jean Pierre
#6703

_clo_ — 30/11/2021
Type de fichier joint : acrobat
sujet.pdf
786.11 KB



public class MiniProjet {


	//déclaration des données
	static class Tableau{
		int tailleTableau;
		Personnage cavalier;
		Position trou1;
		Position trou2;
		Position riviere;
		int nombreCoups;
		boolean end;
	}

	//donées Cavalier
	static class Cavalier {
		Position pos;
		char R;
	}

	//position du cavalier
	static class Position {
		int x;
		int y;
	}

	/*///////////////////////////////////////////////////////////////////
	Initialisation du jeu
	/////////////////////////////////////////////////////////*/


	//position Cavalier
	public static Cavalier initialisationPerso(Tableau jeu){
		jeu.cavalier=new Cavalier();
		jeu.cavalier.pos=new Position();
		//position du cavalier
		jeu.cavalier.pos.x = 0;
		jeu.cavalier.pos.y = 0;
		return jeu.perso;
	}

	//position riviere

	 public static Position initialisationRiviere (Tableau jeu){
		jeu.riviere = new Position();
		do{
			jeu.riviere.x = (int)(Math.random()*jeu.tailleTableau+1);
		}while(jeu.riviere.x == jeu.cavalier.pos.x);
		do{
			jeu.riviere.y = (int)(Math.random()*jeu.TailleTableau+1);
		}while(jeu.riviere.y == jeu.cavalier.pos.y);
		return jeu.riviere;
	}

	//Position du 1er trou
	public static Position initialisationtrou1 (Tableau jeu){
		jeu.trou1 = new Position();
		do{
			jeu.trou1.x = (int)(Math.random()*jeu.tailleTableau+1);
		}while((jeu.trou1.x == jeu.cavalier.pos.x)||(jeu.trou1.x == jeu.riviere.x));
		do{
			jeu.trou1.y = (int)(Math.random()*jeu.sizeGrille+1);
		}while((jeu.trou1.x == jeu.cavalier.pos.x)||(jeu.trou1.y == jeu.riviere.y));

		return jeu.trou1;
	}

	//Position du 2eme trou

	public static Position initialisationtrou2 (Tableau jeu){
		jeu.trou2 = new Position();
		do{
			jeu.trou2.x = (int)(Math.random()*jeu.tailleTableau+1);
		}while((jeu.trou2.x == jeu.cavalier.pos.x)||(jeu.trou2.x == jeu.riviere.x)||(jeu.trou2.x==jeu.trou1.x));
		do{
			jeu.trou2.y = (int)(Math.random()*jeu.sizeGrille+1);
		}while((jeu.trou2.x == jeu.cavalier.pos.x)||(jeu.trou2.y == jeu.riviere.y)||(jeu.trou2.y==jeu.trou1.y));

		return jeu.trou2;
	}





	 //Créer les emplacements pour le cavalier, les trous et la rivière sans qu'ils se chevauchent et le tableau de jeu
  public static void printTableau (Tableau jeu){

    for(int i=0; i<jeu.sizeGrille; i++){
      Ecran.afficher(" ___");
Réduire
MiniProjet.java
3 Ko
Bonjoir, ce que j'ai fait pour le moment reste tres brouillon je galere a faire la grille et les positions
Jean Pierre — 30/11/2021
Et la date de rendu c'est pour quand ?
_clo_ — 30/11/2021
9 decembre
ah et j'ai mis les positions en random psk vu que j'arrivais pas a faire la grille j'ai pas pu leurs mettres les emplacements prevus 😭
Jean Pierre — 30/11/2021
Je te fais ça dans les weekend là je suis short sur un rendu pour vendredi 🌝
_clo_ — 30/11/2021
T'inquiète je sais très bien mdr
Moi je continue d'essayer de mon coter aussi mais je suis vraiment bloquée avec cette grille de * 😂
Jean Pierre — 30/11/2021
roh mais c'est tt con mdrr
_clo_ — 30/11/2021
Oui ben merci 🥲
Jean Pierre — 30/11/2021
Mais de rien
_clo_ — Aujourd’hui à 19:20
Du coup tu aurais le time de m'aider ? Je galère tjr pour cette grille de merde et tu me diras quand tu es dispo pour que je te donne une bouteille pour te remercier au moins pour celui de l'année dernière
Jean Pierre — Aujourd’hui à 19:25
ah ouais
bah je vais me chercher a graille et je te fais ton projet je devrais speed assez vite
Déso c'est la dech avec les partiels et tt tmtc
_clo_ — Aujourd’hui à 19:39
oui je coco j'ai 4 partiels cette semaine
dont 2 samedis matin je t'avoue je pleure
Jean Pierre — Aujourd’hui à 19:46
Outch ça pique courage
_clo_ — Aujourd’hui à 19:52
surtout quand c'est analyse et algebre mdr
et courage a toi aussi je pense que t'as les memes galeres mdr
﻿



public class MiniProjet {


	//déclaration des données
	static class Tableau{
		int tailleTableau;
		Personnage cavalier;
		Position trou1;
		Position trou2;
		Position riviere;
		int nombreCoups;
		boolean end;
	}

	//donées Cavalier
	static class Cavalier {
		Position pos;
		char R;
	}

	//position du cavalier
	static class Position {
		int x;
		int y;
	}

	/*///////////////////////////////////////////////////////////////////
	Initialisation du jeu
	/////////////////////////////////////////////////////////*/


	//position Cavalier
	public static Cavalier initialisationPerso(Tableau jeu){
		jeu.cavalier=new Cavalier();
		jeu.cavalier.pos=new Position();
		//position du cavalier
		jeu.cavalier.pos.x = 0;
		jeu.cavalier.pos.y = 0;
		return jeu.perso;
	}

	//position riviere

	 public static Position initialisationRiviere (Tableau jeu){
		jeu.riviere = new Position();
		do{
			jeu.riviere.x = (int)(Math.random()*jeu.tailleTableau+1);
		}while(jeu.riviere.x == jeu.cavalier.pos.x);
		do{
			jeu.riviere.y = (int)(Math.random()*jeu.TailleTableau+1);
		}while(jeu.riviere.y == jeu.cavalier.pos.y);
		return jeu.riviere;
	}

	//Position du 1er trou
	public static Position initialisationtrou1 (Tableau jeu){
		jeu.trou1 = new Position();
		do{
			jeu.trou1.x = (int)(Math.random()*jeu.tailleTableau+1);
		}while((jeu.trou1.x == jeu.cavalier.pos.x)||(jeu.trou1.x == jeu.riviere.x));
		do{
			jeu.trou1.y = (int)(Math.random()*jeu.sizeGrille+1);
		}while((jeu.trou1.x == jeu.cavalier.pos.x)||(jeu.trou1.y == jeu.riviere.y));

		return jeu.trou1;
	}

	//Position du 2eme trou

	public static Position initialisationtrou2 (Tableau jeu){
		jeu.trou2 = new Position();
		do{
			jeu.trou2.x = (int)(Math.random()*jeu.tailleTableau+1);
		}while((jeu.trou2.x == jeu.cavalier.pos.x)||(jeu.trou2.x == jeu.riviere.x)||(jeu.trou2.x==jeu.trou1.x));
		do{
			jeu.trou2.y = (int)(Math.random()*jeu.sizeGrille+1);
		}while((jeu.trou2.x == jeu.cavalier.pos.x)||(jeu.trou2.y == jeu.riviere.y)||(jeu.trou2.y==jeu.trou1.y));

		return jeu.trou2;
	}





	 //Créer les emplacements pour le cavalier, les trous et la rivière sans qu'ils se chevauchent et le tableau de jeu
  public static void printTableau (Tableau jeu){

    for(int i=0; i<jeu.sizeGrille; i++){
      Ecran.afficher(" ___");
MiniProjet.java
3 Ko
