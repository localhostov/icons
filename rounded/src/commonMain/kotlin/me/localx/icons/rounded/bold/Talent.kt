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

public val Icons.Bold.Talent: ImageVector
    get() {
        if (_talent != null) {
            return _talent!!
        }
        _talent = Builder(name = "Talent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 13.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(22.602f, 11.482f)
                curveToRelative(-0.561f, -0.607f, -1.51f, -0.647f, -2.12f, -0.084f)
                lineToRelative(-6.069f, 5.602f)
                horizontalLineToRelative(-4.827f)
                lineToRelative(-6.069f, -5.602f)
                curveToRelative(-0.609f, -0.562f, -1.558f, -0.523f, -2.12f, 0.084f)
                curveToRelative(-0.562f, 0.609f, -0.524f, 1.558f, 0.084f, 2.12f)
                lineToRelative(6.5f, 6.0f)
                curveToRelative(0.005f, 0.005f, 0.012f, 0.006f, 0.018f, 0.011f)
                verticalLineToRelative(2.887f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.887f)
                curveToRelative(0.005f, -0.005f, 0.012f, -0.006f, 0.018f, -0.011f)
                lineToRelative(6.5f, -6.0f)
                curveToRelative(0.608f, -0.562f, 0.646f, -1.511f, 0.084f, -2.12f)
                close()
                moveTo(9.275f, 6.106f)
                lineToRelative(-0.784f, 2.513f)
                curveToRelative(-0.106f, 0.337f, 0.012f, 0.705f, 0.295f, 0.917f)
                curveToRelative(0.148f, 0.111f, 0.323f, 0.166f, 0.5f, 0.166f)
                curveToRelative(0.161f, 0.0f, 0.323f, -0.047f, 0.463f, -0.141f)
                lineToRelative(2.257f, -1.51f)
                lineToRelative(2.295f, 1.495f)
                curveToRelative(0.296f, 0.193f, 0.682f, 0.177f, 0.964f, -0.038f)
                curveToRelative(0.281f, -0.216f, 0.394f, -0.586f, 0.282f, -0.922f)
                lineToRelative(-0.815f, -2.484f)
                lineToRelative(1.971f, -1.606f)
                curveToRelative(0.268f, -0.225f, 0.366f, -0.594f, 0.246f, -0.923f)
                curveToRelative(-0.12f, -0.329f, -0.433f, -0.548f, -0.783f, -0.548f)
                horizontalLineToRelative(-2.501f)
                lineToRelative(-0.885f, -2.483f)
                curveToRelative(-0.121f, -0.326f, -0.433f, -0.542f, -0.781f, -0.542f)
                reflectiveCurveToRelative(-0.66f, 0.216f, -0.781f, 0.542f)
                lineToRelative(-0.885f, 2.483f)
                horizontalLineToRelative(-2.501f)
                curveToRelative(-0.349f, 0.0f, -0.662f, 0.218f, -0.782f, 0.546f)
                curveToRelative(-0.121f, 0.328f, -0.024f, 0.696f, 0.243f, 0.922f)
                lineToRelative(1.981f, 1.612f)
                close()
            }
        }
        .build()
        return _talent!!
    }

private var _talent: ImageVector? = null
