# Screenshots of Jmeter Before Optimization
![all-student-request Before.png](Images/all-student-request%20Before.png)
![all-student-name Before.png](Images/all-student-name%20Before.png)
![highestGPA Before.png](Images/highestGPA%20Before.png)
![T all-student-request before.png](Images/T%20all-student-request%20before.png)
![T all-student-name before.png](Images/T%20all-student-name%20before.png)
![T highest gpa before.png](Images/T%20highest%20gpa%20before.png)

# Screenshots of Jmeter After Optimization
![all-student-request after.png](Images/all-student-request%20after.png)
![all-student-name after.png](Images/all-student-name%20after.png)
![highest-gpa after.png](Images/highest-gpa%20after.png)
![T all-student-request after.png](Images/T%20all-student-request%20after.png)
![T all-student-name after.png](Images/T%20all-student-name%20after.png)
![T highest gpa after.png](Images/T%20highest%20gpa%20after.png)

# Conclusion
After using IntelliJ Profiler to fine-tune our code, we ran a follow-up round of performance tests with JMeter to compare against our initial measurements. The second set of tests confirmed that our efforts successfully addressed the performance bottlenecks. By offloading intensive computations, optimizing database queries, and eliminating redundant method calls, the application now performs significantly better under load.

Prior to optimization, certain methods required thousands of milliseconds to execute. After our improvements, both methods demonstrated a marked decrease in execution time—some even achieving single-digit millisecond performance. This clear difference underscores the effectiveness of the optimizations, making the application's performance substantially more efficient.

![Profiling Comparison.png](Images/Profiling%20Comparison.png)

# Reflection

## 1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?
### Overview
When optimizing application performance, two common approaches are **performance testing** and **profiling**. Each serves a distinct purpose in identifying and addressing performance issues.

### Key Differences

| Aspect               | JMeter (Performance Testing)        | IntelliJ Profiler (Profiling)       |
|----------------------|-----------------------------------|-----------------------------------|
| **Focus**           | Tests system performance under load | Analyzes code execution and resource usage |
| **Usage**           | Simulates real-world traffic and concurrent users | Identifies CPU/memory bottlenecks within the code |
| **Output**          | Response time, throughput, error rates | Method execution times, memory leaks, CPU usage |
| **Scope**           | Entire application/system | Application internals (methods, threads, objects) |
| **Best For**        | Measuring scalability and stability | Debugging performance inefficiencies |

## 2. How does the profiling process help you in identifying and understanding the weak points in your application?
Exposes code hotspots, such as methods or functions that heavily use CPU or memory. It helps pinpoint memory leaks, excessive object allocations, and thread contention issues, while revealing detailed insights into actual CPU and memory usage.

## 3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?
Yes, IntelliJ Profiler is highly effective in analyzing and identifying bottlenecks in application code by providing detailed insights into CPU usage, memory consumption, and method execution times.

## 4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?
   Challenges include accurately interpreting profiling data, such as distinguishing between CPU-bound and I/O-bound issues. To overcome this, always compare profiling sessions before and after code changes to confirm real performance improvements


## 5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?
   Delivers detailed thread analysis to aid in debugging concurrency issues, offers real-time CPU and memory metrics during application execution, and seamlessly integrates into your development workflow.


## 6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?
   Determine if the performance bottleneck originates from application code, database queries, or infrastructure. For more accurate insights, run the profiler in tandem with a simulated load (e.g., using JMeter concurrently).


## 7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?
   Refactor performance-critical methods and loops by eliminating redundant operations and implementing caching. Optimize database interactions with techniques such as lazy loading, batching, or pagination. To ensure that functionality remains intact, run a comprehensive regression test suite after making code changes and benchmark performance before and after adjustments to confirm improvements.

