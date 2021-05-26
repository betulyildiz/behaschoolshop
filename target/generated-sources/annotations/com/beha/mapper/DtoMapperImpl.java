package com.beha.mapper;

import com.beha.dao.model.Address;
import com.beha.dao.model.Customer;
import com.beha.dao.model.Grade;
import com.beha.dao.model.Lesson;
import com.beha.dao.model.Order;
import com.beha.dao.model.OrderDetail;
import com.beha.dao.model.OrderHistory;
import com.beha.dao.model.OrderStatus;
import com.beha.dao.model.Product;
import com.beha.dao.model.ProductImage;
import com.beha.dao.model.School;
import com.beha.dao.model.ShopList;
import com.beha.dao.model.Teacher;
import com.beha.dao.model.User;
import com.beha.dto.AddressDTO;
import com.beha.dto.CustomerDTO;
import com.beha.dto.EmailPasswordRequestDTO;
import com.beha.dto.GradeDTO;
import com.beha.dto.LessonDTO;
import com.beha.dto.OrderDTO;
import com.beha.dto.OrderDetailDTO;
import com.beha.dto.OrderHistoryDTO;
import com.beha.dto.OrderProductDetailDTO;
import com.beha.dto.OrderStatusDTO;
import com.beha.dto.ProductDTO;
import com.beha.dto.ProductImageDTO;
import com.beha.dto.SchoolDTO;
import com.beha.dto.ShopListDTO;
import com.beha.dto.TeacherDTO;
import com.beha.dto.TeacherLessonDTO;
import com.beha.dto.TeacherShopListDTO;
import com.beha.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-26T17:42:00+0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class DtoMapperImpl implements DtoMapper {

    @Override
    public List<SchoolDTO> toSchoolDTOList(List<School> schoolList) {
        if ( schoolList == null ) {
            return null;
        }

        List<SchoolDTO> list = new ArrayList<SchoolDTO>( schoolList.size() );
        for ( School school : schoolList ) {
            list.add( schoolToSchoolDTO( school ) );
        }

        return list;
    }

    @Override
    public List<OrderHistoryDTO> toOrderHistoryDTOList(List<OrderHistory> orderHistoryList) {
        if ( orderHistoryList == null ) {
            return null;
        }

        List<OrderHistoryDTO> list = new ArrayList<OrderHistoryDTO>( orderHistoryList.size() );
        for ( OrderHistory orderHistory : orderHistoryList ) {
            list.add( orderHistoryToOrderHistoryDTO( orderHistory ) );
        }

        return list;
    }

    @Override
    public List<CustomerDTO> toCustomerDTOList(List<Customer> customerList) {
        if ( customerList == null ) {
            return null;
        }

        List<CustomerDTO> list = new ArrayList<CustomerDTO>( customerList.size() );
        for ( Customer customer : customerList ) {
            list.add( toCustomerDTO( customer ) );
        }

        return list;
    }

    @Override
    public List<GradeDTO> toGradeDTOList(List<Grade> gradeList) {
        if ( gradeList == null ) {
            return null;
        }

        List<GradeDTO> list = new ArrayList<GradeDTO>( gradeList.size() );
        for ( Grade grade : gradeList ) {
            list.add( toGradeDTO( grade ) );
        }

        return list;
    }

    @Override
    public List<ShopListDTO> toShopListDTOList(List<ShopList> shopList) {
        if ( shopList == null ) {
            return null;
        }

        List<ShopListDTO> list = new ArrayList<ShopListDTO>( shopList.size() );
        for ( ShopList shopList1 : shopList ) {
            list.add( toShopListDTO( shopList1 ) );
        }

        return list;
    }

    @Override
    public List<ShopList> toShopListList(List<ShopListDTO> shopListDTO) {
        if ( shopListDTO == null ) {
            return null;
        }

        List<ShopList> list = new ArrayList<ShopList>( shopListDTO.size() );
        for ( ShopListDTO shopListDTO1 : shopListDTO ) {
            list.add( shopListDTOToShopList( shopListDTO1 ) );
        }

        return list;
    }

    @Override
    public ShopListDTO toShopListDTO(ShopList shopList) {
        if ( shopList == null ) {
            return null;
        }

        ShopListDTO shopListDTO = new ShopListDTO();

        shopListDTO.setId( shopList.getId() );
        shopListDTO.setQuantity( shopList.getQuantity() );
        shopListDTO.setPrice( shopList.getPrice() );
        shopListDTO.setProduct( toProductDTO( shopList.getProduct() ) );

        return shopListDTO;
    }

    @Override
    public List<TeacherLessonDTO> toTeacherLessonDTOList(List<Lesson> lessons) {
        if ( lessons == null ) {
            return null;
        }

        List<TeacherLessonDTO> list = new ArrayList<TeacherLessonDTO>( lessons.size() );
        for ( Lesson lesson : lessons ) {
            list.add( lessonToTeacherLessonDTO( lesson ) );
        }

        return list;
    }

    @Override
    public List<LessonDTO> toLessonDTOList(List<Lesson> lessonList) {
        if ( lessonList == null ) {
            return null;
        }

        List<LessonDTO> list = new ArrayList<LessonDTO>( lessonList.size() );
        for ( Lesson lesson : lessonList ) {
            list.add( toLessonDTO( lesson ) );
        }

        return list;
    }

    @Override
    public List<TeacherDTO> toTeacherDTOList(List<Teacher> teacher) {
        if ( teacher == null ) {
            return null;
        }

        List<TeacherDTO> list = new ArrayList<TeacherDTO>( teacher.size() );
        for ( Teacher teacher1 : teacher ) {
            list.add( toTeacherDTO( teacher1 ) );
        }

        return list;
    }

    @Override
    public List<ProductDTO> toProductDTOList(List<Product> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( productList.size() );
        for ( Product product : productList ) {
            list.add( toProductDTO( product ) );
        }

        return list;
    }

    @Override
    public List<AddressDTO> toAddressDTOList(List<Address> addressList) {
        if ( addressList == null ) {
            return null;
        }

        List<AddressDTO> list = new ArrayList<AddressDTO>( addressList.size() );
        for ( Address address : addressList ) {
            list.add( toAddressDTO( address ) );
        }

        return list;
    }

    @Override
    public List<OrderDTO> toOrderDTOList(List<Order> orderList) {
        if ( orderList == null ) {
            return null;
        }

        List<OrderDTO> list = new ArrayList<OrderDTO>( orderList.size() );
        for ( Order order : orderList ) {
            list.add( toOrderDTO( order ) );
        }

        return list;
    }

    @Override
    public List<OrderDetailDTO> toOrderDetailDTOList(List<OrderDetail> orderDetailList) {
        if ( orderDetailList == null ) {
            return null;
        }

        List<OrderDetailDTO> list = new ArrayList<OrderDetailDTO>( orderDetailList.size() );
        for ( OrderDetail orderDetail : orderDetailList ) {
            list.add( orderDetailToOrderDetailDTO( orderDetail ) );
        }

        return list;
    }

    @Override
    public List<OrderProductDetailDTO> toOrderProductDetailDTOList(List<OrderDetail> orderProductDetailList) {
        if ( orderProductDetailList == null ) {
            return null;
        }

        List<OrderProductDetailDTO> list = new ArrayList<OrderProductDetailDTO>( orderProductDetailList.size() );
        for ( OrderDetail orderDetail : orderProductDetailList ) {
            list.add( orderDetailToOrderProductDetailDTO( orderDetail ) );
        }

        return list;
    }

    @Override
    public CustomerDTO toCustomerDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setName( customer.getName() );
        customerDTO.setSurname( customer.getSurname() );
        customerDTO.setEmail( customer.getEmail() );
        customerDTO.setAddress( toAddressDTOList( customer.getAddress() ) );

        return customerDTO;
    }

    @Override
    public Customer toCustomer(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setName( customerDTO.getName() );
        customer.setSurname( customerDTO.getSurname() );
        customer.setEmail( customerDTO.getEmail() );
        customer.setAddress( addressDTOListToAddressList( customerDTO.getAddress() ) );

        return customer;
    }

    @Override
    public ProductDTO toProductDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setBarcode( product.getBarcode() );
        productDTO.setName( product.getName() );
        productDTO.setProductImages( productImageListToProductImageDTOList( product.getProductImages() ) );

        return productDTO;
    }

    @Override
    public Product toProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setBarcode( productDTO.getBarcode() );
        product.setName( productDTO.getName() );
        product.setProductImages( productImageDTOListToProductImageList( productDTO.getProductImages() ) );

        return product;
    }

    @Override
    public OrderDTO toOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setTotal( order.getTotal() );
        orderDTO.setStudentName( order.getStudentName() );
        orderDTO.setCustomer( toCustomerDTO( order.getCustomer() ) );
        orderDTO.setCommissionAmount( order.getCommissionAmount() );

        return orderDTO;
    }

    @Override
    public Order toOrder(OrderDTO OrderDTO) {
        if ( OrderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setTotal( OrderDTO.getTotal() );
        order.setCommissionAmount( OrderDTO.getCommissionAmount() );
        order.setStudentName( OrderDTO.getStudentName() );
        order.setCustomer( toCustomer( OrderDTO.getCustomer() ) );

        return order;
    }

    @Override
    public LessonDTO toLessonDTO(Lesson lesson) {
        if ( lesson == null ) {
            return null;
        }

        LessonDTO lessonDTO = new LessonDTO();

        lessonDTO.setId( lesson.getId() );
        lessonDTO.setName( lesson.getName() );
        lessonDTO.setShopLists( toShopListDTOList( lesson.getShopLists() ) );
        lessonDTO.setTeacher( toTeacherDTO( lesson.getTeacher() ) );

        return lessonDTO;
    }

    @Override
    public Lesson toLesson(LessonDTO LessonDTO) {
        if ( LessonDTO == null ) {
            return null;
        }

        Lesson lesson = new Lesson();

        lesson.setShopLists( toShopListList( LessonDTO.getShopLists() ) );
        lesson.setId( LessonDTO.getId() );
        lesson.setName( LessonDTO.getName() );
        lesson.setTeacher( toTeacher( LessonDTO.getTeacher() ) );

        return lesson;
    }

    @Override
    public Address toAddress(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDTO.getId() );
        address.setAddressName( addressDTO.getAddressName() );
        address.setAddressDescription( addressDTO.getAddressDescription() );
        address.setProvince( addressDTO.getProvince() );
        address.setCounty( addressDTO.getCounty() );
        address.setZipCode( addressDTO.getZipCode() );
        address.setTelephone( addressDTO.getTelephone() );

        return address;
    }

    @Override
    public AddressDTO toAddressDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        addressDTO.setAddressName( address.getAddressName() );
        addressDTO.setAddressDescription( address.getAddressDescription() );
        addressDTO.setCounty( address.getCounty() );
        addressDTO.setProvince( address.getProvince() );
        addressDTO.setZipCode( address.getZipCode() );
        addressDTO.setTelephone( address.getTelephone() );

        return addressDTO;
    }

    @Override
    public Teacher toTeacher(EmailPasswordRequestDTO emailPasswordRequestDTO) {
        if ( emailPasswordRequestDTO == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        teacher.setEmail( emailPasswordRequestDTO.getEmail() );
        teacher.setPassword( emailPasswordRequestDTO.getPassword() );

        return teacher;
    }

    @Override
    public Teacher toTeacher(TeacherDTO teacherDTO) {
        if ( teacherDTO == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        teacher.setId( teacherDTO.getId() );
        teacher.setName( teacherDTO.getName() );
        teacher.setEmail( teacherDTO.getEmail() );
        teacher.setPassword( teacherDTO.getPassword() );

        return teacher;
    }

    @Override
    public TeacherDTO toTeacherDTO(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setEmail( teacher.getEmail() );
        teacherDTO.setPassword( teacher.getPassword() );
        teacherDTO.setName( teacher.getName() );
        if ( teacher.getId() != null ) {
            teacherDTO.setId( teacher.getId() );
        }

        return teacherDTO;
    }

    @Override
    public UserDTO toUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setEmail( user.getEmail() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setName( user.getName() );
        userDTO.setSurName( user.getSurName() );

        return userDTO;
    }

    @Override
    public User toUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setName( userDTO.getName() );
        user.setSurName( userDTO.getSurName() );
        user.setEmail( userDTO.getEmail() );
        user.setPassword( userDTO.getPassword() );

        return user;
    }

    @Override
    public Grade toGrade(GradeDTO gradeDTO) {
        if ( gradeDTO == null ) {
            return null;
        }

        Grade grade = new Grade();

        grade.setId( gradeDTO.getId() );
        grade.setName( gradeDTO.getName() );
        grade.setLessons( lessonDTOListToLessonList( gradeDTO.getLessons() ) );

        return grade;
    }

    @Override
    public GradeDTO toGradeDTO(Grade grade) {
        if ( grade == null ) {
            return null;
        }

        GradeDTO gradeDTO = new GradeDTO();

        gradeDTO.setId( grade.getId() );
        gradeDTO.setName( grade.getName() );
        gradeDTO.setLessons( toLessonDTOList( grade.getLessons() ) );

        return gradeDTO;
    }

    protected SchoolDTO schoolToSchoolDTO(School school) {
        if ( school == null ) {
            return null;
        }

        SchoolDTO schoolDTO = new SchoolDTO();

        schoolDTO.setId( school.getId() );
        schoolDTO.setName( school.getName() );
        schoolDTO.setSubdomain( school.getSubdomain() );
        schoolDTO.setCampus( school.getCampus() );
        schoolDTO.setCity( school.getCity() );
        schoolDTO.setTown( school.getTown() );
        schoolDTO.setCommissionRate( school.getCommissionRate() );

        return schoolDTO;
    }

    protected OrderStatusDTO orderStatusToOrderStatusDTO(OrderStatus orderStatus) {
        if ( orderStatus == null ) {
            return null;
        }

        OrderStatusDTO orderStatusDTO = new OrderStatusDTO();

        if ( orderStatus.getValue() != null ) {
            orderStatusDTO.setValue( orderStatus.getValue() );
        }
        orderStatusDTO.setDescription( orderStatus.getDescription() );

        return orderStatusDTO;
    }

    protected OrderHistoryDTO orderHistoryToOrderHistoryDTO(OrderHistory orderHistory) {
        if ( orderHistory == null ) {
            return null;
        }

        OrderHistoryDTO orderHistoryDTO = new OrderHistoryDTO();

        orderHistoryDTO.setId( orderHistory.getId() );
        orderHistoryDTO.setCreatedDate( orderHistory.getCreatedDate() );
        orderHistoryDTO.setOrderStatus( orderStatusToOrderStatusDTO( orderHistory.getOrderStatus() ) );
        orderHistoryDTO.setComment( orderHistory.getComment() );
        orderHistoryDTO.setNotice( orderHistory.isNotice() );

        return orderHistoryDTO;
    }

    protected ShopList shopListDTOToShopList(ShopListDTO shopListDTO) {
        if ( shopListDTO == null ) {
            return null;
        }

        ShopList shopList = new ShopList();

        shopList.setId( shopListDTO.getId() );
        shopList.setProduct( toProduct( shopListDTO.getProduct() ) );
        shopList.setQuantity( shopListDTO.getQuantity() );
        if ( shopListDTO.getPrice() != null ) {
            shopList.setPrice( shopListDTO.getPrice() );
        }

        return shopList;
    }

    protected TeacherShopListDTO shopListToTeacherShopListDTO(ShopList shopList) {
        if ( shopList == null ) {
            return null;
        }

        TeacherShopListDTO teacherShopListDTO = new TeacherShopListDTO();

        teacherShopListDTO.setQuantity( shopList.getQuantity() );
        teacherShopListDTO.setPrice( shopList.getPrice() );

        return teacherShopListDTO;
    }

    protected List<TeacherShopListDTO> shopListListToTeacherShopListDTOList(List<ShopList> list) {
        if ( list == null ) {
            return null;
        }

        List<TeacherShopListDTO> list1 = new ArrayList<TeacherShopListDTO>( list.size() );
        for ( ShopList shopList : list ) {
            list1.add( shopListToTeacherShopListDTO( shopList ) );
        }

        return list1;
    }

    protected TeacherLessonDTO lessonToTeacherLessonDTO(Lesson lesson) {
        if ( lesson == null ) {
            return null;
        }

        TeacherLessonDTO teacherLessonDTO = new TeacherLessonDTO();

        teacherLessonDTO.setId( lesson.getId() );
        teacherLessonDTO.setName( lesson.getName() );
        teacherLessonDTO.setShopLists( shopListListToTeacherShopListDTOList( lesson.getShopLists() ) );

        return teacherLessonDTO;
    }

    protected OrderDetailDTO orderDetailToOrderDetailDTO(OrderDetail orderDetail) {
        if ( orderDetail == null ) {
            return null;
        }

        OrderDetailDTO orderDetailDTO = new OrderDetailDTO();

        orderDetailDTO.setProduct( toProductDTO( orderDetail.getProduct() ) );
        orderDetailDTO.setQuantity( orderDetail.getQuantity() );
        orderDetailDTO.setPrice( orderDetail.getPrice() );

        return orderDetailDTO;
    }

    protected OrderProductDetailDTO orderDetailToOrderProductDetailDTO(OrderDetail orderDetail) {
        if ( orderDetail == null ) {
            return null;
        }

        OrderProductDetailDTO orderProductDetailDTO = new OrderProductDetailDTO();

        orderProductDetailDTO.setQuantity( orderDetail.getQuantity() );
        orderProductDetailDTO.setPrice( orderDetail.getPrice() );

        return orderProductDetailDTO;
    }

    protected List<Address> addressDTOListToAddressList(List<AddressDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Address> list1 = new ArrayList<Address>( list.size() );
        for ( AddressDTO addressDTO : list ) {
            list1.add( toAddress( addressDTO ) );
        }

        return list1;
    }

    protected ProductImageDTO productImageToProductImageDTO(ProductImage productImage) {
        if ( productImage == null ) {
            return null;
        }

        ProductImageDTO productImageDTO = new ProductImageDTO();

        productImageDTO.setFilePath( productImage.getFilePath() );

        return productImageDTO;
    }

    protected List<ProductImageDTO> productImageListToProductImageDTOList(List<ProductImage> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductImageDTO> list1 = new ArrayList<ProductImageDTO>( list.size() );
        for ( ProductImage productImage : list ) {
            list1.add( productImageToProductImageDTO( productImage ) );
        }

        return list1;
    }

    protected ProductImage productImageDTOToProductImage(ProductImageDTO productImageDTO) {
        if ( productImageDTO == null ) {
            return null;
        }

        ProductImage productImage = new ProductImage();

        productImage.setFilePath( productImageDTO.getFilePath() );

        return productImage;
    }

    protected List<ProductImage> productImageDTOListToProductImageList(List<ProductImageDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductImage> list1 = new ArrayList<ProductImage>( list.size() );
        for ( ProductImageDTO productImageDTO : list ) {
            list1.add( productImageDTOToProductImage( productImageDTO ) );
        }

        return list1;
    }

    protected List<Lesson> lessonDTOListToLessonList(List<LessonDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Lesson> list1 = new ArrayList<Lesson>( list.size() );
        for ( LessonDTO lessonDTO : list ) {
            list1.add( toLesson( lessonDTO ) );
        }

        return list1;
    }
}
