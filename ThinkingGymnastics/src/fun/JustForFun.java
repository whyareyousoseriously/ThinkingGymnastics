/**
 * ����10:48:05
 * power
 */
package fun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * ��foreachѭ���н��е�Ԫ�ص�remove/add������removeԪ��ʹ��Iterator��ʽ��
 * ��������Ҫ������
 * @author cz
 * 2018��3��14������10:48:05
 */
public class JustForFun {
	@Test
	public void userIterator() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			if("1".equals(item)) {
				iterator.remove();
			}
		}
		System.out.println(list.toString());
	}
	/**
	 * ��δ��뽫ɾ������2�󣬳����쳣java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at fun.JustForFun.noIterator(JustForFun.java:39)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at org.junit.vintage.engine.execution.RunnerExecutor.execute(RunnerExecutor.java:42)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
	at java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)
	at java.util.Iterator.forEachRemaining(Unknown Source)
	at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Unknown Source)
	at java.util.stream.AbstractPipeline.copyInto(Unknown Source)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
	at java.util.stream.AbstractPipeline.evaluate(Unknown Source)
	at java.util.stream.ReferencePipeline.forEach(Unknown Source)
	at org.junit.vintage.engine.VintageTestEngine.executeAllChildren(VintageTestEngine.java:83)
	at org.junit.vintage.engine.VintageTestEngine.execute(VintageTestEngine.java:74)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:170)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:154)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:90)
	at org.eclipse.jdt.internal.junit5.runner.JUnit5TestReference.run(JUnit5TestReference.java:82)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:539)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:761)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:461)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:207)
	
	233333333333 why?
	 * @author cz
	 * @time 2018��3��14������11:00:01
	 */
	@Test
	public void noIterator() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		for(String s:list) {
			if("2".equals(s))
				list.remove(s);
		}
		System.out.println(list.toString());
	}
}
