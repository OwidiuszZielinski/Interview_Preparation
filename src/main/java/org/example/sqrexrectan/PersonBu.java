package org.example.sqrexrectan;

public class PersonBu {

    private String name;
    private String surname;
    private String address;

    public PersonBu(builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
    }

    public static class builder {
        private String name;
        private String surname;
        private String address;

        public builder name(String name){
            this.name = name;
            return this;
        }
        public builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public builder address(String address){
            this.address = address;
            return this;
        }

        public PersonBu build (){
            return new PersonBu(this);
        }


    }

}
