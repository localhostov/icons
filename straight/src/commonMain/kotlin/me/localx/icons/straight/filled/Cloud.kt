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

public val Icons.Filled.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7915f, 7.2121f)
                curveTo(17.3472f, 5.3014f, 16.2162f, 3.6205f, 14.6137f, 2.4891f)
                curveTo(13.0111f, 1.3576f, 11.0487f, 0.8544f, 9.0995f, 1.0751f)
                curveTo(7.1502f, 1.2958f, 5.35f, 2.225f, 4.041f, 3.6861f)
                curveTo(2.732f, 5.1472f, 2.0055f, 7.0384f, 1.9995f, 9.0001f)
                curveTo(1.9987f, 10.2785f, 2.3075f, 11.5381f, 2.8995f, 12.6711f)
                curveTo(1.8207f, 13.2492f, 0.9659f, 14.1713f, 0.4712f, 15.2909f)
                curveTo(-0.0236f, 16.4104f, -0.1301f, 17.6632f, 0.1687f, 18.8502f)
                curveTo(0.4675f, 20.0372f, 1.1544f, 21.0903f, 2.1202f, 21.8422f)
                curveTo(3.0861f, 22.5941f, 4.2755f, 23.0016f, 5.4995f, 23.0001f)
                horizontalLineTo(15.9995f)
                curveTo(17.9586f, 22.991f, 19.8463f, 22.2633f, 21.3046f, 20.9551f)
                curveTo(22.7629f, 19.6469f, 23.6904f, 17.849f, 23.9114f, 15.9024f)
                curveTo(24.1323f, 13.9558f, 23.6313f, 11.9958f, 22.5033f, 10.394f)
                curveTo(21.3753f, 8.7922f, 19.6987f, 7.66f, 17.7915f, 7.2121f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
