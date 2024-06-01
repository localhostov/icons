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

public val Icons.Bold.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.768f, 1.1466f)
                    curveTo(13.5358f, 0.9144f, 13.2602f, 0.7302f, 12.9569f, 0.6045f)
                    curveTo(12.6535f, 0.4789f, 12.3284f, 0.4142f, 12.0f, 0.4142f)
                    curveTo(11.6716f, 0.4142f, 11.3465f, 0.4789f, 11.0431f, 0.6045f)
                    curveTo(10.7398f, 0.7302f, 10.4642f, 0.9144f, 10.232f, 1.1466f)
                    lineTo(0.0f, 11.3797f)
                    verticalLineTo(20.9997f)
                    curveTo(0.0f, 21.7953f, 0.3161f, 22.5584f, 0.8787f, 23.121f)
                    curveTo(1.4413f, 23.6836f, 2.2043f, 23.9997f, 3.0f, 23.9997f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 23.9997f, 22.5587f, 23.6836f, 23.1213f, 23.121f)
                    curveTo(23.6839f, 22.5584f, 24.0f, 21.7953f, 24.0f, 20.9997f)
                    verticalLineTo(11.3797f)
                    lineTo(13.768f, 1.1466f)
                    close()
                    moveTo(21.0f, 20.9997f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(17.8177f)
                    curveTo(16.0f, 16.8051f, 15.5977f, 15.8339f, 14.8817f, 15.1179f)
                    curveTo(14.1657f, 14.4019f, 13.1946f, 13.9997f, 12.182f, 13.9997f)
                    horizontalLineTo(11.818f)
                    curveTo(10.8054f, 13.9997f, 9.8343f, 14.4019f, 9.1183f, 15.1179f)
                    curveTo(8.4023f, 15.8339f, 8.0f, 16.8051f, 8.0f, 17.8177f)
                    verticalLineTo(20.9997f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(12.6217f)
                    lineTo(12.0f, 3.6216f)
                    lineTo(21.0f, 12.6217f)
                    verticalLineTo(20.9997f)
                    close()
                }
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
