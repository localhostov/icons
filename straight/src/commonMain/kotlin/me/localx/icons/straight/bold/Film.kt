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

public val Icons.Bold.Film: ImageVector
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
                    moveTo(0.0f, 0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    close()
                    moveTo(21.0f, 3.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(21.0f)
                    close()
                    moveTo(5.0f, 14.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(8.0f, 13.5f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(19.0f, 10.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(16.0f, 3.0f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(16.0f)
                    close()
                    moveTo(5.0f, 3.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(5.0f)
                    close()
                    moveTo(3.0f, 17.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(17.0f)
                    close()
                    moveTo(19.0f, 21.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(19.0f)
                    close()
                }
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
