package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.118f, 0.0595f)
                    curveTo(15.9019f, 0.316f, 18.5082f, 1.5387f, 20.485f, 3.5155f)
                    curveTo(22.4618f, 5.4924f, 23.6845f, 8.0987f, 23.941f, 10.8825f)
                    curveTo(22.4689f, 11.1018f, 20.9658f, 10.9735f, 19.5522f, 10.5078f)
                    curveTo(18.1385f, 10.042f, 16.8535f, 9.2519f, 15.8f, 8.2005f)
                    curveTo(14.7484f, 7.1472f, 13.958f, 5.8622f, 13.4923f, 4.4485f)
                    curveTo(13.0266f, 3.0348f, 12.8984f, 1.5317f, 13.118f, 0.0595f)
                    close()
                    moveTo(22.552f, 13.0005f)
                    curveTo(20.9174f, 13.0013f, 19.3014f, 12.6544f, 17.8111f, 11.983f)
                    curveTo(16.3208f, 11.3115f, 14.9903f, 10.3309f, 13.9078f, 9.106f)
                    curveTo(12.8254f, 7.8812f, 12.0158f, 6.4402f, 11.5328f, 4.8786f)
                    curveTo(11.0497f, 3.317f, 10.9042f, 1.6706f, 11.106f, 0.0485f)
                    curveTo(8.238f, 0.2539f, 5.5404f, 1.4872f, 3.5088f, 3.522f)
                    curveTo(1.4771f, 5.5567f, 0.2479f, 8.2562f, 0.047f, 11.1245f)
                    curveTo(1.7882f, 10.8828f, 3.5618f, 11.048f, 5.2285f, 11.6072f)
                    curveTo(6.8951f, 12.1663f, 8.4094f, 13.1042f, 9.6525f, 14.3472f)
                    curveTo(10.8956f, 15.5902f, 11.8337f, 17.1045f, 12.393f, 18.7711f)
                    curveTo(12.9523f, 20.4377f, 13.1176f, 22.2113f, 12.876f, 23.9525f)
                    curveTo(15.7423f, 23.7523f, 18.4402f, 22.5251f, 20.4746f, 20.496f)
                    curveTo(22.509f, 18.467f, 23.7433f, 15.7723f, 23.951f, 12.9065f)
                    curveTo(23.487f, 12.9661f, 23.0198f, 12.9975f, 22.552f, 13.0005f)
                    close()
                    moveTo(8.239f, 15.7615f)
                    curveTo(7.1817f, 14.7064f, 5.8886f, 13.9181f, 4.4664f, 13.4617f)
                    curveTo(3.0442f, 13.0052f, 1.5338f, 12.8938f, 0.06f, 13.1365f)
                    curveTo(0.3213f, 15.9125f, 1.5431f, 18.5103f, 3.5147f, 20.4818f)
                    curveTo(5.4863f, 22.4534f, 8.084f, 23.6752f, 10.86f, 23.9365f)
                    curveTo(11.103f, 22.4637f, 10.9921f, 20.9541f, 10.5363f, 19.5326f)
                    curveTo(10.0806f, 18.1111f, 9.2931f, 16.8185f, 8.239f, 15.7615f)
                    close()
                }
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
