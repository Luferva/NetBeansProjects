/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetrabalhoso;

/**
 *
 * @author Lenovo
 */
public class ThreadController {
    protected boolean canExecute = false;

    public synchronized boolean isCanExecute() { //synchronized: reprensenta que esse bloco esta bloqueada para acesso de outras threads
        return canExecute;
    }

    public synchronized void setCanExecute(boolean canExecute) {
        this.canExecute = canExecute;
    }
}
