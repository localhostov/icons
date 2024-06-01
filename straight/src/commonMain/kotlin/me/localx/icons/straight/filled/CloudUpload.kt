package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.792f, 7.2121f)
                curveTo(17.3476f, 5.3014f, 16.2167f, 3.6205f, 14.6142f, 2.4891f)
                curveTo(13.0116f, 1.3576f, 11.0492f, 0.8544f, 9.1f, 1.0751f)
                curveTo(7.1507f, 1.2958f, 5.3505f, 2.225f, 4.0415f, 3.6861f)
                curveTo(2.7325f, 5.1472f, 2.006f, 7.0384f, 2.0f, 9.0001f)
                curveTo(1.9986f, 10.2785f, 2.3074f, 11.5383f, 2.9f, 12.6711f)
                curveTo(1.8211f, 13.2492f, 0.9664f, 14.1713f, 0.4716f, 15.2909f)
                curveTo(-0.0231f, 16.4104f, -0.1296f, 17.6632f, 0.1692f, 18.8502f)
                curveTo(0.468f, 20.0372f, 1.1549f, 21.0903f, 2.1207f, 21.8422f)
                curveTo(3.0866f, 22.5941f, 4.276f, 23.0016f, 5.5f, 23.0001f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.4141f)
                lineTo(11.707f, 17.7071f)
                lineTo(10.293f, 16.2931f)
                lineTo(13.586f, 13.0001f)
                curveTo(13.9611f, 12.6251f, 14.4697f, 12.4145f, 15.0f, 12.4145f)
                curveTo(15.5304f, 12.4145f, 16.039f, 12.6251f, 16.414f, 13.0001f)
                lineTo(19.707f, 16.2931f)
                lineTo(18.293f, 17.7071f)
                lineTo(16.0f, 15.4141f)
                verticalLineTo(23.0001f)
                curveTo(17.9591f, 22.991f, 19.8468f, 22.2633f, 21.3051f, 20.9551f)
                curveTo(22.7634f, 19.6469f, 23.6909f, 17.849f, 23.9119f, 15.9024f)
                curveTo(24.1328f, 13.9558f, 23.6318f, 11.9958f, 22.5038f, 10.394f)
                curveTo(21.3758f, 8.7922f, 19.6992f, 7.66f, 17.792f, 7.2121f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
