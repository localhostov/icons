package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowLeftToArc: ImageVector
    get() {
        if (_arrowLeftToArc != null) {
            return _arrowLeftToArc!!
        }
        _arrowLeftToArc = Builder(name = "ArrowLeftToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-13.633f)
                curveToRelative(0.032f, 0.039f, 0.06f, 0.08f, 0.096f, 0.116f)
                lineToRelative(5.137f, 5.18f)
                curveToRelative(0.389f, 0.392f, 0.386f, 1.025f, -0.006f, 1.414f)
                curveToRelative(-0.195f, 0.193f, -0.45f, 0.29f, -0.704f, 0.29f)
                curveToRelative(-0.257f, 0.0f, -0.515f, -0.099f, -0.71f, -0.296f)
                lineToRelative(-5.134f, -5.177f)
                curveToRelative(-0.673f, -0.674f, -1.045f, -1.572f, -1.045f, -2.527f)
                reflectiveCurveToRelative(0.372f, -1.854f, 1.047f, -2.53f)
                lineToRelative(5.132f, -5.174f)
                curveToRelative(0.388f, -0.393f, 1.021f, -0.396f, 1.414f, -0.006f)
                curveToRelative(0.392f, 0.389f, 0.395f, 1.022f, 0.006f, 1.414f)
                lineToRelative(-5.134f, 5.177f)
                curveToRelative(-0.037f, 0.037f, -0.065f, 0.079f, -0.098f, 0.119f)
                horizontalLineToRelative(13.633f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowLeftToArc!!
    }

private var _arrowLeftToArc: ImageVector? = null
