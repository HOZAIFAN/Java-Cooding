public class Report {

    private String report_id;
    private String report_type;
    private String data;

    public Report(String report_id, String report_type, String data) {
        this.report_id = report_id;
        this.report_type = report_type;
        this.data = data;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public String getReport_id() {
        return report_id;
    }

    public void setReport_type(String report_type) {
        this.report_type = report_type;
    }

    public String getReport_type() {
        return report_type;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void generateReport() {
        System.out.println("Generating " + report_type + " report with ID: " + report_id);
    }
}
