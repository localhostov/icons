package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 14.0f)
                    curveTo(0.0f, 14.7956f, 0.3161f, 15.5587f, 0.8787f, 16.1213f)
                    curveTo(1.4413f, 16.6839f, 2.2043f, 17.0f, 3.0f, 17.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9996f, 14.0f)
                    lineTo(21.9996f, 3.0f)
                    horizontalLineTo(7.9996f)
                    verticalLineTo(17.0f)
                    lineTo(10.3406f, 21.681f)
                    curveTo(10.4809f, 21.9841f, 10.6855f, 22.253f, 10.9402f, 22.4691f)
                    curveTo(11.195f, 22.6851f, 11.4937f, 22.8431f, 11.8156f, 22.932f)
                    curveTo(12.1717f, 23.0266f, 12.5457f, 23.031f, 12.9039f, 22.9447f)
                    curveTo(13.2621f, 22.8585f, 13.5931f, 22.6842f, 13.867f, 22.4378f)
                    curveTo(14.1409f, 22.1914f, 14.349f, 21.8806f, 14.4726f, 21.5336f)
                    curveTo(14.5961f, 21.1865f, 14.6312f, 20.8141f, 14.5746f, 20.45f)
                    lineTo(13.9996f, 17.0f)
                    horizontalLineTo(23.9996f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
