package com.example.demo.tests.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution2 {
    public int[] solution(int endingTime, int[][] jobs) {
        int[] answer = {};
        List<Job> answerList = new ArrayList<>();
        JobQueue jobQueue = new JobQueue(endingTime);

        for (int i = 0; i < jobs.length ; i++) {
            jobQueue.push(new Job(jobs[i][0], jobs[i][1], jobs[i][2], jobs[i][3]));
        }

        for (int i = 0; i < jobs.length; i++) {
            Job job = jobQueue.pop();
            if(job != null) answerList.add(job);
        }

        answer = answerList.stream()
                .mapToInt(job -> job.id)
                .toArray();

        return answer;
    }

}

class Job {
    int id;
    int startTime;
    int workTime;
    int validTime;

    public Job(int id, int startTime, int validTime, int workTime) {
        this.id = id;
        this.startTime = startTime;
        this.validTime = validTime;
        this.workTime = workTime;
    }

    public int work() {
        return workTime;
    }
}

class JobQueue {
    private Deque<Job> jobQueue = new ArrayDeque<>();
    private int currentTime = 0;
    private int endingTime;

    public JobQueue(int endingTime) {
        this.endingTime = endingTime;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void push(Job job) {
        if(job.validTime < this.getCurrentTime())
            return;
        jobQueue.offer(job);
    }

    public Job pop() {
        Job job = jobQueue.poll();

        if(job.validTime < getCurrentTime()){
            return null;
        }

        if(currentTime < job.startTime) currentTime = job.startTime;
        job.work();
        currentTime += job.workTime;

        if(getCurrentTime() > endingTime){
            return null;
        }

        if(job.validTime >= getCurrentTime()){
            return job;
        }

        return null;
    }

    public int size() {
        return jobQueue.size();
    }
}
