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

public val Icons.Bold.LineWidth: ImageVector
    get() {
        if (_lineWidth != null) {
            return _lineWidth!!
        }
        _lineWidth = Builder(name = "LineWidth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(24.0f, 5.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(24.0f, 11.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(24.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _lineWidth!!
    }

private var _lineWidth: ImageVector? = null
