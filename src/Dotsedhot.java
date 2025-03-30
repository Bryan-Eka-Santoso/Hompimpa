public class Dotsedhot extends Enemy {
    String sprite =
    "	/##########\\\n" +
    "	/ \\###/	\\\n" +
    "	/	\\#/	\\\n" +
    "	/\\|	|/\\\n" +
    "	| | \\ ==\\	/== /| |\n" +
    "	\\| \\<|>\\ /<|>/|/	/|\n" +
    "	\\		|	-  \\ -	|/#|\n" +
    "	\\#\\	|	|	|/###|\n" +
    "	\\##\\  |	\\|	|/#####|\n" +
    "	\\###\\ | 	_ | /######|\n" +
    "	\\####\\ | / \\/ \\/\\|/#######|\n" +
    "	|######\\|	|# ########|\n" +
    "	/###########\\/ ########/###\\\n" +
    "	/############### #\\######/########\\";    
    
    public Dotsedhot(){
        nama = "Dotsedhot";
        life = 3;
        isFinish = false;
    }

    @Override
    public void startDialog(){
        System.out.println(nama + ": Kusedot darahmu!");
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
        System.out.println(nama + ": Aku keluarkan " + actionSt + "!");
    }

    @Override
    public void defeatDialog(){
        System.out.println(nama + ": Kembali... dan darahmu akan menjadi milikku!");
    }

    @Override
    public void victoryDialog(){
        System.out.println(nama + ": Kamu hanya salah satu dari banyak korban ku!");
    }

    @Override
    public String getSprite(){
        return sprite;
    }
}
