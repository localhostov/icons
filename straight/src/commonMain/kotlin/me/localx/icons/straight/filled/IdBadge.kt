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

public val Icons.Filled.IdBadge: ImageVector
    get() {
        if (_idBadge != null) {
            return _idBadge!!
        }
        _idBadge = Builder(name = "IdBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 4.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(3.0f)
                    curveTo(15.0f, 2.2043f, 14.6839f, 1.4413f, 14.1213f, 0.8787f)
                    curveTo(13.5587f, 0.3161f, 12.7956f, 0.0f, 12.0f, 0.0f)
                    curveTo(11.2044f, 0.0f, 10.4413f, 0.3161f, 9.8787f, 0.8787f)
                    curveTo(9.3161f, 1.4413f, 9.0f, 2.2043f, 9.0f, 3.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 4.0f, 1.4413f, 4.3161f, 0.8787f, 4.8787f)
                    curveTo(0.3161f, 5.4413f, 0.0f, 6.2043f, 0.0f, 7.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.0f)
                    curveTo(24.0f, 6.2043f, 23.6839f, 5.4413f, 23.1213f, 4.8787f)
                    curveTo(22.5587f, 4.3161f, 21.7956f, 4.0f, 21.0f, 4.0f)
                    close()
                    moveTo(10.0f, 19.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(11.0f, 3.0f)
                    curveTo(11.0f, 2.7348f, 11.1054f, 2.4804f, 11.2929f, 2.2929f)
                    curveTo(11.4804f, 2.1054f, 11.7348f, 2.0f, 12.0f, 2.0f)
                    curveTo(12.2652f, 2.0f, 12.5196f, 2.1054f, 12.7071f, 2.2929f)
                    curveTo(12.8946f, 2.4804f, 13.0f, 2.7348f, 13.0f, 3.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(19.0f, 19.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(21.0f, 15.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(21.0f, 11.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(8.0f, 17.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _idBadge!!
    }

private var _idBadge: ImageVector? = null
