package me.localx.icons.straight.outline

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

public val Icons.Outline.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9995f, 23.0001f)
                horizontalLineTo(5.4995f)
                curveTo(4.2755f, 23.0016f, 3.0861f, 22.5941f, 2.1202f, 21.8422f)
                curveTo(1.1544f, 21.0903f, 0.4675f, 20.0372f, 0.1687f, 18.8502f)
                curveTo(-0.1301f, 17.6632f, -0.0236f, 16.4104f, 0.4712f, 15.2909f)
                curveTo(0.9659f, 14.1713f, 1.8207f, 13.2492f, 2.8995f, 12.6711f)
                curveTo(2.3075f, 11.5381f, 1.9987f, 10.2785f, 1.9995f, 9.0001f)
                curveTo(2.0055f, 7.0384f, 2.732f, 5.1472f, 4.041f, 3.6861f)
                curveTo(5.35f, 2.225f, 7.1502f, 1.2958f, 9.0995f, 1.0751f)
                curveTo(11.0487f, 0.8544f, 13.0111f, 1.3576f, 14.6137f, 2.4891f)
                curveTo(16.2162f, 3.6205f, 17.3472f, 5.3014f, 17.7915f, 7.2121f)
                curveTo(19.6987f, 7.66f, 21.3753f, 8.7922f, 22.5033f, 10.394f)
                curveTo(23.6313f, 11.9958f, 24.1323f, 13.9558f, 23.9114f, 15.9024f)
                curveTo(23.6904f, 17.849f, 22.7629f, 19.6469f, 21.3046f, 20.9551f)
                curveTo(19.8463f, 22.2633f, 17.9586f, 22.991f, 15.9995f, 23.0001f)
                close()
                moveTo(9.9995f, 3.0001f)
                curveTo(8.4087f, 3.0017f, 6.8835f, 3.6343f, 5.7586f, 4.7592f)
                curveTo(4.6338f, 5.8841f, 4.0011f, 7.4093f, 3.9995f, 9.0001f)
                curveTo(3.998f, 10.284f, 4.4127f, 11.5338f, 5.1815f, 12.5621f)
                lineTo(6.0635f, 13.7551f)
                lineTo(4.6275f, 14.1261f)
                curveTo(3.8023f, 14.3363f, 3.0823f, 14.8408f, 2.6032f, 15.5448f)
                curveTo(2.124f, 16.2488f, 1.9187f, 17.1036f, 2.0259f, 17.9484f)
                curveTo(2.133f, 18.7932f, 2.5453f, 19.5697f, 3.1851f, 20.1318f)
                curveTo(3.8248f, 20.6938f, 4.648f, 21.0026f, 5.4995f, 21.0001f)
                horizontalLineTo(15.9995f)
                curveTo(17.5112f, 20.9854f, 18.9617f, 20.4006f, 20.0608f, 19.3626f)
                curveTo(21.1599f, 18.3246f, 21.8267f, 16.9099f, 21.9277f, 15.4015f)
                curveTo(22.0288f, 13.8932f, 21.5568f, 12.4022f, 20.606f, 11.2268f)
                curveTo(19.6552f, 10.0515f, 18.2958f, 9.2784f, 16.7995f, 9.0621f)
                lineTo(16.0425f, 8.9621f)
                lineTo(15.9425f, 8.2041f)
                curveTo(15.7478f, 6.765f, 15.0386f, 5.4452f, 13.9461f, 4.4886f)
                curveTo(12.8536f, 3.5319f, 11.4517f, 3.0032f, 9.9995f, 3.0001f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
