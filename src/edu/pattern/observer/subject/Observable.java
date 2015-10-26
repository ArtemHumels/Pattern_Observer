package edu.pattern.observer.subject;

import edu.pattern.observer.obsorver.Obsorver;

public interface Observable
{
	public void registerObserver(Obsorver o);
	public void removeObsorver(Obsorver o);
	public void notifyObservers();
}
