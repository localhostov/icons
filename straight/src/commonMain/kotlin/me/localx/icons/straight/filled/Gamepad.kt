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

public val Icons.Filled.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.7f, 3.3f)
                    lineTo(20.4f, 3.0f)
                    horizontalLineTo(3.6f)
                    lineTo(3.3f, 3.3f)
                    curveTo(1.2f, 5.7f, 0.0f, 8.8f, 0.0f, 12.0f)
                    curveTo(0.0f, 17.5f, 2.2f, 22.0f, 5.0f, 22.0f)
                    curveTo(7.2f, 22.0f, 8.3f, 18.8f, 8.8f, 17.0f)
                    horizontalLineTo(15.2f)
                    curveTo(15.7f, 18.8f, 16.8f, 22.0f, 19.0f, 22.0f)
                    curveTo(21.8f, 22.0f, 24.0f, 17.5f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8f, 22.8f, 5.7f, 20.7f, 3.3f)
                    close()
                    moveTo(9.0f, 11.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(15.5f, 13.0f)
                    curveTo(14.7f, 13.0f, 14.0f, 12.3f, 14.0f, 11.5f)
                    curveTo(14.0f, 10.7f, 14.7f, 10.0f, 15.5f, 10.0f)
                    curveTo(16.3f, 10.0f, 17.0f, 10.7f, 17.0f, 11.5f)
                    curveTo(17.0f, 12.3f, 16.3f, 13.0f, 15.5f, 13.0f)
                    close()
                    moveTo(18.5f, 10.0f)
                    curveTo(17.7f, 10.0f, 17.0f, 9.3f, 17.0f, 8.5f)
                    curveTo(17.0f, 7.7f, 17.7f, 7.0f, 18.5f, 7.0f)
                    curveTo(19.3f, 7.0f, 20.0f, 7.7f, 20.0f, 8.5f)
                    curveTo(20.0f, 9.3f, 19.3f, 10.0f, 18.5f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
