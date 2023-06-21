package in.thilakraj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Problem Description
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 * <p>
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * -10^9 <= A[i] <= 10^9
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is the integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return whether the given array contains a subarray with a sum equal to 0.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 3, 4, 5]
 * Input 2:
 * <p>
 * A = [4, -1, 1]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 0
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * No subarray has sum 0.
 * Explanation 2:
 * <p>
 * The subarray [-1, 1] has sum 0.
 */
public class SubArrayWithSumZero {

    public static void main(String[] args) {
        System.out.println("Ans " + solve(Arrays.asList(159237257, -376099325, 336412686, -985532362, 769208029, -128730916, 234742090, 92476385, -576851838, 7917172, -217000180, -34594424, 461790622, 674913060, -169129780, -434846300, 30259557, 555874682, -692997479, 42615765, 520298095, 788688023, -677013487, -262358775, 383675600, -429192119, -825216645, -132858465, -186826805, -138721756, -897731541, 581553925, 94187821, -720124519, 380433305, -106614475, -950865845, -686457850, -658814936, -352424395, 928465707, 762546465, 262571824, -818068746, 346276321, -6433862, 712652959, 616905752, 415084314, 14162585, -101875178, -182493988, -896458401, -357123812, -156798516, -13870538, -977548640, -878560835, 812142536, 573648171, 338618426, -599631356, 289208995, 737072275, 322696017, -973533010, -957280036, -74359296, 156335295, -929476275, 325273124, 343203426, 55582354, 855777535, -899917718, -986725805, -488390244, -617536672, -666222970, 964149046, 506509594, -708965568, 858897961, -344998812, -68984624, -33583667, -915285231, 179878304, -887338254, -42086926, 922881600, -984955341, -642970181, 274153630, 694837653, -883875060, 711369201, -690268506, 500749697, -974976643, 779025490, -830044807, 555184667, -687393295, -655255199, -17605486, 332591226, -838344204, 815066520, -581328106, -983941048, 185605028, 34656636, -902786041, -294284248, -317893732, -91426528, -202555074, 118513206, -563532339, -557899525, -511832510, -900958314, 918534775, 303918659, 57644413, -838593659, -742403528, 825033972, 330157906, 495086954, 733413474, 465014929, 463590571, -606906038, -312516544, -791264656, 144836754, -101375134, 737172357, -899040030, 134619515, -383185032, 966356526, -817251176, -339447020, -898932697, 369736543, 462798751, 917056373, 998837246, -756001060, 238479896, 502990961, 229638164, 447517641, -924533353, 12657824, -131575566, 491303202, -938498071, 193058528, -879600637, 277421640, 568975665, -909912607, -201313582, -32876469, 692637654, 428589648, 54191502, 939435956, -227093417, 105984995, 757376363, -908011632, 971877354, 126421915, 894552541, -160641968, -261731089, 562193791, -383303687, 80235644, -820803540, -798586717, 166676234, 133228418, -149208353, -574292851, 811174175, -817866396, 286335193, -441040479, 116473211, -874970401, -300292606, -562102813, 432674475, -112450620, 733602433, 277575176, 288797090, 239214926, -133908042, 39588680, -448394621, -57271968, 145766666, 458100334, 663898042, -330371651, -705178138, -361460246, -946615353, 531744165, -98903643, -283903742, -108833604, -693621197, -585786817, 445892544, 779226596, 474189243, -32388006, 793991661, 659229149, 42230854, -332597162, -391844013, 260313034, 790656485, -79387218, -730457532, 741460776, 60074578, -380463962, 861283272, 834410689, -512413747, 555540287, -162832207, 755972428, -796962974, -695178398, -566593399, -566003177, 913034309, -989758785, -861275856, 179140362, -971202185, -22481800, -577208087, 834956848, 534925265, 810692453, -379719181, -348262254, 649671297, -69086577, -622424763, -345084776, 493354035, 754250180, -608541486, 116730604, 960017772, 548358980, 303844347, -109737126, -221502318, -955513727, -436105788, -172197843, 352546461, 250423524, 828627376, 280943308, -614300136, -408326338, -954605726, 767666475, -474927654, 502226496, 744351229, 292060103, -700709088, -107015934, -733661291, 515235193, -520710089, 545015084, 661332147, 1367931, 656705625, 406459889, -185101197, 100699118, -686874409, 16046863, -5138961, -318289543, 944461452, -167177023, 457630764, 887587049, 908232346, -879159664, 13446238, -632533644, 577559350, -780817086, -477992147, 20865284, 114187748, 521856575, -825224582, -805933102, -286129609, 298707408, -882546472, 480138946, 530959190, -392326334, 475960487, -200352574, 655069883, -19683470, 171437861, 277018910, 491197850, 306716924, -955373282, 577895155, -314318186, -597535459, 757200288, -164283976, 343924326, 109607507, 697409127, 71155256, 701796509, 465070600, -310339528, -904074606, -358831452, 464191134, 692418757, -707140976, -518976753, -746338281, -133919551, 377063155, 329126142, -792689402, 402241167, -731664876, -54759122, 269789987, 328039916, -457081588, 545393838, 197383663, 134029397, 583067567, 267708853, -118213272, 521287959, 505782569, 123846631, -188151073, 823254568, -772537733, -823898901, -90083940, 730032709, 609118967, -591281034, 473542658, -172324167, -472815028, -696974867, 759990508, -837767633, 927834591, -520547514, -129931280, 548092813, -551867010, 935589071, 19510632, 662449628, 25217345, 387872958, -969775903, 102442596, 65103010, 15579009, 930392258, 528832047, 205600451, 509258800, 921542606, -220195949, -516781881, 741809380, -347657695, -589219255, -198182777, 608863610, -266980843, -499128194, 1175690, -373791563, 730947212, -236129560, -463491978, 725455469, -492922415, 11462503, -194620695, 355201697, 684535398, 838582462, -503657539, 473435193, -715156417, -964384114, 984016892, -692044318, 123876715, -320585703, -241780595, -134903939, 428786177, 114852773, 150147577, 83044788, -681218604, 110927142, 206506322, 254588126, 286789785, -639846853, 462860047, -114897148, 625660876, 187294787, -419618100, -494851334, 861719396, -156783786, 335564360, -876976466, -309887042, -918084439, 290343219, -18838123, -349458620, -146434583, 620480504, 71270054, -161406047, 893650829, 42940635, 466610167, 317062694, -251939769, 558385194, 945858476, 573240201, -653748662, -187197154, -388520294, -637649686, 619378419, -717319464, 246576025, -416098324, -142464931, 201014187, -992317748, -543105685, 510029692, 166845882, 716997444, 191449724, -45121718, 718907123, 496056353, 598576281, 398464702, -195663473, 773861396, 636421843, -486417475, -963667493, 806010110, 760506033, 683840981, -90009077, -242629878, 127065973, 794680180, -266530692, -870632102, 192788923, -603991269, 932009002, -146025831, -939153417, 758741184, 595237582, -270016099, 42286422, -142721211, 663564797, 43204970, -666524782, 632242810, 987375738, 190684458, 454432221, 22535113, -356885187, -79882003, -850472101, 203065833, -646753845, 399102407, -178833331, 224254978, -367534446, -255091522, -751288030, 821678792, -629569929, -126034931, -660948255, 548998453, -38337855, -428737305, -38155006, -415426267, 806175517, -466600717, -458370965, -428069674, -970239149, 805007085, -989392151, -323485227, -389239978, 506815206, -29916077, 675936585, 750547813, 44617555, 465134807, 348163255, 287831165, -908068046, -353722658, 681898502, 232266611, -444848216, -226496888, 505641031, 80786686, -541492976, 512208463, 16685734, -519582857, -772833159, 277184377, 388594795, -985742398, 200332713, 499970596, 145432623, 412688155, -627815266, -873479522, 313323841, 329756082, -662938510, -603737419, 494658302, 975086309, 206268020, -989713764, -42465900, 354551071, 867422681, -834481458, -407205459, 648323799, 373268801, 613401613, 163280105, -657166350, 475393748, 895718135, -345316735, 133527294, -640687620, -783144140, -265341536, -671764746, 490887837, -969059907, 336606158, 506330933, -849920577, -646094001, 206814505, -473239215, 706520510, 54721311, -111590936, -371584866, 982448064, -63387850, 62824969, 329199114, 152018056, -711715841, 429283667, 105554654, -457940993, 766772471, 375019306, -577925913, -572169990, -32305486, 573768792, -418762263, -541634006, -154680139, 347301611, 76197448, -300491821, -735987187, -865465936, 654918992, -551266103, -605756959, -264963491, 141887300, 954414671, 410500967, 128508170, 213968533, -36852329, -994905185, -380939424, 789913820, 622321827, 600947228, -187085617, 468380245, 681093615, 828149331, -489617470, 537235257, 161465921, 823171828, 977775784, 477300968, 712176203, 216271721, -737865711, 596586125, -288382246, 291775875, 221452982, -543556539, 852032857, -262438407, 765335529, 88980839, -584268006, 644195669, 435775997, -344553936, -254890990, 970834119, 905034037, 158194553, 511738505, -435874589, -772666021, -905759294, 305855900, 997999953, -246615037, 526284183, -203962429, -3629506, 501484156, 947492389, -750086185, -992592682, 476230598, 529212048, -439738224, -382806077, 935643501, 866172457, -913156643, 922208540, -70256084, -828365701, -397133259, -275781575, -431575425, 25328103, 425966651, 467813357, -576302055, -760082735, 417114089, -790053273, -768820988, 187110912, 946881844, -407508204, -372076295, -987556581, -842992280, -217037435, -951489316, -431873801, -113787421, -344811221, 98519069, -393729834, 482747198, -899125253, -265679203, 800166499, -607844368, -705386607, 400371179, 499203698, 887260304, 979066795, -90051897, 773391432, 598388689, -606335192, 302554593, 266349978, -394623251, 339315172, 170966005, 651016104, 768901078, 53257739, -976831651, 70206488, -292793742, -937662457, 129199764, 844570726, 365309850, 989609983, 173523, -56644392, -522716506, -591665159, 156525359, 238794405, -611776377, -730946125, 164794627, 402824005, 681041458, 169588522, 57013818, -544775069, 844216892, 794435327, -805953156, 435168625, 820177202, -780823843, -606017890, 443547455, -310022907, 457161765, 718951629, -608646376, 978471131, 619867753, 698514023, -810235768, 105187133, 368962141, -34996533, 830478934, -640377025, 957265150, -713986425, 830248696, 445705639, 87421479, 801450137, 851424623, -881332781, 61247093, -92647495, 960745163, -271392345, -750647922, -324051326, -48527563, -411470262, -220217549, 961175472, -570622213, 648138, -473935594, 411160059, -49032620, 503288640, 969174259, -506074966, -597269433, -558289192, -685400264, 339844995, 23081904, -680298232, -635203443, 714148298, 994061407, -445195011, -921012780, 755022564, 367745143, 238563461, -503612576, 247648999, -757287993, 294172524, -244412000, -848244274, 568799687, 27452437, 311959602, -139953645, 733777113, -516932320, -863411564, -762875362, 173448269, 246434247, 674392253, -126696348, -352905401, -627227291, -354294333, -815048947, -466946734, -21719740, -605234378, 2789477, 524619457, -305589457, -579832816, -888163500, -555649128, -335234605, 966501455, 841433000, -454755704, -944881313, -886972419, -748923866, 630143312, -849391999, 664371499, 717537159, 596128390, -969854799, -670115368, 801011209, 598530293, -463386797, -827563190, -847188972, 929597967, -197569314, 114057322, -75617558, -80255949, 943583622, -595019895, 647184917, -305319412, 701237496, 394288109, -124753115, 459648518, 788558420, 684493761, -983030320, -867664533, -508610100, -190967599, 730020923, 608966447, -325055633, -59213826, -987076411, 723442938, 764686679, -178602758, 699211426, -952703346, 498101131, 95268473, 444788937, -921385227, 285049317, -461208082, -503601839, -919016510, 867942709, 294484661, 538860744, 858888723, 638967729, 151353100, 741029647, 93901693, -549881538, -843052743, 755150070, 516369147, 42806784, 403206737, 871594773, -849781673, -672664621, 697341380, 790704933, -856123732, 658535298, 10629583, 545733118, 288195461, -17615446, -907841138, 995650514, -777332921, -730559425, 441172259, -996153789, -455905451, 4434)));
    }

    public static int solve(List<Integer> A) {
        HashSet<Long> prefixSum = new HashSet<>();
        long sum = A.get(0);
        prefixSum.add(sum);
        if (A.get(0) == 0) {
            return 1;
        }
        for (int i = 1; i < A.size(); i++) {
            sum += A.get(i);
            if (A.get(i) == 0 || prefixSum.contains(sum) || sum == 0) {
                return 1;
            }
            prefixSum.add(sum);
        }
        return 0;
    }
}
