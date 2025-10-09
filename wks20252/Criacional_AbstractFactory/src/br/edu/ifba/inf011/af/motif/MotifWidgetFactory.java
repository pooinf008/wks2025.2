package br.edu.ifba.inf011.af.motif;

import br.edu.ifba.inf011.af.Icon;
import br.edu.ifba.inf011.af.ScrollBar;
import br.edu.ifba.inf011.af.WidgetFactory;
import br.edu.ifba.inf011.af.Window;

public class MotifWidgetFactory implements WidgetFactory{

	@Override
	public Window createWindow() {
		return new MotifWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	@Override
	public Icon createIcon() {
		return new MotifIcon();
	}

}
