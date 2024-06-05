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

public val Icons.Filled.UserMusic: ImageVector
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
                curveToRelative(0.171f, 0.0f, 0.338f, 0.018f, 0.5f, 0.05f)
                verticalLineToRelative(-5.054f)
                lineToRelative(-5.0f, 0.714f)
                verticalLineToRelative(7.79f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.171f, 0.0f, 0.338f, 0.018f, 0.5f, 0.05f)
                verticalLineToRelative(-5.34f)
                curveToRelative(0.0f, -0.989f, 0.738f, -1.84f, 1.717f, -1.979f)
                lineToRelative(5.0f, -0.714f)
                curveToRelative(0.576f, -0.08f, 1.156f, 0.089f, 1.594f, 0.469f)
                reflectiveCurveToRelative(0.689f, 0.93f, 0.689f, 1.51f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(13.0f, 17.276f)
                verticalLineToRelative(-3.276f)
                lineTo(4.5f, 14.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(10.76f)
                curveToRelative(-0.479f, -0.715f, -0.76f, -1.575f, -0.76f, -2.5f)
                curveToRelative(0.0f, -1.956f, 1.256f, -3.605f, 3.0f, -4.224f)
                close()
            }
        }
        .build()
        return _userMusic!!
    }

private var _userMusic: ImageVector? = null
