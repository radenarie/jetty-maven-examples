<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/header.jsp"></jsp:include>
<c:if test="${Profile == null}">
    <center>
        <h2>Data tidak ditemukan</h2>
    </center>
</c:if>
<c:if test="${Profile != null}">
    <form action="update" method="post">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <h2>Edit Profile</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <button type="button" class="close" onclick="window.location.href='/pview';">&times;</button>
            </div>
        </div>
        <input type="hidden" id="id" name="id" value="${Profile.id}">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="txtNama">Nama</label>
                <input type="text" class="form-control" id="txtNama" name="nama" placeholder="Nama Lengkap"
                       value="<c:out value="${Profile.namaLengkap}"/>"
                       required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="txtAlamat">Alamat</label>
                <input type="text" class="form-control" id="txtAlamat" name="alamat" placeholder="Alamat"
                       value="<c:out value="${Profile.alamat}"/>"
                       required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="txtUmur">Umur</label>
                <input type="number" class="form-control" id="txtUmur" name="umur"
                       value="<c:out value="${Profile.umur}"/>" required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label for="cmbJk">Jenis Kelamin</label>
                <select class="form-control" id="cmbJk" name="jk">
                    <option value="Pria" <c:if test="${Profile.jenisKelamin == 'Pria'}">selected</c:if> >Pria</option>
                    <option value="Wanita" <c:if test="${Profile.jenisKelamin == 'Wanita'}">selected</c:if> >Wanita</option>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-2">
                <button type="submit" class="btn btn-success">Simpan</button>
            </div>
            <div class="form-group col-md-2">
                <button type="button" class="btn btn-default" onclick="window.location.href='/pview';">Batal</button>
            </div>
        </div>
    </form>
</c:if>
<jsp:include page="/footer.jsp"></jsp:include>
