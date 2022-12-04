package com.hdu.search.storyFactory;

import com.hdu.search.store.FishStore;

/**
 * @author shkstart
 * @create 2022-11-29 15:55
 */
public class StoreFactory {

    public StoreFactory() {
    }

    public static FishStore getStore(int storeChoice) {
        if (storeChoice == 1) {
            return FishStore.getInstance();
        } else {
            return null;
        }
    }
}
