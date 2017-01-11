public static int modpow(int base, int exp, int mod) {
    base %= mod;
    int result = 1;
    while(exp > 0) {
        if((exp & 1) != 0)
            result = mulmod(result, base, mod);
        base = mulmod(base, base, mod);
        exp >>= 1;
    }
    return result;
}

public static int mulmod(int a, int b, int mod) {
    int result = 0;
    while (a != 0) {
        if ((a & 1) != 0)
            result = (result + b) % mod;
        a >>= 1;
        b = (b << 1) % mod;
    }
    return result;
}
