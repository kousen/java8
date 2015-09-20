package nfjs.collections

class TaskSamples {
    static List<Task> getSampleTasks() {
        [new Task(id: 1, active: true, duration: 3,
                name: "Defeat the Black Knight"),
         new Task(id: 2, active: true, duration: 5,
                 name: "Answer the bridgekeeper"),
         new Task(id: 3, active: false, duration: 6,
                 name: "Run away from killer rabbit"),
         new Task(id: 4, active: true, duration: 4,
                 name: "Lobbeth thou thy Holy Hand Grenade"),
         new Task(id: 5, active: false, duration: 5,
                 name: "Give a shrubbery to the Knights Who Say Ni!")]
    }
}
