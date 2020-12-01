package prometheus;
import java.io.*;
import prometheus.binary.BinaryPrometheusMetricsProcessor;
import prometheus.text.TextPrometheusMetricsProcessor;
import prometheus.types.MetricFamily;
import prometheus.walkers.CollectorPrometheusMetricsWalker;
import prometheus.walkers.PrometheusMetricsWalker;

public class PrometheusScraper {
 private static final Logger log = Logger.getLogger(PrometheusScraper.class);
    protected class OpenConnectionDetails {
        public final InputStream inputStream;
        public final String contentType;
        public OpenConnectionDetails(InputStream is, String contentType) {
            this.inputStream = is;
            this.contentType = contentType;
        }
    }
 public PrometheusScraper(String name, String ip, String metrics) { 
"name": "Switch at PACS Lab", 
"ip": "10.1.2.12", 
"metrics": ["dropped_packets", "tx_packets", "rx_packets", "uptime" ] 
}, 
{ 
"name": "Switch at Bluvision Lab", 
"ip": "10.1.2.15", 
"metrics": ["dropped_packets", "tx_packets", "rx_packets", "uptime" ] 
}

class FileWrite 
{
   public static void main(String args[])
  {
      try{
    FileWriter fstream = new FileWriter(System.currentTimeMillis() + "prometheus.txt");
        BufferedWriter out = new BufferedWriter(fstream);
    out.write("Metrices");
    out.close();
    }
catch (Exception e)
{	
      System.err.println("Error: " + e.getMessage());
    }
  }
}

public static void purgedata(int days, String dir) {

File directory = new File(dir);
if(directory.exists()){

    File[] listFiles = directory.listFiles();           
    long purgeTime = System.currentTimeMillis() - (days * 24 * 60 * 60 * 1000);
    for(File listFile : listFiles) {
        if(listFile.lastModified() < purgeTime) {
            if(!listFile.delete()) {
                System.err.println("Unable to delete file: " + listFile);
            }
         }
      }
   }
}

public void onStartup(ServletContext servletContext) {

    if (jHipsterProperties.getMetrics().getPrometheus().isEnabled()) {
        String endpoint = jHipsterProperties.getMetrics().getPrometheus().getEndpoint();

        log.debug("Initializing prometheus metrics exporting via {}", endpoint);

        CollectorRegistry.defaultRegistry.register(new DropwizardExports(metricRegistry));
        servletContext
            .addServlet("prometheusMetrics", new MetricsServlet(CollectorRegistry.defaultRegistry))
            .addMapping(endpoint);
    }
}

class JSONPrometheus implements PrometheusMetrics{
    public void metrics( int metricsProcessed) {
        if (metricsProcessed > 0) {
[
{
"name": "Switch at PACS Lab",
"ip": "10.1.2.12",
"metrics": ["dropped_packets", "tx_packets", "rx_packets", "uptime" ]
},
{
"name": "Switch at Bluvision Lab",
"ip": "10.1.2.15",
"metrics": ["dropped_packets", "tx_packets", "rx_packets", "uptime" ]
}
]
    System.out.println("metricsProcessed ");
   }
}
