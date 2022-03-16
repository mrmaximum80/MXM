package lesson14;

public enum MobileOperator {

    BEELINE("Билайн", new int[]{900, 902, 903, 904, 905, 906, 908, 909, 950, 951, 953, 960, 961,
            962, 963, 964, 965, 966, 967, 968, 969, 980, 983, 986}),
    MEGAFON("Мегафон", new int[]{902, 904, 908, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929,
            930, 931, 932, 933, 934, 936, 937, 938, 939, 950, 951, 999}),
    MTS("МТС", new int[]{901, 902, 904, 908, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919,
            950, 978, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989}),
    TELE2("Теле2", new int[]{900, 901, 902, 904, 908, 950, 951, 952, 953, 958, 969, 977, 991, 992,
            993, 994, 995, 996, 999});

    private String operator;
    private int[] codes;


    MobileOperator(String operator, int[] codes) {
        this.operator = operator;
        this.codes = codes;
    }

    public String getOperator() {
        return operator;
    }

    public int[] getCodes() {
        return codes;
    }

}
