package MCalculadora;

/**
* MCalculadora/ICalculadoraHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculadora.idl
* miércoles 1 de marzo de 2023 23H05' CET
*/

public final class ICalculadoraHolder implements org.omg.CORBA.portable.Streamable
{
  public MCalculadora.ICalculadora value = null;

  public ICalculadoraHolder ()
  {
  }

  public ICalculadoraHolder (MCalculadora.ICalculadora initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MCalculadora.ICalculadoraHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MCalculadora.ICalculadoraHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MCalculadora.ICalculadoraHelper.type ();
  }

}
