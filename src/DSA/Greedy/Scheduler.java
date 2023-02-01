package DSA.Greedy;

import java.util.ArrayList;

public class Scheduler {
    static Jobs[] sortJobsByStartTime(Jobs[] jobs) {
        for (int i = 0; i < jobs.length; i++) {
            for (int j = 1; j < jobs.length-i; j++) {
                Jobs temp;
                if (jobs[j].getStartTime() < jobs[j-1].getStartTime()) {
                    temp = jobs[j];
                    jobs[j] = jobs[j-1];
                    jobs[j-1] = temp;
                }
            }
        }
        return jobs;
    }

    static void populateNumberOfMachinesUsed(Jobs[] sortedJobs) {
        ArrayList<Jobs> machines = new ArrayList<>();
        Jobs currentJob = sortedJobs[0];
        machines.add(currentJob);
        System.out.println("("+currentJob.getStartTime()+","+ currentJob.getEndTime()+")"+ " added to Machine " + machines.size());

        for (int i = 0; i < sortedJobs.length-1; i++) {
            boolean addedToMachines = false;

            for (int j = 0; j< machines.size(); j++) {
                if (sortedJobs[i+1].getStartTime() > machines.get(j).getEndTime()) {
                    machines.remove(machines.get(j));
                    machines.add(sortedJobs[i+1]);
                    System.out.println("("+sortedJobs[i+1].getStartTime()+","+ sortedJobs[i+1].getEndTime()+")"+ " added to Machine " + (int)(j+1));
                    currentJob=sortedJobs[i+1];
                    addedToMachines=true;
                    break;
                }
            }



            if (!addedToMachines) {
                if (sortedJobs[i+1].getStartTime() < currentJob.getEndTime()) {
                    machines.add(sortedJobs[i+1]);
                    System.out.println("("+sortedJobs[i+1].getStartTime()+","+ sortedJobs[i+1].getEndTime()+")"+ " added to Machine " + machines.size());
                    currentJob=sortedJobs[i+1];
                }
            }

        }
        System.out.println(machines.size());
    }

    public static void main(String[] args) {
        Jobs job1 = new Jobs(1,2);
        Jobs job2 = new Jobs(1,6);
        Jobs job3 = new Jobs(2,4);
        Jobs job4 = new Jobs(3,8);
        Jobs job5 = new Jobs(7,9);
        Jobs job6 = new Jobs(5,10);
        Jobs[] jobs = {job1,job2,job3,job4,job5,job6};
        Jobs[] sortedJobs=sortJobsByStartTime(jobs);
        populateNumberOfMachinesUsed(sortedJobs);

    }
}

class Jobs {
    private int startTime;
    private int endTime;
    public Jobs(int sTime,int eTime) {
        startTime=sTime;
        endTime = eTime;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public int getEndTime() {
        return this.endTime;
    }
}
