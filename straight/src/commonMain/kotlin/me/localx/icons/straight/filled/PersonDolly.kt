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

public val Icons.Filled.PersonDolly: ImageVector
    get() {
        if (_personDolly != null) {
            return _personDolly!!
        }
        _personDolly = Builder(name = "PersonDolly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.186f, 16.547f)
                curveToRelative(-0.463f, 0.0f, -0.918f, -0.128f, -1.321f, -0.378f)
                curveToRelative(-0.574f, -0.354f, -0.975f, -0.912f, -1.129f, -1.569f)
                lineToRelative(-0.668f, -2.851f)
                curveToRelative(-0.316f, -1.351f, 0.523f, -2.709f, 1.872f, -3.028f)
                lineToRelative(2.775f, -0.66f)
                curveToRelative(0.658f, -0.156f, 1.335f, -0.047f, 1.909f, 0.309f)
                curveToRelative(0.574f, 0.354f, 0.975f, 0.912f, 1.129f, 1.568f)
                lineToRelative(0.668f, 2.852f)
                curveToRelative(0.316f, 1.351f, -0.523f, 2.709f, -1.872f, 3.028f)
                lineToRelative(-2.775f, 0.66f)
                curveToRelative(-0.195f, 0.047f, -0.392f, 0.069f, -0.587f, 0.069f)
                close()
                moveTo(1.0f, 2.5f)
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
        return _personDolly!!
    }

private var _personDolly: ImageVector? = null
