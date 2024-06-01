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

public val Icons.Filled.Gallery: ImageVector
    get() {
        if (_gallery != null) {
            return _gallery!!
        }
        _gallery = Builder(name = "Gallery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 3.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(8.0f)
                    curveTo(21.9984f, 6.6744f, 21.4711f, 5.4036f, 20.5338f, 4.4662f)
                    curveTo(19.5964f, 3.5289f, 18.3256f, 3.0016f, 17.0f, 3.0f)
                    horizontalLineTo(8.0f)
                    curveTo(8.0f, 2.2043f, 8.3161f, 1.4413f, 8.8787f, 0.8787f)
                    curveTo(9.4413f, 0.3161f, 10.2044f, 0.0f, 11.0f, 0.0f)
                    lineTo(21.0f, 0.0f)
                    curveTo(21.7956f, 0.0f, 22.5587f, 0.3161f, 23.1213f, 0.8787f)
                    curveTo(23.6839f, 1.4413f, 24.0f, 2.2043f, 24.0f, 3.0f)
                    close()
                    moveTo(17.0f, 5.0f)
                    horizontalLineTo(7.0f)
                    curveTo(6.2043f, 5.0f, 5.4413f, 5.3161f, 4.8787f, 5.8787f)
                    curveTo(4.3161f, 6.4413f, 4.0f, 7.2043f, 4.0f, 8.0f)
                    horizontalLineTo(13.0f)
                    curveTo(14.3256f, 8.0016f, 15.5964f, 8.5289f, 16.5338f, 9.4662f)
                    curveTo(17.4711f, 10.4036f, 17.9984f, 11.6744f, 18.0f, 13.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(8.0f)
                    curveTo(20.0f, 7.2043f, 19.6839f, 6.4413f, 19.1213f, 5.8787f)
                    curveTo(18.5587f, 5.3161f, 17.7956f, 5.0f, 17.0f, 5.0f)
                    close()
                    moveTo(16.0f, 13.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.0f)
                    curveTo(0.0f, 12.2044f, 0.3161f, 11.4413f, 0.8787f, 10.8787f)
                    curveTo(1.4413f, 10.3161f, 2.2043f, 10.0f, 3.0f, 10.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.7956f, 10.0f, 14.5587f, 10.3161f, 15.1213f, 10.8787f)
                    curveTo(15.6839f, 11.4413f, 16.0f, 12.2044f, 16.0f, 13.0f)
                    close()
                    moveTo(3.0f, 14.0f)
                    curveTo(3.0f, 14.1978f, 3.0587f, 14.3911f, 3.1685f, 14.5556f)
                    curveTo(3.2784f, 14.72f, 3.4346f, 14.8482f, 3.6173f, 14.9239f)
                    curveTo(3.8f, 14.9996f, 4.0011f, 15.0194f, 4.1951f, 14.9808f)
                    curveTo(4.3891f, 14.9422f, 4.5672f, 14.847f, 4.7071f, 14.7071f)
                    curveTo(4.847f, 14.5673f, 4.9422f, 14.3891f, 4.9808f, 14.1951f)
                    curveTo(5.0194f, 14.0011f, 4.9996f, 13.8f, 4.9239f, 13.6173f)
                    curveTo(4.8482f, 13.4346f, 4.72f, 13.2784f, 4.5556f, 13.1685f)
                    curveTo(4.3911f, 13.0586f, 4.1978f, 13.0f, 4.0f, 13.0f)
                    curveTo(3.7348f, 13.0f, 3.4804f, 13.1054f, 3.2929f, 13.2929f)
                    curveTo(3.1054f, 13.4804f, 3.0f, 13.7348f, 3.0f, 14.0f)
                    close()
                    moveTo(14.0f, 12.293f)
                    lineTo(10.0f, 16.293f)
                    lineTo(8.053f, 14.345f)
                    lineTo(2.0f, 19.533f)
                    verticalLineTo(22.166f)
                    lineTo(7.947f, 17.066f)
                    lineTo(10.0f, 19.121f)
                    lineTo(14.0f, 15.121f)
                    verticalLineTo(12.293f)
                    close()
                }
            }
        }
        .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null
