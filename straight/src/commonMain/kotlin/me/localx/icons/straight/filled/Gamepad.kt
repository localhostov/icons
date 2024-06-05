package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 3.3f)
                lineTo(20.4f, 3.0f)
                horizontalLineTo(3.6f)
                lineTo(3.3f, 3.3f)
                curveTo(1.2f, 5.7f, 0.0f, 8.8f, 0.0f, 12.0f)
                curveToRelative(0.0f, 5.5f, 2.2f, 10.0f, 5.0f, 10.0f)
                curveToRelative(2.2f, 0.0f, 3.3f, -3.2f, 3.8f, -5.0f)
                horizontalLineToRelative(6.4f)
                curveToRelative(0.5f, 1.8f, 1.6f, 5.0f, 3.8f, 5.0f)
                curveToRelative(2.8f, 0.0f, 5.0f, -4.5f, 5.0f, -10.0f)
                curveTo(24.0f, 8.8f, 22.8f, 5.7f, 20.7f, 3.3f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.5f, 13.0f)
                curveToRelative(-0.8f, 0.0f, -1.5f, -0.7f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.7f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.7f, 1.5f, 1.5f)
                reflectiveCurveTo(16.3f, 13.0f, 15.5f, 13.0f)
                close()
                moveTo(18.5f, 10.0f)
                curveTo(17.7f, 10.0f, 17.0f, 9.3f, 17.0f, 8.5f)
                reflectiveCurveTo(17.7f, 7.0f, 18.5f, 7.0f)
                reflectiveCurveTo(20.0f, 7.7f, 20.0f, 8.5f)
                reflectiveCurveTo(19.3f, 10.0f, 18.5f, 10.0f)
                close()
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
