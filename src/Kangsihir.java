public class Kangsihir extends Enemy {
    String sprite =
    "	/ \\\n" +
    "	|	|\n" +
    "	--:'''':--\n" +
    "	:'_' :\n" +
    "	_:\"\":\\	\n " +
    "  ' '		.' :::	'._\n"
    + " .*====<<=)	\\	:\n " +
    "  . '	'-'-'\\_	/'._.'\n"
    +
    "	\\====:_\"\"\n" +
    "	.'	\\\\\n" +
    "	:	:\n" +
    "	/  :	\\\n";
    
    
    
    public Kangsihir(){
        nama = "Kangsihir";
        life = 3;
        isFinish = false;
    }

    @Override
    public void startDialog(){
        System.out.println(nama + ": Dengan tongkat sihirku, aku akan mengakhiri pertarungan ini dengan cepat!");
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
        System.out.println(nama + ": Sinar suci tongkatku akan menghancurkan kegelapanmu! " + actionSt + "!");
    }

    @Override
    public void defeatDialog(){
        System.out.println(nama + ": Tidak mungkin... aku, Penyihir Tertinggi, dikalahkan...?");
    }

    @Override
    public void victoryDialog(){
        System.out.println(nama + ": Pertarungan ini terlalu mudah bagiku... kembalilah ketika kamu lebih kuat!");
    }

    @Override
    public String getSprite(){
        return sprite;
    }
}
