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

public val Icons.Filled.BoxAlt: ImageVector
    get() {
        if (_boxAlt != null) {
            return _boxAlt!!
        }
        _boxAlt = Builder(name = "BoxAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 6.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(6.0f)
                    curveTo(14.0f, 6.5304f, 13.7893f, 7.0391f, 13.4142f, 7.4142f)
                    curveTo(13.0391f, 7.7893f, 12.5304f, 8.0f, 12.0f, 8.0f)
                    curveTo(11.4696f, 8.0f, 10.9609f, 7.7893f, 10.5858f, 7.4142f)
                    curveTo(10.2107f, 7.0391f, 10.0f, 6.5304f, 10.0f, 6.0f)
                    close()
                    moveTo(16.0f, 5.0f)
                    horizontalLineTo(24.0f)
                    curveTo(23.9984f, 3.6744f, 23.4711f, 2.4036f, 22.5338f, 1.4662f)
                    curveTo(21.5964f, 0.5289f, 20.3256f, 0.0016f, 19.0f, 0.0f)
                    lineTo(16.0f, 0.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(8.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 0.0016f, 2.4036f, 0.5289f, 1.4662f, 1.4662f)
                    curveTo(0.5289f, 2.4036f, 0.0016f, 3.6744f, 0.0f, 5.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(24.0f, 7.0f)
                    verticalLineTo(19.0f)
                    curveTo(23.9984f, 20.3256f, 23.4711f, 21.5964f, 22.5338f, 22.5338f)
                    curveTo(21.5964f, 23.4711f, 20.3256f, 23.9984f, 19.0f, 24.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 23.9984f, 2.4036f, 23.4711f, 1.4662f, 22.5338f)
                    curveTo(0.5289f, 21.5964f, 0.0016f, 20.3256f, 0.0f, 19.0f)
                    lineTo(0.0f, 7.0f)
                    horizontalLineTo(8.142f)
                    curveTo(8.3603f, 7.8576f, 8.8581f, 8.618f, 9.5567f, 9.1611f)
                    curveTo(10.2554f, 9.7042f, 11.1151f, 9.9991f, 12.0f, 9.9991f)
                    curveTo(12.8849f, 9.9991f, 13.7446f, 9.7042f, 14.4433f, 9.1611f)
                    curveTo(15.1419f, 8.618f, 15.6397f, 7.8576f, 15.858f, 7.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(20.0f, 19.0f)
                    curveTo(20.0f, 18.7348f, 19.8946f, 18.4804f, 19.7071f, 18.2929f)
                    curveTo(19.5196f, 18.1054f, 19.2652f, 18.0f, 19.0f, 18.0f)
                    horizontalLineTo(16.0f)
                    curveTo(15.7348f, 18.0f, 15.4804f, 18.1054f, 15.2929f, 18.2929f)
                    curveTo(15.1054f, 18.4804f, 15.0f, 18.7348f, 15.0f, 19.0f)
                    curveTo(15.0f, 19.2652f, 15.1054f, 19.5196f, 15.2929f, 19.7071f)
                    curveTo(15.4804f, 19.8946f, 15.7348f, 20.0f, 16.0f, 20.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.2652f, 20.0f, 19.5196f, 19.8946f, 19.7071f, 19.7071f)
                    curveTo(19.8946f, 19.5196f, 20.0f, 19.2652f, 20.0f, 19.0f)
                    close()
                }
            }
        }
        .build()
        return _boxAlt!!
    }

private var _boxAlt: ImageVector? = null
