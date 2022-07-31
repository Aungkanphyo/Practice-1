package controlflow;

public class ifstatement {
    public static void main(String[] args) {
        //syntax =>dataType variablename = value;
        //decision making statement
        //loop statement
        //jump statement

        //decision making statement မှာဆိုရင် ၂မျိုးရှိတယ်
        //if statement နဲ့ loop statement

        //if(conditional){} if statement က conditional မှန်မှအလုပ်လုပ်တယ် မှားရင် မလုပ်
        //conditional ထဲမှာ true, false တန်ဖိုးတွေကို သိမ်းတယ် true ရင်ဘာလုပ် false ရင် ဘာလုပ်ဆိုတာညွှန်ကြားတယ်ပေါ့
        //boolean ကစာသားတွေဘာတွေနဲ့ ပေါင်းရေးလို့မရဘူး အ့တာကြောင့်လက်သည်းကွင်းအုပ်ပေးရတယ်
        /*int a = 10;
        //boolean => true or false
        if(a==10){
            System.out.println(a>15); */
        int mark = 80;
        if(mark<40){
            System.out.println("fail");
        }
        else if(mark>=40 && mark<=80){
            System.out.println("pass");
        }
        else{
            System.out.println("D");
        }
    }
}
