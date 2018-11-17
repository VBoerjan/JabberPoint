package controller;

import view.SlideViewer;

public class CommandPreviousSlide implements Command {
	
	SlideViewer slideViewer;

	public CommandPreviousSlide(SlideViewer slideViewer){
		this.slideViewer = slideViewer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		slideViewer.prevSlide();
	}

}