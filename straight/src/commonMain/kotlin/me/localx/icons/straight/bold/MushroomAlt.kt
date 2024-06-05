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

public val Icons.Bold.MushroomAlt: ImageVector
    get() {
        if (_mushroomAlt != null) {
            return _mushroomAlt!!
        }
        _mushroomAlt = Builder(name = "MushroomAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 13.0f)
                horizontalLineToRelative(-7.801f)
                curveToRelative(0.513f, 2.643f, 0.801f, 6.134f, 0.801f, 7.0f)
                curveToRelative(0.0f, 1.203f, -0.487f, 4.0f, -5.0f, 4.0f)
                reflectiveCurveToRelative(-5.0f, -2.797f, -5.0f, -4.0f)
                curveToRelative(0.0f, -0.866f, 0.289f, -4.357f, 0.801f, -7.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-1.5f)
                curveTo(0.0f, 5.159f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.159f, 12.0f, 11.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(14.0f, 20.0f)
                curveToRelative(0.0f, -0.884f, -0.343f, -4.66f, -0.865f, -7.0f)
                horizontalLineToRelative(-2.271f)
                curveToRelative(-0.521f, 2.34f, -0.865f, 6.116f, -0.865f, 7.0f)
                curveToRelative(0.0f, 0.398f, 0.0f, 1.0f, 2.0f, 1.0f)
                reflectiveCurveToRelative(2.0f, -0.602f, 2.0f, -1.0f)
                close()
                moveTo(20.86f, 10.0f)
                curveToRelative(-0.752f, -3.974f, -4.439f, -7.0f, -8.86f, -7.0f)
                curveToRelative(-0.012f, 0.0f, -0.024f, 0.0f, -0.036f, 0.0f)
                curveToRelative(0.023f, 0.163f, 0.036f, 0.33f, 0.036f, 0.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.19f, 0.0f, -2.235f, -0.596f, -2.864f, -1.505f)
                curveToRelative(-1.272f, 1.203f, -2.166f, 2.763f, -2.496f, 4.505f)
                horizontalLineToRelative(5.86f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                horizontalLineToRelative(7.86f)
                close()
            }
        }
        .build()
        return _mushroomAlt!!
    }

private var _mushroomAlt: ImageVector? = null
