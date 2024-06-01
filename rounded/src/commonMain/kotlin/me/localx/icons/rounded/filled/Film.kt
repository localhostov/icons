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

public val Icons.Filled.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0511f, 0.0f)
                    horizontalLineTo(5.0511f)
                    curveTo(3.7255f, 0.0016f, 2.4546f, 0.5289f, 1.5173f, 1.4662f)
                    curveTo(0.58f, 2.4036f, 0.0527f, 3.6744f, 0.0511f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(0.0527f, 20.3256f, 0.58f, 21.5964f, 1.5173f, 22.5338f)
                    curveTo(2.4546f, 23.4711f, 3.7255f, 23.9984f, 5.0511f, 24.0f)
                    horizontalLineTo(19.0511f)
                    curveTo(20.3767f, 23.9984f, 21.6475f, 23.4711f, 22.5849f, 22.5338f)
                    curveTo(23.5222f, 21.5964f, 24.0495f, 20.3256f, 24.0511f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(24.0495f, 3.6744f, 23.5222f, 2.4036f, 22.5849f, 1.4662f)
                    curveTo(21.6475f, 0.5289f, 20.3767f, 0.0016f, 19.0511f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(20.0511f, 11.0f)
                    horizontalLineTo(22.0511f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(20.0511f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(20.0511f, 9.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(22.0511f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(20.0511f)
                    close()
                    moveTo(4.0511f, 13.0f)
                    horizontalLineTo(2.0511f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(4.0511f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(6.0001f, 13.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(6.0001f)
                    close()
                    moveTo(4.0511f, 9.0f)
                    horizontalLineTo(2.0511f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(4.0511f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(2.0511f, 15.0f)
                    horizontalLineTo(4.0511f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(2.0511f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(20.0511f, 15.0f)
                    horizontalLineTo(22.0511f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(20.0511f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(22.0511f, 5.0f)
                    horizontalLineTo(20.0511f)
                    verticalLineTo(2.184f)
                    curveTo(20.634f, 2.3901f, 21.139f, 2.7712f, 21.497f, 3.2753f)
                    curveTo(21.855f, 3.7794f, 22.0485f, 4.3817f, 22.0511f, 5.0f)
                    close()
                    moveTo(4.0511f, 2.184f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(2.0511f)
                    curveTo(2.0536f, 4.3817f, 2.2472f, 3.7794f, 2.6052f, 3.2753f)
                    curveTo(2.9632f, 2.7712f, 3.4682f, 2.3901f, 4.0511f, 2.184f)
                    close()
                    moveTo(2.0511f, 19.0f)
                    horizontalLineTo(4.0511f)
                    verticalLineTo(21.816f)
                    curveTo(3.4682f, 21.6099f, 2.9632f, 21.2288f, 2.6052f, 20.7247f)
                    curveTo(2.2472f, 20.2206f, 2.0536f, 19.6183f, 2.0511f, 19.0f)
                    close()
                    moveTo(20.0511f, 21.816f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(22.0511f)
                    curveTo(22.0485f, 19.6183f, 21.855f, 20.2206f, 21.497f, 20.7247f)
                    curveTo(21.139f, 21.2288f, 20.634f, 21.6099f, 20.0511f, 21.816f)
                    close()
                }
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
