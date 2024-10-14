package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the my-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("my-view")
@JsModule("./views/my-view.ts")
public class MyView extends LitTemplate {

    @Id("nameTextField")
    protected TextField nameTextField;
    @Id("printButton")
    protected Button printButton;
    @Id("vaadinVerticalLayout")
    protected Element vaadinVerticalLayout;

    /**
     * Creates a new MyView.
     */
    public MyView() {
        // You can initialise any data required for the connected UI components here.
    }

}
