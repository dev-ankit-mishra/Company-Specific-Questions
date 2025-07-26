//Problem Link-https://leetcode.com/problems/student-attendance-record-i/description/

public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'P') {
                late = 0;
            } else if (c == 'A') {
                late = 0;
                absent++;
                if (absent >= 2) {
                    return false;
                }
            } else {
                late++;
                if (late >= 3) {
                    return false;
                }
            }
        }
        return true;

    }

}
