public class Shappider extends Enemy {
    String sprite =
    "               (\n" + 
    "         /\\  .-\"\"\".  /\\\n" + 
    "        //\\\\/  ,,,  \\\\//\\\\\n" + 
    "        |/\\| ,;;;;;, |/\\|\n" + 
    "        //\\\\\\;-\"\"\";///\\\\\n" + 
    "       //  \\/   .   \\/  \\\\\n " + 
    "      (| ,-_| \\ | / |_-, |)\n" + 
    "        //`__\\.-../__`\\\\\n" + 
    "       // /.-(() ())-.\\ \\\\\n" + 
    "      (\\ |)   '---'   (| /)\n" + 
    "       ` (|           |) `\n" + 
    "         \\)           (/ ";
    
    public Shappider(){
        nama = "Shappider";
        life = 3;
        isFinish = false;
    }

    @Override
    public void startDialog(){
        System.out.println(nama + ": Guweh Shappiderr, Lu nggak akan bisa kabur!");
    }

    @Override
    public void actionDialog(int action){
        String actionSt;
        if(action == 1){
            actionSt = "HOM";
        } else if(action == 2){
            actionSt = "PIM";
        } else {
            actionSt = "PA";
        }
        System.out.println(nama + ": Lihat jurusku, Aku mengeluarkan " + actionSt + "!");
    }

    @Override
    public void defeatDialog(){
        System.out.println(nama + ": Ti..Tidakk mungkin aku kalah sama makhluk sepertimu!");
    }

    @Override
    public void victoryDialog(){
        System.out.println(nama + ": Yahaha kau kalah! Aku Shappiderr!");
    }

    @Override
    public String getSprite(){
        return sprite;
    }
}
