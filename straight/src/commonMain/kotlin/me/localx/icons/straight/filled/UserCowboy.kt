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

public val Icons.Filled.UserCowboy: ImageVector
    get() {
        if (_userCowboy != null) {
            return _userCowboy!!
        }
        _userCowboy = Builder(name = "UserCowboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(22.296f, 0.748f)
                curveToRelative(-0.088f, 0.122f, -1.623f, 2.162f, -4.987f, 3.371f)
                curveToRelative(-0.635f, -1.618f, -1.888f, -4.119f, -2.88f, -4.119f)
                curveToRelative(-0.533f, 0.0f, -0.865f, 0.312f, -1.085f, 0.52f)
                curveToRelative(-0.251f, 0.236f, -0.51f, 0.48f, -1.345f, 0.48f)
                reflectiveCurveToRelative(-1.094f, -0.244f, -1.345f, -0.48f)
                curveToRelative(-0.22f, -0.207f, -0.552f, -0.52f, -1.085f, -0.52f)
                curveToRelative(-1.001f, 0.0f, -2.239f, 2.477f, -2.879f, 4.118f)
                curveTo(3.337f, 2.91f, 1.812f, 0.872f, 1.724f, 0.751f)
                lineTo(0.096f, 1.911f)
                curveToRelative(0.147f, 0.208f, 3.704f, 5.089f, 11.904f, 5.089f)
                reflectiveCurveTo(23.774f, 2.121f, 23.922f, 1.914f)
                lineToRelative(-1.625f, -1.166f)
                close()
                moveTo(11.999f, 9.0f)
                curveToRelative(-2.312f, 0.0f, -4.304f, -0.357f, -5.994f, -0.895f)
                curveToRelative(0.057f, 3.26f, 2.721f, 5.895f, 5.995f, 5.895f)
                reflectiveCurveToRelative(5.93f, -2.628f, 5.994f, -5.881f)
                curveToRelative(-1.687f, 0.529f, -3.675f, 0.881f, -5.994f, 0.881f)
                close()
            }
        }
        .build()
        return _userCowboy!!
    }

private var _userCowboy: ImageVector? = null
