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

public val Icons.Filled.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.293f, 15.707f)
                    lineTo(20.005f, 13.419f)
                    lineTo(21.419f, 12.005f)
                    lineTo(23.707f, 14.293f)
                    lineTo(22.293f, 15.707f)
                    close()
                    moveTo(23.707f, 5.707f)
                    lineTo(22.293f, 4.293f)
                    lineTo(20.043f, 6.543f)
                    lineTo(21.457f, 7.957f)
                    lineTo(23.707f, 5.707f)
                    close()
                    moveTo(24.0f, 9.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(8.37f, 17.0f)
                    horizontalLineTo(2.739f)
                    lineTo(5.85f, 24.0f)
                    horizontalLineTo(7.25f)
                    curveTo(7.7082f, 23.9997f, 8.1591f, 23.8851f, 8.5618f, 23.6664f)
                    curveTo(8.9645f, 23.4477f, 9.3062f, 23.1319f, 9.5559f, 22.7477f)
                    curveTo(9.8056f, 22.3635f, 9.9554f, 21.923f, 9.9918f, 21.4663f)
                    curveTo(10.0281f, 21.0095f, 9.9498f, 20.5509f, 9.764f, 20.132f)
                    lineTo(8.37f, 17.0f)
                    close()
                    moveTo(18.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(16.0f)
                    curveTo(15.9984f, 18.6744f, 15.4711f, 17.4036f, 14.5338f, 16.4662f)
                    curveTo(13.5964f, 15.5289f, 12.3256f, 15.0016f, 11.0f, 15.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 15.0f, 1.4413f, 14.6839f, 0.8787f, 14.1213f)
                    curveTo(0.3161f, 13.5587f, 0.0f, 12.7956f, 0.0f, 12.0f)
                    lineTo(0.0f, 8.0f)
                    curveTo(0.0f, 7.2043f, 0.3161f, 6.4413f, 0.8787f, 5.8787f)
                    curveTo(1.4413f, 5.3161f, 2.2043f, 5.0f, 3.0f, 5.0f)
                    horizontalLineTo(11.0f)
                    curveTo(12.3256f, 4.9984f, 13.5964f, 4.4711f, 14.5338f, 3.5338f)
                    curveTo(15.4711f, 2.5964f, 15.9984f, 1.3256f, 16.0f, 0.0f)
                    lineTo(18.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
