package zaberp.zab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class uniconnectdatasyncpush extends HttpServlet {
	final String thisName = "";
	JDBCpool pool = null; 
	public static String ztime = "";
	public static String zutime = "";
	public static String zemail = "";
	public static String xpassword = "";
	public static String xaccess = "";
	public static String xdformat = "";
	public static String xdsep = "";
	public static String xlastlogdate = "";
	public static String xname = "";
	public static String zaip = "";
	public static String zuip = "";
	public static String xnamef = "";
	public static String xnamem = "";
	public static String xpadd = "";
	public static String xbirthdate = "";
	public static String xmstat = "";
	public static String xdeptname = "";
	public static String xdesignation = "";
	public static String xdatejoin = "";
	public static String xgrade = "";
	public static String xenddate = "";
	public static String xretdate = "";
	public static String xempstatus = "";
	public static String xlocation = "";
	public static String xdistrict = "";
	public static String xempcategory = "";
	public static String xsid = "";
	public static String ximage = "";
	public static String xbloodgroup = "";
	public static String xhrc1 = "";
	public static String xhrc2 = "";
	public static String xhrc3 = "";
	public static String xhrc4 = "";
	public static String xplan = "";
	public static String xemname = "";
	public static String xrelation = "";
	public static String xemcmobile = "";
	public static String xnimage = "";
	public static String xreligion = "";
	public static String xemptype = "";
	public static String xsignature = "";
	public static String xfile = "";
	public static String xempposition = "";
	public static String xsignatory = "";
	public static String xsp = "";
	public static String xrole = "";
	public static String xoldpass = "";
	public static String xposition = "";
	public static String xpriority = "";
	public static String zscreen = "";
	public static String zauserid = "";
	public static String zuuserid = "";
	public static String zid = "";
	public static String xcus = "";
	public static String xorg = "";
	public static String xmadd = "";
	public static String xemail = "";
	public static String xphone = "";
	public static String xfax = "";
	public static String xstatuscus = "";
	public static String xwh = "";
	public static String xpaymentterm = "";
	public static String xdateeff = "";
	public static String xdateexp = "";
	public static String xcontact = "";
	public static String xgsup = "";
	public static String xtype = "";
	public static String xmobile = "";
	public static String xpaymenttype = "";
	public static String xcusold = "";
	public static String zactive = "";
	public static String xcountry = "";
	public static String xprdcounter = "";
	public static String xcustype = "";
	public static String xcycle = "";
	public static String xcrperiod = "";
	public static String xbank = "";
	public static String xbranch = "";
	public static String xacc = "";
	public static String xrouting = "";
	public static String xacctype = "";
	public static String xbeneficiary = "";
	public static String xenlistedfee = "";
	public static String xstaff = "";
	public static String xidsup = "";
	public static String xsigndate7 = "";
	public static String xcardno = "";
	public static String xbin = "";
	public static String xnid = "";
	public static String xdiv = "";
	public static String xyesno = "";
	public static String xcuscomptype = "";
	public static String xeffectivity = "";
	public static String xdateopening = "";
	public static String xdate = "";
	public static String xvoucher = "";
	public static String xdocnum = "";
	public static String xstatusjv = "";
	public static String xbase = "";
	public static String xprnamt = "";
	public static String xvatamt = "";
	public static String xaitamt = "";
	public static String xnote = "";
	public static String xitem = "";
	public static String xdesc = "";
	public static String xgitem = "";
	public static String xcitem = "";
	public static String xcatitem = "";
	public static String xrate = "";
	public static String xunitpur = "";
	public static String xcost = "";
	public static String xunit = "";
	public static String xlong = "";
	public static String xtitem = "";
	public static String xstype = "";
	public static String xalias = "";
	public static String xmrp = "";
	public static String xpacking = "";
	public static String xdisc = "";
	public static String xcartoon = "";
	public static String xhscode = "";
	public static String xpackqty = "";
	public static String xbrand = "";
	public static String xcfpur = "";
	public static String xcfsel = "";
	public static String xcfiss = "";
	public static String xunitsel = "";
	public static String xunitiss = "";
	public static String xpnature = "";
	public static String xvatrate = "";
	public static String xminqty = "";
	public static String xtaxrate = "";
	public static String xtheircode = "";
	public static String xpartno = "";
	public static String xitemdept = "";
	public static String xitemsubdept = "";
	public static String xsupptaxrate = "";
	public static String xbodycode = "";
	public static String xdatecreate = "";
	public static String xautogrn = "";
	public static String xstarttime = "";
	public static String xendtime = "";
	public static String xincode = "";
	public static String xisonline = "";
	public static String xdesconline = "";
	public static String xcatonline1 = "";
	public static String xcatonline2 = "";
	public static String xcatonline3 = "";
	public static String xwidth = "";
	public static String xpercent = "";
	public static String xparentitem = "";
	public static String xoutlet = "";
	public static String xmanagexpiry = "";
	public static String xheight = "";
	public static String xdescsh = "";
	public static String xdepth = "";
	public static String xdatacheckstatus = "";
	public static String xarticle = "";
	public static String xstatus = "";
	public static String xtp = "";
	public static String xdisctype = "";
	public static String xpornum = "";
	public static String xgcus = "";
	public static String xsubscriptiontype = "";
	public static String xgrowthsalesbase = "";
	public static String xtopnproduct = "";
	public static String xdaytopproduct = "";
	public static String xday_trendchart1 = "";
	public static String xday_trendchart2 = "";
	public static String xdaybarchart3 = "";
	public static String xdatesync_cus_sup = "";
	public static String xgrnnum = "";
	public static String xexch = "";
	public static String xlineamt = "";
	public static String xdiscf = "";
	public static String xvalpo = "";
	public static String xvalgrn = "";
	public static String xvalprn = "";
	public static String xpending = "";
	public static String xtransport = "";
	public static String xqty = "";
	public static String xval = "";
	public static String xposcode = "";
	public static String xstatusord = "";
	public static String xstatusar = "";
	public static String xtotamt = "";
	public static String xait = "";
	public static String tabName = "";
	public static String xdornum = "";
	public static String xstatusgrn = "";
	public static String xref = "";
	public static String xdatecom = "";
	public static String xamount = "";
	public static String xdatedue = "";
	public static String xavlperc = "";
	public static String xdiscamt = "";
	public static String xdoctype = "";
	public static String xdatecpo = "";
	public static String xcrnnum = "";
	public static String xnetamt = "";
	public static String xpreparer = "";
	public static String xcrterms = "";
	public static String xctype = "";
	public static String xpaid = "";
	public static String xbillno = "";
	public static String xvatf = "";
	public static String xaitf = "";
	public static String xperson = "";
	public static String xpaystatus = "";
	public static String xcardtype = "";
	public static String xchgscard = "";
	public static String xchgsamt = "";
	public static String xgiftvoucher = "";
	public static String xvoucheramt = "";
	public static String xpromono = "";
	public static String xbonuspoints = "";
	public static String xearnedbonuspoints = "";
	public static String xearnedbonusamt = "";
	public static String xissuebank = "";
	public static String xpaytype = "";
	public static String xcrnamt = "";
	public static String xcashamt = "";
	public static String xcardamt = "";
	public static String xspdiscamt = "";
	public static String xstatusap = "";
	public static String xstatusprint = "";
	public static String xexpetriot = "";
	public static String xsex = "";
	public static String xterminal = "";
	public static String xbarcode = "";
	public static String xsupptaxamt = "";
	public static String xadvposvchr = "";
	public static String xroundingchange = "";
	public static String xtempearnedbonusamt = "";
	public static String xstatuslp = "";
	public static String xprinttime = "";
	public static String xchange = "";
	public static String tabname = "";
	public static String xsup = "";
	public static String xcur = "";
	public static String xinvnum = "";
	public static String xprimetotamt = "";
	public static String xbasetotamt = "";
	public static String xlcno = "";
	public static String xdategl = "";
	public static String xregi = "";
	public static String xsuperiorsp = "";
	public static String xporeqnum = "";
	public static String xtornum = "";
	public static String xnote1 = "";
	public static String xstatusimgl = "";
	public static String xstatusjvgl = "";
	public static String xstatusapgl = "";
	public static String xsignatory2 = "";
	public static String xsigndate2 = "";
	public static String xsignatory7 = "";
	public static String xsuperior2 = "";
	public static String xsuperior3 = "";
	public static String xsignreject = "";
	public static String xstatusinsp = "";
	public static String xstatusjvfa = "";
	public static String xstatusfa = "";
	public static String xstatusdoc = "";
	public static String xdaterel = "";
	public static String xrategrn = "";
	public static String xqtyinsp = "";
	public static String xqtyprn = "";
	public static String xsyncstatus = "";
	public static String xstatuscrn = "";
	public static String xordernum = "";
	public static String xstatusexch = "";
	public static String xtypeobj = "";
	public static String xsigndate1 = "";
	public static String xsignatory1 = "";
	public static String xday = "";
	public static String xstatusord2 = "";
	public static String xstatusord3 = "";
	public static String xshipdate = "";
	public static String xstatuspor = "";
	public static String xyear = "";
	public static String xper = "";
	public static String xpidate = "";
	public static String xtwh = "";
	public static String xqtygrn = "";
	public static String zorg = "";
	public static String xtpamt = "";
	public static String xprime = "";
	public static String xdiscprime = "";
	public static String xchgsprime = "";
	public static String xsign = "";
	public static String xbalprime = "";
	public static String xtypetrn = "";
	public static String xstatuschq = "";
	public static String xprimebuyer = "";
	public static String xbalprimebuyer = "";
	public static String xcurbuyer = "";
	public static String xexchbuyer = "";
	public static String xtyperec = "";
	public static String xadjustment = "";
	public static String xbalance = "";
	public static String wName = "";
	public static String sDate = "";
	public static String tDate = "";
	public static String payload = "";
	public static String xcode = "";
	public static String xaccvat = "";
	public static String xaccdisc = "";
	public static String xaccait = "";
	public static String xaccret = "";
	public static String xaccpur = "";
	public static String xaccwo = "";
	public static String xprops = "";
	public static String xarea = "";
	public static String xregion = "";
	public static String xfield = "";
	public static String xterritory = "";
	public static String xtrcode = "";
	public static String xtargetshare = "";
	public static String xaccadj = "";
	public static String xacccash = "";
	public static String xaccbank = "";
	public static String xtypestore = "";
	public static String xgtype = "";
	public static String xdepmethod = "";
	public static String xaccother = "";
	public static String xaccsradj = "";
	public static String xaccgvadj = "";
	public static String xaccbpadj = "";
	public static String xaccsupptax = "";
	public static String xaccrc = "";
	public static String xaccsrgainloss = "";
	public static String xvatregno = "";
	public static String xvatarea = "";
	public static String xdmwh = "";
	public static String xipaddress = "";
	public static String xprintername = "";
	public static String xbizunit = "";
	public static String xsignatory3 = "";
	public static String xsigndate3 = "";
	public static String xsignatory4 = "";
	public static String xsignatory5 = "";
	public static String xsignatory6 = "";
	public static String xsigndate6 = "";
	public static String xsub = "";
	public static String xtrn = "";
	public static String xoldvoucher = "";
	public static String xdatechq = "";
	public static String xchequeno = "";
	public static String xpaidto = "";
	public static String xfileref = "";
	public static String xsuperiorgl = "";
	public static String xsigndate4 = "";
	public static String xsigndate5 = "";
	public static String xdatereject = "";
	public static String xrptcount = "";
	public static String xproject = "";
	public static String xgiftitem = "";
	public static String xcrngainamt = "";
	public static String xsigndatelp7 = "";
	public static String xsumnum = "";
	public static String xtso = "";
	public static String xexpamt = "";
	public static String xpp = "";
	public static String xpreparerlp = "";
	public static String xsignatorylp1 = "";
	public static String xsigndatelp1 = "";
	public static String xsignatorylp2 = "";
	public static String xsigndatelp2 = "";
	public static String xsignatorylp3 = "";
	public static String xsigndatelp3 = "";
	public static String xsignrejectlp = "";
	public static String xdaterejectlp = "";
	public static String xsignatorylp4 = "";
	public static String xsigndatelp4 = "";
	public static String xsignatorylp5 = "";
	public static String xsigndatelp5 = "";
	public static String xsignatorylp6 = "";
	public static String xsigndatelp6 = "";
	public static String xsignatorylp7 = "";
	public static String xvehicle = "";
	public static String xdealno = "";
	public static String xstatusgl = "";
	public static String xdocrow = "";

	public static Statement stmt = null;
	public static Statement stmt_det = null;

	public static boolean isEndpointReachable(String endpointUrl, String method) {
		try {
			URL url = new URL(endpointUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(method);
			connection.setConnectTimeout(1000);
			int responseCode = connection.getResponseCode();
			return responseCode >= 200 && responseCode < 300;
		} catch (Exception var5) {
			return false;
		}
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.pool = zabInfo.GetPool(this, "");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection con = null;
		Statement stmt1 = null;
		Statement stmt1_update = null;
		Statement stmt_xstatusrecupdate = null;
		Object var7 = null;

		try {
			con = this.pool.getConnection();
			stmt = con.createStatement();
			response.setContentType("text/json");
			zid = request.getParameter("zid");
			String command = request.getParameter("command");
			String central_ip = request.getParameter("central_ip");
			String wName = request.getParameter("wName");
			sDate = request.getParameter("sDate");
			tDate = request.getParameter("tDate");
			String result = "";
			Object var12 = null;

			try {
				String endpointUrl = "http://" + central_ip + "/zab/uniconnectdatasync";
				if (command.equals("Add")) {

					if (wName.equals("Users")) {
						this.querywork_sendxusers(wName, con, endpointUrl);
					}

					if (wName.equals("Pdmst")) {
						this.querywork_sendpdmst(wName, con, endpointUrl);
					}

					if (wName.equals("Casupitem")) {
						this.querywork_sendcasupitem(wName, con, endpointUrl);
					}

					if (wName.equals("Cacus")) {
						this.querywork_sendcacus(wName, con, endpointUrl);
					}

					if (wName.equals("SupplierPayment")) {
						this.querywork_sendSupPay(wName, con, endpointUrl);
					}

					if (wName.equals("CaItem")) {
						this.querywork_sendCaItem(wName, con, endpointUrl);
					}

					if (wName.equals("CaItemTrans")) {
						this.querywork_sendCaItemTrans(wName, con, endpointUrl);
					}

					if (wName.equals("ConfigServiceTerms")) {
						this.querywork_sendConfigServiceTerms(wName, con, endpointUrl);
					}

					if (wName.equals("PoSummary")) {
						this.querywork_sendPoSummary(wName, con, endpointUrl);
					}

					if (wName.equals("OpSuppliersItemMovement")) {
						this.querywork_sendopsupitemmovement(wName, con, endpointUrl);
					}

					if (wName.equals("Opnetsupplierdaybal")) {
						this.querywork_sendopnetsupBal(wName, con, endpointUrl);
					}

					if (wName.equals("OpdoHeader")) {
						this.querywork_sendOpDo(wName, con, endpointUrl);
					}

					if (wName.equals("Pogrn")) {
						this.querywork_sendPOgrn(wName, con, endpointUrl);
					}

					if (wName.equals("Opcrn")) {
						this.querywork_sendOPcrn(wName, con, endpointUrl); 
					}

					if (wName.equals("Poordhddtterms")) {
						this.querywork_sendPO(wName, con, endpointUrl);
					}

					if (wName.equals("ArhedAralc")) {
						this.querywork_sendARALC(wName, con, endpointUrl);
					}

					if (wName.equals("Xcodes")) {
						this.querywork_sendXcodes(wName, con, endpointUrl);
					}

					if (wName.equals("Acheader")) {
						this.querywork_sendAcheader(wName, con, endpointUrl);
					}
					
					if (wName.equals("Pdsignatoryrpt")) {
						this.querywork_sendPdsignatoryrpt(wName, con, endpointUrl);
					}

				}
			} catch (SQLException var25) {
				var25.printStackTrace();
			}
		} catch (SQLException var26) {
			var26.printStackTrace();
		} catch (Exception var27) {
			var27.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException var24) {
					var24.printStackTrace();
				}
			}

			this.pool.releaseConnection(con);
		}

	}

	private void querywork_sendARALC(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";

		String selectsql = "SELECT ztime, ISNULL(zutime, '') AS zutime, zid, zauserid, ISNULL(zuuserid, '') AS zuuserid, "
				+ "xvoucher, xcus, xcur, xdate, ISNULL(xbank, '') AS xbank, ISNULL(xref, '') AS xref, xexch, "
				+ "xprime, xbase, ISNULL(xdiscprime, 0.00) AS xdiscprime, xchgsprime, ISNULL(xnote, '') AS xnote, "
				+ "xstatusjv, xsign, xbalprime, ISNULL(xdocnum, '') AS xdocnum, ISNULL(xvatamt, 0.00) AS xvatamt, "
				+ "ISNULL(xaitamt, 0.00) AS xaitamt, ISNULL(xordernum, '') AS xordernum, ISNULL(xdatedue, '') AS xdatedue, "
				+ "xwh, ISNULL(xpaymentterm, '') AS xpaymentterm, ISNULL(xtype, '') AS xtype, ISNULL(xlcno, '') AS xlcno, "
				+ "xtypetrn, ISNULL(xpornum, '') AS xpornum, ISNULL(xgrnnum, '') AS xgrnnum, ISNULL(xstatuschq, '') AS xstatuschq, "
				+ "ISNULL(xprimebuyer, 0.00) AS xprimebuyer, ISNULL(xbalprimebuyer, 0.00) AS xbalprimebuyer, "
				+ "ISNULL(xcurbuyer, '') AS xcurbuyer, ISNULL(xexchbuyer, 0.00) AS xexchbuyer, ISNULL(xtyperec, '') AS xtyperec, "
				+ "ISNULL(xval, 0.00) AS xval, ISNULL(xsyncstatus, 0) AS xsyncstatus, ISNULL(xadjustment, 0.00) AS xadjustment "
				+ "FROM arhedtemp WITH (NOLOCK) " + "WHERE zid = " + zid + " " + "AND (CAST(ztime AS DATE) BETWEEN CAST('"
				+ sDate + "' AS DATE) AND CAST('" + tDate + "' AS DATE) " + "OR CAST(zutime AS DATE) BETWEEN CAST('"
				+ sDate + "' AS DATE) AND CAST('" + tDate + "' AS DATE))";

		//System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendarhed(rs, endpointUrl, "ARHED");

		selectsql = "select ztime, isnull(zutime,'') as zutime, zid, zauserid, isnull(zuuserid,'') as zuuserid, "
				+ "xvoucher, isnull(xinvnum,'') as xinvnum, xdate, "
				+ "xdatedue, xbalance, xamount, isnull(xpornum,'') as xpornum, "
				+ "isnull(xgrnnum,'') as xgrnnum, isnull(xvatamt, 0.00) as xvatamt " + "from aralctemp with(nolock) "
				+ "where zid = " + zid + " " + "and (cast(ztime as date) between cast('" + sDate
				+ "' as date) and cast('" + tDate + "' as date) " + "or cast(zutime as date) between cast('" + sDate
				+ "' as date) and cast('" + tDate + "' as date))";

		//System.out.println(selectsql);

		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_arlc(rs, endpointUrl, "ARLC");
	}

	private void querywork_sendPO(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "WITH t_header AS (\r\n"
				+ "   SELECT 'Header' AS tabName, ztime, ISNULL(zutime, '') AS zutime,\r\n"
				+ "          zauserid, ISNULL(zuuserid, '') AS zuuserid, zid, xpornum,\r\n"
				+ "          ISNULL(xshipdate, '') AS xshipdate, ISNULL(xpaymentterm, '') AS xpaymentterm,\r\n"
				+ "          ISNULL(xexch, 1.000000) AS xexch, ISNULL(xtype, '') AS xtype, ISNULL(xporeqnum, '') AS xporeqnum,\r\n"
				+ "          xstatuspor, xwh, xdate, xtypeobj, xyear, xper, xdisc, xdiscf, xvatrate, xvatamt, xait, xpidate,\r\n"
				+ "          xcus, xstatus, xtwh, xtornum, xpreparer, ISNULL(xsignatory1, '') AS xsignatory1,\r\n"
				+ "          ISNULL(xsigndate1, '') AS xsigndate1, xidsup, xsuperior2, xsuperior3, xdiv,\r\n"
				+ "          0.00 AS xrate, 0.00 AS xlineamt, 0.00 AS xqtygrn, 0.000000 AS xcfpur, 0.00 AS xbase, 0.00 AS xqtyprn,\r\n"
				+ "          ISNULL(xsyncstatus, 0) AS xsyncstatus\r\n" + "   FROM poordheadertemp WITH (NOLOCK)\r\n"
				+ "   WHERE CAST(xdate AS DATE) BETWEEN CAST('" + sDate + "' AS DATE) AND CAST('" + tDate
				+ "' AS DATE)\r\n" + "),\r\n" + "t_detaile AS (\r\n"
				+ "   SELECT 'Details' AS tabName, a.ztime, ISNULL(a.zutime, '') AS zutime, a.zauserid,\r\n"
				+ "          ISNULL(a.zuuserid, '') AS zuuserid, a.zid, a.xpornum, '' AS xshipdate,\r\n"
				+ "          a.xitem AS xpaymentterm, a.xqtypur AS xexch, a.xnote AS xtype, a.xunitpur AS xporeqnum,\r\n"
				+ "          a.xrow AS xstatuspor, '' AS xwh, '' AS xdate, a.xspecification AS xtypeobj, a.xqtyord AS xyear,\r\n"
				+ "          a.xdocrow AS xper, a.xdisc, a.xdiscf, a.xvatrate, a.xvatamt, a.xrategrn AS xait, '' AS xpidate,\r\n"
				+ "          '' AS xcus, a.xqtybonus AS xstatus, '' AS xtwh, '' AS xtornum, '' AS xpreparer, '' AS xsignatory1,\r\n"
				+ "          '' AS xsigndate1, '' AS xidsup, '' AS xsuperior2, '' AS xsuperior3, '' AS xdiv, a.xrate, a.xlineamt,\r\n"
				+ "          a.xqtygrn, a.xcfpur, a.xbase, a.xqtyprn, 0 AS xsyncstatus\r\n"
				+ "   FROM poorddetailtemp a WITH (NOLOCK)\r\n"
				+ "   JOIN t_header b ON a.zid = b.zid AND a.xpornum = b.xpornum\r\n" + "),\r\n" + "t_terms AS (\r\n"
				+ "   SELECT 'Terms' AS tabName, a.ztime, ISNULL(a.zutime, '') AS zutime, a.zauserid,\r\n"
				+ "          ISNULL(a.zuuserid, '') AS zuuserid, a.zid, a.xpornum, '' AS xshipdate,\r\n"
				+ "          '' AS xpaymentterm, 0.00 AS xexch, a.xnote AS xtype, '' AS xporeqnum, a.xrow AS xstatuspor,\r\n"
				+ "          '' AS xwh, '' AS xdate, '' AS xtypeobj, 0 AS xyear, a.xcode AS xper, 0.00 AS xdisc, 0.00 AS xdiscf,\r\n"
				+ "          0.00 AS xvatrate, 0.00 AS xvatamt, 0.00 AS xait, '' AS xpidate, '' AS xcus, 0 AS xstatus,\r\n"
				+ "          '' AS xtwh, '' AS xtornum, '' AS xpreparer, '' AS xsignatory1, '' AS xsigndate1, '' AS xidsup,\r\n"
				+ "          '' AS xsuperior2, '' AS xsuperior3, '' AS xdiv, 0.00 AS xrate, 0.00 AS xlineamt, 0.00 AS xqtygrn,\r\n"
				+ "          0.00 AS xcfpur, 0.00 AS xbase, 0.00 AS xqtyprn, 0 AS xsyncstatus\r\n"
				+ "   FROM poterms a WITH (NOLOCK)\r\n"
				+ "   JOIN t_header b ON a.zid = b.zid AND a.xpornum = b.xpornum\r\n" + "),\r\n" + "t_all AS (\r\n"
				+ "   SELECT * FROM t_header\r\n" + "   UNION ALL\r\n" + "   SELECT * FROM t_detaile\r\n"
				+ "   UNION ALL\r\n" + "   SELECT * FROM t_terms\r\n" + ")\r\n" + "SELECT * FROM t_all\r\n"
				+ "ORDER BY xpornum,\r\n" + "         CASE WHEN tabName = 'Header' THEN 1\r\n"
				+ "              WHEN tabName = 'Details' THEN 2\r\n" + "              ELSE 3 END";

		//System.out.println(selectsql);

		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendpoordhddtterms(rs, endpointUrl, wName2);
	}

	private void querywork_sendXcodes(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "SELECT ztime, ISNULL(zutime,'') zutime, zauserid, ISNULL(zuuserid, '') AS zuuserid, zid, ISNULL(xtype, '') AS xtype,\r\n"
				+ "ISNULL(xcode, '') AS xcode, ISNULL(xlong, '') AS xlong, zactive,ISNULL(xacc, '') AS xacc, ISNULL(xaccvat, '') AS xaccvat,\r\n"
				+ "ISNULL(xaccdisc, '') AS xaccdisc, ISNULL(xaccait, '') AS xaccait, ISNULL(xaccret, '') AS xaccret, ISNULL(xaccpur, '') AS xaccpur,\r\n"
				+ "ISNULL(xaccwo, '') AS xaccwo, ISNULL(xprops, '') AS xprops, ISNULL(xmadd, '') AS xmadd, ISNULL(xphone, '') AS xphone,\r\n"
				+ "ISNULL(xfax, '') AS xfax, ISNULL(xemail, '') AS xemail, ISNULL(xarea, '') AS xarea, ISNULL(xwh, '') AS xwh,\r\n"
				+ "ISNULL(xregion, '') AS xregion, ISNULL(xfield, '') AS xfield, ISNULL(xterritory, '') AS xterritory, ISNULL(xhrc1, '') AS xhrc1,\r\n"
				+ "ISNULL(xdeptname, '') AS xdeptname, ISNULL(xtypeobj, '') AS xtypeobj, ISNULL(xtrcode, '') AS xtrcode,\r\n"
				+ "ISNULL(xtargetshare, 0) AS xtargetshare, ISNULL(xpercent, 0) AS xpercent, ISNULL(xdepmethod, '') AS xdepmethod,\r\n"
				+ "ISNULL(xaccother, '') AS xaccother, ISNULL(xitemdept, '') AS xitemdept, ISNULL(xitemsubdept, '') AS xitemsubdept,\r\n"
				+ "ISNULL(xaccsradj, '') AS xaccsradj, ISNULL(xaccgvadj, '') AS xaccgvadj, ISNULL(xaccbpadj, '') AS xaccbpadj,\r\n"
				+ "ISNULL(xaccsupptax, '') AS xaccsupptax, ISNULL(xaccrc, '') AS xaccrc, ISNULL(xaccsrgainloss, '') AS xaccsrgainloss,\r\n"
				+ "ISNULL(xvatregno, '') AS xvatregno, ISNULL(xvatarea, '') AS xvatarea, ISNULL(xdmwh, '') AS xdmwh,\r\n"
				+ "ISNULL(xipaddress, '') AS xipaddress, ISNULL(xprintername, '') AS xprintername, ISNULL(xbizunit, '') AS xbizunit,\r\n"
				+ "ISNULL(xbin, '') AS xbin, ISNULL(xalias, '') AS xalias, ISNULL(xvatrate, 0) AS xvatrate, ISNULL(zaip, '') AS zaip,\r\n"
				+ "ISNULL(zuip, '') AS zuip, ISNULL(xaccadj, '') AS xaccadj, ISNULL(xacccash, '') AS xacccash, ISNULL(xaccbank, '') AS xaccbank,\r\n"
				+ "ISNULL(xtypestore, '') AS xtypestore, ISNULL(xgtype, '') AS xgtype FROM xcodes;";

		//System.out.println(selectsql);

		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendXcodes(rs, endpointUrl, wName2);
	}

	private void querywork_sendAcheader(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "SELECT ISNULL(ztime, '') AS ztime, ISNULL(zutime, '') AS zutime, ISNULL(zauserid, '') AS zauserid, ISNULL(zuuserid, '') AS zuuserid, ISNULL(zid, 0) AS zid,\r\n"
				+ "ISNULL(xvoucher, '') AS xvoucher, ISNULL(xref, '') AS xref, ISNULL(xdate, '') AS xdate, ISNULL(xlong, '') AS xlong, ISNULL(xstatusjv, '') AS xstatusjv,\r\n"
				+ "ISNULL(xyear, 0) AS xyear, ISNULL(xper, '') AS xper, ISNULL(xwh, '') AS xwh, ISNULL(xsub, '') AS xsub, ISNULL(xtype, '') AS xtype, ISNULL(xtrn, '') AS xtrn,\r\n"
				+ "ISNULL(xlcno, '') AS xlcno, ISNULL(xgrnnum, '') AS xgrnnum, ISNULL(xoldvoucher, '') AS xoldvoucher, ISNULL(xstatus, '') AS xstatus, ISNULL(xordernum, '') AS xordernum,\r\n"
				+ "ISNULL(xdatecreate, '') AS xdatecreate, ISNULL(xdatechq, '') AS xdatechq, ISNULL(xchequeno, '') AS xchequeno, ISNULL(xbank, '') AS xbank, ISNULL(xpaidto, '') AS xpaidto,\r\n"
				+ "ISNULL(xinvnum, '') AS xinvnum, ISNULL(xpornum, '') AS xpornum, ISNULL(xdornum, '') AS xdornum, ISNULL(xporeqnum, '') AS xporeqnum, ISNULL(xnote, '') AS xnote,\r\n"
				+ "ISNULL(xfileref, '') AS xfileref, ISNULL(xsuperiorgl, '') AS xsuperiorgl, ISNULL(xpreparer, '') AS xpreparer, ISNULL(xsignatory1, '') AS xsignatory1,\r\n"
				+ "ISNULL(xsigndate1, '') AS xsigndate1, ISNULL(xsignatory2, '') AS xsignatory2, ISNULL(xsigndate2, '') AS xsigndate2, ISNULL(xsignatory3, '') AS xsignatory3,\r\n"
				+ "ISNULL(xsigndate3, '') AS xsigndate3, ISNULL(xsignatory4, '') AS xsignatory4, ISNULL(xsigndate4, '') AS xsigndate4, ISNULL(xsignatory5, '') AS xsignatory5,\r\n"
				+ "ISNULL(xsigndate5, '') AS xsigndate5, ISNULL(xsignatory6, '') AS xsignatory6, ISNULL(xsigndate6, '') AS xsigndate6, ISNULL(xsignatory7, '') AS xsignatory7,\r\n"
				+ "ISNULL(xsigndate7, '') AS xsigndate7, ISNULL(xsuperior2, '') AS xsuperior2, ISNULL(xsuperior3, '') AS xsuperior3, ISNULL(xsignreject, '') AS xsignreject,\r\n"
				+ "ISNULL(xdatereject, '') AS xdatereject, ISNULL(xrptcount, 0) AS xrptcount, ISNULL(xproject, '') AS xproject, ISNULL(xtypeobj, '') AS xtypeobj,\r\n"
				+ "ISNULL(xsyncstatus, '') AS xsyncstatus FROM acheadertemptbl \r\n" + "WHERE zid = 100080 \r\n"
				+ "AND (CAST(ztime AS date) BETWEEN CAST('" + sDate + "' AS date) AND CAST('" + tDate
				+ "' AS date) \r\n" + "OR CAST(zutime AS date) BETWEEN CAST('" + sDate + "' AS date) AND CAST('" + tDate
				+ "' AS date));\r\n";

		//System.out.println(selectsql);

		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendAcheader(rs, endpointUrl, wName2);
	}
	
	private void querywork_sendPdsignatoryrpt(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "SELECT ISNULL(ztime, '') AS ztime, ISNULL(zutime, '') AS zutime, ISNULL(zauserid, '') AS zauserid,"
				+ " ISNULL(zuuserid, '') AS zuuserid, ISNULL(zid, '') AS zid, ISNULL(xtypetrn, '') AS xtypetrn, ISNULL(xsignatory1, '') AS xsignatory1,"
				+ " ISNULL(xsignatory2, '') AS xsignatory2, ISNULL(xsignatory3, '') AS xsignatory3, ISNULL(xsignatory4, '') AS xsignatory4,"
				+ " ISNULL(xsignatory5, '') AS xsignatory5, ISNULL(xsignatory6, '') AS xsignatory6, ISNULL(xsignatory7, '') AS xsignatory7,"
				+ " ISNULL(xnofsignatory, '') AS xnofsignatory, ISNULL(xlong, '') AS xlong FROM pdsignatoryrpt ";

		//System.out.println(selectsql);

		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendPdsignatoryrpt(rs, endpointUrl, wName2);
	}
	
	private void querywork_sendOPcrn(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "with t_opdisall as (\r\n"
				+ "	select distinct a.xcrnnum from opcrndetail a with(nolock)\r\n"
				+ "	join opcrnheader h with(nolock) on h.xcrnnum=a.xcrnnum \r\n"
				+ "	join cacus c with(nolock) on a.xsup = c.xcus and c.xcuscomptype='yes' \r\n"
				+ "	where h.xstatuscrn=6 and (cast(h.xdate as date) between cast('"+sDate+"' as date) and cast('"+tDate+"' as date) )\r\n"
				+ "), t_header as ( \r\n"
				+ "	select 'Header' as tabName, ztime, isnull(zutime,'') as zutime, zauserid, isnull(zuuserid,'') as zuuserid, zid, a.xcrnnum , \r\n"
				+ "	xdate, xcus, xorg, xstatuscrn, xwh, xtotamt, xordernum, xstatusar, xamount , xdisc, xdiscf, xvatamt, xdiscamt, xtype, xexch, xvoucher, xstatusjv, \r\n"
				+ "	xpaymenttype , xsupptaxamt, xstatusexch, xtypeobj, xbarcode, xdiv, isnull(xterminal,'') as xterminal, xroundingchange , xstatusord, \r\n"
				+ "	isnull(xsigndate1,'') as xsigndate1, isnull(xsuperior2,'') as xsuperior2 , isnull(xsuperior3,'') as xsuperior3, isnull(xsignatory1,'') as xsignatory1 , \r\n"
				+ "	isnull(xpreparer,'') as xpreparer, isnull(xnote1,'') as xnote1 , isnull(xidsup,'') as xidsup, isnull(xday,0) as xday, isnull(xstatus,0) as xstatus, \r\n"
				+ "	0.00 as xstatusord2, 0.00 as xstatusord3, 0.00 as xsupptaxrate  \r\n"
				+ "	from opcrnheader a with(nolock) \r\n"
				+ "	join t_opdisall b on a.xcrnnum = b.xcrnnum\r\n"
				+ "), t_detaile as (\r\n"
				+ "	select 'Detail' as tabName, a.ztime, isnull(a.zutime,'') as zutime, a.zauserid, isnull(a.zuuserid,'') as zuuserid, a.zid, \r\n"
				+ "	a.xcrnnum, '' as xdate, a.xitem as xcus, a.xlong as xorg, a.xrow as xstatuscrn, '' as xwh, a.xqtyord as xtotamt, '' as xordernum, \r\n"
				+ "	a.xdocrow as xstatusar, a.xrate as xamount, a.xdisc, a.xlineamt as xdiscf, a.xvatamt, a.xvatrate as xdiscamt, a.xtype, a.xdiscdetamt as xexch, \r\n"
				+ "	a.xsup as xvoucher, isnull(a.xstatusjv,0) as xstatusjv, '' as xpaymenttype, a.xsupptaxamt, 0 as xstatusexch, a.xunitsel as xtypeobj, '' as xbarcode, \r\n"
				+ "	'' as xdiv, '' as xterminal, a.xcost as xroundingchange, 0 as xstatusord, '' as xsigndate1, '' as xsuperior2, '' as xsuperior3, '' as xsignatory1, \r\n"
				+ "	'' as xpreparer, '' as xnote1, '' as xidsup, 0 as xday, 0 as xstatus, a.xstatus as xstatusord2, a.xamtother as xstatusord3, \r\n"
				+ "	isnull(a.xsupptaxrate,0.00) as xsupptaxrate  \r\n"
				+ "	from opcrndetail a with(nolock) \r\n"
				+ "	join t_header b on a.zid = b.zid and a.xcrnnum = b.xcrnnum \r\n"
				+ "), t_all as (\r\n"
				+ "	select * from t_header   \r\n"
				+ "	union all \r\n"
				+ "	select * from t_detaile  \r\n"
				+ ")\r\n"
				+ "select * from t_all order by xcrnnum,\r\n"
				+ "case when tabName = 'Header' then 1 when tabName = 'Detail' then 2 else 3 end;";
		System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendopcrn(rs, endpointUrl, wName2);
	}

	private void querywork_sendPOgrn(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "WITH t_header AS (\r\n"
				+ "    SELECT 'Header' AS tabName,ztime,ISNULL(zutime, '') AS zutime,zauserid,ISNULL(zuuserid, '') AS zuuserid,zid,xgrnnum,ISNULL(xdate, '') AS xdate,\r\n"
				+ "	xsup,xstatusgrn,xref,xpornum,xnote,xcur,xexch,xinvnum,xtype,ISNULL(xprimetotamt, 0.00) AS xprimetotamt,ISNULL(xbasetotamt, 0.00) AS xbasetotamt,\r\n"
				+ "	xwh,xstatusap,xstatusjv,xdisc,xdiscf,ISNULL(xlcno, '') AS xlcno,ISNULL(xtotamt, 0.00) AS xtotamt,ISNULL(xdategl, '') AS xdategl,xvoucher,xregi,xstaff,\r\n"
				+ "	xcus,xsuperiorsp,xporeqnum,xtornum,xnote1,xstatus,xstatusimgl,xstatusjvgl,xstatusapgl,xpreparer,ISNULL(xsignatory2, '') AS xsignatory2,ISNULL(xsigndate2, '') AS xsigndate2,\r\n"
				+ "	xsignatory7,ISNULL(xsigndate7, '') AS xsigndate7,xsuperior2,xsuperior3,xsignreject,xstatusinsp,xdiv,xstatusjvfa,xstatusfa,xstatusdoc,ISNULL(xdaterel, '') AS xdaterel,\r\n"
				+ "	0.000000 AS xcfpur,0.00 AS xvatrate,0.00000 AS xrategrn,0.00 AS xbase,0.000 AS xqtyinsp,0.00000 AS xvalpo,0.00 AS xqtyprn\r\n"
				+ "    FROM pogrnheader WITH (NOLOCK)\r\n"
				+ "    WHERE CAST(ztime AS DATE) BETWEEN CAST('"+sDate+"' AS DATE) AND CAST('"+tDate+"' AS DATE)\r\n"
				+ "),\r\n"
				+ "t_detaile AS (\r\n"
				+ "    SELECT\r\n"
				+ "        'Detail' AS tabName,a.ztime,ISNULL(a.zutime, '') AS zutime,a.zauserid,ISNULL(a.zuuserid, '') AS zuuserid,a.zid,a.xgrnnum,'' AS xdate,a.xitem AS xsup,a.xrow AS xstatusgrn,\r\n"
				+ "	a.xunitpur AS xref,a.xpornum,'' AS xnote,'' AS xcur,a.xrate AS xexch,a.xlong AS xinvnum,ISNULL(a.xtype, '') AS xtype,ISNULL(a.xlineamt, 0.00) AS xprimetotamt,\r\n"
				+ "	0.00 AS xbasetotamt,a.xbatch AS xwh,a.xqtybonus AS xstatusap,0 AS xstatusjv,a.xdisc,a.xdiscf,ISNULL(a.xserial, '') AS xlcno,ISNULL(a.xvatamt, 0.00) AS xtotamt,\r\n"
				+ "	ISNULL(a.xdategl, '') AS xdategl,'' AS xvoucher,'' AS xregi,'' AS xstaff,'' AS xcus,'' AS xsuperiorsp,'' AS xporeqnum,'' AS xtornum,'' AS xnote1,a.xqtyasset AS xstatus,\r\n"
				+ "	a.xlife AS xstatusimgl,0 AS xstatusjvgl,0 AS xstatusapgl,'' AS xpreparer,'' AS xsignatory2,a.xdateexp AS xsigndate2,'' AS xsignatory7,'' AS xsigndate7,'' AS xsuperior2,\r\n"
				+ "	'' AS xsuperior3,'' AS xsignreject,'' AS xstatusinsp,'' AS xdiv,0 AS xstatusjvfa,0 AS xstatusfa,a.xdocrow AS xstatusdoc,'' AS xdaterel,ISNULL(a.xcfpur, 0.00) AS xcfpur,\r\n"
				+ "	ISNULL(a.xvatrate, 0.00) AS xvatrate,a.xrategrn,a.xbase,a.xqtyinsp,ISNULL(a.xvalpo, 0.00) AS xvalpo,a.xqtyprn    \r\n"
				+ "	FROM pogrndetail a WITH (NOLOCK) JOIN t_header b ON a.zid = b.zid AND a.xgrnnum = b.xgrnnum\r\n"
				+ "),\r\n"
				+ "t_all AS (\r\n"
				+ "    SELECT * FROM t_header\r\n"
				+ "    UNION ALL\r\n"
				+ "    SELECT * FROM t_detaile\r\n"
				+ ")\r\n"
				+ "SELECT * \r\n"
				+ "FROM t_all\r\n"
				+ "ORDER BY xgrnnum, \r\n"
				+ "         CASE \r\n"
				+ "            WHEN tabName = 'Header' THEN 1 \r\n"
				+ "            WHEN tabName = 'Detail' THEN 2 \r\n"
				+ "            ELSE 3 \r\n"
				+ "         END;";
		System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendpogrn(rs, endpointUrl, wName2);
	}

	private void querywork_sendOpDo(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		stmt_det = con.createStatement();

			String selectsql = "with t_opdisall as (select distinct a.xdornum from opdodetail a with(nolock)\r\n"
			+ "join opdoheader h with(nolock) on h.xdornum=a.xdornum join cacus c with(nolock) on a.xsup = c.xcus and c.xcuscomptype='yes'where h.xstatusprint=30 and (\r\n"
			+ "cast(h.xdate as date) between cast('"+sDate+"' as date) and cast('"+tDate+"' as date) ))\r\n"
			+ ", t_header AS (SELECT 'Header' AS tabName, ztime, ISNULL(zutime, '') AS zutime, zauserid, ISNULL(zuuserid, '') AS zuuserid, zid, ISNULL(a.xdornum, '') AS xdornum,\r\n"
			+ "xcus,ISNULL(xstatusord, '') AS xstatusord, ISNULL(xnote, '') AS xnote, ISNULL(xwh, '') AS xwh, ISNULL(xpornum, '') AS xpornum, xstatusar, xtotamt, ISNULL(xdisc, 0) AS xdisc, \r\n"
			+ "ISNULL(xdiscf, 0) AS xdiscf,ISNULL(xdatecom, '') AS xdatecom, ISNULL(xait, 0) AS xait, xamount, xvatrate, xdatedue, xavlperc, xvatamt, xaitamt, xdiscamt,ISNULL(xpaymentterm, '') AS xpaymentterm, \r\n"
			+ "ISNULL(xtype, '') AS xtype, ISNULL(xcrnnum, '') AS xcrnnum, xnetamt, xvoucher, xpreparer,xstatusjv, ISNULL(xcrterms, '') AS xcrterms, ISNULL(xctype, '') AS xctype, ISNULL(xbank, '') AS xbank, \r\n"
			+ "ISNULL(xpaid, 0) AS xpaid, ISNULL(xbillno, '') AS xbillno, ISNULL(xvatf, 0) AS xvatf,ISNULL(xaitf, 0) AS xaitf, ISNULL(xperson, '') AS xperson,xpaystatus, ISNULL(xcardtype, '') AS xcardtype, \r\n"
			+ "ISNULL(xchgscard, 0.00) AS xchgscard, xchgsamt, ISNULL(xgiftvoucher, '') AS xgiftvoucher, xvoucheramt,ISNULL(xpromono, '') AS xpromono, ISNULL(xbonuspoints, 0) AS xbonuspoints, \r\n"
			+ "ISNULL(xearnedbonuspoints, 0) AS xearnedbonuspoints, ISNULL(xearnedbonusamt, 0) AS xearnedbonusamt, ISNULL(xissuebank, '') AS xissuebank, ISNULL(xpaytype, '') AS xpaytype,\r\n"
			+ "ISNULL(xcrnamt, 0) AS xcrnamt, ISNULL(xcashamt, 0) AS xcashamt, ISNULL(xcardamt, 0) AS xcardamt, ISNULL(xspdiscamt, 0) AS xspdiscamt, xstatusprint, ISNULL(xcardno, '') AS xcardno,\r\n"
			+ "ISNULL(xexpetriot, '') AS xexpetriot, ISNULL(xsex, '') AS xsex, xterminal, ISNULL(xbarcode, '') AS xbarcode, xsupptaxamt, xadvposvchr,xroundingchange, ISNULL(xdiv, '') AS xdiv, \r\n"
			+ "ISNULL(xtempearnedbonusamt, 0.00) AS xtempearnedbonusamt, xstatuslp, ISNULL(xprinttime, '') AS xprinttime, ISNULL(a.xdoctype, '') AS xdoctype,ISNULL(a.xchange, 0) AS xchange,\r\n"
			+ "ISNULL(a.xref, '') AS xref,ISNULL(a.xdate, '') AS xdate,'' AS xdatecpo,\r\n"
			+ "isnull(a.xgiftitem,'') as xgiftitem,isnull(a.xcrngainamt,0) as xcrngainamt,isnull(a.xidsup,'') as xidsup,isnull(a.xsuperior2,'') as xsuperior2,isnull(a.xsuperior3,'') as xsuperior3,isnull(a.xsignatory1,'') as xsignatory1\r\n"
			+ ",isnull(a.xsigndate1,'') as xsigndate1,isnull(a.xsignatory2,'') as xsignatory2,isnull(a.xsigndate2,'') as xsigndate2,isnull(a.xsignatory3,'') as xsignatory3,isnull(a.xsigndate3,'') as xsigndate3,isnull(a.xsignatory4,'') as xsignatory4\r\n"
			+ ",isnull(a.xsigndate4,'') as xsigndate4,isnull(a.xsignatory5,'') as xsignatory5,isnull(a.xsigndate5,'') as xsigndate5,isnull(a.xsignatory6,'') as xsignatory6,isnull(a.xsigndate6,'') as xsigndate6,isnull(a.xsignatory7,'') as xsignatory7\r\n"
			+ ",isnull(a.xsigndatelp7,'') as xsigndatelp7,isnull(a.xsignreject,'') as xsignreject,isnull(a.xdatereject,'') as xdatereject,isnull(a.xsumnum,'') as xsumnum,isnull(a.xnote1,'') as xnote1,isnull(a.xsp,'') as xsp\r\n"
			+ ",isnull(a.xpaymenttype,'') as xpaymenttype,isnull(a.xterritory,'') as xterritory,isnull(a.xtso,'') as xtso,isnull(a.xproject,'') as xproject,isnull(a.xprime,0) as xprime,isnull(a.xyear,'') as xyear\r\n"
			+ ",isnull(a.xper,'') as xper,isnull(a.xexpamt,0) as xexpamt,isnull(a.xpp,'') as xpp,isnull(a.xpreparerlp,'') as xpreparerlp,isnull(a.xsignatorylp1,'') as xsignatorylp1,isnull(a.xsigndatelp1,'') as xsigndatelp1\r\n"
			+ ",isnull(a.xsignatorylp2,'') as xsignatorylp2,isnull(a.xsigndatelp2,'') as xsigndatelp2,isnull(a.xsignatorylp3,'') as xsignatorylp3,isnull(a.xsigndatelp3,'') as xsigndatelp3,isnull(a.xsignrejectlp,'') as xsignrejectlp\r\n"
			+ ",isnull(a.xdaterejectlp,'') as xdaterejectlp,isnull(a.xsignatorylp4,'') as xsignatorylp4,isnull(a.xsigndatelp4,'') as xsigndatelp4,isnull(a.xsignatorylp5,'') as xsignatorylp5,isnull(a.xsigndatelp5,'') as xsigndatelp5\r\n"
			+ ",isnull(a.xsignatorylp6,'') as xsignatorylp6,isnull(a.xsigndatelp6,'') as xsigndatelp6,isnull(a.xsignatorylp7,'') as xsignatorylp7,isnull(a.xvehicle,'') as xvehicle\r\n"
			+ ",isnull(a.xdealno,'') as xdealno,isnull(a.xpnature,'') as xpnature,'' AS zemail,'' AS xdocrow,'' AS zactive,'' AS xstatusgl\r\n"
			+ "FROM opdoheader a WITH (NOLOCK)\r\n"
			+ "join t_opdisall b on a.xdornum = b.xdornum\r\n"
			+ "),\r\n"
			+ "t_detaile AS (SELECT 'Detail' AS tabName,a.ztime,ISNULL(a.zutime, '') AS zutime,a.zauserid,ISNULL(a.zuuserid, '') AS zuuserid,a.zid,a.xdornum,'' AS xcus,ISNULL(a.xstatusgrn, '') AS xstatusord,\r\n"
			+ "ISNULL(a.xnote, '') AS xnote,a.xunit AS xwh,a.xitem AS xpornum,a.xrow AS xstatusar,a.xvatrate AS xtotamt,ISNULL(a.xdisc, 0) AS xdisc,a.xratedisc AS xdiscf,'' AS xdatecom,a.xqtybonus AS xait,\r\n"
			+ "a.xqtyord AS xamount,a.xvatrate,'' AS xdatedue,a.xrate AS xavlperc,a.xvatamt,a.xcost AS xaitamt,a.xdiscamt,ISNULL(a.xpaymentterm, '') AS xpaymentterm,ISNULL(a.xtype, '') AS xtype,\r\n"
			+ "ISNULL(a.xcomplgiftitem, '') AS xcrnnum,ISNULL(a.xnetamt, 0) AS xnetamt,ISNULL(a.xvoucher, '') AS xvoucher,'' AS xpreparer,ISNULL(a.xstatusjv, '') AS xstatusjv,a.xpricerow AS xcrterms,\r\n"
			+ "ISNULL(a.xpromotype, '') AS xctype,ISNULL(a.xpackitem, '') AS xbank,0.00 AS xpaid,'' AS xbillno,a.xlineamt AS xvatf,a.xqtycrn AS xaitf,a.xdesc AS xperson,0 AS xpaystatus,'' AS xcardtype,\r\n"
			+ "a.xrategrn AS xchgscard,a.xsupptaxrate AS xchgsamt,a.xtitem AS xgiftvoucher,0.00 AS xvoucheramt,a.xparentitem AS xpromono,ISNULL(a.xbonuspoints, 0.00) AS xbonuspoints,0.00 AS xearnedbonuspoints,\r\n"
			+ "0.00 AS xearnedbonusamt,ISNULL(a.xdocnum, '') AS xissuebank,'' AS xpaytype,a.xamtother AS xcrnamt,0.00 AS xcashamt,0.00 AS xcardamt,0.00 AS xspdiscamt,ISNULL(a.xstatusap, 0) AS xstatusprint,\r\n"
			+ "'' AS xcardno,'' AS xexpetriot,'' AS xsex,a.xterminal,'' AS xbarcode,a.xsupptaxamt,a.xsup AS xadvposvchr,0.00 AS xroundingchange,'' AS xdiv,0.00 AS xtempearnedbonusamt,a.xdorrow AS xstatuslp,\r\n"
			+ "'' AS xprinttime, '' AS xdoctype,0 AS xchange,'' AS xref,'' AS xdate,'' AS xdatecpo,\r\n"
			+ "'' as xgiftitem,0 as xcrngainamt,'' xidsup,'' as xsuperior2,'' as xsuperior3,'' as xsignatory1,'' as xsigndate1,'' as xsignatory2,'' as xsigndate2,'' as xsignatory3\r\n"
			+ ",'' as xsigndate3,'' as xsignatory4,'' as xsigndate4,'' as xsignatory5,'' as xsigndate5,'' as xsignatory6,'' as xsigndate6,'' as xsignatory7,'' as xsigndatelp7,'' as xsignreject\r\n"
			+ ",'' as xdatereject,'' as xsumnum,'' as xnote1,'' as xsp,'' as xpaymenttype,'' as xterritory,'' as xtso,'' as xproject,0 as xprime,'' as xyear,'' as xper,0 as xexpamt\r\n"
			+ ",'' as xpp,'' as xpreparerlp,'' as xsignatorylp1,'' as xsigndatelp1,'' as xsignatorylp2,'' as xsigndatelp2,'' as xsignatorylp3,'' as xsigndatelp3,'' as xsignrejectlp,'' as xdaterejectlp\r\n"
			+ ",'' as xsignatorylp4,'' as xsigndatelp4,'' as xsignatorylp5,'' as xsigndatelp5,'' as xsignatorylp6,'' as xsigndatelp6,'' as xsignatorylp7,'' as xvehicle,'' as xdealno\r\n"
			+ ",'' as xpnature,ISNULL(a.zemail, '') AS zemail,ISNULL(a.xdocrow, '') AS xdocrow,ISNULL(a.zactive, 0) AS zactive,ISNULL(a.xstatusgl, 0) AS xstatusgl\r\n"
			+ "from opdodetail a  with(nolock) join t_header b on a.zid = b.zid and a.xdornum = b.xdornum join cacus c on a.xsup = c.xcus and c.xcuscomptype='yes')\r\n"
			+ ", t_all AS (SELECT * FROM t_header\r\n"
			+ "UNION ALL\r\n"
			+ "SELECT * FROM t_detaile\r\n"
			+ ")\r\n"
			+ "SELECT * FROM t_all ORDER BY xdornum, CASE WHEN tabName = 'Header' THEN 1 WHEN tabName = 'Detail' THEN 2 \r\n"
			+ "ELSE 3 \r\n"
			+ "END";
			System.out.println(selectsql);
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectsql);
			this.call_sendOpDoheaderdetail(rs, endpointUrl, wName2);

	}

	private void querywork_sendopnetsupBal(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "\r\nselect ztime,isnull(zutime,'') as zutime,zid,zauserid,isnull(zuuserid,'') as zuuserid,zorg,\r\nxcus,xorg,xpaymenttype,xdiv,xlong,xdate,xnetamt,xtpamt,xcrnamt,xtype\r\nfrom opnetsupplierdaybal with(nolock)where zid="
				+ zid + "\r\n" + "and cast(xdate as date ) between cast('" + sDate + "' as date ) and cast('" + tDate
				+ "' as date )";
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendopnetsupplierdaybal(rs, endpointUrl, wName2);
	}

	private void querywork_sendopsupitemmovement(String wName2, Connection con, String endpointUrl)
			throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "\r\nselect ztime,isnull(zutime,'') as zutime,zid,zauserid,isnull(zuuserid,'') as zuuserid,xcus,xdiv,xdate,xitem,xdesc,xqty,xval,xunit,xposcode\r\nfrom opsuppliersitemmovement with(nolock)\r\nwhere zid="
				+ zid + "\r\n" + "and (cast(xdate as date ) between cast('" + sDate + "' as date ) and cast('" + tDate
				+ "' as date )\r\n" + "or cast(ztime as date ) between cast('" + sDate + "' as date ) and cast('"
				+ tDate + "' as date )\r\n" + "or cast(zutime as date ) between cast('" + sDate
				+ "' as date ) and cast('" + tDate + "' as date ))";
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendopsuppliersitemmovement(rs, endpointUrl, wName2);
	}

	private void querywork_sendPoSummary(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "\r\nselect ztime,isnull(zutime,'') as zutime,zauserid,isnull(zuuserid,'') as zuuserid,zid,xcus,xdiv,xdatesync_cus_sup,xdate,xpornum,isnull(xgrnnum,'') as xgrnnum,\r\nxexch,xlineamt,xvatrate,xvatamt,xdisc,xdiscf,xvalpo,xvalgrn,xvalprn,xpending,isnull(xtype,'') as xtype,isnull(xnote,'') as xnote,xtransport\r\nfrom posummary with(nolock)\r\nwhere zid="
				+ zid + "\r\n" + "and (cast(ztime as date ) between cast('" + sDate + "' as date ) and cast('" + tDate
				+ "' as date )\r\n" + "or cast(zutime as date ) between cast('" + sDate + "' as date ) and cast('"
				+ tDate + "' as date ))";
		// ////System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendposummary(rs, endpointUrl, wName2);
	}

	private void querywork_sendConfigServiceTerms(String wName2, Connection con, String endpointUrl)
			throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "\r\nselect ztime,isnull(zutime,'') as zutime,zauserid,isnull(zuuserid,'') as zuuserid,zid,xcus,isnull(xgcus,'') as xgcus,xdateeff,xdateexp,isnull(xsubscriptiontype,'') as xsubscriptiontype,\r\nxgrowthsalesbase,xtopnproduct,xdaytopproduct,xday_trendchart1,xday_trendchart2,xdaybarchart3,isnull(xnote,'') as xnote,zactive\r\nfrom configserviceterms with(nolock)\r\nwhere zid="
				+ zid + "\r\n" + "and (cast(ztime as date ) between cast('" + sDate + "' as date ) and cast('" + tDate
				+ "' as date )\r\n" + "or cast(zutime as date ) between cast('" + sDate + "' as date ) and cast('"
				+ tDate + "' as date ))";
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendconfigserviceterms(rs, endpointUrl, wName2);
	}

	private void querywork_sendCaItemTrans(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";

		String selectsql = "SELECT a.ztime, ISNULL(a.zutime, '') AS zutime, a.zauserid, ISNULL(a.zuuserid, '') AS zuuserid, a.zid, \r\n"
				+ "a.xitem, a.xcus, a.xparentitem, a.zactive, a.xstatus, a.xnote, a.xpaymenttype, a.xcost, ISNULL(a.xpornum, '') AS xpornum, \r\n"
				+ "a.xrate, ISNULL(a.xtp, 0) AS xtp, a.xdateeff, a.xdateexp, a.xdisc, ISNULL(a.xdisctype, '') AS xdisctype, \r\n"
				+ "a.xstarttime, a.xendtime, a.xbodycode, a.xdatacheckstatus, ISNULL(a.xtheircode, '') AS xtheircode, \r\n"
				+ "ISNULL(a.xbrand, '') AS xbrand  FROM caitemtranslation a WITH(NOLOCK)  \r\n"
				+ "join cacus b on a.zid = b.zid and a.xcus = b.xcus and b.xcuscomptype = 'yes' \r\n"
				+ "WHERE a.zid =  100080 " + "AND (CAST(a.ztime AS date) BETWEEN CAST('" + sDate
				+ "' AS date) AND CAST('" + tDate + "' AS date) " + "OR CAST(a.zutime AS date) BETWEEN CAST('" + sDate
				+ "' AS date) AND CAST('" + tDate + "' AS date))";

		//System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendcaitemtrans(rs, endpointUrl, wName2);
	}

	private void querywork_sendCaItem(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";

		String selectsql = "select ztime, isnull(zutime,'') as zutime, zauserid, isnull(zuuserid,'') as zuuserid, zid, xitem, xdesc, xgitem, "
				+ "ISNULL(xcitem,'') as xcitem, xcatitem, xrate, xunitpur, xcost, isnull(xvatamt,0) as xvatamt, xunit, isnull(xlong,'') as xlong, "
				+ "xtitem, xstype, '' as xalias, isnull(xmrp,0) as xmrp, isnull(xpacking,'') as xpacking, isnull(xdisc,0) as xdisc, isnull(xcartoon,0) as xcartoon, "
				+ "isnull(xdateeff,'') as xdateeff, isnull(xdateexp,'') as xdateexp, isnull(xhscode,'') as xhscode, isnull(xpackqty,0) as xpackqty, "
				+ "zactive, isnull(xbrand,'') as xbrand, xcfpur, isnull(xcfsel,0) as xcfsel, isnull(xcfiss,0) as xcfiss, isnull(xunitsel,0) as xunitsel, "
				+ "isnull(xunitiss,'') as xunitiss, xpnature, xvatrate, isnull(xminqty,0) as xminqty, isnull(xtaxrate,0) as xtaxrate, isnull(xtheircode,'') as xtheircode, "
				+ "isnull(xpartno,'') as xpartno, isnull(xtype,'') as xtype, isnull(xitemdept,'') as xitemdept, isnull(xitemsubdept,'') as xitemsubdept, "
				+ "isnull(xsupptaxrate,0) as xsupptaxrate, isnull(xbodycode,'') as xbodycode, isnull(xdatecreate,'') as xdatecreate, isnull(xautogrn,'') as xautogrn, "
				+ "xstarttime, xendtime, isnull(xincode,'') as xincode, isnull(xisonline,'') as xisonline, isnull(xdesconline,'') as xdesconline, "
				+ "isnull(xcatonline1,'') as xcatonline1, isnull(xcatonline2,'') as xcatonline2, isnull(xcatonline3,'') as xcatonline3, isnull(xwidth,0) as xwidth, "
				+ "isnull(xpercent,0) as xpercent, isnull(xparentitem,'') as xparentitem, isnull(xoutlet,'') as xoutlet, isnull(xmanagexpiry,'') as xmanagexpiry, "
				+ "isnull(xheight,0) as xheight, isnull(xdiv,'') as xdiv, isnull(xdescsh,'') as xdescsh, isnull(xdepth,0) as xdepth, "
				+ "isnull(xdatacheckstatus,0) as xdatacheckstatus, isnull(xarticle,'') as xarticle, isnull(xacc,'') as xacc "
				+ "from caitem with(nolock) " + "where zid = " + zid + " " + "and (cast(ztime as date) between cast('"
				+ sDate + "' as date) and cast('" + tDate + "' as date) " + "or cast(zutime as date) between cast('"
				+ sDate + "' as date) and cast('" + tDate + "' as date))";

		//System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendcaitem(rs, endpointUrl, wName2);
	}

	private void querywork_sendSupPay(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "select zid,ztime,isnull(zutime,'') as zutime,zauserid,isnull(zuuserid,'') as zuuserid,xcus,xdate,xvoucher,xdocnum,"
				+ "xstatusjv,xbase,xprnamt,xvatamt,isnull(xaitamt,0) as xaitamt,isnull(xnote,'') as xnote from supplierpayments with(nolock)"
				+ "where zid=" + zid + " and cast(xdate as date ) between cast('" + sDate + "' as date ) and cast('"
				+ tDate + "' as date )";

		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendsuppPay(rs, endpointUrl, wName2);
	}

	private void querywork_sendcacus(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";

		String selectsql = "SELECT ztime, ISNULL(zutime,'') AS zutime, zauserid, ISNULL(zuuserid,'') AS zuuserid, zid, xcus, ISNULL(xorg,'') AS xorg, "
				+ "ISNULL(xmadd,'') AS xmadd, ISNULL(xemail,'') AS xemail, ISNULL(xphone,'') AS xphone, ISNULL(xfax,'') AS xfax, xstatuscus, "
				+ "ISNULL(xwh,'') AS xwh, ISNULL(xpaymentterm,'') AS xpaymentterm, ISNULL(xdateeff,'') AS xdateeff, ISNULL(xdateexp,'') AS xdateexp, "
				+ "xcontact, xgsup, xtype, ISNULL(xmobile,'') AS xmobile, xpaymenttype, ISNULL(xcusold,'') AS xcusold, zactive, "
				+ "ISNULL(xcountry,'') AS xcountry, xprdcounter, ISNULL(xcustype,'') AS xcustype, xcycle, xcrperiod, ISNULL(xbank,'') AS xbank, "
				+ "ISNULL(xbranch,'') AS xbranch, ISNULL(xacc,'') AS xacc, ISNULL(xrouting,'') AS xrouting, ISNULL(xacctype,'') AS xacctype, "
				+ "ISNULL(xbeneficiary,'') AS xbeneficiary, ISNULL(xenlistedfee,0) AS xenlistedfee, ISNULL(xstaff,'') AS xstaff, "
				+ "ISNULL(xidsup,'') AS xidsup, ISNULL(xsigndate7,'') AS xsigndate7, ISNULL(xcardno,'') AS xcardno, ISNULL(xbin,'') AS xbin, "
				+ "ISNULL(xnid,'') AS xnid, ISNULL(xdiv,'') AS xdiv, ISNULL(xcuscomptype,'') AS xcuscomptype, '' AS xeffectivity, "
				+ "'' AS xdateopening FROM cacus WITH(nolock) " + "WHERE zid = " + zid + " AND xcuscomptype = 'yes'";

		//System.out.println(selectsql);

		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendcacus(rs, endpointUrl, wName2);
	}

	private void querywork_sendxusers(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "SELECT ISNULL(ztime, '') AS ztime, ISNULL(zutime, '') AS zutime, ISNULL(zid, '') AS zid, ISNULL(zemail, '') AS zemail,\r\n"
				+ "ISNULL(xpassword, '') AS xpassword, ISNULL(xaccess, '') AS xaccess, ISNULL(xdformat, '') AS xdformat, ISNULL(xdsep, '') AS xdsep,\r\n"
				+ "ISNULL(zactive, '') AS zactive, ISNULL(zauserid, '') AS zauserid, ISNULL(zuuserid, '') AS zuuserid, ISNULL(xlastlogdate, '') AS xlastlogdate,\r\n"
				+ "ISNULL(xname, '') AS xname, ISNULL(zaip, '') AS zaip, ISNULL(zuip, '') AS zuip, ISNULL(xwh, '') AS xwh, ISNULL(xsp, '') AS xsp,\r\n"
				+ "ISNULL(xrole, '') AS xrole, ISNULL(xoldpass, '') AS xoldpass, ISNULL(xposition, '') AS xposition, ISNULL(xpriority, '') AS xpriority,\r\n"
				+ "ISNULL(zscreen, '') AS zscreen FROM xusers \r\n" + "WHERE zid = 100080 "
				+ "AND (CAST(ztime AS DATE) BETWEEN CAST('" + sDate + "' AS DATE) AND CAST('" + tDate + "' AS DATE) "
				+ "OR CAST(zutime AS DATE) BETWEEN CAST('" + sDate + "' AS DATE) AND CAST('" + tDate + "' AS DATE));";
		//System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendxusers(rs, endpointUrl, wName2);
	}

	private void querywork_sendpdmst(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "SELECT ISNULL(ztime, '') AS ztime, ISNULL(zutime, '') AS zutime, ISNULL(zauserid, '') AS zauserid, ISNULL(zuuserid, '') AS zuuserid,\r\n"
				+ "ISNULL(zid, '') AS zid, ISNULL(xstaff, '') AS xstaff, ISNULL(xname, '') AS xname, ISNULL(xnamef, '') AS xnamef, ISNULL(xnamem, '') AS xnamem,\r\n"
				+ "ISNULL(xmadd, '') AS xmadd, ISNULL(xpadd, '') AS xpadd, ISNULL(xbirthdate, '') AS xbirthdate, ISNULL(xsex, '') AS xsex,\r\n"
				+ "ISNULL(xmstat, '') AS xmstat, ISNULL(xdeptname, '') AS xdeptname, ISNULL(xdesignation, '') AS xdesignation, ISNULL(xdatejoin, '') AS xdatejoin,\r\n"
				+ "ISNULL(xgrade, '') AS xgrade, ISNULL(xemail, '') AS xemail, ISNULL(xenddate, '') AS xenddate, ISNULL(xretdate, '') AS xretdate,\r\n"
				+ "ISNULL(xempstatus, '') AS xempstatus, ISNULL(xlocation, '') AS xlocation, ISNULL(xdistrict, '') AS xdistrict, ISNULL(xdatecom, '') AS xdatecom,\r\n"
				+ "ISNULL(xposition, '') AS xposition, ISNULL(xempcategory, '') AS xempcategory, ISNULL(xstatus, '') AS xstatus, ISNULL(xsid, '') AS xsid,\r\n"
				+ "ISNULL(ximage, '') AS ximage, ISNULL(xbloodgroup, '') AS xbloodgroup, ISNULL(xphone, '') AS xphone, ISNULL(xhrc1, '') AS xhrc1,\r\n"
				+ "ISNULL(xhrc2, '') AS xhrc2, ISNULL(xhrc3, '') AS xhrc3, ISNULL(xhrc4, '') AS xhrc4, ISNULL(xplan, '') AS xplan, ISNULL(xemname, '') AS xemname,\r\n"
				+ "ISNULL(xrelation, '') AS xrelation, ISNULL(xemcmobile, '') AS xemcmobile, ISNULL(xmobile, '') AS xmobile, ISNULL(xnimage, '') AS xnimage,\r\n"
				+ "ISNULL(xreligion, '') AS xreligion, ISNULL(xemptype, '') AS xemptype, ISNULL(zactive, '') AS zactive, ISNULL(xsignature, '') AS xsignature,\r\n"
				+ "ISNULL(xfile, '') AS xfile, ISNULL(xempposition, '') AS xempposition, ISNULL(xsignatory, '') AS xsignatory,\r\n"
				+ "ISNULL(xdatacheckstatus, '') AS xdatacheckstatus FROM pdmst";
		//System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendpdmst(rs, endpointUrl, wName2);
	}

	private void querywork_sendcasupitem(String wName2, Connection con, String endpointUrl) throws SQLException {
		ResultSet rs = null;
		String result = "";
		String selectsql = "SELECT ISNULL(a.ztime, '') AS ztime, ISNULL(a.zutime, '') AS zutime, ISNULL(a.zauserid, '') AS zauserid,\r\n"
				+ "ISNULL(a.zuuserid, '') AS zuuserid, ISNULL(a.zid, 0) AS zid, ISNULL(a.xcus, '') AS xcus, ISNULL(a.xitem, '') AS xitem,\r\n"
				+ "ISNULL(a.zactive, '') AS zactive, ISNULL(a.xstatus, '') AS xstatus, ISNULL(a.xdiv, '') AS xdiv, ISNULL(a.xyesno, '') AS xyesno,\r\n"
				+ "ISNULL(a.xvatrate, 0) AS xvatrate, ISNULL(a.xdatacheckstatus, '') AS xdatacheckstatus, ISNULL(a.xbrand, '') AS xbrand,\r\n"
				+ "ISNULL(a.xcost, 0) AS xcost, ISNULL(a.xrate, 0) AS xrate FROM casupitem a\r\n"
				+ "join cacus b on a.zid = b.zid and a.xcus = b.xcus and b.xcuscomptype = 'yes'\r\n"
				+ "WHERE a.zid =  100080  \r\n" + " AND (cast(a.ztime as date) between cast('" + sDate
				+ "' as date) and cast('" + tDate + "' as date) \r\n" + " OR cast(a.zutime as date) between cast('"
				+ sDate + "' as date) and cast('" + tDate + "' as date))";
		//System.out.println(selectsql);
		stmt = con.createStatement();
		rs = stmt.executeQuery(selectsql);
		this.call_sendcasupitem(rs, endpointUrl, wName2);
	}

	private String call_sendcaitem(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xitem = rs.getString("xitem");
			xdesc = rs.getString("xdesc");
			xgitem = rs.getString("xgitem");
			xcitem = rs.getString("xcitem");
			xcatitem = rs.getString("xcatitem");
			xrate = rs.getString("xrate");
			xunitpur = rs.getString("xunitpur");
			xcost = rs.getString("xcost");
			xvatamt = rs.getString("xvatamt");
			xunit = rs.getString("xunit");
			xlong = rs.getString("xlong");
			xtitem = rs.getString("xtitem");
			xstype = rs.getString("xstype");
			xalias = rs.getString("xalias");
			xmrp = rs.getString("xmrp");
			xpacking = rs.getString("xpacking");
			xdisc = rs.getString("xdisc");
			xcartoon = rs.getString("xcartoon");
			xdateeff = rs.getString("xdateeff");
			xdateexp = rs.getString("xdateexp");
			xhscode = rs.getString("xhscode");
			xpackqty = rs.getString("xpackqty");
			zactive = rs.getString("zactive");
			xbrand = rs.getString("xbrand");
			xcfpur = rs.getString("xcfpur");
			xcfsel = rs.getString("xcfsel");
			xcfiss = rs.getString("xcfiss");
			xunitsel = rs.getString("xunitsel");
			xunitiss = rs.getString("xunitiss");
			xpnature = rs.getString("xpnature");
			xvatrate = rs.getString("xvatrate");
			xminqty = rs.getString("xminqty");
			xtaxrate = rs.getString("xtaxrate");
			xtheircode = rs.getString("xtheircode");
			xpartno = rs.getString("xpartno");
			xtype = rs.getString("xtype");
			xitemdept = rs.getString("xitemdept");
			xitemsubdept = rs.getString("xitemsubdept");
			xsupptaxrate = rs.getString("xsupptaxrate");
			xbodycode = rs.getString("xbodycode");
			xdatecreate = rs.getString("xdatecreate");
			xautogrn = rs.getString("xautogrn");
			xstarttime = rs.getString("xstarttime");
			xendtime = rs.getString("xendtime");
			xincode = rs.getString("xincode");
			xisonline = rs.getString("xisonline");
			xdesconline = rs.getString("xdesconline");
			xcatonline1 = rs.getString("xcatonline1");
			xcatonline2 = rs.getString("xcatonline2");
			xcatonline3 = rs.getString("xcatonline3");
			xwidth = rs.getString("xwidth");
			xpercent = rs.getString("xpercent");
			xparentitem = rs.getString("xparentitem");
			xoutlet = rs.getString("xoutlet");
			xmanagexpiry = rs.getString("xmanagexpiry");
			xheight = rs.getString("xheight");
			xdiv = rs.getString("xdiv");
			xdescsh = rs.getString("xdescsh");
			xdepth = rs.getString("xdepth");
			xdatacheckstatus = rs.getString("xdatacheckstatus");
			xarticle = rs.getString("xarticle");
			xacc = rs.getString("xacc");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xitem", xitem);
			jsonObject.put("xdesc", xdesc);
			jsonObject.put("xgitem", xgitem);
			jsonObject.put("xcitem", xcitem);
			jsonObject.put("xcatitem", xcatitem);
			jsonObject.put("xrate", xrate);
			jsonObject.put("xunitpur", xunitpur);
			jsonObject.put("xcost", xcost);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xunit", xunit);
			jsonObject.put("xlong", xlong);
			jsonObject.put("xtitem", xtitem);
			jsonObject.put("xstype", xstype);
			jsonObject.put("xalias", xalias);
			jsonObject.put("xmrp", xmrp);
			jsonObject.put("xpacking", xpacking);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xcartoon", xcartoon);
			jsonObject.put("xdateeff", xdateeff);
			jsonObject.put("xdateexp", xdateexp);
			jsonObject.put("xhscode", xhscode);
			jsonObject.put("xpackqty", xpackqty);
			jsonObject.put("zactive", zactive);
			jsonObject.put("xbrand", xbrand);
			jsonObject.put("xcfpur", xcfpur);
			jsonObject.put("xcfsel", xcfsel);
			jsonObject.put("xcfiss", xcfiss);
			jsonObject.put("xunitsel", xunitsel);
			jsonObject.put("xunitiss", xunitiss);
			jsonObject.put("xpnature", xpnature);
			jsonObject.put("xvatrate", xvatrate);
			jsonObject.put("xminqty", xminqty);
			jsonObject.put("xtaxrate", xtaxrate);
			jsonObject.put("xtheircode", xtheircode);
			jsonObject.put("xpartno", xpartno);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xitemdept", xitemdept);
			jsonObject.put("xitemsubdept", xitemsubdept);
			jsonObject.put("xsupptaxrate", xsupptaxrate);
			jsonObject.put("xbodycode", xbodycode);
			jsonObject.put("xdatecreate", xdatecreate);
			jsonObject.put("xautogrn", xautogrn);
			jsonObject.put("xstarttime", xstarttime);
			jsonObject.put("xendtime", xendtime);
			jsonObject.put("xincode", xincode);
			jsonObject.put("xisonline", xisonline);
			jsonObject.put("xdesconline", xdesconline);
			jsonObject.put("xcatonline1", xcatonline1);
			jsonObject.put("xcatonline2", xcatonline2);
			jsonObject.put("xcatonline3", xcatonline3);
			jsonObject.put("xwidth", xwidth);
			jsonObject.put("xpercent", xpercent);
			jsonObject.put("xparentitem", xparentitem);
			jsonObject.put("xoutlet", xoutlet);
			jsonObject.put("xmanagexpiry", xmanagexpiry);
			jsonObject.put("xheight", xheight);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xdescsh", xdescsh);
			jsonObject.put("xdepth", xdepth);
			jsonObject.put("xdatacheckstatus", xdatacheckstatus);
			jsonObject.put("xarticle", xarticle);
			jsonObject.put("xacc", xacc);
			jsonObject.put("wName", ttypess);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\caitem.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=caitem";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	private String call_sendcaitemtrans(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xitem = rs.getString("xitem");
			xcus = rs.getString("xcus");
			xparentitem = rs.getString("xparentitem");
			zactive = rs.getString("zactive");
			xstatus = rs.getString("xstatus");
			xnote = rs.getString("xnote");
			xpaymenttype = rs.getString("xpaymenttype");
			xcost = rs.getString("xcost");
			xrate = rs.getString("xrate");
			xtp = rs.getString("xtp");
			xdateeff = rs.getString("xdateeff");
			xdateexp = rs.getString("xdateexp");
			xdisc = rs.getString("xdisc");
			xdisctype = rs.getString("xdisctype");
			xstarttime = rs.getString("xstarttime");
			xendtime = rs.getString("xendtime");
			xbodycode = rs.getString("xbodycode");
			xdatacheckstatus = rs.getString("xdatacheckstatus");
			xtheircode = rs.getString("xtheircode");
			xbrand = rs.getString("xbrand");
			xpornum = rs.getString("xpornum");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xitem", xitem);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xparentitem", xparentitem);
			jsonObject.put("zactive", zactive);
			jsonObject.put("xstatus", xstatus);
			jsonObject.put("xnote", xnote);
			jsonObject.put("xpaymenttype", xpaymenttype);
			jsonObject.put("xcost", xcost);
			jsonObject.put("xrate", xrate);
			jsonObject.put("xtp", xtp);
			jsonObject.put("xdateeff", xdateeff);
			jsonObject.put("xdateexp", xdateexp);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xalias", xalias);
			jsonObject.put("xmrp", xmrp);
			jsonObject.put("xpacking", xpacking);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xdisctype", xdisctype);
			jsonObject.put("xstarttime", xstarttime);
			jsonObject.put("xendtime", xendtime);
			jsonObject.put("xbodycode", xbodycode);
			jsonObject.put("xdatacheckstatus", xdatacheckstatus);
			jsonObject.put("xtheircode", xtheircode);
			jsonObject.put("xbrand", xbrand);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\caitemtranslation.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=caitemtranslation";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendconfigserviceterms(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xcus = rs.getString("xcus");
			xgcus = rs.getString("xgcus");
			xdateeff = rs.getString("xdateeff");
			xdateexp = rs.getString("xdateexp");
			xsubscriptiontype = rs.getString("xsubscriptiontype");
			xgrowthsalesbase = rs.getString("xgrowthsalesbase");
			xtopnproduct = rs.getString("xtopnproduct");
			xdaytopproduct = rs.getString("xdaytopproduct");
			xday_trendchart1 = rs.getString("xday_trendchart1");
			xday_trendchart2 = rs.getString("xday_trendchart2");
			xdaybarchart3 = rs.getString("xdaybarchart3");
			xnote = rs.getString("xnote");
			zactive = rs.getString("zactive");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xgcus", xgcus);
			jsonObject.put("xdateeff", xdateeff);
			jsonObject.put("xdateexp", xdateexp);
			jsonObject.put("xsubscriptiontype", xsubscriptiontype);
			jsonObject.put("xgrowthsalesbase", xgrowthsalesbase);
			jsonObject.put("xtopnproduct", xtopnproduct);
			jsonObject.put("xdaytopproduct", xdaytopproduct);
			jsonObject.put("xday_trendchart1", xday_trendchart1);
			jsonObject.put("xday_trendchart2", xday_trendchart2);
			jsonObject.put("xdaybarchart3", xdaybarchart3);
			jsonObject.put("xnote", xnote);
			jsonObject.put("zactive", zactive);
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\configserviceterms.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=configserviceterms";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	private String call_sendOpDoheaderdetail(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			tabName = rs.getString("tabName");
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xdornum = rs.getString("xdornum");
			xcus = rs.getString("xcus");
			xstatusord = rs.getString("xstatusord");
			xnote = rs.getString("xnote");
			xwh = rs.getString("xwh");
			xpornum = rs.getString("xpornum");
			xstatusar = rs.getString("xstatusar");
			xtotamt = rs.getString("xtotamt");
			xdisc = rs.getString("xdisc");
			xdiscf = rs.getString("xdiscf");
			xdatecom = rs.getString("xdatecom");
			xait = rs.getString("xait");
			xamount = rs.getString("xamount");
			xvatrate = rs.getString("xvatrate");
			xdatedue = rs.getString("xdatedue");
			xavlperc = rs.getString("xavlperc");
			xvatamt = rs.getString("xvatamt");
			xaitamt = rs.getString("xaitamt");
			xdiscamt = rs.getString("xdiscamt");
			xpaymentterm = rs.getString("xpaymentterm");
			xtype = rs.getString("xtype");
			xcrnnum = rs.getString("xcrnnum");
			xnetamt = rs.getString("xnetamt");
			xvoucher = rs.getString("xvoucher");
			xpreparer = rs.getString("xpreparer");
			xstatusjv = rs.getString("xstatusjv");
			xcrterms = rs.getString("xcrterms");
			xctype = rs.getString("xctype");
			xbank = rs.getString("xbank");
			xpaid = rs.getString("xpaid");
			xbillno = rs.getString("xbillno");
			xvatf = rs.getString("xvatf");
			xaitf = rs.getString("xaitf");
			xperson = rs.getString("xperson");
			xpaystatus = rs.getString("xpaystatus");
			xcardtype = rs.getString("xcardtype");
			xchgscard = rs.getString("xchgscard");
			xchgsamt = rs.getString("xchgsamt");
			xgiftvoucher = rs.getString("xgiftvoucher");
			xpromono = rs.getString("xpromono");
			 xbonuspoints = rs.getString("xbonuspoints");
			 xearnedbonuspoints = rs.getString("xearnedbonuspoints");
			xearnedbonusamt = rs.getString("xearnedbonusamt");
			xissuebank = rs.getString("xissuebank");
			xpaytype = rs.getString("xpaytype");
			xcrnamt = rs.getString("xcrnamt");
			xcashamt = rs.getString("xcashamt");
			xcardamt = rs.getString("xcardamt");
			xspdiscamt = rs.getString("xspdiscamt");
			xstatusprint = rs.getString("xstatusprint");
			xcardno = rs.getString("xcardno");
			xexpetriot = rs.getString("xexpetriot");
			xsex = rs.getString("xsex");
			xterminal = rs.getString("xterminal");
			xbarcode = rs.getString("xbarcode");
			xsupptaxamt = rs.getString("xsupptaxamt");
			xadvposvchr = rs.getString("xadvposvchr");
			xroundingchange = rs.getString("xroundingchange");
			xdiv = rs.getString("xdiv");
			xtempearnedbonusamt = rs.getString("xtempearnedbonusamt");
			xstatuslp = rs.getString("xstatuslp");
			xprinttime = rs.getString("xprinttime");
			xdoctype = rs.getString("xdoctype");
			xchange = rs.getString("xchange");
			xref = rs.getString("xref");
			xdate = rs.getString("xdate");
			xdatecpo = rs.getString("xdatecpo");
			xgiftitem = rs.getString("xgiftitem");
			xcrngainamt = rs.getString("xcrngainamt");
			xidsup = rs.getString("xidsup");
			xsuperior2 = rs.getString("xsuperior2");
			xsuperior3 = rs.getString("xsuperior3");
			xsignatory1 = rs.getString("xsignatory1");
			xsigndate1 = rs.getString("xsigndate1");
			xsignatory2 = rs.getString("xsignatory2");
			xsigndate2 = rs.getString("xsigndate2");
			xsignatory3 = rs.getString("xsignatory3");
			xsigndate3 = rs.getString("xsigndate3");
			xsignatory4 = rs.getString("xsignatory4");
			xsigndate4 = rs.getString("xsigndate4");
			xsignatory5 = rs.getString("xsignatory5");
			xsigndate5 = rs.getString("xsigndate5");
			xsignatory6 = rs.getString("xsignatory6");
			xsigndate6 = rs.getString("xsigndate6");
			xsignatory7 = rs.getString("xsignatory7");
			xsigndatelp7 = rs.getString("xsigndatelp7");
			xsignreject = rs.getString("xsignreject");
			xdatereject = rs.getString("xdatereject");
			xsumnum = rs.getString("xsumnum");
			xnote1 = rs.getString("xnote1");
			xsp = rs.getString("xsp");
			xpaymenttype = rs.getString("xpaymenttype");
			xterritory = rs.getString("xterritory");
			xtso = rs.getString("xtso");
			xproject = rs.getString("xproject");
			xprime = rs.getString("xprime");
			xyear = rs.getString("xyear");
			xper = rs.getString("xper");
			xexpamt = rs.getString("xexpamt");
			xpp = rs.getString("xpp");
			xpreparerlp = rs.getString("xpreparerlp");
			xsignatorylp1 = rs.getString("xsignatorylp1");
			xsigndatelp1 = rs.getString("xsigndatelp1");
			xsignatorylp2 = rs.getString("xsignatorylp2");
			xsigndatelp2 = rs.getString("xsigndatelp2");
			xsignatorylp3 = rs.getString("xsignatorylp3");
			xsigndatelp3 = rs.getString("xsigndatelp3");
			xsignrejectlp = rs.getString("xsignrejectlp");
			xdaterejectlp = rs.getString("xdaterejectlp");
			xsignatorylp4 = rs.getString("xsignatorylp4");
			xsigndatelp4 = rs.getString("xsigndatelp4");
			xsignatorylp5 = rs.getString("xsignatorylp5");
			xsigndatelp5 = rs.getString("xsigndatelp5");
			xsignatorylp6 = rs.getString("xsignatorylp6");
			xsigndatelp6 = rs.getString("xsigndatelp6");
			xsignatorylp7 = rs.getString("xsignatorylp7");
			xvehicle = rs.getString("xvehicle");
			xdealno = rs.getString("xdealno");
			xpnature = rs.getString("xpnature");
			zemail = rs.getString("zemail");
			xvoucheramt = rs.getString("xvoucheramt");
			xdocrow = rs.getString("xdocrow");
			zactive = rs.getString("zactive");
			xstatusgl = rs.getString("xstatusgl");
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("tabName", tabName);
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xdornum", xdornum);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xstatusord", xstatusord);
			jsonObject.put("xnote", xnote);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("xstatusar", xstatusar);
			jsonObject.put("xtotamt", xtotamt);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xdiscf", xdiscf);
			jsonObject.put("xdatecom", xdatecom);
			jsonObject.put("xait", xait);
			jsonObject.put("xamount", xamount);
			jsonObject.put("xvatrate", xvatrate);
			jsonObject.put("xdatedue", xdatedue);
			jsonObject.put("xavlperc", xavlperc);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xaitamt", xaitamt);
			jsonObject.put("xdiscamt", xdiscamt);
			jsonObject.put("xpaymentterm", xpaymentterm);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xcrnnum", xcrnnum);
			jsonObject.put("xnetamt", xnetamt);
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xpreparer", xpreparer);
			jsonObject.put("xstatusjv", xstatusjv);
			jsonObject.put("xcrterms", xcrterms);
			jsonObject.put("xctype", xctype);
			jsonObject.put("xbank", xbank);
			jsonObject.put("xpaid", xpaid);
			jsonObject.put("xbillno", xbillno);
			jsonObject.put("xvatf", xvatf);
			jsonObject.put("xaitf", xaitf);
			jsonObject.put("xperson", xperson);
			jsonObject.put("xpaystatus", xpaystatus);
			jsonObject.put("xcardtype", xcardtype);
			jsonObject.put("xchgscard", xchgscard);
			jsonObject.put("xchgsamt", xchgsamt);
			jsonObject.put("xgiftvoucher", xgiftvoucher);
			jsonObject.put("xpromono", xpromono);
			jsonObject.put("xbonuspoints", xbonuspoints);
			jsonObject.put("xearnedbonuspoints", xearnedbonuspoints);
			jsonObject.put("xearnedbonusamt", xearnedbonusamt);
			jsonObject.put("xissuebank", xissuebank);
			jsonObject.put("xpaytype", xpaytype);
			jsonObject.put("xcrnamt", xcrnamt);
			jsonObject.put("xcashamt", xcashamt);
			jsonObject.put("xcardamt", xcardamt);
			jsonObject.put("xspdiscamt", xspdiscamt);
			jsonObject.put("xstatusprint", xstatusprint);
			jsonObject.put("xcardno", xcardno);
			jsonObject.put("xexpetriot", xexpetriot);
			jsonObject.put("xsex", xsex);
			jsonObject.put("xterminal", xterminal);
			jsonObject.put("xbarcode", xbarcode);
			jsonObject.put("xsupptaxamt", xsupptaxamt);
			jsonObject.put("xadvposvchr", xadvposvchr);
			jsonObject.put("xroundingchange", xroundingchange);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xtempearnedbonusamt", xtempearnedbonusamt);
			jsonObject.put("xstatuslp", xstatuslp);
			jsonObject.put("xprinttime", xprinttime);
			jsonObject.put("xdoctype", xdoctype);
			jsonObject.put("xchange", xchange);
			jsonObject.put("xref", xref);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xdatecpo", xdatecpo);
			jsonObject.put("xgiftitem", xgiftitem);
			jsonObject.put("xcrngainamt", xcrngainamt);
			jsonObject.put("xidsup", xidsup);
			jsonObject.put("xsuperior2", xsuperior2);
			jsonObject.put("xsuperior3", xsuperior3);
			jsonObject.put("xsignatory1", xsignatory1);
			jsonObject.put("xsigndate1", xsigndate1);
			jsonObject.put("xsignatory2", xsignatory2);
			jsonObject.put("xsigndate2", xsigndate2);
			jsonObject.put("xsignatory3", xsignatory3);
			jsonObject.put("xsigndate3", xsigndate3);
			jsonObject.put("xsignatory4", xsignatory4);
			jsonObject.put("xsigndate4", xsigndate4);
			jsonObject.put("xsignatory5", xsignatory5);
			jsonObject.put("xsigndate5", xsigndate5);
			jsonObject.put("xsignatory6", xsignatory6);
			jsonObject.put("xsigndate6", xsigndate6);
			jsonObject.put("xsignatory7", xsignatory7);
			jsonObject.put("xsigndatelp7", xsigndatelp7);
			jsonObject.put("xsignreject", xsignreject);
			jsonObject.put("xdatereject", xdatereject);
			jsonObject.put("xsumnum", xsumnum);
			jsonObject.put("xnote1", xnote1);
			jsonObject.put("xsp", xsp);
			jsonObject.put("xpaymenttype", xpaymenttype);
			jsonObject.put("xterritory", xterritory);
			jsonObject.put("xtso", xtso);
			jsonObject.put("xproject", xproject);
			jsonObject.put("xprime", xprime);
			jsonObject.put("xyear", xyear);
			jsonObject.put("xper", xper);
			jsonObject.put("xexpamt", xexpamt);
			jsonObject.put("xpp", xpp);
			jsonObject.put("xpreparerlp", xpreparerlp);
			jsonObject.put("xsignatorylp1", xsignatorylp1);
			jsonObject.put("xsigndatelp1", xsigndatelp1);
			jsonObject.put("xsignatorylp2", xsignatorylp2);
			jsonObject.put("xsigndatelp2", xsigndatelp2);
			jsonObject.put("xsignatorylp3", xsignatorylp3);
			jsonObject.put("xsigndatelp3", xsigndatelp3);
			jsonObject.put("xsignrejectlp", xsignrejectlp);
			jsonObject.put("xdaterejectlp", xdaterejectlp);
			jsonObject.put("xsignatorylp4", xsignatorylp4);
			jsonObject.put("xsigndatelp4", xsigndatelp4);
			jsonObject.put("xsignatorylp5", xsignatorylp5);
			jsonObject.put("xsigndatelp5", xsigndatelp5);
			jsonObject.put("xsignatorylp6", xsignatorylp6);
			jsonObject.put("xsigndatelp6", xsigndatelp6);
			jsonObject.put("xsignatorylp7", xsignatorylp7);
			jsonObject.put("xvehicle", xvehicle);
			jsonObject.put("xdealno", xdealno);
			jsonObject.put("xpnature", xpnature);
			jsonObject.put("zemail", zemail);
			jsonObject.put("xvoucheramt", xvoucheramt);
			jsonObject.put("xdocrow", xdocrow);
			jsonObject.put("zactive", zactive);
			jsonObject.put("xstatusgl", xstatusgl);

			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\opdoheaderdetail.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://localhost:8070/zab/JsonFileReceiver?filename=opdoheaderdetail";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendpogrn(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			tabName = rs.getString("tabName");
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xgrnnum = rs.getString("xgrnnum");
			xdate = rs.getString("xdate");
			xsup = rs.getString("xsup");
			xstatusgrn = rs.getString("xstatusgrn");
			xref = rs.getString("xref");
			xpornum = rs.getString("xpornum");
			xnote = rs.getString("xnote");
			xcur = rs.getString("xcur");
			xexch = rs.getString("xexch");
			xinvnum = rs.getString("xinvnum");
			xtype = rs.getString("xtype");
			xprimetotamt = rs.getString("xprimetotamt");
			xbasetotamt = rs.getString("xbasetotamt");
			xwh = rs.getString("xwh");
			xstatusap = rs.getString("xstatusap");
			xstatusjv = rs.getString("xstatusjv");
			xdisc = rs.getString("xdisc");
			xdiscf = rs.getString("xdiscf");
			xlcno = rs.getString("xlcno");
			xtotamt = rs.getString("xtotamt");
			xdategl = rs.getString("xdategl");
			xvoucher = rs.getString("xvoucher");
			xregi = rs.getString("xregi");
			xstaff = rs.getString("xstaff");
			xcus = rs.getString("xcus");
			xsuperiorsp = rs.getString("xsuperiorsp");
			xporeqnum = rs.getString("xporeqnum");
			xtornum = rs.getString("xtornum");
			xnote1 = rs.getString("xnote1");
			xstatus = rs.getString("xstatus");
			xstatusimgl = rs.getString("xstatusimgl");
			xstatusjvgl = rs.getString("xstatusjvgl");
			xstatusapgl = rs.getString("xstatusapgl");
			xpreparer = rs.getString("xpreparer");
			xsignatory2 = rs.getString("xsignatory2");
			xsigndate2 = rs.getString("xsigndate2");
			xsignatory7 = rs.getString("xsignatory7");
			xsigndate7 = rs.getString("xsigndate7");
			xsuperior2 = rs.getString("xsuperior2");
			xsuperior3 = rs.getString("xsuperior3");
			xsignreject = rs.getString("xsignreject");
			xstatusinsp = rs.getString("xstatusinsp");
			xdiv = rs.getString("xdiv");
			xstatusjvfa = rs.getString("xstatusjvfa");
			xstatusfa = rs.getString("xstatusfa");
			xstatusdoc = rs.getString("xstatusdoc");
			xdaterel = rs.getString("xdaterel");
			xcfpur = rs.getString("xcfpur");
			xvatrate = rs.getString("xvatrate");
			xrategrn = rs.getString("xrategrn");
			xbase = rs.getString("xbase");
			xqtyinsp = rs.getString("xqtyinsp");
			xvalpo = rs.getString("xvalpo");
			xqtyprn = rs.getString("xqtyprn");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("tabName", tabName);
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xgrnnum", xgrnnum);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xsup", xsup);
			jsonObject.put("xstatusgrn", xstatusgrn);
			jsonObject.put("xref", xref);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("xnote", xnote);
			jsonObject.put("xcur", xcur);
			jsonObject.put("xexch", xexch);
			jsonObject.put("xinvnum", xinvnum);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xprimetotamt", xprimetotamt);
			jsonObject.put("xbasetotamt", xbasetotamt);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xstatusap", xstatusap);
			jsonObject.put("xstatusjv", xstatusjv);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xdiscf", xdiscf);
			jsonObject.put("xlcno", xlcno);
			jsonObject.put("xtotamt", xtotamt);
			jsonObject.put("xdategl", xdategl);
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xregi", xregi);
			jsonObject.put("xstaff", xstaff);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xsuperiorsp", xsuperiorsp);
			jsonObject.put("xporeqnum", xporeqnum);
			jsonObject.put("xtornum", xtornum);
			jsonObject.put("xnote1", xnote1);
			jsonObject.put("xstatus", xstatus);
			jsonObject.put("xstatusimgl", xstatusimgl);
			jsonObject.put("xstatusjvgl", xstatusjvgl);
			jsonObject.put("xstatusapgl", xstatusapgl);
			jsonObject.put("xpreparer", xpreparer);
			jsonObject.put("xsignatory2", xsignatory2);
			jsonObject.put("xsigndate2", xsigndate2);
			jsonObject.put("xsignatory7", xsignatory7);
			jsonObject.put("xsigndate7", xsigndate7);
			jsonObject.put("xsuperior2", xsuperior2);
			jsonObject.put("xsuperior3", xsuperior3);
			jsonObject.put("xsignreject", xsignreject);
			jsonObject.put("xstatusinsp", xstatusinsp);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xstatusjvfa", xstatusjvfa);
			jsonObject.put("xstatusfa", xstatusfa);
			jsonObject.put("xstatusdoc", xstatusdoc);
			jsonObject.put("xdaterel", xdaterel);
			jsonObject.put("xcfpur", xcfpur);
			jsonObject.put("xvatrate", xvatrate);
			jsonObject.put("xrategrn", xrategrn);
			jsonObject.put("xbase", xbase);
			jsonObject.put("xqtyinsp", xqtyinsp);
			jsonObject.put("xvalpo", xvalpo);
			jsonObject.put("xqtyprn", xqtyprn);
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\pogrnheaderdetail.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://localhost:8070/zab/JsonFileReceiver?filename=pogrnheaderdetail";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendAcheader(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {

			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xvoucher = rs.getString("xvoucher");
			xref = rs.getString("xref");
			xdate = rs.getString("xdate");
			xlong = rs.getString("xlong");
			xstatusjv = rs.getString("xstatusjv");
			xyear = rs.getString("xyear");
			xper = rs.getString("xper");
			xwh = rs.getString("xwh");
			xsub = rs.getString("xsub");
			xtype = rs.getString("xtype");
			xtrn = rs.getString("xtrn");
			xlcno = rs.getString("xlcno");
			xgrnnum = rs.getString("xgrnnum");
			xoldvoucher = rs.getString("xoldvoucher");
			xstatus = rs.getString("xstatus");
			xordernum = rs.getString("xordernum");
			xdatecreate = rs.getString("xdatecreate");
			xdatechq = rs.getString("xdatechq");
			xchequeno = rs.getString("xchequeno");
			xbank = rs.getString("xbank");
			xpaidto = rs.getString("xpaidto");
			xinvnum = rs.getString("xinvnum");
			xpornum = rs.getString("xpornum");
			xdornum = rs.getString("xdornum");
			xporeqnum = rs.getString("xporeqnum");
			xnote = rs.getString("xnote");
			xfileref = rs.getString("xfileref");
			xsuperiorgl = rs.getString("xsuperiorgl");
			xpreparer = rs.getString("xpreparer");
			xsignatory1 = rs.getString("xsignatory1");
			xsigndate1 = rs.getString("xsigndate1");
			xsignatory2 = rs.getString("xsignatory2");
			xsigndate2 = rs.getString("xsigndate2");
			xsignatory3 = rs.getString("xsignatory3");
			xsigndate3 = rs.getString("xsigndate3");
			xsignatory4 = rs.getString("xsignatory4");
			xsigndate4 = rs.getString("xsigndate4");
			xsignatory5 = rs.getString("xsignatory5");
			xsigndate5 = rs.getString("xsigndate5");
			xsignatory6 = rs.getString("xsignatory6");
			xsigndate6 = rs.getString("xsigndate6");
			xsignatory7 = rs.getString("xsignatory7");
			xsigndate7 = rs.getString("xsigndate7");
			xsuperior2 = rs.getString("xsuperior2");
			xsuperior3 = rs.getString("xsuperior3");
			xsignreject = rs.getString("xsignreject");
			xdatereject = rs.getString("xdatereject");
			xrptcount = rs.getString("xrptcount");
			xproject = rs.getString("xproject");
			xtypeobj = rs.getString("xtypeobj");
			xsyncstatus = rs.getString("xsyncstatus");

			JSONObject jsonObject = new JSONObject();

			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xref", xref);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xlong", xlong);
			jsonObject.put("xstatusjv", xstatusjv);
			jsonObject.put("xyear", xyear);
			jsonObject.put("xper", xper);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xsub", xsub);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xtrn", xtrn);
			jsonObject.put("xlcno", xlcno);
			jsonObject.put("xgrnnum", xgrnnum);
			jsonObject.put("xoldvoucher", xoldvoucher);
			jsonObject.put("xstatus", xstatus);
			jsonObject.put("xordernum", xordernum);
			jsonObject.put("xdatecreate", xdatecreate);
			jsonObject.put("xdatechq", xdatechq);
			jsonObject.put("xchequeno", xchequeno);
			jsonObject.put("xbank", xbank);
			jsonObject.put("xpaidto", xpaidto);
			jsonObject.put("xinvnum", xinvnum);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("xdornum", xdornum);
			jsonObject.put("xporeqnum", xporeqnum);
			jsonObject.put("xnote", xnote);
			jsonObject.put("xfileref", xfileref);
			jsonObject.put("xsuperiorgl", xsuperiorgl);
			jsonObject.put("xpreparer", xpreparer);
			jsonObject.put("xsignatory1", xsignatory1);
			jsonObject.put("xsigndate1", xsigndate1);
			jsonObject.put("xsignatory2", xsignatory2);
			jsonObject.put("xsigndate2", xsigndate2);
			jsonObject.put("xsignatory3", xsignatory3);
			jsonObject.put("xsigndate3", xsigndate3);
			jsonObject.put("xsignatory4", xsignatory4);
			jsonObject.put("xsigndate4", xsigndate4);
			jsonObject.put("xsignatory5", xsignatory5);
			jsonObject.put("xsigndate5", xsigndate5);
			jsonObject.put("xsignatory6", xsignatory6);
			jsonObject.put("xsigndate6", xsigndate6);
			jsonObject.put("xsignatory7", xsignatory7);
			jsonObject.put("xsigndate7", xsigndate7);
			jsonObject.put("xsuperior2", xsuperior2);
			jsonObject.put("xsuperior3", xsuperior3);
			jsonObject.put("xsignreject", xsignreject);
			jsonObject.put("xdatereject", xdatereject);
			jsonObject.put("xrptcount", xrptcount);
			jsonObject.put("xproject", xproject);
			jsonObject.put("xtypeobj", xtypeobj);
			jsonObject.put("xsyncstatus", "100");

			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\acheader.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=acheader";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendPdsignatoryrpt(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			String ztime = rs.getString("ztime");
			String zutime = rs.getString("zutime");
			String zauserid = rs.getString("zauserid");
			String zuuserid = rs.getString("zuuserid");
			String zid = rs.getString("zid");
			String xtypetrn = rs.getString("xtypetrn");
			String xsignatory1 = rs.getString("xsignatory1");
			String xsignatory2 = rs.getString("xsignatory2");
			String xsignatory3 = rs.getString("xsignatory3");
			String xsignatory4 = rs.getString("xsignatory4");
			String xsignatory5 = rs.getString("xsignatory5");
			String xsignatory6 = rs.getString("xsignatory6");
			String xsignatory7 = rs.getString("xsignatory7");
			String xnofsignatory = rs.getString("xnofsignatory");
			String xlong = rs.getString("xlong");
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xtypetrn", xtypetrn); 
			jsonObject.put("xsignatory1", xsignatory1); 
			jsonObject.put("xsignatory2", xsignatory2); 
			jsonObject.put("xsignatory3", xsignatory3); 
			jsonObject.put("xsignatory4", xsignatory4); 
			jsonObject.put("xsignatory5", xsignatory5); 
			jsonObject.put("xsignatory6", xsignatory6); 
			jsonObject.put("xsignatory7", xsignatory7); 
			jsonObject.put("xnofsignatory", xnofsignatory); 
			jsonObject.put("xlong", xlong); 
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xref", xref);
			jsonObject.put("xdate", xdate);
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\pdsignatoryrpt.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=pdsignatoryrpt";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private String call_sendopcrn(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			tabName = rs.getString("tabName");
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xcrnnum = rs.getString("xcrnnum");
			xdate = rs.getString("xdate");
			xcus = rs.getString("xcus");
			xorg = rs.getString("xorg");
			xstatuscrn = rs.getString("xstatuscrn");
			xwh = rs.getString("xwh");
			xtotamt = rs.getString("xtotamt");
			xordernum = rs.getString("xordernum");
			xstatusar = rs.getString("xstatusar");
			xamount = rs.getString("xamount");
			xdisc = rs.getString("xdisc");
			xdiscf = rs.getString("xdiscf");
			xvatamt = rs.getString("xvatamt");
			xdiscamt = rs.getString("xdiscamt");
			xtype = rs.getString("xtype");
			xexch = rs.getString("xexch");
			xvoucher = rs.getString("xvoucher");
			xstatusjv = rs.getString("xstatusjv");
			xpaymenttype = rs.getString("xpaymenttype");
			xsupptaxamt = rs.getString("xsupptaxamt");
			xstatusexch = rs.getString("xstatusexch");
			xtypeobj = rs.getString("xtypeobj");
			xbarcode = rs.getString("xbarcode");
			xdiv = rs.getString("xdiv");
			xterminal = rs.getString("xterminal");
			xroundingchange = rs.getString("xroundingchange");
			xstatusord = rs.getString("xstatusord");
			xsigndate1 = rs.getString("xsigndate1");
			xsuperior2 = rs.getString("xsuperior2");
			xsuperior3 = rs.getString("xsuperior3");
			xsignatory1 = rs.getString("xsignatory1");
			xpreparer = rs.getString("xpreparer");
			xnote1 = rs.getString("xnote1");
			xidsup = rs.getString("xidsup");
			xday = rs.getString("xday");
			xstatus = rs.getString("xstatus");
			xstatusord2 = rs.getString("xstatusord2");
			xstatusord3 = rs.getString("xstatusord3");
			xsupptaxrate = rs.getString("xsupptaxrate");

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("tabName", tabName);
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xcrnnum", xcrnnum);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xorg", xorg);
			jsonObject.put("xstatuscrn", xstatuscrn);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xtotamt", xtotamt);
			jsonObject.put("xordernum", xordernum);
			jsonObject.put("xstatusar", xstatusar);
			jsonObject.put("xamount", xamount);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xdiscf", xdiscf);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xdiscamt", xdiscamt);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xexch", xexch);
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xstatusjv", xstatusjv);
			jsonObject.put("xpaymenttype", xpaymenttype);
			jsonObject.put("xsupptaxamt", xsupptaxamt);
			jsonObject.put("xstatusexch", xstatusexch);
			jsonObject.put("xtypeobj", xtypeobj);
			jsonObject.put("xbarcode", xbarcode);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xterminal", xterminal);
			jsonObject.put("xroundingchange", xroundingchange);
			jsonObject.put("xstatusord", xstatusord);
			jsonObject.put("xsigndate1", xsigndate1);
			jsonObject.put("xsuperior2", xsuperior2);
			jsonObject.put("xsuperior3", xsuperior3);
			jsonObject.put("xsignatory1", xsignatory1);
			jsonObject.put("xpreparer", xpreparer);
			jsonObject.put("xnote1", xnote1);
			jsonObject.put("xidsup", xidsup);
			jsonObject.put("xday", xday);
			jsonObject.put("xstatus", xstatus);
			jsonObject.put("xstatusord2", xstatusord2);
			jsonObject.put("xstatusord3", xstatusord3);
			jsonObject.put("xsupptaxrate", xsupptaxrate);

			
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\opcrnheaderdetail.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://localhost:8070/zab/JsonFileReceiver?filename=opcrnheaderdetail";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendpoordhddtterms(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			tabName = rs.getString("tabName");
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xpornum = rs.getString("xpornum");
			xshipdate = rs.getString("xshipdate");
			xpaymentterm = rs.getString("xpaymentterm");
			xexch = rs.getString("xexch");
			xtype = rs.getString("xtype");
			xporeqnum = rs.getString("xporeqnum");
			xstatuspor = rs.getString("xstatuspor");
			xwh = rs.getString("xwh");
			xdate = rs.getString("xdate");
			xtypeobj = rs.getString("xtypeobj");
			xyear = rs.getString("xyear");
			xper = rs.getString("xper");
			xdisc = rs.getString("xdisc");
			xdiscf = rs.getString("xdiscf");
			xvatrate = rs.getString("xvatrate");
			xvatamt = rs.getString("xvatamt");
			xait = rs.getString("xait");
			xpidate = rs.getString("xpidate");
			xcus = rs.getString("xcus");
			xstatus = rs.getString("xstatus");
			xtwh = rs.getString("xtwh");
			xtornum = rs.getString("xtornum");
			xpreparer = rs.getString("xpreparer");
			xsignatory1 = rs.getString("xsignatory1");
			xsigndate1 = rs.getString("xsigndate1");
			xidsup = rs.getString("xidsup");
			xsuperior2 = rs.getString("xsuperior2");
			xsuperior3 = rs.getString("xsuperior3");
			xdiv = rs.getString("xdiv");
			xrate = rs.getString("xrate");
			xlineamt = rs.getString("xlineamt");
			xqtygrn = rs.getString("xqtygrn");
			xcfpur = rs.getString("xcfpur");
			xbase = rs.getString("xbase");
			xqtyprn = rs.getString("xqtyprn");
			xsyncstatus = rs.getString("xsyncstatus");
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("tabName", tabName);
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("xshipdate", xshipdate);
			jsonObject.put("xpaymentterm", xpaymentterm);
			jsonObject.put("xexch", xexch);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xporeqnum", xporeqnum);
			jsonObject.put("xstatuspor", xstatuspor);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xtypeobj", xtypeobj);
			jsonObject.put("xyear", xyear);
			jsonObject.put("xper", xper);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xdiscf", xdiscf);
			jsonObject.put("xvatrate", xvatrate);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xait", xait);
			jsonObject.put("xpidate", xpidate);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xstatus", xstatus);
			jsonObject.put("xstatusdetails", "100");
			jsonObject.put("xtwh", xtwh);
			jsonObject.put("xtornum", xtornum);
			jsonObject.put("xpreparer", xpreparer);
			jsonObject.put("xsignatory1", xsignatory1);
			jsonObject.put("xsigndate1", xsigndate1);
			jsonObject.put("xidsup", xidsup);
			jsonObject.put("xsuperior2", xsuperior2);
			jsonObject.put("xsuperior3", xsuperior3);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xrate", xrate);
			jsonObject.put("xlineamt", xlineamt);
			jsonObject.put("xqtygrn", xqtygrn);
			jsonObject.put("xcfpur", xcfpur);
			jsonObject.put("xbase", xbase);
			jsonObject.put("xqtyprn", xqtyprn);
			jsonObject.put("xsyncstatus", "100");
			
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\poordheaderdetailpoterms.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=poordheaderdetailpoterms";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendposummary(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xcus = rs.getString("xcus");
			xdiv = rs.getString("xdiv");
			xdatesync_cus_sup = rs.getString("xdatesync_cus_sup");
			xdate = rs.getString("xdate");
			xpornum = rs.getString("xpornum");
			xgrnnum = rs.getString("xgrnnum");
			xexch = rs.getString("xexch");
			xlineamt = rs.getString("xlineamt");
			xvatrate = rs.getString("xvatrate");
			xvatamt = rs.getString("xvatamt");
			xdisc = rs.getString("xdisc");
			xdiscf = rs.getString("xdiscf");
			xvalpo = rs.getString("xvalpo");
			xvalgrn = rs.getString("xvalgrn");
			xvalprn = rs.getString("xvalprn");
			xpending = rs.getString("xpending");
			xtype = rs.getString("xtype");
			xnote = rs.getString("xnote");
			xtransport = rs.getString("xtransport");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xdatesync_cus_sup", xdatesync_cus_sup);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("xgrnnum", xgrnnum);
			jsonObject.put("xexch", xexch);
			jsonObject.put("xlineamt", xlineamt);
			jsonObject.put("xvatrate", xvatrate);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xdisc", xdisc);
			jsonObject.put("xdiscf", xdiscf);
			jsonObject.put("xvalpo", xvalpo);
			jsonObject.put("xvalgrn", xvalgrn);
			jsonObject.put("xvalprn", xvalprn);
			jsonObject.put("xpending", xpending);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xnote", xnote);
			jsonObject.put("xtransport", xtransport);
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\posummary.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=posummary";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendopsuppliersitemmovement(ResultSet rs, String endpointUrl, String ttypess)
			throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xcus = rs.getString("xcus");
			xdiv = rs.getString("xdiv");
			xdate = rs.getString("xdate");
			xitem = rs.getString("xitem");
			xdesc = rs.getString("xdesc");
			xqty = rs.getString("xqty");
			xval = rs.getString("xval");
			xunit = rs.getString("xunit");
			xposcode = rs.getString("xposcode");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xitem", xitem);
			jsonObject.put("xdesc", xdesc);
			jsonObject.put("xqty", xqty);
			jsonObject.put("xval", xval);
			jsonObject.put("xunit", xunit);
			jsonObject.put("xposcode", xposcode);
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\opsuppliersitemmovement.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=opsuppliersitemmovement";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendopnetsupplierdaybal(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			zorg = rs.getString("zorg");
			xcus = rs.getString("xcus");
			xorg = rs.getString("xorg");
			xpaymenttype = rs.getString("xpaymenttype");
			xdiv = rs.getString("xdiv");
			xlong = rs.getString("xlong");
			xdate = rs.getString("xdate");
			xnetamt = rs.getString("xnetamt");
			xtpamt = rs.getString("xtpamt");
			xcrnamt = rs.getString("xcrnamt");
			xtype = rs.getString("xtype");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xcus", xcus);
			jsonObject.put("zorg", zorg);
			jsonObject.put("xorg", xorg);
			jsonObject.put("xpaymenttype", xpaymenttype);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xlong", xlong);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xnetamt", xnetamt);
			jsonObject.put("xtpamt", xtpamt);
			jsonObject.put("xcrnamt", xcrnamt);
			jsonObject.put("xtype", xtype);
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\opnetsupplierdaybal.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=opnetsupplierdaybal";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendarhed(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zid = rs.getString("zid");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			xvoucher = rs.getString("xvoucher");
			xcus = rs.getString("xcus");
			xcur = rs.getString("xcur");
			xdate = rs.getString("xdate");
			xbank = rs.getString("xbank");
			xref = rs.getString("xref");
			xexch = rs.getString("xexch");
			xprime = rs.getString("xprime");
			xbase = rs.getString("xbase");
			xdiscprime = rs.getString("xdiscprime");
			xchgsprime = rs.getString("xchgsprime");
			xnote = rs.getString("xnote");
			xstatusjv = rs.getString("xstatusjv");
			xsign = rs.getString("xsign");
			xbalprime = rs.getString("xbalprime");
			xdocnum = rs.getString("xdocnum");
			xvatamt = rs.getString("xvatamt");
			xaitamt = rs.getString("xaitamt");
			xordernum = rs.getString("xordernum");
			xdatedue = rs.getString("xdatedue");
			xwh = rs.getString("xwh");
			xpaymentterm = rs.getString("xpaymentterm");
			xtype = rs.getString("xtype");
			xlcno = rs.getString("xlcno");
			xtypetrn = rs.getString("xtypetrn");
			xpornum = rs.getString("xpornum");
			xgrnnum = rs.getString("xgrnnum");
			xstatuschq = rs.getString("xstatuschq");
			xprimebuyer = rs.getString("xprimebuyer");
			xbalprimebuyer = rs.getString("xbalprimebuyer");
			xcurbuyer = rs.getString("xcurbuyer");
			xexchbuyer = rs.getString("xexchbuyer");
			xtyperec = rs.getString("xtyperec");
			xval = rs.getString("xval");
			xsyncstatus = rs.getString("xsyncstatus");
			xadjustment = rs.getString("xadjustment");
			
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zid", zid);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xcur", xcur);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xbank", xbank);
			jsonObject.put("xref", xref);
			jsonObject.put("xexch", xexch);
			jsonObject.put("xprime", xprime);
			jsonObject.put("xbase", xbase);
			jsonObject.put("xdiscprime", xdiscprime);
			jsonObject.put("xchgsprime", xchgsprime);
			jsonObject.put("xnote", xnote);
			jsonObject.put("xstatusjv", xstatusjv);
			jsonObject.put("xsign", xsign);
			jsonObject.put("xbalprime", xbalprime);
			jsonObject.put("xdocnum", xdocnum);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xaitamt", xaitamt);
			jsonObject.put("xordernum", xordernum);
			jsonObject.put("xdatedue", xdatedue);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xpaymentterm", xpaymentterm);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xlcno", xlcno);
			jsonObject.put("xtypetrn", xtypetrn);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("xgrnnum", xgrnnum);
			jsonObject.put("xstatuschq", xstatuschq);
			jsonObject.put("xprimebuyer", xprimebuyer);
			jsonObject.put("xbalprimebuyer", xbalprimebuyer);
			jsonObject.put("xcurbuyer", xcurbuyer);
			jsonObject.put("xexchbuyer", xexchbuyer);
			jsonObject.put("xtyperec", xtyperec);
			jsonObject.put("xval", xval);
			jsonObject.put("xsyncstatus", "100");
			jsonObject.put("xadjustment", xadjustment);
			
			
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\arhed.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=arhed";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_arlc(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zid = rs.getString("zid");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			xvoucher = rs.getString("xvoucher");
			xinvnum = rs.getString("xinvnum");
			xdate = rs.getString("xdate");
			xdatedue = rs.getString("xdatedue");
			xbalance = rs.getString("xbalance");
			xamount = rs.getString("xamount");
			xpornum = rs.getString("xpornum");
			xgrnnum = rs.getString("xgrnnum");
			xvatamt = rs.getString("xvatamt");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zid", zid);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xinvnum", xinvnum);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xdatedue", xdatedue);
			jsonObject.put("xbalance", xbalance);
			jsonObject.put("xamount", xamount);
			jsonObject.put("xpornum", xpornum);
			jsonObject.put("xgrnnum", xgrnnum);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xsyncstatus", "100");
			jsonObject.put("wName", ttypess);
			jsonObject.put("sDate", sDate);
			jsonObject.put("tDate", tDate);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\aralc.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=aralc";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendsuppPay(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xdate = rs.getString("xdate");
			xvoucher = rs.getString("xvoucher");
			xdocnum = rs.getString("xdocnum");
			xstatusjv = rs.getString("xstatusjv");
			xbase = rs.getString("xbase");
			xprnamt = rs.getString("xprnamt");
			xvatamt = rs.getString("xvatamt");
			xaitamt = rs.getString("xaitamt");
			xnote = rs.getString("xnote");
			xcus = rs.getString("xcus");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xdate", xdate);
			jsonObject.put("xvoucher", xvoucher);
			jsonObject.put("xdocnum", xdocnum);
			jsonObject.put("xstatusjv", xstatusjv);
			jsonObject.put("xbase", xbase);
			jsonObject.put("xprnamt", xprnamt);
			jsonObject.put("xvatamt", xvatamt);
			jsonObject.put("xaitamt", xaitamt);
			jsonObject.put("xnote", xnote);
			jsonObject.put("xcus", xcus);
			jsonObject.put("wName", ttypess);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\supplierpayments.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=supplierpayments";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	private String call_sendcacus(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {
			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xcus = rs.getString("xcus");
			xorg = rs.getString("xorg");
			xmadd = rs.getString("xmadd");
			xemail = rs.getString("xemail");
			xphone = rs.getString("xphone");
			xfax = rs.getString("xfax");
			xstatuscus = rs.getString("xstatuscus");
			xwh = rs.getString("xwh");
			xpaymentterm = rs.getString("xpaymentterm");
			xdateeff = rs.getString("xdateeff");
			xdateexp = rs.getString("xdateexp");
			xcontact = rs.getString("xcontact");
			xgsup = rs.getString("xgsup");
			xtype = rs.getString("xtype");
			xmobile = rs.getString("xmobile");
			xpaymenttype = rs.getString("xpaymenttype");
			xcusold = rs.getString("xcusold");
			zactive = rs.getString("zactive");
			xcountry = rs.getString("xcountry");
			xprdcounter = rs.getString("xprdcounter");
			xcustype = rs.getString("xcustype");
			xcycle = rs.getString("xcycle");
			xcrperiod = rs.getString("xcrperiod");
			xbank = rs.getString("xbank");
			xbranch = rs.getString("xbranch");
			xacc = rs.getString("xacc");
			xrouting = rs.getString("xrouting");
			xacctype = rs.getString("xacctype");
			xbeneficiary = rs.getString("xbeneficiary");
			xenlistedfee = rs.getString("xenlistedfee");
			xstaff = rs.getString("xstaff");
			xidsup = rs.getString("xidsup");
			xsigndate7 = rs.getString("xsigndate7");
			xcardno = rs.getString("xcardno");
			xbin = rs.getString("xbin");
			xnid = rs.getString("xnid");
			xdiv = rs.getString("xdiv");
			xcuscomptype = rs.getString("xcuscomptype");
			xeffectivity = rs.getString("xeffectivity");
			xdateopening = rs.getString("xdateopening");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xorg", xorg);
			jsonObject.put("xmadd", xmadd);
			jsonObject.put("xemail", xemail);
			jsonObject.put("xphone", xphone);
			jsonObject.put("xfax", xfax);
			jsonObject.put("xstatuscus", xstatuscus);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xpaymentterm", xpaymentterm);
			jsonObject.put("xdateeff", xdateeff);
			jsonObject.put("xdateexp", xdateexp);
			jsonObject.put("xcontact", xcontact);
			jsonObject.put("xgsup", xgsup);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xmobile", xmobile);
			jsonObject.put("xpaymenttype", xpaymenttype);
			jsonObject.put("xcusold", xcusold);
			jsonObject.put("zactive", zactive);
			jsonObject.put("xcountry", xcountry);
			jsonObject.put("xprdcounter", xprdcounter);
			jsonObject.put("xcustype", xcustype);
			jsonObject.put("xcycle", xcycle);
			jsonObject.put("xcrperiod", xcrperiod);
			jsonObject.put("xbank", xbank);
			jsonObject.put("xbranch", xbranch);
			jsonObject.put("xacc", xacc);
			jsonObject.put("xrouting", xrouting);
			jsonObject.put("xacctype", xacctype);
			jsonObject.put("xbeneficiary", xbeneficiary);
			jsonObject.put("xenlistedfee", xenlistedfee);
			jsonObject.put("xstaff", xstaff);
			jsonObject.put("xidsup", xidsup);
			jsonObject.put("xsigndate7", xsigndate7);
			jsonObject.put("xcardno", xcardno);
			jsonObject.put("xbin", xbin);
			jsonObject.put("xnid", xnid);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xcuscomptype", xcuscomptype);
			jsonObject.put("xeffectivity", xeffectivity);
			jsonObject.put("xdateopening", xdateopening);
			jsonObject.put("wName", ttypess);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\cacus.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=cacus";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendxusers(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {

			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zid = rs.getString("zid");
			zemail = rs.getString("zemail");
			xpassword = rs.getString("xpassword");
			xaccess = rs.getString("xaccess");
			xdformat = rs.getString("xdformat");
			xdsep = rs.getString("xdsep");
			zactive = rs.getString("zactive");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			xlastlogdate = rs.getString("xlastlogdate");
			xname = rs.getString("xname");
			zaip = rs.getString("zaip");
			zuip = rs.getString("zuip");
			xwh = rs.getString("xwh");
			xsp = rs.getString("xsp");
			xrole = rs.getString("xrole");
			xoldpass = rs.getString("xoldpass");
			xposition = rs.getString("xposition");
			xpriority = rs.getString("xpriority");
			zscreen = rs.getString("zscreen");

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zid", zid);
			jsonObject.put("zemail", zemail);
			jsonObject.put("xpassword", xpassword);
			jsonObject.put("xaccess", xaccess);
			jsonObject.put("xdformat", xdformat);
			jsonObject.put("xdsep", xdsep);
			jsonObject.put("zactive", zactive);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("xlastlogdate", xlastlogdate);
			jsonObject.put("xname", xname);
			jsonObject.put("zaip", zaip);
			jsonObject.put("zuip", zuip);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xsp", xsp);
			jsonObject.put("xrole", xrole);
			jsonObject.put("xoldpass", xoldpass);
			jsonObject.put("xposition", xposition);
			jsonObject.put("xpriority", xpriority);
			jsonObject.put("zscreen", zscreen);
			jsonObject.put("wName", ttypess);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\xusers.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=xusers";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendXcodes(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {

			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xtype = rs.getString("xtype");
			xcode = rs.getString("xcode");
			xlong = rs.getString("xlong");
			zactive = rs.getString("zactive");
			xacc = rs.getString("xacc");
			xaccvat = rs.getString("xaccvat");
			xaccdisc = rs.getString("xaccdisc");
			xaccait = rs.getString("xaccait");
			xaccret = rs.getString("xaccret");
			xaccpur = rs.getString("xaccpur");
			xaccwo = rs.getString("xaccwo");
			xprops = rs.getString("xprops");
			xmadd = rs.getString("xmadd");
			xphone = rs.getString("xphone");
			xfax = rs.getString("xfax");
			xemail = rs.getString("xemail");
			xarea = rs.getString("xarea");
			xwh = rs.getString("xwh");
			xregion = rs.getString("xregion");
			xfield = rs.getString("xfield");
			xterritory = rs.getString("xterritory");
			xhrc1 = rs.getString("xhrc1");
			xdeptname = rs.getString("xdeptname");
			xtypeobj = rs.getString("xtypeobj");
			xtrcode = rs.getString("xtrcode");
			xtargetshare = rs.getString("xtargetshare");
			xpercent = rs.getString("xpercent");
			xdepmethod = rs.getString("xdepmethod");
			xaccother = rs.getString("xaccother");
			xitemdept = rs.getString("xitemdept");
			xitemsubdept = rs.getString("xitemsubdept");
			xaccsradj = rs.getString("xaccsradj");
			xaccgvadj = rs.getString("xaccgvadj");
			xaccbpadj = rs.getString("xaccbpadj");
			xaccsupptax = rs.getString("xaccsupptax");
			xaccrc = rs.getString("xaccrc");
			xaccsrgainloss = rs.getString("xaccsrgainloss");
			xvatregno = rs.getString("xvatregno");
			xvatarea = rs.getString("xvatarea");
			xdmwh = rs.getString("xdmwh");
			xipaddress = rs.getString("xipaddress");
			xprintername = rs.getString("xprintername");
			xbizunit = rs.getString("xbizunit");
			xbin = rs.getString("xbin");
			xalias = rs.getString("xalias");
			xvatrate = rs.getString("xvatrate");
			zaip = rs.getString("zaip");
			zuip = rs.getString("zuip");
			xaccadj = rs.getString("xaccadj");
			xacccash = rs.getString("xacccash");
			xaccbank = rs.getString("xaccbank");
			xtypestore = rs.getString("xtypestore");
			xgtype = rs.getString("xgtype");

			JSONObject jsonObject = new JSONObject();

			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xtype", xtype);
			jsonObject.put("xcode", xcode);
			jsonObject.put("xlong", xlong);
			jsonObject.put("zactive", zactive);
			jsonObject.put("xacc", xacc);
			jsonObject.put("xaccvat", xaccvat);
			jsonObject.put("xaccdisc", xaccdisc);
			jsonObject.put("xaccait", xaccait);
			jsonObject.put("xaccret", xaccret);
			jsonObject.put("xaccpur", xaccpur);
			jsonObject.put("xaccwo", xaccwo);
			jsonObject.put("xprops", xprops);
			jsonObject.put("xmadd", xmadd);
			jsonObject.put("xphone", xphone);
			jsonObject.put("xfax", xfax);
			jsonObject.put("xemail", xemail);
			jsonObject.put("xarea", xarea);
			jsonObject.put("xwh", xwh);
			jsonObject.put("xregion", xregion);
			jsonObject.put("xfield", xfield);
			jsonObject.put("xterritory", xterritory);
			jsonObject.put("xhrc1", xhrc1);
			jsonObject.put("xdeptname", xdeptname);
			jsonObject.put("xtypeobj", xtypeobj);
			jsonObject.put("xtrcode", xtrcode);
			jsonObject.put("xtargetshare", xtargetshare);
			jsonObject.put("xpercent", xpercent);
			jsonObject.put("xdepmethod", xdepmethod);
			jsonObject.put("xaccother", xaccother);
			jsonObject.put("xitemdept", xitemdept);
			jsonObject.put("xitemsubdept", xitemsubdept);
			jsonObject.put("xaccsradj", xaccsradj);
			jsonObject.put("xaccgvadj", xaccgvadj);
			jsonObject.put("xaccbpadj", xaccbpadj);
			jsonObject.put("xaccsupptax", xaccsupptax);
			jsonObject.put("xaccrc", xaccrc);
			jsonObject.put("xaccsrgainloss", xaccsrgainloss);
			jsonObject.put("xvatregno", xvatregno);
			jsonObject.put("xvatarea", xvatarea);
			jsonObject.put("xdmwh", xdmwh);
			jsonObject.put("xipaddress", xipaddress);
			jsonObject.put("xprintername", xprintername);
			jsonObject.put("xbizunit", xbizunit);
			jsonObject.put("xbin", xbin);
			jsonObject.put("xalias", xalias);
			jsonObject.put("xvatrate", xvatrate);
			jsonObject.put("zaip", zaip);
			jsonObject.put("zuip", zuip);
			jsonObject.put("xaccadj", xaccadj);
			jsonObject.put("xacccash", xacccash);
			jsonObject.put("xaccbank", xaccbank);
			jsonObject.put("xtypestore", xtypestore);
			jsonObject.put("xgtype", xgtype);

			jsonObject.put("wName", ttypess);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\xcodes.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=xcodes";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendpdmst(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {

			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xstaff = rs.getString("xstaff");
			xname = rs.getString("xname");
			xnamef = rs.getString("xnamef");
			xnamem = rs.getString("xnamem");
			xmadd = rs.getString("xmadd");
			xpadd = rs.getString("xpadd");
			xbirthdate = rs.getString("xbirthdate");
			xsex = rs.getString("xsex");
			xmstat = rs.getString("xmstat");
			xdeptname = rs.getString("xdeptname");
			xdesignation = rs.getString("xdesignation");
			xdatejoin = rs.getString("xdatejoin");
			xgrade = rs.getString("xgrade");
			xemail = rs.getString("xemail");
			xenddate = rs.getString("xenddate");
			xretdate = rs.getString("xretdate");
			xempstatus = rs.getString("xempstatus");
			xlocation = rs.getString("xlocation");
			xdistrict = rs.getString("xdistrict");
			xdatecom = rs.getString("xdatecom");
			xposition = rs.getString("xposition");
			xempcategory = rs.getString("xempcategory");
			xstatus = rs.getString("xstatus");
			xsid = rs.getString("xsid");
			ximage = rs.getString("ximage");
			xbloodgroup = rs.getString("xbloodgroup");
			xphone = rs.getString("xphone");
			xhrc1 = rs.getString("xhrc1");
			xhrc2 = rs.getString("xhrc2");
			xhrc3 = rs.getString("xhrc3");
			xhrc4 = rs.getString("xhrc4");
			xplan = rs.getString("xplan");
			xemname = rs.getString("xemname");
			xrelation = rs.getString("xrelation");
			xemcmobile = rs.getString("xemcmobile");
			xmobile = rs.getString("xmobile");
			xnimage = rs.getString("xnimage");
			xreligion = rs.getString("xreligion");
			xemptype = rs.getString("xemptype");
			zactive = rs.getString("zactive");
			xsignature = rs.getString("xsignature");
			xfile = rs.getString("xfile");
			xempposition = rs.getString("xempposition");
			xsignatory = rs.getString("xsignatory");
			xdatacheckstatus = rs.getString("xdatacheckstatus");

			JSONObject jsonObject = new JSONObject();

			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xstaff", xstaff);
			jsonObject.put("xname", xname);
			jsonObject.put("xnamef", xnamef);
			jsonObject.put("xnamem", xnamem);
			jsonObject.put("xmadd", xmadd);
			jsonObject.put("xpadd", xpadd);
			jsonObject.put("xbirthdate", xbirthdate);
			jsonObject.put("xsex", xsex);
			jsonObject.put("xmstat", xmstat);
			jsonObject.put("xdeptname", xdeptname);
			jsonObject.put("xdesignation", xdesignation);
			jsonObject.put("xdatejoin", xdatejoin);
			jsonObject.put("xgrade", xgrade);
			jsonObject.put("xemail", xemail);
			jsonObject.put("xenddate", xenddate);
			jsonObject.put("xretdate", xretdate);
			jsonObject.put("xempstatus", xempstatus);
			jsonObject.put("xlocation", xlocation);
			jsonObject.put("xdistrict", xdistrict);
			jsonObject.put("xdatecom", xdatecom);
			jsonObject.put("xposition", xposition);
			jsonObject.put("xempcategory", xempcategory);
			jsonObject.put("xstatus", xstatus);
			jsonObject.put("xsid", xsid);
			jsonObject.put("ximage", ximage);
			jsonObject.put("xbloodgroup", xbloodgroup);
			jsonObject.put("xphone", xphone);
			jsonObject.put("xhrc1", xhrc1);
			jsonObject.put("xhrc2", xhrc2);
			jsonObject.put("xhrc3", xhrc3);
			jsonObject.put("xhrc4", xhrc4);
			jsonObject.put("xplan", xplan);
			jsonObject.put("xemname", xemname);
			jsonObject.put("xrelation", xrelation);
			jsonObject.put("xemcmobile", xemcmobile);
			jsonObject.put("xmobile", xmobile);
			jsonObject.put("xnimage", xnimage);
			jsonObject.put("xreligion", xreligion);
			jsonObject.put("xemptype", xemptype);
			jsonObject.put("zactive", zactive);
			jsonObject.put("xsignature", xsignature);
			jsonObject.put("xfile", xfile);
			jsonObject.put("xempposition", xempposition);
			jsonObject.put("xsignatory", xsignatory);
			jsonObject.put("xdatacheckstatus", xdatacheckstatus);

			jsonObject.put("wName", ttypess);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\pdmst.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=pdmst";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String call_sendcasupitem(ResultSet rs, String endpointUrl, String ttypess) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		jsonArray.clear();
		String result = "";

		while (rs.next()) {

			ztime = rs.getString("ztime");
			zutime = rs.getString("zutime");
			zauserid = rs.getString("zauserid");
			zuuserid = rs.getString("zuuserid");
			zid = rs.getString("zid");
			xcus = rs.getString("xcus");
			xitem = rs.getString("xitem");
			zactive = rs.getString("zactive");
			xstatus = rs.getString("xstatus");
			xdiv = rs.getString("xdiv");
			xyesno = rs.getString("xyesno");
			xvatrate = rs.getString("xvatrate");
			xdatacheckstatus = rs.getString("xdatacheckstatus");
			xbrand = rs.getString("xbrand");
			xcost = rs.getString("xcost");
			xrate = rs.getString("xrate");

			JSONObject jsonObject = new JSONObject();

			jsonObject.put("ztime", ztime);
			jsonObject.put("zutime", zutime);
			jsonObject.put("zauserid", zauserid);
			jsonObject.put("zuuserid", zuuserid);
			jsonObject.put("zid", zid);
			jsonObject.put("xcus", xcus);
			jsonObject.put("xitem", xitem);
			jsonObject.put("zactive", zactive);
			jsonObject.put("xstatus", xstatus);
			jsonObject.put("xdiv", xdiv);
			jsonObject.put("xyesno", xyesno);
			jsonObject.put("xvatrate", xvatrate);
			jsonObject.put("xdatacheckstatus", xdatacheckstatus);
			jsonObject.put("xbrand", xbrand);
			jsonObject.put("xcost", xcost);
			jsonObject.put("xrate", xrate);

			jsonObject.put("wName", ttypess);
			jsonArray.add(jsonObject);
		}

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("data", jsonArray);

		String filePath = "E:\\jsondata\\casupitem.json";
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(jsonObject2.toJSONString());
			file.flush();
			String destinationURL = "http://192.168.9.117:8080/zab/JsonFileReceiver?filename=casupitem";
			SendJsonFile(filePath, destinationURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	// Method to send JSON file to the server
	private static void SendJsonFile(String jsonFilePath, String destinationURL) throws SQLException, IOException {
		HttpURLConnection connection = null;
		OutputStream outputStream = null;
		FileInputStream fileInputStream = null;

		try {
			// Open connection to the destination URL
			URL url = new URL(destinationURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");

			// Open a stream to send the JSON file
			outputStream = connection.getOutputStream();
			fileInputStream = new FileInputStream(new File(jsonFilePath));

			// Read the file and send it to the server
			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = fileInputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
			outputStream.flush();
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
			} else {
				InputStream errorStream = connection.getErrorStream();
				if (errorStream != null) {
					BufferedReader reader = new BufferedReader(new InputStreamReader(errorStream));
					String line;
					while ((line = reader.readLine()) != null) {
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close streams and disconnect
			if (fileInputStream != null) {
				fileInputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
			if (connection != null) {
				connection.disconnect();
			}
		}
	}

}
