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

public val Icons.Outline.MushroomAlt: ImageVector
    get() {
        if (_mushroomAlt != null) {
            return _mushroomAlt!!
        }
        _mushroomAlt = Builder(name = "MushroomAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.933f)
                curveToRelative(-0.579f, 2.594f, -0.933f, 5.983f, -0.933f, 7.0f)
                curveToRelative(0.0f, 2.43f, 1.962f, 4.0f, 5.0f, 4.0f)
                reflectiveCurveToRelative(5.0f, -1.57f, 5.0f, -4.0f)
                curveToRelative(0.0f, -1.017f, -0.354f, -4.406f, -0.933f, -7.0f)
                horizontalLineToRelative(7.933f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.0f, 2.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.905f, 0.0f, -1.703f, -0.484f, -2.141f, -1.241f)
                curveToRelative(1.336f, -0.917f, 2.899f, -1.523f, 4.592f, -1.701f)
                curveToRelative(0.026f, 0.145f, 0.049f, 0.291f, 0.049f, 0.442f)
                close()
                moveTo(15.0f, 20.0f)
                curveToRelative(0.0f, 1.855f, -2.296f, 2.0f, -3.0f, 2.0f)
                reflectiveCurveToRelative(-3.0f, -0.145f, -3.0f, -2.0f)
                curveToRelative(0.0f, -0.872f, 0.382f, -4.527f, 0.987f, -7.0f)
                horizontalLineToRelative(4.026f)
                curveToRelative(0.605f, 2.473f, 0.987f, 6.128f, 0.987f, 7.0f)
                close()
                moveTo(12.714f, 11.0f)
                curveToRelative(0.175f, -0.295f, 0.286f, -0.632f, 0.286f, -1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.368f, 0.111f, 0.705f, 0.286f, 1.0f)
                lineTo(2.05f, 11.0f)
                curveToRelative(0.229f, -2.296f, 1.244f, -4.36f, 2.763f, -5.934f)
                curveToRelative(0.819f, 1.193f, 2.174f, 1.934f, 3.687f, 1.934f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -0.155f, -0.035f, -0.303f, -0.05f, -0.455f)
                curveToRelative(4.74f, 0.449f, 8.528f, 4.221f, 9.0f, 8.955f)
                horizontalLineToRelative(-9.236f)
                close()
                moveTo(18.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mushroomAlt!!
    }

private var _mushroomAlt: ImageVector? = null
