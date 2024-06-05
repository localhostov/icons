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

public val Icons.Bold.MapMarkerSmile: ImageVector
    get() {
        if (_mapMarkerSmile != null) {
            return _mapMarkerSmile!!
        }
        _mapMarkerSmile = Builder(name = "MapMarkerSmile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.506f, 0.0f, -2.928f, -0.583f, -4.003f, -1.64f)
                lineToRelative(-3.734f, -3.466f)
                curveTo(-0.066f, 14.548f, -0.066f, 7.543f, 4.219f, 3.238f)
                curveTo(6.296f, 1.15f, 9.06f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.703f, 1.15f, 7.78f, 3.238f)
                curveToRelative(4.285f, 4.305f, 4.285f, 11.31f, 0.0f, 15.615f)
                lineToRelative(-3.808f, 3.537f)
                curveToRelative(-1.046f, 1.028f, -2.468f, 1.61f, -3.973f, 1.61f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-2.136f, 0.0f, -4.144f, 0.836f, -5.654f, 2.354f)
                curveToRelative(-3.124f, 3.138f, -3.124f, 8.245f, 0.0f, 11.383f)
                lineToRelative(3.723f, 3.455f)
                curveToRelative(1.085f, 1.063f, 2.81f, 1.035f, 3.833f, 0.029f)
                lineToRelative(3.796f, -3.524f)
                curveToRelative(3.081f, -3.097f, 3.081f, -8.204f, -0.042f, -11.342f)
                curveToRelative(-1.511f, -1.518f, -3.519f, -2.354f, -5.654f, -2.354f)
                close()
                moveTo(16.561f, 13.111f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0.0f, -2.122f)
                curveToRelative(-0.586f, -0.586f, -1.536f, -0.585f, -2.122f, 0.0f)
                curveToRelative(-1.304f, 1.304f, -3.575f, 1.303f, -4.879f, 0.0f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(1.218f, 1.218f, 2.838f, 1.889f, 4.561f, 1.889f)
                reflectiveCurveToRelative(3.342f, -0.671f, 4.561f, -1.889f)
                close()
                moveTo(9.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _mapMarkerSmile!!
    }

private var _mapMarkerSmile: ImageVector? = null
