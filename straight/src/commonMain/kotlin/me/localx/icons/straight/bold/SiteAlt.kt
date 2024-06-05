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

public val Icons.Bold.SiteAlt: ImageVector
    get() {
        if (_siteAlt != null) {
            return _siteAlt!!
        }
        _siteAlt = Builder(name = "SiteAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 11.0f)
                lineToRelative(13.0f, 4.447f)
                lineToRelative(-5.816f, 2.737f)
                lineToRelative(-2.737f, 5.816f)
                lineToRelative(-4.447f, -13.0f)
                close()
                moveTo(11.843f, 19.643f)
                lineToRelative(1.465f, 4.282f)
                curveToRelative(-0.43f, 0.047f, -0.865f, 0.075f, -1.307f, 0.075f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 0.442f, -0.028f, 0.878f, -0.075f, 1.308f)
                lineToRelative(-2.94f, -1.006f)
                curveToRelative(0.003f, -0.101f, 0.015f, -0.2f, 0.015f, -0.302f)
                curveToRelative(0.0f, -3.85f, -2.43f, -7.143f, -5.837f, -8.426f)
                curveToRelative(1.033f, 1.896f, 2.113f, 4.537f, 2.301f, 7.523f)
                lineToRelative(-3.134f, -1.072f)
                curveToRelative(-0.408f, -2.445f, -1.481f, -4.559f, -2.327f, -5.924f)
                curveToRelative(-1.069f, 1.727f, -2.502f, 4.649f, -2.502f, 7.898f)
                lineToRelative(0.064f, 0.982f)
                curveToRelative(0.232f, 2.713f, 1.345f, 5.106f, 2.279f, 6.661f)
                close()
                moveTo(3.126f, 10.5f)
                horizontalLineToRelative(3.452f)
                curveToRelative(0.283f, -2.74f, 1.288f, -5.155f, 2.253f, -6.923f)
                curveToRelative(-2.952f, 1.114f, -5.169f, 3.737f, -5.706f, 6.923f)
                close()
                moveTo(8.832f, 20.424f)
                curveToRelative(-0.966f, -1.768f, -1.97f, -4.184f, -2.253f, -6.924f)
                horizontalLineToRelative(-3.453f)
                curveToRelative(0.537f, 3.187f, 2.754f, 5.81f, 5.706f, 6.924f)
                close()
            }
        }
        .build()
        return _siteAlt!!
    }

private var _siteAlt: ImageVector? = null
