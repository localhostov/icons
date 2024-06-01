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

public val Icons.Bold.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 15.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(17.0f)
                    curveTo(0.0f, 17.7956f, 0.3161f, 18.5587f, 0.8787f, 19.1213f)
                    curveTo(1.4413f, 19.6839f, 2.2043f, 20.0f, 3.0f, 20.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 20.0f, 22.5587f, 19.6839f, 23.1213f, 19.1213f)
                    curveTo(23.6839f, 18.5587f, 24.0f, 17.7956f, 24.0f, 17.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(14.769f, 16.0f)
                    horizontalLineTo(9.231f)
                    lineTo(8.308f, 15.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(15.692f)
                    lineTo(14.769f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
