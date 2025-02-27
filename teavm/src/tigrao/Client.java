package tigrao;

import org.teavm.jso.dom.html.HTMLDocument;

public class Client {
    public static void main(String[] args) {
        var document = HTMLDocument.current();
        var div = document.createElement("div");
        div.appendChild(document.createTextNode("VAI SE FUDER"));
        document.getBody().appendChild(div);
    }
}
