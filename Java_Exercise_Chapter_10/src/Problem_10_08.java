public class Problem_10_8 {

    public static void main(String[] args) {
        int[][] brackets = new int[][] {
                // stat 0 single
                {8350,33950, 82250, 171550, 372950},
                // stat 1 Married Filing Jointly
                {16700, 67900, 137050, 208850, 372950},
                // stat 2 Married Filing Separately
                {8350, 33950, 68525, 104425, 186475},
                // stat 3 Head of Household
                {11950, 45500, 117450, 190200, 372950}};

        double[] rates = new double[] { 0.10, 0.15,0.25,0.28,0.33,0.35 };

        String s1 = "Taxable Income";
        String s2 = "Single";
        String s3 = "Married Joint";
        String s4 = "Married Separate";
        String s5 = "Head of house";

        System.out.printf("%-20s%-12s%-4s%21s%16s\n", s1, s2, s3, s4, s5);
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%4d%19.0f%16.0f%16.0f%20.0f\n", i,
                    new Tax(Tax.SINGLE_FILER,brackets,rates,i).getTax(),
                    new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW,brackets,rates,i).getTax(),
                    new Tax(Tax.MARRIED_SEPARATELY,brackets,rates,i).getTax(),
                    new Tax(Tax.HEAD_OF_HOUSEHOLD,brackets,rates,i).getTax()
            );



    }
    }

    private static class Tax{

        public static final int SINGLE_FILER = 0;
        public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW= 1;
        public static final int MARRIED_SEPARATELY = 2;
        public static final int HEAD_OF_HOUSEHOLD = 3;

        private int filingStatus;
        private int[][] brackets;
        private double[] rates;
        private double taxableIncome;

        public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
            this.filingStatus = filingStatus;
            this.brackets = brackets;
            this.rates = rates;
            this.taxableIncome = taxableIncome;

        }

        public int getFilingStatus() {
            return filingStatus;
        }

        public void setFilingStatus(int filingStatus) {
            this.filingStatus = filingStatus;
        }

        public int[][] getBrackets() {
            return brackets;
        }

        public void setBrackets(int[][] brackets) {
            this.brackets = brackets;
        }

        public double[] getRates() {
            return rates;
        }

        public void setRates(double[] rates) {
            this.rates = rates;
        }

        public double getTaxableIncome() {
            return taxableIncome;
        }

        public void setTaxableIncome(double taxableIncome) {
            this.taxableIncome = taxableIncome;
        }

        public double getTax() {
            double tax;
            if (taxableIncome <= brackets[filingStatus][0]) return Math.round(taxableIncome * rates[0]);

            tax = brackets[filingStatus][0] * rates[0];

            for (int i = 1; i < brackets[filingStatus].length; i++) {

                if (taxableIncome > brackets[filingStatus][i]) {
                    tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];

                } else {
                    return Math.round(tax + (taxableIncome - brackets[filingStatus][i - 1]) * rates[i]);
                }
            }
            return Math.round(tax + (taxableIncome - brackets[filingStatus][4]) * rates[5]);
        }

    }


}
