public class Main {
    public static void main(String[] args) {


        class Cat {
            public void run(){
                System.out.println(StringStore.runFast);
            }
        }

        class Doctor {
            public void healCats (Cat cat){
                System.out.println(StringStore.bodyWell);
                cat.run();
            }
        }
        class Lion extends Cat {
            public void run(){
                System.out.println(StringStore.lion + StringStore.runFast +
                        StringStore.withSpeed + 60 + StringStore.kmHr);
            }
        }

        class Tiger extends Cat {
            public void run(){
                System.out.println(StringStore.tiger + StringStore.runFast +
                        StringStore.withSpeed + 85 + StringStore.kmHr);
            }
        }

        class Cheetah extends Cat {
            public void run(){
                System.out.println(StringStore.cheetah + StringStore.runFast +
                        StringStore.withSpeed + 120 + StringStore.kmHr);
            }
        }


        Doctor doctor = new Doctor();
        Lion simba = new Lion();
        Tiger sherkhan = new Tiger();
        Cheetah chester = new Cheetah();

        doctor.healCats(simba);
        doctor.healCats(sherkhan);
        doctor.healCats(chester);

    }
}