package com.RachelLoren.NameStormer;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Utility {
    //This class is used to store functions used throughout the rest of the project.

    //possible female names
    public static String[] a_f_Names= {"Ava","Amelia","Abigail","Anna","Annabelle","Annabella","Alaina","Adalee","Adelyn","Alessandra","Alexa","Alexis","Alice","Alisson","Amber","Amy","Anastasia","Ashley","Ashlynn","Aurora","Avery"
    };
    public static String[] b_f_Names= {"Bella","Bethany","Bianca","Brianna","Brooke","Brooklyn","Bridget","Brylee", "Beatriz","Beatrice"};
    public static String[] c_f_Names = {"Cadence","Charlotte","Camila","Chloe","Claire","Clara","Cecilia","Cara","Carmen","Claudia","Celeste"
    };
    public static String[] d_f_Names = {"Daisy","Diana","Destiny","Dawn","Dorothy","Dahlia","Dina","Dixie","Dakota","Daphne","Dani"};
    public static String[] e_f_Names = {"Emma","Elizabeth","Emily","Elanor","Eva","Eden","Elise","Elsa","Eliza","Edna","Erica","Evie"};
    public static String[] f_f_Names = {"Finley","Freyja","Faith","Fiona","Farah","Fatima","Felicity","Faiza","Flora","Fay","Fern","Fleur","Farzana"
    };
    public static String[] g_f_Names = {"Gabriella","Gracie","Giselle","Gemma","Grace","Gina","Gail","Genevieve","Galina","Gloria","Gwen","Greta"
    };
    public static String[] h_f_Names = {"Hazel","Harmony","Hope","Hana","Hannah","Helen","Haley","Heather","Holly","Heidi","Hattie","Hadley","Harriet"
    };
    public static String[] i_f_Names = {"Isabella","Ivy","Iris","Isla","Isabelle","Ivory","Ivanna","Ira","Irene","Indigo","Idris"};
    public static String[] j_f_Names = {"Jade","Julia","Jane","Jasmine","Joy","Jana","June","Jessica","Joan","Jill","Jenny","Juliet","Jocelyn","Jolene","Josie"
    };
    public static String[] k_f_Names = {"Kiara","Kaitlyn","Kylee","Karina","Kate","Kayla","Kali","Kaia","Kelly","Kay","Kamila","Kira","Kimberly","Kim","Khloe"
    };
    public static String[] l_f_Names = {"Luna","Lucy","Lily","Lydia","Lola","Laura","Lara","Layla","Linda","Leia","Louise","Louisa","Leilani","Lia","Lila","Lucia","Leena"
    };
    public static String[] m_f_Names = {"Madelyn","Melody","Maria","Madeline","Maeve","Maggie","Mae","Madison","Marie","Mila","Michele","Maia","Megan","Mira","Marina","Maryam","Molly","Myra","Morgan","Mackenzie"
    };
    public static String[] n_f_Names = {"Nora","Natalie","Naomi","Nadia","Nina","Nancy","Naima","Natasha","Nadina","Nova","Nicole","Nala","Natalia","Nadira","Nani"
    };
    public static String[] o_f_Names = {"Olive","Octavia","Ophelia","Olivia","Olga","Odette","Oma","Odelia","Oona","Opal","Olympia","Odell","Omana","Orva","Ottilie"
    };
    public static String[] p_f_Names = {"Penelope","Paisley","Piper","Paige","Paula","Pamela","Phoebe","Penny","Poppy","Pegg","Priscilla","Pauline","Patty","Pam"
    };
    public static String[] q_f_Names = {"Quinn","Queen","Quianna","Quincey","Quinlan","Quintina","Qahira","Quella","Quita","Quinlynn","Quentina"
    };
    public static String[] r_f_Names = {"Riley","Rachel","Rose","Ruby","Raina","Ruth","Rita","Ria","Rana","Renee","Rayna","Regina","Raven","Ramona","Rihanna","Roxy"
    };
    public static String[] s_f_Names = {"Sarah","Sophia","Stella","Scarlett","Sadie","Sofia","Sasha","Sally","Sabrina","Skylar","Saanvi","Sienna","Sloane","Savannah","Susan"
    };
    public static String[] t_f_Names = {"Trinity","Tessa","Talia","Tara","Tanya","Tania","Tia","Tabitha","Tatiana","Teresa","Tamara","Taylor","Tina","Thea","Tallulah","Tiffany","Thalia"
    };
    public static String[] u_f_Names = {"Ulrika","Ursula","Ulyssa","Uma","Una","Ula","Urania","Uditi","Ursa","Ulani","Ubika"};
    public static String[] v_f_Names = {"Victoria","Violet","Valerie","Valentina","Vera","Vanessa","Val","Venus","Veronica","Viola","Verity","Vida","Viviana","Verena"
    };
    public static String[] w_f_Names = {"Winter","Wren","Willow","Wynter","Willa","Winnie","Whitney","Wendy","Winona","Wilhelmina"};
    public static String[] x_f_Names = {"Xara","Xayah","Xena","Xiomara","Xenia","Xandra","Xaviera","Xylia","Xia","Xaria"};
    public static String[] y_f_Names = {"Yara","Yuna","Yasmine","Yana","Yael","Yesenia","Yumi","Yanira","Yelena","Yakira","Yoselin","Yaminah","Ysabel"
    };
    public static String[] z_f_Names = {"Zoey","Zara","Zelda","Zoe","Zahra","Zia","Zoya","Zaina","Zuria","Zola","Zella","Zandra","Zada","Zofia","Zilpah"
    };

    //possible male names
    public static String[] a_m_Names = {"Aiden","Asher","Anthony","Alexander","Andrew","Avery","Aaron","Axel","Alex","Austin","Adam","Adrian","Axel","Atlas"
    };
    public static String[] b_m_Names = {"Benjamin","Baxton","Bentley","Blake","Bruce","Bernard","Blaze","Brian","Brody","Brandon","Bradley","Byron","Brayden"
    };
    public static String[] c_m_Names = {"Carter","Charles","Christopher","Carl","Carlos","Calvin","Charlie","Cameron","Cole","Clyde","Caden","Cesar","Colin","Cody","Chad","Cooper","Connor","Chris","Clark","Chester","Clarence"
    };
    public static String[] d_m_Names = {"Daniel","Dylan","David","Damian","Dean","Dante","Danny","Damon","Dale","Dane","Diego","Darren","Dominic","Dennis","Donald","Desmond","Davis"
    };
    public static String[] e_m_Names = {"Elijah","Ethan","Easton","Edward","Earl","Edgar","Edwin","Eli","Eddie","Evan","Eric","Ernest","Edison","Ezekiel","Eduardo"
    };
    public static String[] f_m_Names = {"Felix","Francisco","Franklin","Fabian","Ferndando","Finn","Finnegan","Ford","Frances","Frank","Frederick"
    };
    public static String[] g_m_Names = {"Gabriel","Grayson","Grant","George","Gage","Gabe","Gregory","Gian","Griffin","Garrett","Gordon","Garrison","Glenn","Gareth","Gus","Greg","Grady"
    };
    public static String[] h_m_Names = {"Henry","Harry","Hunter","Hudson","Hans","Hank","Hugo","Hector","Harold","Harvey","Harrison","Haden","Hale","Herman","Holden"
    };
    public static String[] i_m_Names = {"Issac","Izaiah","Immanuel","Ian","Ibrahim","Isaiah","Ivan","Ismael","Iker","Israel"};
    public static String[] j_m_Names = {"James","Jackson","Julian","Jacob","John","Jason","Jake","Joshua","Jace","Joel","Jordan","Joseph","Joe","Johnathon","Jeremiah","Jeremias","Jasper","Justin","Jamie","Joey"
    };
    public static String[] k_m_Names = {"Karter","Kevin","Kyle","Kane","Karl","Kenneth","Kaleb","Keith","Kade","Kayden","Kalvin","Kameron","Keegan","Kareem","Knox","Karan","Kain"
    };
    public static String[] l_m_Names = {"Luca","Liam","Leo","Leon","Lucas","Lee","Louis","Luke","Levi","Lawrence","Leonardo","Lewis","Larry","Logan","Landon","Luis","Lance","Leroy","Lorenzo"
    };
    public static String[] m_m_Names = {"Mason","Matthew","Miles","Michael","Mark","Max","Mateo","Martin","Marcus","Milo","Marshall","Maverick","Malcolm","Marvin","Melvin"
    };
    public static String[] n_m_Names = {"Noah","Nathan","Nolan","Neal","Nicholas","Neo","Nigel","Nelson","Neel","Nate","Ned","Norman","Nico"
    };
    public static String[] o_m_Names = {"Oliver","Owen","Oscar","Otis","Otto","Odin","Obaiah","Oberon","Omar","Ollie","Orson","Oakley","Orion"
    };
    public static String[] p_m_Names = {"Patrick","Preston","Paul","Pedro","Percy","Perry","Parker","Phil","Paolo","Pierre","Pierce","Paxton","Paden"
    };
    public static String[] q_m_Names = {"Qadir","Qing","Quinlan","Quentin","Quinton","Quantrell","Quenton","Qamar","Qaid","Quinn"};
    public static String[] r_m_Names = {"Ryan","Robert","Rylan","Ray","Richard","Ralph","Raymond","Rex","Roger","Romeo","Russel","Randy","Ricky","Rick","Rico","Ricardo"
    };
    public static String[] s_m_Names = {"Stephen","Simon","Scott","Samuel","Sam","Spencer","Sonny","Sebastian","Steven","Steve","Silas","Sean","Salvador"
    };
    public static String[] t_m_Names = {"Theodore","Thomas","Tyler","Theo","Toby","Travis","Tobias","Tony","Tom","Tate","Troy","Tristan","Tim","Taj"
    };
    public static String[] u_m_Names = {"Ulysses","Uziel","Umar","Uriel","Upton","Uday","Ulrich","Umberto","Urbano","Ugo","Ulric","Ulf","Ulrik"
    };
    public static String[] v_m_Names = {"Vincent","Victor","Vihaan","Vince","Vito","Vidal","Vail","Vincenzo","Viktor","Veer","Vishnu","Ved","Vincente","Vinson"
    };
    public static String[] w_m_Names = {"William","Wyatt","Wesley","Walter","Warren","Wayne","Weston","Watson","Waldo","Wallace","Wilfred"};
    public static String[] x_m_Names = {"Xander","Xavier","Ximun","Xavion","Xandro","Xaiden","Xavi","Xavior","Xayden","Xion"};
    public static String[] y_m_Names = {"Yusuf","Yosef","Yair","Yael","Yash","Yahya","Yan","Yamir","Yannick","Yaman","Yadav"};
    public static String[] z_m_Names = {"Zachariah","Zander","Zane","Zachary","Zack","Zeke","Zain","Zayden","Zaki","Zebulon","Zayn","Zaiden","Zak","Zoltan"
    };

    //possible gender neutral names
    public static String[] a_n_Names = {"Avery","Ash","Alex","Asher","Aiden","Aria","Aubrey","Ashley","Addison","Angel"};
    public static String[] b_n_Names = {"Bailey","Brooks","Beau","Brooklyn","Beckette","Barrett","Bernie","Billie","Becl","Bao"};
    public static String[] c_n_Names = {"Carlin","Carey","Caelan","Camden","Cameron","Campbell","Cai","Cailin","Cache","Cassey"};
    public static String[] d_n_Names = {"Dale","Darby","Darcy","Dakota","Dacey","Dai","Danie","Denim","Dani","Devin"};
    public static String[] e_n_Names = {"Eden","Eli","Emery","Everly","Eddie","Ellis","East","Eldeah","Elizah","Ezra","Echo"};
    public static String[] f_n_Names = {"Flynn","Finley","Faye","Finnley","Flynn","Fallon","Freddi","Farren","Finn","Flann"};
    public static String[] g_n_Names = {"Genesis","Gene","Gray","Gael","Guadalupe","Gal","Garnet","Gable","Gabi","Gemini"};
    public static String[] h_n_Names = {"Hale","Harper","Hart","Hayes","Holden","Halley","Harlow","Hollis","Henley","Hyssop"};
    public static String[] i_n_Names = {"Ickett","Izzy","Ira","Imani","Ivory","Idris","Ilay","Iliah","Indigo","Isa"};
    public static String[] j_n_Names = {"Jackie","Jay","Jamie","Jordan","Jessie","Jaden","Jean","Jacky","Jaylin","Jacki"};
    public static String[] k_n_Names = {"Kai","Kinsley","Kennedy","Kyrie","Kaiden","Kace","Kade","Kadri","Kerrigan","Kabili"};
    public static String[] l_n_Names = {"Lee","Leslie","Lex","Luca","Leighton","London","Laverne","Lei","Lake","Lane"};
    public static String[] m_n_Names = {"Merle","Morgan","Mack","Mad","Mac","Marion","Manny","Mahina","Maud","Machi"};
    public static String[] n_n_Names = {"Noel","Nat","Neo","Noor","Noe","Nataly","Nevada","Nimai","Nahele","Nakia"};
    public static String[] o_n_Names = {"Oakley","Ollie","Omega","Onyx","Oakleigh","Oak","Orphie","Ozzie","Olive","Ola"};
    public static String[] p_n_Names = {"Parker","Peyton","Presley","Paisley","Phoenix","Paxton","Page","Pat","Pace","Page"};
    public static String[] q_n_Names = {"Quinn","Quest","Quin","Quincy","Quentin","Quinlan","Quillan","Qi","Quarry","Quinnlan"};
    public static String[] r_n_Names = {"River","Rowan","Remi","Ro","Riley","Rylee","Rae","Reed","Ramsey","Rafa","Raddix","Racer","Raine","Rabia"
    };
    public static String[] s_n_Names = {"Sam","Sascha","Skyler","Saffron","Sloan","Sidney","Sawyer","Spencer","Shea","Sammy"};
    public static String[] t_n_Names = {"Terry","Tracy","Tyler","Taylor","Teagan","Tatum","Tai","Tan","Taki","Tale"};
    public static String[] u_n_Names = {"Uaine","Udo","Uduak","Ugur","Ugra","Uk","Ull","Umber","Unique","Unathi"};
    public static String[] v_n_Names = {"Val","Valo","Vic","Valley","Vaely","Valee","Valli","Vallie","Van","Vida"};
    public static String[] w_n_Names = {"Wynn","Wade","Wally","Winter","Winnie","Willie","Walker","Waverly"};
    public static String[] x_n_Names = {"Xael","Xan","Xandy","Xanthe","Xanti","Xerxes","Xia","Xian","Xen","Xue"};
    public static String[] y_n_Names = {"Yara","Yuki","Yael","Yasin","Yona","Yannick","Yali","Yahel","Yadid","Yonah"};
    public static String[] z_n_Names = {"Zion","Zephyr","Zo","Zariah","Zen","Zyan","Zuir","Zola","Zaire","Zalley"};


    //This generates and returns a random name to be displayed in the app.
    public static String generateName(char p){
        String name = "";
        int min = 1;
        int max, num;
        char pref = p;

        int a_f_length = a_f_Names.length;
        int b_f_length = b_f_Names.length;
        int c_f_length = c_f_Names.length;
        int d_f_length = d_f_Names.length;
        int e_f_length = e_f_Names.length;
        int f_f_length = f_f_Names.length;
        int g_f_length = g_f_Names.length;
        int h_f_length = h_f_Names.length;
        int i_f_length = i_f_Names.length;
        int j_f_length = j_f_Names.length;
        int k_f_length = k_f_Names.length;
        int l_f_length = l_f_Names.length;
        int m_f_length = m_f_Names.length;
        int n_f_length = n_f_Names.length;
        int o_f_length = o_f_Names.length;
        int p_f_length = p_f_Names.length;
        int q_f_length = q_f_Names.length;
        int r_f_length = r_f_Names.length;
        int s_f_length = s_f_Names.length;
        int t_f_length = t_f_Names.length;
        int u_f_length = u_f_Names.length;
        int v_f_length = v_f_Names.length;
        int w_f_length = w_f_Names.length;
        int x_f_length = x_f_Names.length;
        int y_f_length = y_f_Names.length;
        int z_f_length = z_f_Names.length;

        int a_m_length = a_m_Names.length;
        int b_m_length = b_m_Names.length;
        int c_m_length = c_m_Names.length;
        int d_m_length = d_m_Names.length;
        int e_m_length = e_m_Names.length;
        int f_m_length = f_m_Names.length;
        int g_m_length = g_m_Names.length;
        int h_m_length = h_m_Names.length;
        int i_m_length = i_m_Names.length;
        int j_m_length = j_m_Names.length;
        int k_m_length = k_m_Names.length;
        int l_m_length = l_m_Names.length;
        int m_m_length = m_m_Names.length;
        int n_m_length = n_m_Names.length;
        int o_m_length = o_m_Names.length;
        int p_m_length = p_m_Names.length;
        int q_m_length = q_m_Names.length;
        int r_m_length = r_m_Names.length;
        int s_m_length = s_m_Names.length;
        int t_m_length = t_m_Names.length;
        int u_m_length = u_m_Names.length;
        int v_m_length = v_m_Names.length;
        int w_m_length = w_m_Names.length;
        int x_m_length = x_m_Names.length;
        int y_m_length = y_m_Names.length;
        int z_m_length = z_m_Names.length;

        int a_n_length = a_n_Names.length;
        int b_n_length = b_n_Names.length;
        int c_n_length = c_n_Names.length;
        int d_n_length = d_n_Names.length;
        int e_n_length = e_n_Names.length;
        int f_n_length = f_n_Names.length;
        int g_n_length = g_n_Names.length;
        int h_n_length = h_n_Names.length;
        int i_n_length = i_n_Names.length;
        int j_n_length = j_n_Names.length;
        int k_n_length = k_n_Names.length;
        int l_n_length = l_n_Names.length;
        int m_n_length = m_n_Names.length;
        int n_n_length = n_n_Names.length;
        int o_n_length = o_n_Names.length;
        int p_n_length = p_n_Names.length;
        int q_n_length = q_n_Names.length;
        int r_n_length = r_n_Names.length;
        int s_n_length = s_n_Names.length;
        int t_n_length = t_n_Names.length;
        int u_n_length = u_n_Names.length;
        int v_n_length = v_n_Names.length;
        int w_n_length = w_n_Names.length;
        int x_n_length = x_n_Names.length;
        int y_n_length = y_n_Names.length;
        int z_n_length = z_n_Names.length;

        int fMax = a_f_length + b_f_length + c_f_length + d_f_length + e_f_length + f_f_length + g_f_length + h_f_length + i_f_length + j_f_length + k_f_length + l_f_length + m_f_length + n_f_length + o_f_length + p_f_length + q_f_length + r_f_length + s_f_length + t_f_length + u_f_length + v_f_length + w_f_length + x_f_length + y_f_length + z_f_length;
        int mMax = a_m_length + b_m_length + c_m_length + d_m_length + e_m_length + f_m_length + g_m_length + h_m_length + i_m_length + j_m_length + k_m_length + l_m_length + m_m_length + n_m_length + o_m_length + p_m_length + q_m_length + r_m_length + s_m_length + t_m_length + u_m_length + v_m_length + w_m_length + x_m_length + y_m_length + z_m_length;
        int nMax = a_n_length + b_n_length + c_n_length + d_n_length + e_n_length + f_n_length + g_n_length + h_n_length + i_n_length + j_n_length + k_n_length + l_n_length + m_n_length + n_n_length + o_n_length + p_n_length + q_n_length + r_n_length + s_n_length + t_n_length + u_n_length + v_n_length + w_n_length + x_n_length + y_n_length + z_n_length;

        if(p=='a'){
            max = fMax + mMax + nMax;
            num = (int)Math.floor(Math.random()*(max-min+1)+min);

            if(num <= fMax){
                pref='f';
            }else{
                num = num - fMax;
            }
            if(p=='a' && num <= mMax){
                pref='m';
            }else{
                num = num - mMax;
            }
            if(p=='a' && num <= nMax){
                pref = 'n';
            }else{
                max = 3;
                num = (int)Math.floor(Math.random()*(max-min+1)+min);
                if(num==1){
                    pref='f';
                }else if(num==2){
                    pref='m';
                }else{
                    pref='n';
                }
            }
        }
        if(pref=='f'){
            max = fMax;
            num = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(name=="" && num <= a_f_length){
                name = a_f_Names[num-1];
            }else{
                num = num - a_f_length;
            }
            if(name=="" && num <= b_f_length){
                name = b_f_Names[num-1];
            }else{
                num = num - b_f_length;
            }
            if(name=="" && num <= c_f_length){
                name = c_f_Names[num-1];
            }else{
                num = num - c_f_length;
            }
            if(name=="" && num <= d_f_length){
                name = d_f_Names[num-1];
            }else{
                num = num - d_f_length;
            }
            if(name=="" && num <= e_f_length){
                name = e_f_Names[num-1];
            }else{
                num = num - e_f_length;
            }
            if(name=="" && num <= f_f_length){
                name = f_f_Names[num-1];
            }else{
                num = num - f_f_length;
            }
            if(name=="" && num <= g_f_length){
                name = g_f_Names[num-1];
            }else{
                num = num - g_f_length;
            }
            if(name=="" && num <= h_f_length){
                name = h_f_Names[num-1];
            }else{
                num = num - h_f_length;
            }
            if(name=="" && num <= i_f_length){
                name = i_f_Names[num-1];
            }else{
                num = num - i_f_length;
            }
            if(name=="" && num <= j_f_length){
                name = j_f_Names[num-1];
            }else{
                num = num - j_f_length;
            }
            if(name=="" && num <= k_f_length){
                name = k_f_Names[num-1];
            }else{
                num = num - k_f_length;
            }
            if(name=="" && num <= l_f_length){
                name = l_f_Names[num-1];
            }else{
                num = num - l_f_length;
            }
            if(name=="" && num <= m_f_length){
                name = m_f_Names[num-1];
            }else{
                num = num - m_f_length;
            }
            if(name=="" && num <= n_f_length){
                name = n_f_Names[num-1];
            }else{
                num = num - n_f_length;
            }
            if(name=="" && num <= o_f_length){
                name = o_f_Names[num-1];
            }else{
                num = num - o_f_length;
            }
            if(name=="" && num <= p_f_length){
                name = p_f_Names[num-1];
            }else{
                num = num - p_f_length;
            }
            if(name=="" && num <= q_f_length){
                name = q_f_Names[num-1];
            }else{
                num = num - q_f_length;
            }
            if(name=="" && num <= r_f_length){
                name = r_f_Names[num-1];
            }else{
                num = num - r_f_length;
            }
            if(name=="" && num <= s_f_length){
                name = s_f_Names[num-1];
            }else{
                num = num - s_f_length;
            }
            if(name=="" && num <= t_f_length){
                name = t_f_Names[num-1];
            }else{
                num = num - t_f_length;
            }
            if(name=="" && num <= u_f_length){
                name = u_f_Names[num-1];
            }else{
                num = num - u_f_length;
            }
            if(name=="" && num <= v_f_length){
                name = v_f_Names[num-1];
            }else{
                num = num - v_f_length;
            }
            if(name=="" && num <= w_f_length){
                name = w_f_Names[num-1];
            }else{
                num = num - w_f_length;
            }
            if(name=="" && num <= x_f_length){
                name = x_f_Names[num-1];
            }else{
                num = num - x_f_length;
            }
            if(name=="" && num <= y_f_length){
                name = y_f_Names[num-1];
            }else{
                num = num - y_f_length;
            }
            if(name=="" && num <= z_f_length){
                name = z_f_Names[num-1];
            }else{
                num = num - z_f_length;
            }
        }

        if(pref=='m'){
            max = mMax;
            num = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(name=="" && num <= a_m_length){
                name = a_m_Names[num-1];
            }else{
                num = num - a_m_length;
            }
            if(name=="" && num <= b_m_length){
                name = b_m_Names[num-1];
            }else{
                num = num - b_m_length;
            }
            if(name=="" && num <= c_m_length){
                name = c_m_Names[num-1];
            }else{
                num = num - c_m_length;
            }
            if(name=="" && num <= d_m_length){
                name = d_m_Names[num-1];
            }else{
                num = num - d_m_length;
            }
            if(name=="" && num <= e_m_length){
                name = e_m_Names[num-1];
            }else{
                num = num - e_m_length;
            }
            if(name=="" && num <= f_m_length){
                name = f_m_Names[num-1];
            }else{
                num = num - f_m_length;
            }
            if(name=="" && num <= g_m_length){
                name = g_m_Names[num-1];
            }else{
                num = num - g_m_length;
            }
            if(name=="" && num <= h_m_length){
                name = h_m_Names[num-1];
            }else{
                num = num - h_m_length;
            }
            if(name=="" && num <= i_m_length){
                name = i_m_Names[num-1];
            }else{
                num = num - i_m_length;
            }
            if(name=="" && num <= j_m_length){
                name = j_m_Names[num-1];
            }else{
                num = num - j_m_length;
            }
            if(name=="" && num <= k_m_length){
                name = k_m_Names[num-1];
            }else{
                num = num - k_m_length;
            }
            if(name=="" && num <= l_m_length){
                name = l_m_Names[num-1];
            }else{
                num = num - l_m_length;
            }
            if(name=="" && num <= m_m_length){
                name = m_m_Names[num-1];
            }else{
                num = num - m_m_length;
            }
            if(name=="" && num <= n_m_length){
                name = n_m_Names[num-1];
            }else{
                num = num - n_m_length;
            }
            if(name=="" && num <= o_m_length){
                name = o_m_Names[num-1];
            }else{
                num = num - o_m_length;
            }
            if(name=="" && num <= p_m_length){
                name = p_m_Names[num-1];
            }else{
                num = num - p_m_length;
            }
            if(name=="" && num <= q_m_length){
                name = q_m_Names[num-1];
            }else{
                num = num - q_m_length;
            }
            if(name=="" && num <= r_m_length){
                name = r_m_Names[num-1];
            }else{
                num = num - r_m_length;
            }
            if(name=="" && num <= s_m_length){
                name = s_m_Names[num-1];
            }else{
                num = num - s_m_length;
            }
            if(name=="" && num <= t_m_length){
                name = t_m_Names[num-1];
            }else{
                num = num - t_m_length;
            }
            if(name=="" && num <= u_m_length){
                name = u_m_Names[num-1];
            }else{
                num = num - u_m_length;
            }
            if(name=="" && num <= v_m_length){
                name = v_m_Names[num-1];
            }else{
                num = num - v_m_length;
            }
            if(name=="" && num <= w_m_length){
                name = w_m_Names[num-1];
            }else{
                num = num - w_m_length;
            }
            if(name=="" && num <= x_m_length){
                name = x_m_Names[num-1];
            }else{
                num = num - x_m_length;
            }
            if(name=="" && num <= y_m_length){
                name = y_m_Names[num-1];
            }else{
                num = num - y_m_length;
            }
            if(name=="" && num <= z_m_length){
                name = z_m_Names[num-1];
            }else{
                num = num - z_m_length;
            }
        }

        if(pref=='n'){
            max = nMax;
            num = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(name=="" && num <= a_n_length){
                name = a_n_Names[num-1];
            }else{
                num = num - a_n_length;
            }
            if(name=="" && num <= b_n_length){
                name = b_n_Names[num-1];
            }else{
                num = num - b_n_length;
            }
            if(name=="" && num <= c_n_length){
                name = c_n_Names[num-1];
            }else{
                num = num - c_n_length;
            }
            if(name=="" && num <= d_n_length){
                name = d_n_Names[num-1];
            }else{
                num = num - d_n_length;
            }
            if(name=="" && num <= e_n_length){
                name = e_n_Names[num-1];
            }else{
                num = num - e_n_length;
            }
            if(name=="" && num <= f_n_length){
                name = f_n_Names[num-1];
            }else{
                num = num - f_n_length;
            }
            if(name=="" && num <= g_n_length){
                name = g_n_Names[num-1];
            }else{
                num = num - g_n_length;
            }
            if(name=="" && num <= h_n_length){
                name = h_n_Names[num-1];
            }else{
                num = num - h_n_length;
            }
            if(name=="" && num <= i_n_length){
                name = i_n_Names[num-1];
            }else{
                num = num - i_n_length;
            }
            if(name=="" && num <= j_n_length){
                name = j_n_Names[num-1];
            }else{
                num = num - j_n_length;
            }
            if(name=="" && num <= k_n_length){
                name = k_n_Names[num-1];
            }else{
                num = num - k_n_length;
            }
            if(name=="" && num <= l_n_length){
                name = l_n_Names[num-1];
            }else{
                num = num - l_n_length;
            }
            if(name=="" && num <= m_n_length){
                name = m_n_Names[num-1];
            }else{
                num = num - m_n_length;
            }
            if(name=="" && num <= n_n_length){
                name = n_n_Names[num-1];
            }else{
                num = num - n_n_length;
            }
            if(name=="" && num <= o_n_length){
                name = o_n_Names[num-1];
            }else{
                num = num - o_n_length;
            }
            if(name=="" && num <= p_n_length){
                name = p_n_Names[num-1];
            }else{
                num = num - p_n_length;
            }
            if(name=="" && num <= q_n_length){
                name = q_n_Names[num-1];
            }else{
                num = num - q_n_length;
            }
            if(name=="" && num <= r_n_length){
                name = r_n_Names[num-1];
            }else{
                num = num - r_n_length;
            }
            if(name=="" && num <= s_n_length){
                name = s_n_Names[num-1];
            }else{
                num = num - s_n_length;
            }
            if(name=="" && num <= t_n_length){
                name = t_n_Names[num-1];
            }else{
                num = num - t_n_length;
            }
            if(name=="" && num <= u_n_length){
                name = u_n_Names[num-1];
            }else{
                num = num - u_n_length;
            }
            if(name=="" && num <= v_n_length){
                name = v_n_Names[num-1];
            }else{
                num = num - v_n_length;
            }
            if(name=="" && num <= w_n_length){
                name = w_n_Names[num-1];
            }else{
                num = num - w_n_length;
            }
            if(name=="" && num <= x_n_length){
                name = x_n_Names[num-1];
            }else{
                num = num - x_n_length;
            }
            if(name=="" && num <= y_n_length){
                name = y_n_Names[num-1];
            }else{
                num = num - y_n_length;
            }
            if(name=="" && num <= z_n_length){
                name = z_n_Names[num-1];
            }else{
                num = num - z_n_length;
            }
        }


        if(name==""){
            name = "Name is zero";
        }
        return name;
    }


    //This generates and returns a random name that starts with a letter, letter.
    public static String runFavorites(char p, int letter){
        String name = "";
        int num, max;
        int min = 1;
        char pref = p;

        if(p=='a'){
            max = 3;
            num = (int)Math.floor(Math.random()*(max-min+1)+min);
            switch(num){
                case 1:
                    pref = 'f';
                    break;
                case 2:
                    pref = 'm';
                    break;
                case 3:
                    pref = 'n';
                    break;
            }
        }

        switch(letter){
            case 1:
                if(pref=='f'){
                    max = a_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = a_f_Names[num-1];
                }else if(pref=='m'){
                    max = a_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = a_m_Names[num-1];
                }else if(pref=='n'){
                    max = a_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = a_n_Names[num-1];
                }else{
                    int a_f_length = a_f_Names.length;
                    int a_m_length = a_m_Names.length;
                    int a_n_length = a_n_Names.length;
                    max = a_f_length + a_m_length + a_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= a_f_length){
                        name = a_f_Names[num-1];
                    }else{
                        num = num - a_f_length;
                    }
                    if(name == "" && num <= a_m_length){
                        name = a_m_Names[num-1];
                    }else{
                        num = num - a_m_length;
                    }
                    if(name == "" && num <= a_n_length){
                        name = a_n_Names[num-1];
                    }else{
                        name = "a favorites failed";
                    }
                }
                break;
            case 2:
                if(pref=='f'){
                    max = b_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = b_f_Names[num-1];
                }else if(pref=='m'){
                    max = b_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = b_m_Names[num-1];
                }else if(pref=='n'){
                    max = b_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = b_n_Names[num-1];
                }else{
                    int b_f_length = b_f_Names.length;
                    int b_m_length = b_m_Names.length;
                    int b_n_length = b_n_Names.length;
                    max = b_f_length + b_m_length + b_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= b_f_length){
                        name = b_f_Names[num-1];
                    }else{
                        num = num - b_f_length;
                    }
                    if(name == "" && num <= b_m_length){
                        name = b_m_Names[num-1];
                    }else{
                        num = num - b_m_length;
                    }
                    if(name == "" && num <= b_n_length){
                        name = b_n_Names[num-1];
                    }else{
                        name = "a favorites failed";
                    }
                }
                break;
            case 3:
                if(pref=='f'){
                    max = c_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = c_f_Names[num-1];
                }else if(pref=='m'){
                    max = c_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = c_m_Names[num-1];
                }else if(pref=='n'){
                    max = c_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = c_n_Names[num-1];
                }else{
                    int c_f_length = c_f_Names.length;
                    int c_m_length = c_m_Names.length;
                    int c_n_length = c_n_Names.length;
                    max = c_f_length + c_m_length + c_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= c_f_length){
                        name = c_f_Names[num-1];
                    }else{
                        num = num - c_f_length;
                    }
                    if(name == "" && num <= c_m_length){
                        name = c_m_Names[num-1];
                    }else{
                        num = num - c_m_length;
                    }
                    if(name == "" && num <= c_n_length){
                        name = c_n_Names[num-1];
                    }else{
                        name = "a favorites failed";
                    }
                }
                break;
            case 4:
                if(pref=='f'){
                    max = d_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = d_f_Names[num-1];
                }else if(pref=='m'){
                    max = d_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = d_m_Names[num-1];
                }else if(pref=='n'){
                    max = d_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = d_n_Names[num-1];
                }else{
                    int d_f_length = d_f_Names.length;
                    int d_m_length = d_m_Names.length;
                    int d_n_length = d_n_Names.length;
                    max = d_f_length + d_m_length + d_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= d_f_length){
                        name = d_f_Names[num-1];
                    }else{
                        num = num - d_f_length;
                    }
                    if(name == "" && num <= d_m_length){
                        name = d_m_Names[num-1];
                    }else{
                        num = num - d_m_length;
                    }
                    if(name == "" && num <= d_n_length){
                        name = d_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 5:
                if(pref=='f'){
                    max = e_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = e_f_Names[num-1];
                }else if(pref=='m'){
                    max = e_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = e_m_Names[num-1];
                }else if(pref=='n'){
                    max = e_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = e_n_Names[num-1];
                }else{
                    int e_f_length = e_f_Names.length;
                    int e_m_length = e_m_Names.length;
                    int e_n_length = e_n_Names.length;
                    max = e_f_length + e_m_length + e_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= e_f_length){
                        name = e_f_Names[num-1];
                    }else{
                        num = num - e_f_length;
                    }
                    if(name == "" && num <= e_m_length){
                        name = e_m_Names[num-1];
                    }else{
                        num = num - e_m_length;
                    }
                    if(name == "" && num <= e_n_length){
                        name = e_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 6:
                if(pref=='f'){
                    max = f_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = f_f_Names[num-1];
                }else if(pref=='m'){
                    max = f_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = f_m_Names[num-1];
                }else if(pref=='n'){
                    max = f_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = f_n_Names[num-1];
                }else{
                    int f_f_length = f_f_Names.length;
                    int f_m_length = f_m_Names.length;
                    int f_n_length = f_n_Names.length;
                    max = f_f_length + f_m_length + f_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= f_f_length){
                        name = f_f_Names[num-1];
                    }else{
                        num = num - f_f_length;
                    }
                    if(name == "" && num <= f_m_length){
                        name = f_m_Names[num-1];
                    }else{
                        num = num - f_m_length;
                    }
                    if(name == "" && num <= f_n_length){
                        name = f_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 7:
                if(pref=='f'){
                    max = g_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = g_f_Names[num-1];
                }else if(pref=='m'){
                    max = g_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = g_m_Names[num-1];
                }else if(pref=='n'){
                    max = g_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = g_n_Names[num-1];
                }else{
                    int g_f_length = g_f_Names.length;
                    int g_m_length = g_m_Names.length;
                    int g_n_length = g_n_Names.length;
                    max = g_f_length + g_m_length + g_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= g_f_length){
                        name = g_f_Names[num-1];
                    }else{
                        num = num - g_f_length;
                    }
                    if(name == "" && num <= g_m_length){
                        name = g_m_Names[num-1];
                    }else{
                        num = num - g_m_length;
                    }
                    if(name == "" && num <= g_n_length){
                        name = g_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 8:
                if(pref=='f'){
                    max = h_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = h_f_Names[num-1];
                }else if(pref=='m'){
                    max = h_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = h_m_Names[num-1];
                }else if(pref=='n'){
                    max = h_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = h_n_Names[num-1];
                }else{
                    int h_f_length = h_f_Names.length;
                    int h_m_length = h_m_Names.length;
                    int h_n_length = h_n_Names.length;
                    max = h_f_length + h_m_length + h_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= h_f_length){
                        name = h_f_Names[num-1];
                    }else{
                        num = num - h_f_length;
                    }
                    if(name == "" && num <= h_m_length){
                        name = h_m_Names[num-1];
                    }else{
                        num = num - h_m_length;
                    }
                    if(name == "" && num <= h_n_length){
                        name = h_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 9:
                if(pref=='f'){
                    max =i_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = i_f_Names[num-1];
                }else if(pref=='m'){
                    max = i_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = i_m_Names[num-1];
                }else if(pref=='n'){
                    max = i_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = i_n_Names[num-1];
                }else{
                    int i_f_length = i_f_Names.length;
                    int i_m_length = i_m_Names.length;
                    int i_n_length = i_n_Names.length;
                    max = i_f_length + i_m_length + i_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= i_f_length){
                        name = i_f_Names[num-1];
                    }else{
                        num = num - i_f_length;
                    }
                    if(name == "" && num <= i_m_length){
                        name = i_m_Names[num-1];
                    }else{
                        num = num - i_m_length;
                    }
                    if(name == "" && num <= i_n_length){
                        name = i_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 10:
                if(pref=='f'){
                    max = j_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = j_f_Names[num-1];
                }else if(pref=='m'){
                    max = j_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = j_m_Names[num-1];
                }else if(pref=='n'){
                    max = j_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = j_n_Names[num-1];
                }else{
                    int j_f_length = j_f_Names.length;
                    int j_m_length = j_m_Names.length;
                    int j_n_length = j_n_Names.length;
                    max = j_f_length + j_m_length + j_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= j_f_length){
                        name = j_f_Names[num-1];
                    }else{
                        num = num - j_f_length;
                    }
                    if(name == "" && num <= j_m_length){
                        name = j_m_Names[num-1];
                    }else{
                        num = num - j_m_length;
                    }
                    if(name == "" && num <= j_n_length){
                        name = j_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 11:
                if(pref=='f'){
                    max = k_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = k_f_Names[num-1];
                }else if(pref=='m'){
                    max = k_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = k_m_Names[num-1];
                }else if(pref=='n'){
                    max = k_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = k_n_Names[num-1];
                }else{
                    int k_f_length = k_f_Names.length;
                    int k_m_length = k_m_Names.length;
                    int k_n_length = k_n_Names.length;
                    max = k_f_length + k_m_length + k_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= k_f_length){
                        name = k_f_Names[num-1];
                    }else{
                        num = num - k_f_length;
                    }
                    if(name == "" && num <= k_m_length){
                        name = k_m_Names[num-1];
                    }else{
                        num = num - k_m_length;
                    }
                    if(name == "" && num <= k_n_length){
                        name = k_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 12:
                if(pref=='f'){
                    max = l_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = l_f_Names[num-1];
                }else if(pref=='m'){
                    max = l_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = l_m_Names[num-1];
                }else if(pref=='n'){
                    max = l_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = l_n_Names[num-1];
                }else{
                    int l_f_length = l_f_Names.length;
                    int l_m_length = l_m_Names.length;
                    int l_n_length = l_n_Names.length;
                    max = l_f_length + l_m_length + l_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= l_f_length){
                        name = l_f_Names[num-1];
                    }else{
                        num = num - l_f_length;
                    }
                    if(name == "" && num <= l_m_length){
                        name = l_m_Names[num-1];
                    }else{
                        num = num - l_m_length;
                    }
                    if(name == "" && num <= l_n_length){
                        name = l_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 13:
                if(pref=='f'){
                    max = m_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = m_f_Names[num-1];
                }else if(pref=='m'){
                    max = m_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = m_m_Names[num-1];
                }else if(pref=='n'){
                    max = m_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = m_n_Names[num-1];
                }else{
                    int m_f_length = m_f_Names.length;
                    int m_m_length = m_m_Names.length;
                    int m_n_length = m_n_Names.length;
                    max = m_f_length + m_m_length + m_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= m_f_length){
                        name = m_f_Names[num-1];
                    }else{
                        num = num - m_f_length;
                    }
                    if(name == "" && num <= m_m_length){
                        name = m_m_Names[num-1];
                    }else{
                        num = num - m_m_length;
                    }
                    if(name == "" && num <= m_n_length){
                        name = m_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 14:
                if(pref=='f'){
                    max = n_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = n_f_Names[num-1];
                }else if(pref=='m'){
                    max = n_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = n_m_Names[num-1];
                }else if(pref=='n'){
                    max = n_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = n_n_Names[num-1];
                }else{
                    int n_f_length = n_f_Names.length;
                    int n_m_length = n_m_Names.length;
                    int n_n_length = n_n_Names.length;
                    max = n_f_length + n_m_length + n_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= n_f_length){
                        name = n_f_Names[num-1];
                    }else{
                        num = num - n_f_length;
                    }
                    if(name == "" && num <= n_m_length){
                        name = n_m_Names[num-1];
                    }else{
                        num = num - n_m_length;
                    }
                    if(name == "" && num <= n_n_length){
                        name = n_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 15:
                if(pref=='f'){
                    max = o_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = o_f_Names[num-1];
                }else if(pref=='m'){
                    max = o_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = o_m_Names[num-1];
                }else if(pref=='n'){
                    max = o_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = o_n_Names[num-1];
                }else{
                    int o_f_length = o_f_Names.length;
                    int o_m_length = o_m_Names.length;
                    int o_n_length = o_n_Names.length;
                    max = o_f_length + o_m_length + o_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= o_f_length){
                        name = o_f_Names[num-1];
                    }else{
                        num = num - o_f_length;
                    }
                    if(name == "" && num <= o_m_length){
                        name = o_m_Names[num-1];
                    }else{
                        num = num - o_m_length;
                    }
                    if(name == "" && num <= o_n_length){
                        name = o_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 16:
                if(pref=='f'){
                    max = p_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = p_f_Names[num-1];
                }else if(pref=='m'){
                    max = p_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = p_m_Names[num-1];
                }else if(pref=='n'){
                    max = p_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = p_n_Names[num-1];
                }else{
                    int p_f_length = p_f_Names.length;
                    int p_m_length = p_m_Names.length;
                    int p_n_length = p_n_Names.length;
                    max = p_f_length + p_m_length + p_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= p_f_length){
                        name = p_f_Names[num-1];
                    }else{
                        num = num - p_f_length;
                    }
                    if(name == "" && num <= p_m_length){
                        name = p_m_Names[num-1];
                    }else{
                        num = num - p_m_length;
                    }
                    if(name == "" && num <= p_n_length){
                        name = p_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 17:
                if(pref=='f'){
                    max = q_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = q_f_Names[num-1];
                }else if(pref=='m'){
                    max = q_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = q_m_Names[num-1];
                }else if(pref=='n'){
                    max = q_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = q_n_Names[num-1];
                }else{
                    int q_f_length = q_f_Names.length;
                    int q_m_length = q_m_Names.length;
                    int q_n_length = q_n_Names.length;
                    max = q_f_length + q_m_length + q_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= q_f_length){
                        name = q_f_Names[num-1];
                    }else{
                        num = num - q_f_length;
                    }
                    if(name == "" && num <= q_m_length){
                        name = q_m_Names[num-1];
                    }else{
                        num = num - q_m_length;
                    }
                    if(name == "" && num <= q_n_length){
                        name = q_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 18:
                if(pref=='f'){
                    max = r_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = r_f_Names[num-1];
                }else if(pref=='m'){
                    max = r_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = r_m_Names[num-1];
                }else if(pref=='n'){
                    max = r_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = r_n_Names[num-1];
                }else{
                    int r_f_length = r_f_Names.length;
                    int r_m_length = r_m_Names.length;
                    int r_n_length = r_n_Names.length;
                    max = r_f_length + r_m_length + r_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= r_f_length){
                        name = r_f_Names[num-1];
                    }else{
                        num = num - r_f_length;
                    }
                    if(name == "" && num <= r_m_length){
                        name = r_m_Names[num-1];
                    }else{
                        num = num - r_m_length;
                    }
                    if(name == "" && num <= r_n_length){
                        name = r_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 19:
                if(pref=='f'){
                    max = s_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = s_f_Names[num-1];
                }else if(pref=='m'){
                    max = s_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = s_m_Names[num-1];
                }else if(pref=='n'){
                    max = s_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = s_n_Names[num-1];
                }else{
                    int s_f_length = s_f_Names.length;
                    int s_m_length = s_m_Names.length;
                    int s_n_length = s_n_Names.length;
                    max = s_f_length + s_m_length + s_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= s_f_length){
                        name = s_f_Names[num-1];
                    }else{
                        num = num - s_f_length;
                    }
                    if(name == "" && num <= s_m_length){
                        name = s_m_Names[num-1];
                    }else{
                        num = num - s_m_length;
                    }
                    if(name == "" && num <= s_n_length){
                        name = s_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 20:
                if(pref=='f'){
                    max = t_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = t_f_Names[num-1];
                }else if(pref=='m'){
                    max = t_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = t_m_Names[num-1];
                }else if(pref=='n'){
                    max = t_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = t_n_Names[num-1];
                }else{
                    int t_f_length = t_f_Names.length;
                    int t_m_length = t_m_Names.length;
                    int t_n_length = t_n_Names.length;
                    max = t_f_length + t_m_length + t_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= t_f_length){
                        name = t_f_Names[num-1];
                    }else{
                        num = num - t_f_length;
                    }
                    if(name == "" && num <= t_m_length){
                        name = t_m_Names[num-1];
                    }else{
                        num = num - t_m_length;
                    }
                    if(name == "" && num <= t_n_length){
                        name = t_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 21:
                if(pref=='f'){
                    max = u_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = u_f_Names[num-1];
                }else if(pref=='m'){
                    max = u_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = u_m_Names[num-1];
                }else if(pref=='n'){
                    max = u_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = u_n_Names[num-1];
                }else{
                    int u_f_length = u_f_Names.length;
                    int u_m_length = u_m_Names.length;
                    int u_n_length = u_n_Names.length;
                    max = u_f_length + u_m_length + u_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= u_f_length){
                        name = u_f_Names[num-1];
                    }else{
                        num = num - u_f_length;
                    }
                    if(name == "" && num <= u_m_length){
                        name = u_m_Names[num-1];
                    }else{
                        num = num - u_m_length;
                    }
                    if(name == "" && num <= u_n_length){
                        name = u_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 22:
                if(pref=='f'){
                    max = v_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = v_f_Names[num-1];
                }else if(pref=='m'){
                    max = v_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = v_m_Names[num-1];
                }else if(pref=='n'){
                    max = v_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = v_n_Names[num-1];
                }else{
                    int v_f_length = v_f_Names.length;
                    int v_m_length = v_m_Names.length;
                    int v_n_length = v_n_Names.length;
                    max = v_f_length + v_m_length + v_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= v_f_length){
                        name = v_f_Names[num-1];
                    }else{
                        num = num - v_f_length;
                    }
                    if(name == "" && num <= v_m_length){
                        name = v_m_Names[num-1];
                    }else{
                        num = num - v_m_length;
                    }
                    if(name == "" && num <= v_n_length){
                        name = v_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 23:
                if(pref=='f'){
                    max = w_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = w_f_Names[num-1];
                }else if(pref=='m'){
                    max = w_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = w_m_Names[num-1];
                }else if(pref=='n'){
                    max = w_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = w_n_Names[num-1];
                }else{
                    int w_f_length = w_f_Names.length;
                    int w_m_length = w_m_Names.length;
                    int w_n_length = w_n_Names.length;
                    max = w_f_length + w_m_length + w_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= w_f_length){
                        name = w_f_Names[num-1];
                    }else{
                        num = num - w_f_length;
                    }
                    if(name == "" && num <= w_m_length){
                        name = w_m_Names[num-1];
                    }else{
                        num = num - w_m_length;
                    }
                    if(name == "" && num <= w_n_length){
                        name = w_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 24:
                if(pref=='f'){
                    max = x_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = x_f_Names[num-1];
                }else if(pref=='m'){
                    max = x_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = x_m_Names[num-1];
                }else if(pref=='n'){
                    max = x_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = x_n_Names[num-1];
                }else{
                    int x_f_length = x_f_Names.length;
                    int x_m_length = x_m_Names.length;
                    int x_n_length = x_n_Names.length;
                    max = x_f_length + x_m_length + x_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= x_f_length){
                        name = x_f_Names[num-1];
                    }else{
                        num = num - x_f_length;
                    }
                    if(name == "" && num <= x_m_length){
                        name = x_m_Names[num-1];
                    }else{
                        num = num - x_m_length;
                    }
                    if(name == "" && num <= x_n_length){
                        name = x_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 25:
                if(pref=='f'){
                    max = y_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = y_f_Names[num-1];
                }else if(pref=='m'){
                    max = y_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = y_m_Names[num-1];
                }else if(pref=='n'){
                    max = y_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = y_n_Names[num-1];
                }else{
                    int y_f_length = y_f_Names.length;
                    int y_m_length = y_m_Names.length;
                    int y_n_length = y_n_Names.length;
                    max = y_f_length + y_m_length + y_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= y_f_length){
                        name = y_f_Names[num-1];
                    }else{
                        num = num - y_f_length;
                    }
                    if(name == "" && num <= y_m_length){
                        name = y_m_Names[num-1];
                    }else{
                        num = num - y_m_length;
                    }
                    if(name == "" && num <= y_n_length){
                        name = y_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
                break;
            case 26:
                if(pref=='f'){
                    max = z_f_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = z_f_Names[num-1];
                }else if(pref=='m'){
                    max = z_m_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = z_m_Names[num-1];
                }else if(pref=='n'){
                    max = z_n_Names.length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    name = z_n_Names[num-1];
                }else{
                    int z_f_length = z_f_Names.length;
                    int z_m_length = z_m_Names.length;
                    int z_n_length = z_n_Names.length;
                    max = z_f_length + z_m_length + z_n_length;
                    num = (int)Math.floor(Math.random()*(max-min+1)+min);
                    if(num <= z_f_length){
                        name = z_f_Names[num-1];
                    }else{
                        num = num - z_f_length;
                    }
                    if(name == "" && num <= z_m_length){
                        name = z_m_Names[num-1];
                    }else{
                        num = num - z_m_length;
                    }
                    if(name == "" && num <= z_n_length){
                        name = z_n_Names[num-1];
                    }else{
                        name = "Congrats, you broke the generator!";
                    }
                }
        }

        return name;
    }

}
