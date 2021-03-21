package IRetryAnalyzerCode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer
{
	//Go to IAnnotationTransformer, hover the mouse pointer and press Control click
   public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
   {
	   //use annotation.set
	 annotation.setRetryAnalyzer(RetryFailedTCs.class);
	 //Instead of setting the Analyser for each and every class, we do it in common
	 
   }
}
