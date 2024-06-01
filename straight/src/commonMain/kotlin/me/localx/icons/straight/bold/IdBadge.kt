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

public val Icons.Bold.IdBadge: ImageVector
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
                    moveTo(20.5f, 4.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(3.0f)
                    curveTo(15.0f, 2.2043f, 14.6839f, 1.4413f, 14.1213f, 0.8787f)
                    curveTo(13.5587f, 0.3161f, 12.7956f, 0.0f, 12.0f, 0.0f)
                    curveTo(11.2044f, 0.0f, 10.4413f, 0.3161f, 9.8787f, 0.8787f)
                    curveTo(9.3161f, 1.4413f, 9.0f, 2.2043f, 9.0f, 3.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 4.0f, 1.6815f, 4.3688f, 1.0251f, 5.0251f)
                    curveTo(0.3687f, 5.6815f, 0.0f, 6.5717f, 0.0f, 7.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.5f)
                    curveTo(24.0f, 6.5717f, 23.6313f, 5.6815f, 22.9749f, 5.0251f)
                    curveTo(22.3185f, 4.3688f, 21.4283f, 4.0f, 20.5f, 4.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(7.5f)
                    curveTo(3.0f, 7.3674f, 3.0527f, 7.2402f, 3.1465f, 7.1465f)
                    curveTo(3.2402f, 7.0527f, 3.3674f, 7.0f, 3.5f, 7.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 7.0f, 20.7598f, 7.0527f, 20.8536f, 7.1465f)
                    curveTo(20.9473f, 7.2402f, 21.0f, 7.3674f, 21.0f, 7.5f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(5.0f, 11.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(12.0f, 11.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(12.0f, 16.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _idBadge!!
    }

private var _idBadge: ImageVector? = null
