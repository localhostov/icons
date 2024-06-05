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

public val Icons.Bold.CatHead: ImageVector
    get() {
        if (_catHead != null) {
            return _catHead!!
        }
        _catHead = Builder(name = "CatHead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 13.5f)
                curveToRelative(0.0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(4.71f, 24.0f, 0.0f, 19.29f, 0.0f, 13.5f)
                curveTo(0.0f, 6.911f, 0.994f, 2.365f, 1.036f, 2.175f)
                lineTo(1.517f, 0.01f)
                lineToRelative(4.204f, 2.876f)
                curveToRelative(1.83f, -1.196f, 3.903f, -1.844f, 6.056f, -1.884f)
                curveToRelative(2.284f, -0.032f, 4.51f, 0.613f, 6.472f, 1.905f)
                lineTo(22.562f, -0.044f)
                lineToRelative(0.414f, 2.275f)
                curveToRelative(0.042f, 0.23f, 1.024f, 5.697f, 1.024f, 11.269f)
                close()
                moveTo(21.0f, 13.5f)
                curveToRelative(0.0f, -3.155f, -0.343f, -6.343f, -0.623f, -8.414f)
                lineToRelative(-2.219f, 1.519f)
                lineToRelative(-0.867f, -0.688f)
                curveToRelative(-1.622f, -1.288f, -3.502f, -1.947f, -5.461f, -1.914f)
                curveToRelative(-1.855f, 0.034f, -3.638f, 0.688f, -5.157f, 1.892f)
                lineToRelative(-0.866f, 0.687f)
                lineToRelative(-2.223f, -1.521f)
                curveToRelative(-0.27f, 1.893f, -0.584f, 4.864f, -0.584f, 8.441f)
                curveToRelative(0.0f, 4.136f, 3.364f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                close()
                moveTo(13.51f, 14.591f)
                curveToRelative(0.646f, -0.397f, 0.99f, -0.997f, 0.99f, -1.404f)
                curveToRelative(0.0f, -0.656f, -0.889f, -1.188f, -2.5f, -1.188f)
                reflectiveCurveToRelative(-2.5f, 0.532f, -2.5f, 1.188f)
                curveToRelative(0.0f, 0.407f, 0.344f, 1.007f, 0.99f, 1.404f)
                curveToRelative(-0.049f, 0.575f, -0.587f, 1.933f, -2.49f, 2.409f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.559f, 0.0f, 2.988f, -0.567f, 4.0f, -1.454f)
                curveToRelative(1.012f, 0.887f, 2.441f, 1.454f, 4.0f, 1.454f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.903f, -0.476f, -2.442f, -1.833f, -2.49f, -2.409f)
                close()
            }
        }
        .build()
        return _catHead!!
    }

private var _catHead: ImageVector? = null
