package me.localx.icons.straight.outline

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

public val Icons.Outline.UserMusic: ImageVector
    get() {
        if (_userMusic != null) {
            return _userMusic!!
        }
        _userMusic = Builder(name = "UserMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.5f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.003f, 0.0f, 0.004f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.171f, 0.0f, 0.338f, 0.017f, 0.5f, 0.05f)
                verticalLineToRelative(-5.054f)
                lineToRelative(-5.0f, 0.714f)
                verticalLineToRelative(7.79f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.171f, 0.0f, 0.338f, 0.017f, 0.5f, 0.05f)
                verticalLineToRelative(-5.34f)
                curveToRelative(0.0f, -0.989f, 0.738f, -1.84f, 1.717f, -1.979f)
                lineToRelative(5.0f, -0.714f)
                curveToRelative(0.576f, -0.08f, 1.156f, 0.089f, 1.594f, 0.469f)
                reflectiveCurveToRelative(0.689f, 0.93f, 0.689f, 1.51f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 2.691f, 4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(13.0f, 14.0f)
                lineTo(4.5f, 14.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _userMusic!!
    }

private var _userMusic: ImageVector? = null
