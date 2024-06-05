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

public val Icons.Bold.TeamCheck: ImageVector
    get() {
        if (_teamCheck != null) {
            return _teamCheck!!
        }
        _teamCheck = Builder(name = "TeamCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.683f, 17.712f)
                lineToRelative(-2.703f, 2.614f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.354f, -1.332f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.354f, 1.331f)
                curveToRelative(0.144f, 0.142f, 0.38f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.713f, -2.624f)
                curveToRelative(0.397f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(2.0f, 8.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(10.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.417f, -0.097f, -2.5f, -2.0f, -2.5f)
                reflectiveCurveToRelative(-2.0f, 2.083f, -2.0f, 2.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -2.649f, 1.564f, -5.5f, 5.0f, -5.5f)
                reflectiveCurveToRelative(5.0f, 2.851f, 5.0f, 5.5f)
                close()
                moveTo(11.599f, 13.0f)
                curveToRelative(-0.096f, 0.0f, -0.192f, -0.009f, -0.29f, -0.028f)
                curveToRelative(-0.813f, -0.159f, -1.343f, -0.947f, -1.184f, -1.76f)
                curveToRelative(0.508f, -2.598f, 2.376f, -4.212f, 4.875f, -4.212f)
                curveToRelative(1.413f, 0.0f, 2.636f, 0.511f, 3.536f, 1.478f)
                curveToRelative(0.564f, 0.606f, 0.531f, 1.555f, -0.075f, 2.12f)
                curveToRelative(-0.605f, 0.564f, -1.556f, 0.532f, -2.12f, -0.076f)
                curveToRelative(-0.327f, -0.351f, -0.766f, -0.522f, -1.341f, -0.522f)
                curveToRelative(-1.049f, 0.0f, -1.699f, 0.602f, -1.932f, 1.788f)
                curveToRelative(-0.14f, 0.716f, -0.768f, 1.212f, -1.47f, 1.212f)
                close()
            }
        }
        .build()
        return _teamCheck!!
    }

private var _teamCheck: ImageVector? = null
