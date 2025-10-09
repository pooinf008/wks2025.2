package br.edu.ifba.inf011.af.pm;

import br.edu.ifba.inf011.af.Icon;
import br.edu.ifba.inf011.af.ScrollBar;
import br.edu.ifba.inf011.af.WidgetFactory;
import br.edu.ifba.inf011.af.Window;

public class PMWidgetFactory implements WidgetFactory{

	@Override
	public Window createWindow() {
		return new PMWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}

	@Override
	public Icon createIcon() {
		return new PMIcon();
	}

}
