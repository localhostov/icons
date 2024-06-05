package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

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
                moveTo(17.7f, 3.0f)
                horizontalLineTo(6.3f)
                curveTo(4.4f, 3.0f, 2.7f, 4.0f, 1.7f, 5.7f)
                curveTo(0.6f, 7.6f, 0.0f, 9.8f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.9f, 2.0f, 10.0f, 5.3f, 10.0f)
                curveToRelative(1.8f, 0.0f, 3.3f, -1.4f, 4.0f, -3.7f)
                curveTo(9.4f, 18.1f, 9.5f, 18.0f, 9.7f, 18.0f)
                horizontalLineToRelative(4.6f)
                curveToRelative(0.2f, 0.0f, 0.4f, 0.1f, 0.4f, 0.3f)
                curveToRelative(1.0f, 3.2f, 2.9f, 3.7f, 3.9f, 3.7f)
                curveTo(22.0f, 22.0f, 24.0f, 16.9f, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.2f, -0.6f, -4.4f, -1.7f, -6.4f)
                curveTo(21.4f, 4.0f, 19.6f, 3.0f, 17.7f, 3.0f)
                close()
                moveTo(18.7f, 19.0f)
                curveToRelative(-0.3f, 0.0f, -0.7f, -0.5f, -1.0f, -1.6f)
                curveTo(17.2f, 16.0f, 15.9f, 15.0f, 14.4f, 15.0f)
                horizontalLineTo(9.7f)
                curveToRelative(-1.5f, 0.0f, -2.8f, 1.0f, -3.3f, 2.4f)
                curveToRelative(-0.3f, 1.0f, -0.8f, 1.6f, -1.1f, 1.6f)
                curveTo(4.7f, 18.9f, 3.0f, 16.4f, 3.0f, 12.0f)
                curveToRelative(0.0f, -1.7f, 0.5f, -3.4f, 1.3f, -4.9f)
                curveTo(4.7f, 6.4f, 5.5f, 6.0f, 6.3f, 6.0f)
                horizontalLineToRelative(11.4f)
                curveToRelative(0.8f, 0.0f, 1.6f, 0.4f, 2.0f, 1.1f)
                curveTo(20.6f, 8.6f, 21.0f, 10.3f, 21.0f, 12.0f)
                curveTo(21.0f, 16.4f, 19.3f, 18.9f, 18.7f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                curveTo(10.0f, 7.7f, 9.3f, 7.0f, 8.5f, 7.0f)
                reflectiveCurveTo(7.0f, 7.7f, 7.0f, 8.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.5f)
                curveTo(5.7f, 9.0f, 5.0f, 9.7f, 5.0f, 10.5f)
                reflectiveCurveTo(5.7f, 12.0f, 6.5f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(0.5f)
                curveTo(7.0f, 13.3f, 7.7f, 14.0f, 8.5f, 14.0f)
                reflectiveCurveToRelative(1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f)
                reflectiveCurveTo(11.3f, 9.0f, 10.5f, 9.0f)
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
