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

public val Icons.Outline.ArrowUpToArc: ImageVector
    get() {
        if (_arrowUpToArc != null) {
            return _arrowUpToArc!!
        }
        _arrowUpToArc = Builder(name = "ArrowUpToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(14.529f, 8.047f)
                curveToRelative(-1.352f, -1.351f, -3.71f, -1.348f, -5.056f, -0.002f)
                lineToRelative(-5.177f, 5.134f)
                curveToRelative(-0.392f, 0.389f, -0.395f, 1.021f, -0.006f, 1.414f)
                curveToRelative(0.389f, 0.393f, 1.023f, 0.395f, 1.414f, 0.006f)
                lineToRelative(5.18f, -5.137f)
                curveToRelative(0.034f, -0.034f, 0.08f, -0.046f, 0.116f, -0.075f)
                verticalLineToRelative(13.614f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-13.613f)
                curveToRelative(0.037f, 0.031f, 0.085f, 0.043f, 0.119f, 0.078f)
                lineToRelative(5.177f, 5.134f)
                curveToRelative(0.195f, 0.193f, 0.449f, 0.29f, 0.704f, 0.29f)
                curveToRelative(0.257f, 0.0f, 0.515f, -0.099f, 0.71f, -0.296f)
                curveToRelative(0.389f, -0.393f, 0.387f, -1.025f, -0.006f, -1.414f)
                lineToRelative(-5.175f, -5.132f)
                close()
            }
        }
        .build()
        return _arrowUpToArc!!
    }

private var _arrowUpToArc: ImageVector? = null
