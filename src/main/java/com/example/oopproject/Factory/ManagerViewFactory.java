package com.example.oopproject.UserPackage;

import com.example.oopproject.ManagerService.Model.Manager;
import com.example.oopproject.ManagerService.controller.ManagerController;
import com.example.oopproject.ManagerService.view.ManagerViewEn;
import com.example.oopproject.ManagerService.view.ManagerViewKz;
import com.example.oopproject.ManagerService.view.ManagerViewRu;

/**
 * Factory class to create ManagerView based on language options.
 */
public class ManagerViewFactory {

    /**
     * Returns a ManagerView based on the provided option.
     * @param option The option to select the ManagerView language.
     * @param manager The Manager instance.
     * @param managerController The ManagerController instance.
     * @return The appropriate ManagerView based on the option provided.
     */
    public ManagerViewEn getView(int option, Manager manager, ManagerController managerController){
        if(option == 1){
            return new ManagerViewEn(manager, managerController);
        }
        else if(option == 2){
            return new ManagerViewKz(manager, managerController);
        }
        else{
            return new ManagerViewRu(manager, managerController);
        }
    }
}
