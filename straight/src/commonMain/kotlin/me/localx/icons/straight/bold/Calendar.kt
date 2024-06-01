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

public val Icons.Bold.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 2.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 2.0f, 1.4413f, 2.3161f, 0.8787f, 2.8787f)
                    curveTo(0.3161f, 3.4413f, 0.0f, 4.2043f, 0.0f, 5.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0f)
                    curveTo(24.0f, 4.2043f, 23.6839f, 3.4413f, 23.1213f, 2.8787f)
                    curveTo(22.5587f, 2.3161f, 21.7956f, 2.0f, 21.0f, 2.0f)
                    close()
                    moveTo(3.0f, 21.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
