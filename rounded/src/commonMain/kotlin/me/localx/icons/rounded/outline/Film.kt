package me.localx.icons.rounded.outline

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

public val Icons.Outline.Film: ImageVector
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
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 0.0016f, 2.4036f, 0.5289f, 1.4662f, 1.4662f)
                    curveTo(0.5289f, 2.4036f, 0.0016f, 3.6744f, 0.0f, 5.0f)
                    lineTo(0.0f, 19.0f)
                    curveTo(0.0016f, 20.3256f, 0.5289f, 21.5964f, 1.4662f, 22.5338f)
                    curveTo(2.4036f, 23.4711f, 3.6744f, 23.9984f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9984f, 21.5964f, 23.4711f, 22.5338f, 22.5338f)
                    curveTo(23.4711f, 21.5964f, 23.9984f, 20.3256f, 24.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(23.9984f, 3.6744f, 23.4711f, 2.4036f, 22.5338f, 1.4662f)
                    curveTo(21.5964f, 0.5289f, 20.3256f, 0.0016f, 19.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(20.0f, 11.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(20.0f, 9.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(20.0f)
                    close()
                    moveTo(18.0f, 11.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(4.0f, 13.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(4.0f, 9.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(2.0f, 15.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(6.0f, 13.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(20.0f, 15.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(22.0f, 5.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(2.184f)
                    curveTo(20.5829f, 2.3901f, 21.0879f, 2.7712f, 21.4459f, 3.2753f)
                    curveTo(21.8039f, 3.7794f, 21.9974f, 4.3817f, 22.0f, 5.0f)
                    close()
                    moveTo(4.0f, 2.184f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(2.0f)
                    curveTo(2.0026f, 4.3817f, 2.1961f, 3.7794f, 2.5541f, 3.2753f)
                    curveTo(2.9121f, 2.7712f, 3.4171f, 2.3901f, 4.0f, 2.184f)
                    close()
                    moveTo(2.0f, 19.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(21.816f)
                    curveTo(3.4171f, 21.6099f, 2.9121f, 21.2288f, 2.5541f, 20.7247f)
                    curveTo(2.1961f, 20.2206f, 2.0026f, 19.6183f, 2.0f, 19.0f)
                    close()
                    moveTo(20.0f, 21.816f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(22.0f)
                    curveTo(21.9974f, 19.6183f, 21.8039f, 20.2206f, 21.4459f, 20.7247f)
                    curveTo(21.0879f, 21.2288f, 20.5829f, 21.6099f, 20.0f, 21.816f)
                    close()
                }
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
