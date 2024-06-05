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

public val Icons.Outline.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.293f, 8.224f)
                curveToRelative(0.237f, 2.224f, 1.638f, 4.203f, 3.679f, 5.175f)
                lineToRelative(11.822f, 5.289f)
                curveToRelative(0.402f, 0.192f, 0.831f, 0.289f, 1.262f, 0.289f)
                curveToRelative(0.346f, 0.0f, 0.691f, -0.062f, 1.026f, -0.187f)
                curveToRelative(0.752f, -0.279f, 1.344f, -0.838f, 1.666f, -1.575f)
                curveToRelative(0.661f, -1.511f, -0.027f, -3.279f, -1.535f, -3.946f)
                lineToRelative(-2.321f, -1.07f)
                lineToRelative(-1.514f, -8.22f)
                curveToRelative(-0.099f, -1.094f, -0.786f, -2.045f, -1.8f, -2.485f)
                lineToRelative(-0.794f, -0.338f)
                curveToRelative(-0.619f, -0.265f, -1.328f, -0.2f, -1.891f, 0.174f)
                curveToRelative(-0.562f, 0.373f, -0.896f, 0.999f, -0.894f, 1.67f)
                verticalLineToRelative(6.024f)
                lineToRelative(-3.166f, -1.459f)
                lineToRelative(-1.186f, -3.036f)
                curveToRelative(-0.383f, -0.976f, -1.341f, -1.601f, -2.405f, -1.524f)
                curveToRelative(-0.635f, 0.039f, -1.216f, 0.333f, -1.637f, 0.831f)
                curveToRelative(-0.441f, 0.522f, -0.652f, 1.211f, -0.58f, 1.893f)
                lineToRelative(0.267f, 2.495f)
                close()
                moveTo(13.0f, 2.996f)
                lineToRelative(0.788f, 0.336f)
                curveToRelative(0.336f, 0.146f, 0.565f, 0.462f, 0.61f, 0.917f)
                lineToRelative(1.272f, 6.927f)
                lineToRelative(-2.671f, -1.231f)
                verticalLineTo(2.996f)
                close()
                moveTo(4.134f, 5.128f)
                curveToRelative(0.066f, -0.079f, 0.144f, -0.121f, 0.23f, -0.126f)
                horizontalLineToRelative(0.031f)
                curveToRelative(0.213f, 0.0f, 0.343f, 0.136f, 0.39f, 0.257f)
                lineToRelative(1.333f, 3.41f)
                curveToRelative(0.095f, 0.241f, 0.278f, 0.436f, 0.513f, 0.544f)
                curveToRelative(0.0f, 0.0f, 12.764f, 5.882f, 12.77f, 5.884f)
                curveToRelative(0.505f, 0.221f, 0.736f, 0.812f, 0.516f, 1.316f)
                curveToRelative(-0.103f, 0.235f, -0.292f, 0.414f, -0.531f, 0.502f)
                curveToRelative(-0.241f, 0.09f, -0.499f, 0.077f, -0.752f, -0.042f)
                lineTo(6.811f, 11.584f)
                curveToRelative(-1.396f, -0.666f, -2.365f, -2.035f, -2.529f, -3.573f)
                lineToRelative(-0.267f, -2.495f)
                curveToRelative(-0.015f, -0.138f, 0.03f, -0.284f, 0.119f, -0.389f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(23.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
