package controller;

public class ThreadMatriz extends Thread{

	private int vet[];

	public ThreadMatriz (int [] vet) 
	{
		this.vet = vet;
	}
	
	public void run()
	{
		carrega();
	}

	private void carrega() 
	{
		int soma = 0;
		
		for (int i = 0; i < 5; i++)
		{
			soma = soma + vet[i];
		}
		
		System.out.println("TID #" + getId() + " = " + soma);
	}
}