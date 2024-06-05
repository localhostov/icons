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

public val Icons.Filled.RegionPin: ImageVector
    get() {
        if (_regionPin != null) {
            return _regionPin!!
        }
        _regionPin = Builder(name = "RegionPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.183f, 9.74f)
                curveToRelative(0.343f, -1.25f, 1.186f, -2.315f, 2.355f, -2.925f)
                lineToRelative(1.019f, -0.435f)
                curveToRelative(0.195f, 1.672f, 0.94f, 3.223f, 2.163f, 4.445f)
                lineToRelative(1.833f, 1.793f)
                curveToRelative(0.922f, 0.901f, 2.146f, 1.398f, 3.447f, 1.398f)
                reflectiveCurveToRelative(2.526f, -0.497f, 3.448f, -1.398f)
                lineToRelative(1.855f, -1.815f)
                curveToRelative(1.212f, -1.211f, 1.954f, -2.766f, 2.145f, -4.445f)
                curveToRelative(0.0f, 0.0f, 0.979f, 0.408f, 0.999f, 0.417f)
                curveToRelative(1.426f, 0.711f, 2.387f, 2.078f, 2.573f, 3.658f)
                lineToRelative(0.242f, 2.053f)
                lineToRelative(-12.617f, 5.844f)
                lineTo(1.183f, 9.74f)
                close()
                moveTo(23.506f, 14.578f)
                lineToRelative(-11.255f, 5.213f)
                lineToRelative(4.634f, 4.209f)
                horizontalLineToRelative(2.446f)
                curveToRelative(1.34f, 0.0f, 2.62f, -0.574f, 3.51f, -1.576f)
                curveToRelative(0.891f, -1.001f, 1.312f, -2.339f, 1.156f, -3.671f)
                lineToRelative(-0.491f, -4.175f)
                close()
                moveTo(0.842f, 12.131f)
                lineTo(0.063f, 18.753f)
                curveToRelative(-0.157f, 1.331f, 0.264f, 2.67f, 1.155f, 3.671f)
                curveToRelative(0.891f, 1.002f, 2.17f, 1.576f, 3.51f, 1.576f)
                horizontalLineToRelative(9.184f)
                lineTo(0.842f, 12.131f)
                close()
                moveTo(17.5f, 5.5f)
                curveToRelative(0.0f, 1.47f, -0.572f, 2.851f, -1.611f, 3.889f)
                lineToRelative(-1.84f, 1.801f)
                curveToRelative(-0.565f, 0.553f, -1.307f, 0.828f, -2.049f, 0.828f)
                reflectiveCurveToRelative(-1.483f, -0.275f, -2.048f, -0.828f)
                lineToRelative(-1.833f, -1.793f)
                curveToRelative(-1.047f, -1.046f, -1.619f, -2.428f, -1.619f, -3.896f)
                reflectiveCurveToRelative(0.572f, -2.851f, 1.611f, -3.889f)
                curveToRelative(1.039f, -1.039f, 2.42f, -1.611f, 3.889f, -1.611f)
                reflectiveCurveToRelative(2.85f, 0.572f, 3.889f, 1.611f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.039f, 1.039f, 1.611f, 2.42f, 1.611f, 3.889f)
                close()
                moveTo(13.5f, 5.494f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _regionPin!!
    }

private var _regionPin: ImageVector? = null
