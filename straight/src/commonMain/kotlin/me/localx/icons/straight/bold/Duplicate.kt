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

public val Icons.Bold.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9f, 0.0f)
                    horizontalLineTo(11.0f)
                    curveTo(10.2044f, 0.0f, 9.4413f, 0.3161f, 8.8787f, 0.8787f)
                    curveTo(8.3161f, 1.4413f, 8.0f, 2.2043f, 8.0f, 3.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2044f, 5.0f, 3.4413f, 5.3161f, 2.8787f, 5.8787f)
                    curveTo(2.3161f, 6.4413f, 2.0f, 7.2043f, 2.0f, 8.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(3.307f)
                    lineTo(18.9f, 0.0f)
                    close()
                    moveTo(14.0f, 21.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(11.0f, 15.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
