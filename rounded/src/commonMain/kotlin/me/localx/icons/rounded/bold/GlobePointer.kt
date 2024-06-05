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

public val Icons.Bold.GlobePointer: ImageVector
    get() {
        if (_globePointer != null) {
            return _globePointer!!
        }
        _globePointer = Builder(name = "GlobePointer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.855f, 14.739f)
                lineToRelative(-3.944f, 8.675f)
                curveToRelative(-0.159f, 0.351f, -0.506f, 0.579f, -0.892f, 0.586f)
                horizontalLineToRelative(-0.019f)
                curveToRelative(-0.378f, 0.0f, -0.725f, -0.214f, -0.895f, -0.553f)
                lineToRelative(-1.144f, -2.288f)
                lineToRelative(-2.401f, 2.401f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(2.401f, -2.401f)
                lineToRelative(-2.288f, -1.144f)
                curveTo(0.208f, 17.722f, -0.007f, 17.367f, 0.0f, 16.981f)
                reflectiveCurveToRelative(0.235f, -0.732f, 0.586f, -0.892f)
                curveToRelative(0.0f, 0.0f, 8.734f, -3.97f, 8.765f, -3.98f)
                curveToRelative(0.728f, -0.246f, 1.518f, -0.066f, 2.062f, 0.479f)
                curveToRelative(0.545f, 0.544f, 0.728f, 1.334f, 0.442f, 2.151f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, -0.001f, 0.0f)
                curveToRelative(-0.834f, 0.0f, -1.492f, -0.5f, -1.492f, -1.442f)
                curveToRelative(0.0f, -0.682f, 0.334f, -1.009f, 0.352f, -1.029f)
                curveToRelative(0.035f, -0.041f, 3.643f, -4.375f, 3.643f, -9.528f)
                curveToRelative(0.0f, -3.267f, -1.429f, -6.178f, -2.497f, -7.899f)
                curveToRelative(-0.753f, 1.215f, -1.686f, 3.017f, -2.172f, 5.112f)
                curveToRelative(-0.16f, 0.692f, -0.777f, 1.161f, -1.46f, 1.161f)
                curveToRelative(-0.112f, 0.0f, -0.226f, -0.013f, -0.34f, -0.039f)
                curveToRelative(-0.807f, -0.187f, -1.31f, -0.992f, -1.122f, -1.8f)
                curveToRelative(0.446f, -1.924f, 1.194f, -3.616f, 1.92f, -4.948f)
                curveToRelative(-3.401f, 1.286f, -5.829f, 4.567f, -5.829f, 8.412f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveTo(0.0f, 5.425f, 5.5f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.427f, 12.0f, 12.0f)
                close()
                moveTo(15.17f, 3.587f)
                curveToRelative(0.965f, 1.767f, 1.959f, 4.176f, 2.243f, 6.913f)
                horizontalLineToRelative(3.452f)
                curveToRelative(-0.537f, -3.183f, -2.746f, -5.798f, -5.694f, -6.913f)
                close()
                moveTo(20.864f, 13.5f)
                horizontalLineToRelative(-3.452f)
                curveToRelative(-0.283f, 2.737f, -1.278f, 5.145f, -2.243f, 6.913f)
                curveToRelative(2.948f, -1.115f, 5.157f, -3.729f, 5.694f, -6.913f)
                close()
            }
        }
        .build()
        return _globePointer!!
    }

private var _globePointer: ImageVector? = null
