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

public val Icons.Bold.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.4999f, 0.0f)
                    horizontalLineTo(15.3789f)
                    lineTo(9.9999f, 5.379f)
                    verticalLineTo(11.5f)
                    curveTo(7.1849f, 13.544f, 3.3999f, 16.321f, 2.8879f, 16.83f)
                    curveTo(2.5124f, 17.2078f, 2.2436f, 17.6783f, 2.1087f, 18.1936f)
                    curveTo(1.9739f, 18.7089f, 1.9777f, 19.2507f, 2.1199f, 19.764f)
                    lineTo(0.0199f, 21.864f)
                    lineTo(2.1409f, 23.98f)
                    lineTo(4.2409f, 21.88f)
                    curveTo(4.7543f, 22.0298f, 5.2987f, 22.0373f, 5.816f, 21.9017f)
                    curveTo(6.3333f, 21.7661f, 6.8041f, 21.4924f, 7.1779f, 21.11f)
                    curveTo(7.6869f, 20.601f, 10.4639f, 16.81f, 12.5079f, 13.998f)
                    horizontalLineTo(18.6229f)
                    lineTo(23.9999f, 8.621f)
                    verticalLineTo(3.5f)
                    curveTo(23.9999f, 2.5717f, 23.6311f, 1.6815f, 22.9747f, 1.0251f)
                    curveTo(22.3184f, 0.3687f, 21.4281f, 0.0f, 20.4999f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(20.9999f, 7.379f)
                    lineTo(17.3789f, 11.0f)
                    horizontalLineTo(15.1209f)
                    lineTo(19.5609f, 6.561f)
                    lineTo(17.4389f, 4.439f)
                    lineTo(12.9999f, 8.879f)
                    verticalLineTo(6.621f)
                    lineTo(16.6209f, 3.0f)
                    horizontalLineTo(20.4999f)
                    curveTo(20.6325f, 3.0f, 20.7597f, 3.0527f, 20.8534f, 3.1465f)
                    curveTo(20.9472f, 3.2402f, 20.9999f, 3.3674f, 20.9999f, 3.5f)
                    verticalLineTo(7.379f)
                    close()
                }
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
