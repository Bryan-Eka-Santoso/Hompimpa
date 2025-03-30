public class Maklampir extends Enemy {
    String sprite =
    "	_/ /\n" +
    "	(  * )		/  |\n"
    +
    "	)  \"	_ o)'-./  \n" +
    "	* _ )	(_, .$$$\n" +
    "	( ) 		7_$$$$\n" +
    "	( : { _) '--- $\\\n" +
    "		'	//  \\  _, \\\n" +
    "	)	( \\_/\\_\n" +
    "	.'	\\ \\------ ''.\n" +
    "	|='	'=| |	)\n" +
    "	|	| | .	_/\n " +
    "	\\	(. ),  / /  I	\\\n" +
    "	'._/_)_(\\  .'  (  ,(,_) \n";    
    
    
    public Maklampir(){
        nama = "Maklampir";
        life = 3;
        isFinish = false;
    }

    @Override
    public void startDialog(){
        System.out.println(nama + ": Kamu berani mengganggu istirahatku? Bersiaplah untuk menghadapi kutukanku!");
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
        System.out.println(nama + ": Dengan kekuatan bulan purnama, aku mengutukmu! Rasakan " + actionSt + "!");
    }

    @Override
    public void defeatDialog(){
        System.out.println(nama + ": Aku... terlalu ceroboh... tapi ingat, kutukanku akan selalu mengikutimu.");
    }

    @Override
    public void victoryDialog(){
        System.out.println(nama + ": Lampir: Hihihi... kamu hanyalah mainan dalam tanganku!");
    }

    @Override
    public String getSprite(){
        return sprite;
    }
}
