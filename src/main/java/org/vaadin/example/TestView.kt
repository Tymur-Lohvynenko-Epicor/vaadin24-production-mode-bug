package org.vaadin.example

import com.vaadin.flow.component.html.H1
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route("test")
class TestView : MyView() {

    init {
        printButton.addClickListener {
            val name = nameTextField.value
            Notification.show("Hello $name")
            vaadinVerticalLayout.`as`(VerticalLayout::class.java)
                .add(H1(name))
        }
    }
}
