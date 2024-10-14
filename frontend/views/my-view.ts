import { LitElement, html, css } from 'lit-element';
import { customElement } from 'lit-element/decorators.js';

@customElement('my-view')
export class MyView extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout">
  <vaadin-text-field label="Name" placeholder="Your Name" id="nameTextField" type="text"></vaadin-text-field>
  <vaadin-button id="printButton" theme="primary">
    Print name
  </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
