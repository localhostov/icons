package me.localx.icons.rounded.bold

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

public val Icons.Bold.CompassSouth: ImageVector
    get() {
        if (_compassSouth != null) {
            return _compassSouth!!
        }
        _compassSouth = Builder(name = "CompassSouth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.308f, 9.966f)
                curveToRelative(-0.678f, 1.568f, -3.71f, 7.045f, -3.71f, 7.045f)
                curveToRelative(-0.661f, 1.301f, -2.518f, 1.295f, -3.171f, -0.01f)
                curveToRelative(0.0f, 0.0f, -3.732f, -7.027f, -3.734f, -7.03f)
                curveToRelative(-0.294f, -0.643f, -0.161f, -1.415f, 0.359f, -1.948f)
                curveToRelative(0.498f, -0.501f, 1.239f, -0.646f, 1.798f, -0.414f)
                curveToRelative(0.186f, 0.094f, 3.149f, 1.61f, 3.149f, 1.61f)
                curveToRelative(0.0f, 0.0f, 2.653f, -1.362f, 2.968f, -1.549f)
                curveToRelative(0.454f, -0.218f, 0.983f, -0.226f, 1.451f, -0.02f)
                curveToRelative(0.882f, 0.389f, 1.283f, 1.423f, 0.888f, 2.316f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _compassSouth!!
    }

private var _compassSouth: ImageVector? = null
