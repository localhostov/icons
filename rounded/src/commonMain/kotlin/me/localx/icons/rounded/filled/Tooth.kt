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

public val Icons.Filled.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.9998f, -7.0E-4f)
                    curveTo(16.6708f, -3.0E-4f, 15.3499f, 0.2072f, 14.0848f, 0.6143f)
                    curveTo(13.4132f, 0.8472f, 12.7102f, 0.977f, 11.9998f, 0.9993f)
                    curveTo(11.2893f, 0.977f, 10.5864f, 0.8472f, 9.9148f, 0.6143f)
                    curveTo(8.6496f, 0.2073f, 7.3288f, -2.0E-4f, 5.9998f, -7.0E-4f)
                    curveTo(5.2038f, -0.0308f, 4.4101f, 0.1037f, 3.6685f, 0.3946f)
                    curveTo(2.9269f, 0.6854f, 2.2533f, 1.1263f, 1.69f, 1.6896f)
                    curveTo(1.1267f, 2.2529f, 0.6859f, 2.9264f, 0.395f, 3.668f)
                    curveTo(0.1042f, 4.4096f, -0.0304f, 5.2033f, -2.0E-4f, 5.9993f)
                    curveTo(-2.0E-4f, 12.4423f, 3.3548f, 18.7853f, 5.7678f, 22.8843f)
                    curveTo(6.022f, 23.3131f, 6.41f, 23.6466f, 6.8721f, 23.8334f)
                    curveTo(7.3342f, 24.0202f, 7.8449f, 24.0501f, 8.3257f, 23.9185f)
                    curveTo(8.8065f, 23.7868f, 9.2307f, 23.5009f, 9.5331f, 23.1046f)
                    curveTo(9.8356f, 22.7084f, 9.9995f, 22.2238f, 9.9998f, 21.7253f)
                    verticalLineTo(15.1063f)
                    curveTo(9.989f, 14.6195f, 10.1498f, 14.1443f, 10.454f, 13.7641f)
                    curveTo(10.7582f, 13.3838f, 11.1864f, 13.1227f, 11.6638f, 13.0263f)
                    curveTo(11.9509f, 12.9774f, 12.2451f, 12.9918f, 12.5261f, 13.0684f)
                    curveTo(12.807f, 13.145f, 13.0678f, 13.2821f, 13.2903f, 13.47f)
                    curveTo(13.5128f, 13.6579f, 13.6915f, 13.8921f, 13.8141f, 14.1562f)
                    curveTo(13.9366f, 14.4204f, 14.0f, 14.7081f, 13.9998f, 14.9993f)
                    verticalLineTo(21.7253f)
                    curveTo(14.0f, 22.2238f, 14.164f, 22.7084f, 14.4664f, 23.1046f)
                    curveTo(14.7689f, 23.5009f, 15.1931f, 23.7868f, 15.6739f, 23.9185f)
                    curveTo(16.1546f, 24.0501f, 16.6654f, 24.0202f, 17.1275f, 23.8334f)
                    curveTo(17.5896f, 23.6466f, 17.9776f, 23.3131f, 18.2318f, 22.8843f)
                    curveTo(20.6458f, 18.7843f, 23.9998f, 12.4413f, 23.9998f, 5.9993f)
                    curveTo(24.03f, 5.2033f, 23.8954f, 4.4096f, 23.6046f, 3.668f)
                    curveTo(23.3137f, 2.9264f, 22.8728f, 2.2529f, 22.3096f, 1.6896f)
                    curveTo(21.7463f, 1.1263f, 21.0727f, 0.6854f, 20.3311f, 0.3946f)
                    curveTo(19.5895f, 0.1037f, 18.7958f, -0.0308f, 17.9998f, -7.0E-4f)
                    close()
                }
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
