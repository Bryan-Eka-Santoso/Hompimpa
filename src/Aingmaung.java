public class Aingmaung extends Enemy {
    String sprite =
    "           _____,    _..-=-==-=-====--,\n" + 
    "        _.'a   /  .-',___,..=-=--==-'`\n" + 
    "       ( _     \\ /  //___/-=--=----'\n" + 
    "        ` `\\    /  //---/--==----=-'\n" + 
    "     ,-.    | / \\_//-_.'==-==---='\n" + 
    "    (.-.`\\  | |'../-'=-=-=-=-'\n" + 
    "     (' `\\`\\| //_|-\\\\.`;~````~,        _\n" + 
    "          \\ | \\_,_,_\\.'        \\     .'_`\\\n " + 
    "           `\\            ,    , \\    || `\\\\\n" + 
    "             \\    /   _.--\\    \\ '._.'/  / |\n" + 
    "             /  /`---'   \\ \\   |`'---'   \\/\n" + 
    "          __/ /           __) \\ ) `|\n" + 
    "       ((='-;)         (,___/(,_/)\n"; 
    
    public Aingmaung(){
        nama = "Aingmaung";
        life = 3;
        isFinish = false;
    }

    @Override
    public void startDialog(){
        System.out.println(nama + ": Kamu berani memasuki wilayahku? Bersiaplah untuk menghadapi kemarahan sang raja langit!");
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
        System.out.println(nama + ": Raunganku akan mengguncang jiwamu! Bersiaplah untuk ketakutan! " + actionSt + "!");
    }

    @Override
    public void defeatDialog(){
        System.out.println(nama + ": Aku... kalah... tapi ingat, langit dan darat masih milikku...");
    }

    @Override
    public void victoryDialog(){
        System.out.println(nama + ": Kamu hanyalah mangsa kecil bagi sang penguasa langit!");
    }

    @Override
    public String getSprite(){
        return sprite;
    }
}
