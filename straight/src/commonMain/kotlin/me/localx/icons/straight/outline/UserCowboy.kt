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

public val Icons.Outline.UserCowboy: ImageVector
    get() {
        if (_userCowboy != null) {
            return _userCowboy!!
        }
        _userCowboy = Builder(name = "UserCowboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.296f, 1.748f)
                curveToRelative(-0.086f, 0.118f, -1.528f, 2.048f, -4.689f, 3.266f)
                curveToRelative(-0.71f, -2.443f, -2.216f, -5.014f, -3.177f, -5.014f)
                curveToRelative(-0.533f, 0.0f, -0.865f, 0.312f, -1.085f, 0.52f)
                curveToRelative(-0.251f, 0.236f, -0.51f, 0.48f, -1.345f, 0.48f)
                reflectiveCurveToRelative(-1.094f, -0.244f, -1.345f, -0.48f)
                curveToRelative(-0.22f, -0.207f, -0.552f, -0.52f, -1.085f, -0.52f)
                curveToRelative(-0.961f, 0.0f, -2.466f, 2.57f, -3.177f, 5.013f)
                curveTo(3.242f, 3.795f, 1.81f, 1.869f, 1.724f, 1.751f)
                lineTo(0.096f, 2.911f)
                curveToRelative(0.104f, 0.148f, 1.926f, 2.647f, 5.904f, 4.087f)
                verticalLineToRelative(1.002f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(3.985f, -1.439f, 5.817f, -3.939f, 5.922f, -4.085f)
                lineToRelative(-1.625f, -1.166f)
                close()
                moveTo(9.765f, 2.38f)
                curveToRelative(0.442f, 0.311f, 1.125f, 0.62f, 2.234f, 0.62f)
                reflectiveCurveToRelative(1.792f, -0.31f, 2.234f, -0.62f)
                curveToRelative(0.459f, 0.716f, 1.108f, 1.917f, 1.479f, 3.213f)
                curveToRelative(-1.089f, 0.252f, -2.323f, 0.408f, -3.714f, 0.408f)
                reflectiveCurveToRelative(-2.625f, -0.156f, -3.713f, -0.408f)
                curveToRelative(0.371f, -1.296f, 1.02f, -2.496f, 1.479f, -3.212f)
                close()
                moveTo(11.999f, 12.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-0.423f)
                curveToRelative(1.186f, 0.263f, 2.517f, 0.423f, 4.0f, 0.423f)
                reflectiveCurveToRelative(2.813f, -0.16f, 4.0f, -0.423f)
                verticalLineToRelative(0.423f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(20.999f, 20.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 18.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _userCowboy!!
    }

private var _userCowboy: ImageVector? = null
