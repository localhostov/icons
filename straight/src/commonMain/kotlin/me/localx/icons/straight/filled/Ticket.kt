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

public val Icons.Filled.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 15.0f)
                    verticalLineTo(3.0f)
                    curveTo(21.0f, 2.2043f, 20.6839f, 1.4413f, 20.1213f, 0.8787f)
                    curveTo(19.5587f, 0.3161f, 18.7956f, 0.0f, 18.0f, 0.0f)
                    lineTo(14.0f, 0.0f)
                    verticalLineTo(1.0f)
                    curveTo(14.0f, 1.5304f, 13.7893f, 2.0391f, 13.4142f, 2.4142f)
                    curveTo(13.0391f, 2.7893f, 12.5304f, 3.0f, 12.0f, 3.0f)
                    curveTo(11.4696f, 3.0f, 10.9609f, 2.7893f, 10.5858f, 2.4142f)
                    curveTo(10.2107f, 2.0391f, 10.0f, 1.5304f, 10.0f, 1.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, 0.0f, 4.4413f, 0.3161f, 3.8787f, 0.8787f)
                    curveTo(3.3161f, 1.4413f, 3.0f, 2.2043f, 3.0f, 3.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(23.0f)
                    curveTo(10.0f, 22.4696f, 10.2107f, 21.9609f, 10.5858f, 21.5858f)
                    curveTo(10.9609f, 21.2107f, 11.4696f, 21.0f, 12.0f, 21.0f)
                    curveTo(12.5304f, 21.0f, 13.0391f, 21.2107f, 13.4142f, 21.5858f)
                    curveTo(13.7893f, 21.9609f, 14.0f, 22.4696f, 14.0f, 23.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(21.0f)
                    close()
                    moveTo(14.0f, 17.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
