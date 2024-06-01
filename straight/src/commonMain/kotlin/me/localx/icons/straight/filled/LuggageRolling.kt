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

public val Icons.Filled.LuggageRolling: ImageVector
    get() {
        if (_luggageRolling != null) {
            return _luggageRolling!!
        }
        _luggageRolling = Builder(name = "LuggageRolling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 11.0f)
                    curveTo(24.0f, 10.2044f, 23.6839f, 9.4413f, 23.1213f, 8.8787f)
                    curveTo(22.5587f, 8.3161f, 21.7956f, 8.0f, 21.0f, 8.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(3.0f)
                    curveTo(17.0f, 2.2043f, 16.6839f, 1.4413f, 16.1213f, 0.8787f)
                    curveTo(15.5587f, 0.3161f, 14.7956f, 0.0f, 14.0f, 0.0f)
                    lineTo(10.0f, 0.0f)
                    curveTo(9.2044f, 0.0f, 8.4413f, 0.3161f, 7.8787f, 0.8787f)
                    curveTo(7.3161f, 1.4413f, 7.0f, 2.2043f, 7.0f, 3.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 8.0f, 1.4413f, 8.3161f, 0.8787f, 8.8787f)
                    curveTo(0.3161f, 9.4413f, 0.0f, 10.2044f, 0.0f, 11.0f)
                    lineTo(0.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(9.0f, 3.0f)
                    curveTo(9.0f, 2.7348f, 9.1054f, 2.4804f, 9.2929f, 2.2929f)
                    curveTo(9.4804f, 2.1054f, 9.7348f, 2.0f, 10.0f, 2.0f)
                    horizontalLineTo(14.0f)
                    curveTo(14.2652f, 2.0f, 14.5196f, 2.1054f, 14.7071f, 2.2929f)
                    curveTo(14.8946f, 2.4804f, 15.0f, 2.7348f, 15.0f, 3.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(17.0f, 14.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _luggageRolling!!
    }

private var _luggageRolling: ImageVector? = null
