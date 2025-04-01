public class Player {
    String nama;
    int life;
    String sprite = 
    "     _._\n" + 
    "     /__\\__  //\n" + 
    "    //_____\\///\n" + 
    "   _| /-_-)\\|/_\n" + 
    "  (___\\ _ //___\\\n" + 
    "  (  |\\\\_/// * \\\\\n" + 
    "   \\_| \\_((*   *))\n" + 
    "   ( |__|_\\\\* *//\n" + 
    "   (o/  _  \\_*_/\n" + 
    "   //\\__|__/\\\n" + 
    "  // |  | |  |\n" + 
    " //  _\\ | |___)\n" + 
    "//  (___|"; 
    
    public Player(String nama) {
        this.nama = nama;
        this.life = 3;
    }

    public void startDialog(){
        System.out.println(nama + ": Hari yang cerah bungg!");
    }

    public void actionDialog(int action){
        String actionSt;
        if(action == 1){
            actionSt = "HOM";
        } else if(action == 2){
            actionSt = "PIM";
        } else {
            actionSt = "PA";
        }
        System.out.println(nama + ": Wahai makhluk jahanam, bersiaplah untuk kalah, aku mengeluarkan " + actionSt);
    }

    public void defeatDialog(){
        System.out.println(nama + ": Aku.. kalah? Tidak mungkin!");
    }

    public void victoryDialog(){
        System.out.println(nama + ": Kau kalah! Berlutulah di hadapanku!");
    }

    public String getSprite(){
        return sprite;
    }
}
