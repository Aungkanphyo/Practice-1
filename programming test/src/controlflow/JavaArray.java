package controlflow;

public class JavaArray {
    public static void main(String[] args) {
        /*int a = 78; //variable initialize
        String name = "Aung Kan Phyo";
        int num[] = {23,56,84,54,1,78}; //initialize
        System.out.println(num[4]);
        num[4] = 5;
        System.out.println(num[4]);*/
        //int b; => variable ကိုနောက်က တန်ဖိုးတွေမထည့်ဘဲရေးလို့ရသလိုမျိုး array မှာလည်းရေးလို့ ရတယ်
        //ဘယ်လိုရေးမလဲဆိုတော့
        String names[] = new String[] {"Mg Myint","Kyaw Aung","Tharnot","Avenger","La Khawan"};
        /*System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);
        String car[] = new String[4];
        car[0] = "Toyota";
        car[2] = "Nissan";
        car[3] = "Hijet";
        System.out.println(car[1]);*/ // car[1] မှာဘာမှမရှိတော့ null လို့ပြတယ်။ အ့လိုမျိုးဘဲ တန်ဖိုးမထည့်ထားတဲ့ကောင်တွေကို output
        //ထုတ်ရင် null ဆိုတာဘဲပြတယ်
        System.out.println(names.length); //ကိုယ်ရေးထားတဲ့ array ထဲမှာ အခန်းဘယ်နှစ်ခန်းပါလည်းဆိုတာသိချင်ရင် အ့လို‌ရေးရတယ်။ (.)dot ဆိုတာရေးလိုက်ရင် သုံးလို့ရတဲဟာတွေအကုန်ကျလာတာ။
        /*names[1]="Nang Saing Lin Kham";
        System.out.println(names[1]);*/ //ပြင်ချင်တဲ့ကောင်ကို အ့လိုပြင်တာ။

        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }
}
