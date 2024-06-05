package me.localx.icons.straight.bold

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

public val Icons.Bold.PersonDress: ImageVector
    get() {
        if (_personDress != null) {
            return _personDress!!
        }
        _personDress = Builder(name = "PersonDress", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(19.457f, 15.574f)
                lineToRelative(-2.243f, -2.458f)
                lineToRelative(0.986f, 7.884f)
                horizontalLineToRelative(-2.199f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.199f)
                lineToRelative(0.986f, -7.884f)
                lineToRelative(-2.243f, 2.458f)
                lineToRelative(-2.216f, -2.022f)
                lineToRelative(5.872f, -6.435f)
                lineToRelative(0.003f, 0.003f)
                curveToRelative(0.643f, -0.692f, 1.559f, -1.12f, 2.563f, -1.12f)
                horizontalLineToRelative(1.469f)
                curveToRelative(1.004f, 0.0f, 1.92f, 0.428f, 2.563f, 1.12f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(5.872f, 6.435f)
                lineToRelative(-2.216f, 2.022f)
                close()
                moveTo(11.766f, 9.0f)
                curveToRelative(-0.251f, 0.0f, -0.465f, 0.188f, -0.496f, 0.438f)
                lineToRelative(-1.07f, 8.562f)
                horizontalLineToRelative(4.602f)
                lineToRelative(-1.07f, -8.562f)
                curveToRelative(-0.031f, -0.25f, -0.245f, -0.438f, -0.496f, -0.438f)
                horizontalLineToRelative(-1.469f)
                close()
            }
        }
        .build()
        return _personDress!!
    }

private var _personDress: ImageVector? = null
