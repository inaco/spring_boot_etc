package sample.gradle.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {

	@Around("execution(* sample.gradle.service.ISampleService.start(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("準備中");
		Object obj = point.proceed();
		System.out.println("終了中");
		System.out.println();
		return obj;
	}
}