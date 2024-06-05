package me.localx.icons.straight.outline

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

public val Icons.Outline.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4f, 3.0f)
                horizontalLineTo(3.6f)
                lineTo(3.3f, 3.3f)
                curveTo(1.2f, 5.7f, 0.0f, 8.8f, 0.0f, 12.0f)
                curveToRelative(0.0f, 5.5f, 2.2f, 10.0f, 5.0f, 10.0f)
                curveToRelative(2.2f, 0.0f, 3.3f, -3.2f, 3.8f, -5.0f)
                horizontalLineToRelative(6.4f)
                curveToRelative(0.5f, 1.8f, 1.6f, 5.0f, 3.8f, 5.0f)
                curveToRelative(2.8f, 0.0f, 5.0f, -4.5f, 5.0f, -10.0f)
                curveToRelative(0.0f, -3.2f, -1.2f, -6.3f, -3.3f, -8.7f)
                lineTo(20.4f, 3.0f)
                close()
                moveTo(19.0f, 20.0f)
                curveToRelative(-0.6f, 0.0f, -1.6f, -2.1f, -2.0f, -4.2f)
                lineTo(16.8f, 15.0f)
                horizontalLineTo(7.2f)
                lineTo(7.0f, 15.8f)
                curveTo(6.6f, 17.9f, 5.6f, 20.0f, 5.0f, 20.0f)
                curveToRelative(-1.0f, 0.0f, -3.0f, -3.1f, -3.0f, -8.0f)
                curveToRelative(0.0f, -2.5f, 0.9f, -5.0f, 2.5f, -7.0f)
                horizontalLineToRelative(15.1f)
                curveToRelative(1.6f, 2.0f, 2.4f, 4.5f, 2.4f, 7.0f)
                curveTo(22.0f, 16.9f, 20.0f, 20.0f, 19.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 8.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 11.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
