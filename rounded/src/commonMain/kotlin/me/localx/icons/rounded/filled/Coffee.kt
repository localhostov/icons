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

public val Icons.Filled.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0001f, 4.0f)
                    curveTo(23.0001f, 4.5304f, 22.7893f, 5.0391f, 22.4143f, 5.4142f)
                    curveTo(22.0392f, 5.7893f, 21.5305f, 6.0f, 21.0001f, 6.0f)
                    horizontalLineTo(3.0001f)
                    curveTo(2.4696f, 6.0f, 1.9609f, 5.7893f, 1.5859f, 5.4142f)
                    curveTo(1.2108f, 5.0391f, 1.0001f, 4.5304f, 1.0001f, 4.0f)
                    curveTo(1.0001f, 3.4696f, 1.2108f, 2.9609f, 1.5859f, 2.5858f)
                    curveTo(1.9609f, 2.2107f, 2.4696f, 2.0f, 3.0001f, 2.0f)
                    horizontalLineTo(4.1841f)
                    curveTo(4.3901f, 1.4171f, 4.7713f, 0.9121f, 5.2754f, 0.5541f)
                    curveTo(5.7794f, 0.1961f, 6.3818f, 0.0026f, 7.0001f, 0.0f)
                    lineTo(17.0001f, 0.0f)
                    curveTo(17.6183f, 0.0026f, 18.2207f, 0.1961f, 18.7248f, 0.5541f)
                    curveTo(19.2288f, 0.9121f, 19.61f, 1.4171f, 19.8161f, 2.0f)
                    horizontalLineTo(21.0001f)
                    curveTo(21.5305f, 2.0f, 22.0392f, 2.2107f, 22.4143f, 2.5858f)
                    curveTo(22.7893f, 2.9609f, 23.0001f, 3.4696f, 23.0001f, 4.0f)
                    close()
                    moveTo(10.0001f, 16.0f)
                    curveTo(10.1051f, 19.954f, 13.8951f, 19.953f, 14.0001f, 16.0f)
                    curveTo(13.9001f, 12.046f, 10.1051f, 12.047f, 10.0001f, 16.0f)
                    close()
                    moveTo(8.0811f, 15.0f)
                    curveTo(8.9731f, 9.713f, 15.0291f, 9.716f, 15.9191f, 15.0f)
                    horizontalLineTo(21.0071f)
                    lineTo(21.7421f, 9.124f)
                    curveTo(21.7596f, 8.9833f, 21.7471f, 8.8405f, 21.7053f, 8.7051f)
                    curveTo(21.6635f, 8.5696f, 21.5933f, 8.4446f, 21.4995f, 8.3383f)
                    curveTo(21.4057f, 8.232f, 21.2904f, 8.1469f, 21.1612f, 8.0885f)
                    curveTo(21.032f, 8.0302f, 20.8918f, 8.0f, 20.7501f, 8.0f)
                    horizontalLineTo(3.2501f)
                    curveTo(3.1083f, 8.0f, 2.9682f, 8.0302f, 2.8389f, 8.0885f)
                    curveTo(2.7097f, 8.1469f, 2.5944f, 8.232f, 2.5006f, 8.3383f)
                    curveTo(2.4068f, 8.4446f, 2.3366f, 8.5696f, 2.2948f, 8.7051f)
                    curveTo(2.253f, 8.8405f, 2.2405f, 8.9833f, 2.2581f, 9.124f)
                    lineTo(2.9921f, 15.0f)
                    horizontalLineTo(8.0811f)
                    close()
                    moveTo(15.9191f, 17.0f)
                    curveTo(15.0271f, 22.287f, 8.9721f, 22.284f, 8.0811f, 17.0f)
                    horizontalLineTo(3.2421f)
                    lineTo(3.5701f, 19.62f)
                    curveTo(3.7228f, 20.8285f, 4.3108f, 21.94f, 5.224f, 22.7462f)
                    curveTo(6.1372f, 23.5524f, 7.3129f, 23.9982f, 8.5311f, 24.0f)
                    horizontalLineTo(15.4691f)
                    curveTo(16.6872f, 23.9982f, 17.8629f, 23.5524f, 18.7761f, 22.7462f)
                    curveTo(19.6893f, 21.94f, 20.2773f, 20.8285f, 20.4301f, 19.62f)
                    lineTo(20.7571f, 17.0f)
                    horizontalLineTo(15.9191f)
                    close()
                }
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
