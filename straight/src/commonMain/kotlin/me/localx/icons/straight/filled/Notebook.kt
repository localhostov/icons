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

public val Icons.Filled.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = Builder(name = "Notebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 2.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(21.0f)
                    curveTo(3.0f, 21.7956f, 3.3161f, 22.5587f, 3.8787f, 23.1213f)
                    curveTo(4.4413f, 23.6839f, 5.2043f, 24.0f, 6.0f, 24.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.7956f, 24.0f, 19.5587f, 23.6839f, 20.1213f, 23.1213f)
                    curveTo(20.6839f, 22.5587f, 21.0f, 21.7956f, 21.0f, 21.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(19.0f)
                    close()
                    moveTo(13.0f, 17.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(17.0f, 13.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(17.0f, 9.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(9.0f)
                    close()
                }
            }
        }
        .build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
