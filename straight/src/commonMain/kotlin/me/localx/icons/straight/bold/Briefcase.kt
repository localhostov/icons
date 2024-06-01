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

public val Icons.Bold.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 3.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(2.454f)
                    curveTo(17.9992f, 1.8034f, 17.7404f, 1.1797f, 17.2804f, 0.7196f)
                    curveTo(16.8203f, 0.2596f, 16.1966f, 8.0E-4f, 15.546f, 0.0f)
                    lineTo(8.455f, 0.0f)
                    curveTo(7.8042f, 5.0E-4f, 7.1803f, 0.2592f, 6.72f, 0.7193f)
                    curveTo(6.2597f, 1.1794f, 6.0008f, 1.8032f, 6.0f, 2.454f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(6.0f)
                    curveTo(24.0f, 5.2043f, 23.6839f, 4.4413f, 23.1213f, 3.8787f)
                    curveTo(22.5587f, 3.3161f, 21.7956f, 3.0f, 21.0f, 3.0f)
                    close()
                    moveTo(21.0f, 6.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(21.0f)
                    close()
                    moveTo(3.0f, 21.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
