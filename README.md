# practice_algorithm

<h2>👩‍💻목표</h2>
<h4>쉬운 문제는 Stream을 사용해서 풀어보기</h4>
<h4>어려운 문제는 구현에 집중해보기</h4>

<details>
<summary>MapToObj</summary>
  <h5>📌MapToObj( )는 원시타입 Stream => 일반적인 stream객체로 변환</h5>
  <h5>📌원시타입 stream(IntStream.range(0, N)) => 일반적인 stream Stream<String></h5>
  <a href="https://www.geeksforgeeks.org/intstream-maptoobj-java">IntStream mapToObj() in Java</a>
  <hr/>
    
```java
for(int i=0; i<N; i++) {
  for(int j=0; j<N; j++) {
    ...
  }
  sb.append(rank).append(" ");
}

=> IntStream.range(0, N)
  .mapToObj(i -> {
    for(int j=0; j<N; j++) {
      ...
    }
    return String.valueOf(rank);
  })
    .collect(Collectors.joining(" "));
```
</details>
