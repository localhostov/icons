package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.001f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.002f, 0.0f, 0.003f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.171f, 0.0f, 0.338f, 0.018f, 0.5f, 0.05f)
                verticalLineToRelative(-3.917f)
                curveToRelative(0.0f, -0.294f, -0.123f, -0.562f, -0.345f, -0.755f)
                curveToRelative(-0.223f, -0.193f, -0.504f, -0.275f, -0.797f, -0.235f)
                lineToRelative(-2.57f, 0.367f)
                curveToRelative(-0.734f, 0.105f, -1.288f, 0.744f, -1.288f, 1.485f)
                verticalLineToRelative(6.504f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.171f, 0.0f, 0.338f, 0.018f, 0.5f, 0.05f)
                verticalLineToRelative(-4.054f)
                curveToRelative(0.0f, -1.73f, 1.292f, -3.22f, 3.005f, -3.465f)
                lineToRelative(2.571f, -0.367f)
                curveToRelative(0.861f, -0.125f, 1.732f, 0.133f, 2.39f, 0.704f)
                curveToRelative(0.657f, 0.57f, 1.034f, 1.396f, 1.034f, 2.266f)
                verticalLineToRelative(6.362f)
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
                moveTo(12.927f, 15.957f)
                curveToRelative(0.208f, -0.512f, -0.04f, -1.095f, -0.551f, -1.302f)
                curveToRelative(-1.073f, -0.435f, -2.209f, -0.655f, -3.375f, -0.655f)
                curveTo(4.038f, 14.0f, 0.0f, 18.038f, 0.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.908f, 0.0f, 1.792f, 0.171f, 2.625f, 0.508f)
                curveToRelative(0.512f, 0.207f, 1.095f, -0.04f, 1.302f, -0.551f)
                close()
            }
        }
        .build()
        return _userMusic!!
    }

private var _userMusic: ImageVector? = null
