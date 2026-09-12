    int xorr=0;
    for(const int &num:nums){
        xorr^=num;
    }
    return !xorr;
}