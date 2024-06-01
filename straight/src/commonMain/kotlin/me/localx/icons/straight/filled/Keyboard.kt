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

public val Icons.Filled.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 5.9996f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(1.9996f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(5.9996f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 5.9996f, 1.4413f, 6.3157f, 0.8787f, 6.8783f)
                    curveTo(0.3161f, 7.4409f, 0.0f, 8.204f, 0.0f, 8.9996f)
                    lineTo(0.0f, 19.9996f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.9996f)
                    curveTo(24.0f, 8.204f, 23.6839f, 7.4409f, 23.1213f, 6.8783f)
                    curveTo(22.5587f, 6.3157f, 21.7956f, 5.9996f, 21.0f, 5.9996f)
                    close()
                    moveTo(9.0f, 9.9996f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(11.9996f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(9.9996f)
                    close()
                    moveTo(6.0f, 15.9996f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(13.9996f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(15.9996f)
                    close()
                    moveTo(7.0f, 11.9996f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(9.9996f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(11.9996f)
                    close()
                    moveTo(16.0f, 15.9996f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.9996f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(15.9996f)
                    close()
                    moveTo(20.0f, 15.9996f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(13.9996f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(15.9996f)
                    close()
                    moveTo(20.0f, 11.9996f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(9.9996f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(11.9996f)
                    close()
                }
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
