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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3f, 3.0f)
                horizontalLineTo(3.7f)
                lineTo(3.3f, 3.4f)
                curveTo(1.2f, 5.8f, 0.0f, 8.8f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.9f, 2.0f, 10.0f, 5.3f, 10.0f)
                curveToRelative(2.2f, 0.0f, 3.6f, -2.4f, 4.2f, -4.0f)
                horizontalLineToRelative(4.9f)
                curveToRelative(0.7f, 1.6f, 2.0f, 4.0f, 4.2f, 4.0f)
                curveTo(22.0f, 22.0f, 24.0f, 16.9f, 24.0f, 12.0f)
                curveToRelative(0.0f, -3.2f, -1.2f, -6.2f, -3.3f, -8.6f)
                lineTo(20.3f, 3.0f)
                close()
                moveTo(18.7f, 19.0f)
                curveToRelative(-0.4f, -0.1f, -1.3f, -1.5f, -1.8f, -3.0f)
                lineToRelative(-0.3f, -1.0f)
                horizontalLineTo(7.4f)
                lineToRelative(-0.3f, 1.0f)
                curveToRelative(-0.4f, 1.4f, -1.3f, 2.8f, -1.7f, 3.0f)
                curveTo(4.7f, 18.9f, 3.0f, 16.4f, 3.0f, 12.0f)
                curveToRelative(0.0f, -2.2f, 0.7f, -4.3f, 2.1f, -6.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.3f, 1.7f, 2.0f, 3.8f, 2.0f, 6.0f)
                curveTo(21.0f, 16.4f, 19.3f, 18.9f, 18.7f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
