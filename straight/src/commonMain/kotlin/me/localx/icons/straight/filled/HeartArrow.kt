package me.localx.icons.straight.filled

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

public val Icons.Filled.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 18.0f)
                    verticalLineTo(20.586f)
                    lineTo(18.94f, 17.526f)
                    curveTo(21.063f, 15.281f, 23.0f, 12.534f, 23.0f, 9.95f)
                    curveTo(23.0555f, 8.4327f, 22.5082f, 6.9552f, 21.4776f, 5.8403f)
                    curveTo(20.447f, 4.7254f, 19.0169f, 4.0637f, 17.5f, 4.0f)
                    curveTo(16.6125f, 4.0471f, 15.7471f, 4.2936f, 14.968f, 4.7212f)
                    curveTo(14.1889f, 5.1488f, 13.5162f, 5.7466f, 13.0f, 6.47f)
                    curveTo(12.4838f, 5.7465f, 11.8112f, 5.1487f, 11.0321f, 4.7211f)
                    curveTo(10.253f, 4.2935f, 9.3875f, 4.047f, 8.5f, 4.0f)
                    curveTo(7.6422f, 4.0019f, 6.7986f, 4.2196f, 6.047f, 4.633f)
                    lineTo(1.414f, 0.0f)
                    lineTo(0.0f, 1.414f)
                    lineTo(4.484f, 5.9f)
                    curveTo(3.5195f, 7.0283f, 2.9928f, 8.4657f, 3.0f, 9.95f)
                    curveTo(3.0f, 15.35f, 11.458f, 21.497f, 12.422f, 22.18f)
                    lineTo(13.0f, 22.589f)
                    lineTo(13.578f, 22.18f)
                    curveTo(14.9595f, 21.1827f, 16.2765f, 20.0988f, 17.521f, 18.935f)
                    lineTo(20.586f, 22.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0f)
                    curveTo(22.5304f, 24.0f, 23.0391f, 23.7893f, 23.4142f, 23.4142f)
                    curveTo(23.7893f, 23.0391f, 24.0f, 22.5304f, 24.0f, 22.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
