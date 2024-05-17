package oops.LibraryManagement;

public class LibraryMember extends Member {
    boolean membershipStatus;
    public LibraryMember(Member member, boolean membershipStatus){
        super(member);
        this.membershipStatus = membershipStatus;
    }


}
