package me.localx.icons.straight.outline

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

public val Icons.Outline.Film: ImageVector
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
                    moveTo(22.0f, 0.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(22.0f, 5.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(22.0f)
                    close()
                    moveTo(20.0f, 13.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(20.0f, 11.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(20.0f)
                    close()
                    moveTo(18.0f, 2.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(18.0f)
                    close()
                    moveTo(2.0f, 11.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(2.0f)
                    close()
                    moveTo(4.0f, 13.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(4.0f)
                    close()
                    moveTo(4.0f, 5.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(4.0f)
                    close()
                    moveTo(2.0f, 19.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(2.0f)
                    close()
                    moveTo(6.0f, 22.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(6.0f)
                    close()
                    moveTo(20.0f, 19.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(20.0f)
                    close()
                }
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
