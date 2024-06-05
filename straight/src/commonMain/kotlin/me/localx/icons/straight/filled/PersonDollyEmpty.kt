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

public val Icons.Filled.PersonDollyEmpty: ImageVector
    get() {
        if (_personDollyEmpty != null) {
            return _personDollyEmpty!!
        }
        _personDollyEmpty = Builder(name = "PersonDollyEmpty", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 2.5f)
                curveTo(1.0f, 1.119f, 2.119f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.0f, 3.881f, 1.0f, 2.5f)
                close()
                moveTo(24.006f, 19.06f)
                lineToRelative(-0.451f, -1.949f)
                lineToRelative(-8.581f, 1.989f)
                lineToRelative(-3.049f, -13.15f)
                lineToRelative(-1.948f, 0.451f)
                lineToRelative(1.066f, 4.6f)
                horizontalLineToRelative(-2.81f)
                lineToRelative(-1.671f, -3.341f)
                curveToRelative(-0.511f, -1.023f, -1.539f, -1.659f, -2.683f, -1.659f)
                horizontalLineToRelative(-1.379f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(5.661f)
                curveToRelative(0.0f, 0.875f, 0.445f, 1.671f, 1.202f, 2.137f)
                lineToRelative(3.798f, 2.27f)
                verticalLineToRelative(5.433f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.567f)
                lineToRelative(-2.0f, -1.195f)
                verticalLineToRelative(-7.232f)
                lineToRelative(1.997f, 3.994f)
                horizontalLineToRelative(4.51f)
                lineToRelative(1.407f, 6.07f)
                curveToRelative(-1.098f, 0.264f, -1.914f, 1.251f, -1.914f, 2.43f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.196f, -0.023f, -0.386f, -0.066f, -0.569f)
                lineToRelative(8.072f, -1.871f)
                close()
                moveTo(1.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.298f)
                lineToRelative(-2.0f, -1.195f)
                verticalLineToRelative(5.493f)
                close()
            }
        }
        .build()
        return _personDollyEmpty!!
    }

private var _personDollyEmpty: ImageVector? = null
