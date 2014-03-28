package installator.stages.config;

import javax.swing.JPanel;

/**
 * Стадия предназначенная для выбора одного пункта из списка. Основная полезная 
 * информация при работе с пользователем: номер пункта из списка
 * @author cfif11
 */
public class ChoiceStage extends ConfigStage<Integer>{
    
    /**
     * Создание стадии единичного выбора из списка с панелью разработчика.
     * @param panel панель, созданная разработчиком. Обязательно должна быть 
     * наследником {@link StageInteracting}
     * @param name имя 
     */
    public ChoiceStage(int index, StagePanel panel, String name) {
        super(panel, index, name);
       // ((StagePanel)panel).setStage(this);
    }
    
    /**
     * Создание стадии единичного выбора из списка с панелью 
     * {@link ChoicePanel по умолчанию}.
     * @param name имя
     * @param text текст вопроса
     * @param itemsText массив строк для пунктов списка
     */
    public ChoiceStage(int index, String name, String text, String[] itemsText) {
        super(index, name);
        setPanel(new ChoicePanel(index, name, text, itemsText));
    }
}
