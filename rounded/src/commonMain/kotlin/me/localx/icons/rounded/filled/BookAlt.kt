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

public val Icons.Filled.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.2f, 2.163f)
                    curveTo(21.6299f, 1.6874f, 20.9611f, 1.3447f, 20.242f, 1.1598f)
                    curveTo(19.523f, 0.9749f, 18.7718f, 0.9524f, 18.043f, 1.094f)
                    lineTo(16.279f, 1.526f)
                    curveTo(15.3584f, 1.6947f, 14.5262f, 2.1809f, 13.9271f, 2.8999f)
                    curveTo(13.3279f, 3.6188f, 12.9999f, 4.5251f, 13.0f, 5.461f)
                    verticalLineTo(20.928f)
                    curveTo(12.3369f, 21.025f, 11.6631f, 21.025f, 11.0f, 20.928f)
                    verticalLineTo(5.461f)
                    curveTo(11.0033f, 4.5338f, 10.6828f, 3.6344f, 10.0939f, 2.9182f)
                    curveTo(9.5049f, 2.202f, 8.6844f, 1.7139f, 7.774f, 1.538f)
                    lineTo(5.9f, 1.082f)
                    curveTo(5.1792f, 0.9501f, 4.4381f, 0.9783f, 3.7294f, 1.1645f)
                    curveTo(3.0206f, 1.3507f, 2.3615f, 1.6905f, 1.7986f, 2.1597f)
                    curveTo(1.2357f, 2.6289f, 0.7828f, 3.2161f, 0.472f, 3.8797f)
                    curveTo(0.1612f, 4.5434f, 0.0f, 5.2672f, 0.0f, 6.0f)
                    lineTo(0.0f, 16.793f)
                    curveTo(1.0E-4f, 17.9638f, 0.411f, 19.0975f, 1.1611f, 19.9964f)
                    curveTo(1.9113f, 20.8953f, 2.9531f, 21.5025f, 4.105f, 21.712f)
                    lineTo(10.391f, 22.855f)
                    curveTo(11.455f, 23.0484f, 12.545f, 23.0484f, 13.609f, 22.855f)
                    lineTo(19.9f, 21.712f)
                    curveTo(21.051f, 21.5014f, 22.0916f, 20.8938f, 22.8408f, 19.995f)
                    curveTo(23.5899f, 19.0962f, 24.0002f, 17.9631f, 24.0f, 16.793f)
                    verticalLineTo(6.0f)
                    curveTo(24.0005f, 5.2675f, 23.8394f, 4.5438f, 23.5283f, 3.8806f)
                    curveTo(23.2171f, 3.2174f, 22.7636f, 2.631f, 22.2f, 2.163f)
                    close()
                }
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
