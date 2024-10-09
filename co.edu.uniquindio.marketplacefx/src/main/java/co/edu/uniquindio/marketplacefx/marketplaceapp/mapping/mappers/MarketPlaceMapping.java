package co.edu.uniquindio.marketplacefx.marketplaceapp.mapping.mappers;

import co.edu.uniquindio.marketplacefx.marketplaceapp.mapping.dto.VendedorDTO;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Vendedor;
import co.edu.uniquindio.marketplacefx.marketplaceapp.service.IMarketPlaceMapping;

import java.util.ArrayList;
import java.util.List;

public class MarketPlaceMapping implements IMarketPlaceMapping {
    @Override
    public List<VendedorDTO> getVendedorDTO(List<Vendedor> listaVendedores) {
        if (listaVendedores == null){
            return null;
        }
        List<VendedorDTO> listaVendedoresDto = new ArrayList<VendedorDTO>(listaVendedores.size());
        for (Vendedor vendedor : listaVendedores) {
            listaVendedoresDto.add(vendorToVendedorDto(vendedor));
        }
        return listaVendedoresDto;
    }

    @Override
    public VendedorDTO vendorToVendedorDto(Vendedor vendedor) {
        return new VendedorDTO(
                vendedor.getNombres(),
                vendedor.getApellidos(),
                vendedor.getCedula(),
                vendedor.getDireccion(),
                vendedor.getUsuario(),
                vendedor.getContraseña());
    }

    @Override
    public Vendedor vendedorDtoToVendedor(VendedorDTO vendedorDTO) {
        return (Vendedor) Vendedor.builder()
                .nombres(vendedorDTO.nombres())
                .apellidos(vendedorDTO.apellidos())
                .cedula(vendedorDTO.cedula())
                .direccion(vendedorDTO.direccion())
                .usuario(vendedorDTO.usuario())
                .contraseña(vendedorDTO.contrasena())
                .build();
    }
}
