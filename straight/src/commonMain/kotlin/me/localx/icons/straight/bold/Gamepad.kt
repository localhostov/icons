package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Gamepad: ImageVector
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
                    moveTo(20.3f, 3.0f)
                    horizontalLineTo(3.7f)
                    lineTo(3.3f, 3.4f)
                    curveTo(1.2f, 5.8f, 0.0f, 8.8f, 0.0f, 12.0f)
                    curveTo(0.0f, 16.9f, 2.0f, 22.0f, 5.3f, 22.0f)
                    curveTo(7.5f, 22.0f, 8.9f, 19.6f, 9.5f, 18.0f)
                    horizontalLineTo(14.4f)
                    curveTo(15.1f, 19.6f, 16.4f, 22.0f, 18.6f, 22.0f)
                    curveTo(22.0f, 22.0f, 24.0f, 16.9f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8f, 22.8f, 5.8f, 20.7f, 3.4f)
                    lineTo(20.3f, 3.0f)
                    close()
                    moveTo(18.7f, 19.0f)
                    curveTo(18.3f, 18.9f, 17.4f, 17.5f, 16.9f, 16.0f)
                    lineTo(16.6f, 15.0f)
                    horizontalLineTo(7.4f)
                    lineTo(7.1f, 16.0f)
                    curveTo(6.7f, 17.4f, 5.8f, 18.8f, 5.4f, 19.0f)
                    curveTo(4.7f, 18.9f, 3.0f, 16.4f, 3.0f, 12.0f)
                    curveTo(3.0f, 9.8f, 3.7f, 7.7f, 5.1f, 6.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3f, 7.7f, 21.0f, 9.8f, 21.0f, 12.0f)
                    curveTo(21.0f, 16.4f, 19.3f, 18.9f, 18.7f, 19.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0001f, 7.0002f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(9.0002f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(12.0002f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(14.0002f)
                    horizontalLineTo(10.0001f)
                    verticalLineTo(12.0002f)
                    horizontalLineTo(12.0001f)
                    verticalLineTo(9.0002f)
                    horizontalLineTo(10.0001f)
                    verticalLineTo(7.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 11.9996f)
                    curveTo(18.1046f, 11.9996f, 19.0f, 11.1042f, 19.0f, 9.9996f)
                    curveTo(19.0f, 8.8951f, 18.1046f, 7.9996f, 17.0f, 7.9996f)
                    curveTo(15.8954f, 7.9996f, 15.0f, 8.8951f, 15.0f, 9.9996f)
                    curveTo(15.0f, 11.1042f, 15.8954f, 11.9996f, 17.0f, 11.9996f)
                    close()
                }
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
