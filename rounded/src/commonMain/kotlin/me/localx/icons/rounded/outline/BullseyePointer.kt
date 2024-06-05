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

public val Icons.Outline.BullseyePointer: ImageVector
    get() {
        if (_bullseyePointer != null) {
            return _bullseyePointer!!
        }
        _bullseyePointer = Builder(name = "BullseyePointer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.637f, 11.851f)
                lineTo(0.653f, 15.104f)
                curveToRelative(-0.321f, 0.117f, -0.561f, 0.389f, -0.636f, 0.723f)
                curveToRelative(-0.074f, 0.334f, 0.027f, 0.683f, 0.27f, 0.924f)
                lineToRelative(2.793f, 2.793f)
                lineTo(0.3f, 22.325f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(2.78f, -2.78f)
                lineToRelative(2.793f, 2.793f)
                curveToRelative(0.189f, 0.189f, 0.444f, 0.293f, 0.707f, 0.293f)
                curveToRelative(0.072f, 0.0f, 0.146f, -0.008f, 0.217f, -0.024f)
                curveToRelative(0.334f, -0.074f, 0.607f, -0.314f, 0.724f, -0.636f)
                lineToRelative(3.254f, -8.984f)
                lineToRelative(0.006f, -0.017f)
                curveToRelative(0.249f, -0.728f, 0.065f, -1.518f, -0.479f, -2.062f)
                curveToRelative(-0.543f, -0.543f, -1.331f, -0.727f, -2.077f, -0.472f)
                close()
                moveTo(7.589f, 21.226f)
                lineToRelative(-4.777f, -4.777f)
                lineToRelative(7.491f, -2.718f)
                lineToRelative(-2.714f, 7.495f)
                close()
                moveTo(24.007f, 10.032f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                reflectiveCurveTo(18.418f, 2.032f, 14.007f, 2.032f)
                reflectiveCurveTo(6.007f, 5.621f, 6.007f, 10.032f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveTo(4.007f, 4.518f, 8.493f, 0.032f, 14.007f, 0.032f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                close()
                moveTo(18.007f, 10.032f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.623f, 0.0f, -3.074f, 0.969f, -3.696f, 2.468f)
                curveToRelative(-0.213f, 0.51f, -0.798f, 0.751f, -1.308f, 0.54f)
                reflectiveCurveToRelative(-0.752f, -0.797f, -0.54f, -1.307f)
                curveToRelative(0.934f, -2.249f, 3.109f, -3.701f, 5.544f, -3.701f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.437f, -1.454f, 4.613f, -3.705f, 5.545f)
                curveToRelative(-0.125f, 0.052f, -0.255f, 0.077f, -0.383f, 0.077f)
                curveToRelative(-0.393f, 0.0f, -0.765f, -0.233f, -0.924f, -0.618f)
                curveToRelative(-0.211f, -0.51f, 0.031f, -1.095f, 0.541f, -1.306f)
                curveToRelative(1.501f, -0.622f, 2.471f, -2.073f, 2.471f, -3.697f)
                close()
            }
        }
        .build()
        return _bullseyePointer!!
    }

private var _bullseyePointer: ImageVector? = null
