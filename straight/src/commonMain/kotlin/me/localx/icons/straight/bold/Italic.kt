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

public val Icons.Bold.Italic: ImageVector
    get() {
        if (_italic != null) {
            return _italic!!
        }
        _italic = Builder(name = "Italic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 3.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(11.713f)
                    lineTo(9.259f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(12.287f)
                    lineTo(14.741f, 3.0f)
                    horizontalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _italic!!
    }

private var _italic: ImageVector? = null
