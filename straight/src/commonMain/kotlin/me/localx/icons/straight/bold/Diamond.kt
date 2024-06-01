package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.3652f, 6.1339f)
                    lineTo(20.0002f, 1.4159f)
                    curveTo(19.6839f, 0.9741f, 19.2668f, 0.614f, 18.7835f, 0.3657f)
                    curveTo(18.3001f, 0.1173f, 17.7646f, -0.0122f, 17.2212f, -0.0121f)
                    horizontalLineTo(6.7792f)
                    curveTo(6.2366f, -0.0114f, 5.7021f, 0.1185f, 5.2197f, 0.3668f)
                    curveTo(4.7373f, 0.6151f, 4.321f, 0.9748f, 4.0052f, 1.4159f)
                    lineTo(0.6342f, 6.1349f)
                    curveTo(0.2077f, 6.7396f, -0.0121f, 7.4658f, 0.0075f, 8.2055f)
                    curveTo(0.0271f, 8.9452f, 0.2852f, 9.6587f, 0.7432f, 10.2399f)
                    lineTo(12.0002f, 24.1099f)
                    lineTo(23.2712f, 10.2219f)
                    curveTo(23.7241f, 9.6411f, 23.9778f, 8.9298f, 23.9947f, 8.1935f)
                    curveTo(24.0116f, 7.4571f, 23.7909f, 6.735f, 23.3652f, 6.1339f)
                    close()
                    moveTo(3.0762f, 7.8779f)
                    lineTo(6.4462f, 3.1599f)
                    curveTo(6.4841f, 3.107f, 6.5341f, 3.0638f, 6.592f, 3.0339f)
                    curveTo(6.6499f, 3.004f, 6.714f, 2.9882f, 6.7792f, 2.9879f)
                    horizontalLineTo(9.7002f)
                    lineTo(8.2752f, 8.4999f)
                    horizontalLineTo(15.7252f)
                    lineTo(14.3002f, 2.9879f)
                    horizontalLineTo(17.2232f)
                    curveTo(17.2883f, 2.9882f, 17.3525f, 3.004f, 17.4104f, 3.0339f)
                    curveTo(17.4683f, 3.0638f, 17.5182f, 3.107f, 17.5562f, 3.1599f)
                    lineTo(20.9252f, 7.8769f)
                    curveTo(20.9752f, 7.9454f, 21.0026f, 8.0278f, 21.0035f, 8.1126f)
                    curveTo(21.0044f, 8.1974f, 20.9787f, 8.2804f, 20.9302f, 8.3499f)
                    lineTo(20.8082f, 8.4999f)
                    horizontalLineTo(15.7252f)
                    lineTo(12.0002f, 19.3479f)
                    lineTo(8.2752f, 8.4999f)
                    horizontalLineTo(3.1942f)
                    lineTo(3.0872f, 8.3679f)
                    curveTo(3.033f, 8.2983f, 3.0026f, 8.213f, 3.0007f, 8.1247f)
                    curveTo(2.9987f, 8.0365f, 3.0252f, 7.9499f, 3.0762f, 7.8779f)
                    close()
                }
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
