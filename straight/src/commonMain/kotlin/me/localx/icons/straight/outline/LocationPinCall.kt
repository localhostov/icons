package me.localx.icons.straight.outline

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

public val Icons.Outline.LocationPinCall: ImageVector
    get() {
        if (_locationPinCall != null) {
            return _locationPinCall!!
        }
        _locationPinCall = Builder(name = "LocationPinCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 11.994f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.536f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.535f, 1.464f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                reflectiveCurveToRelative(0.523f, 2.596f, 1.482f, 3.552f)
                lineToRelative(3.518f, 3.442f)
                close()
                moveTo(16.879f, 2.879f)
                curveToRelative(0.566f, -0.567f, 1.32f, -0.879f, 2.121f, -0.879f)
                reflectiveCurveToRelative(1.555f, 0.312f, 2.121f, 0.879f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.871f, 2.114f)
                lineToRelative(-2.129f, 2.083f)
                lineToRelative(-2.112f, -2.067f)
                curveToRelative(-0.572f, -0.571f, -0.888f, -1.328f, -0.888f, -2.129f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.879f, -2.121f)
                close()
                moveTo(14.199f, 16.262f)
                curveToRelative(-2.959f, -1.282f, -5.079f, -3.407f, -6.453f, -6.469f)
                lineToRelative(3.406f, -3.406f)
                lineTo(4.888f, 0.122f)
                lineTo(1.716f, 3.293f)
                curveToRelative(-1.106f, 1.105f, -1.716f, 2.599f, -1.716f, 4.208f)
                curveToRelative(0.0f, 7.248f, 9.252f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.608f, 0.0f, 3.103f, -0.609f, 4.207f, -1.715f)
                lineToRelative(3.171f, -3.171f)
                lineToRelative(-6.265f, -6.265f)
                lineToRelative(-3.414f, 3.414f)
                close()
                moveTo(19.292f, 20.871f)
                curveToRelative(-0.727f, 0.728f, -1.718f, 1.129f, -2.792f, 1.129f)
                curveToRelative(-6.233f, 0.0f, -14.5f, -8.266f, -14.5f, -14.5f)
                curveToRelative(0.0f, -1.073f, 0.401f, -2.065f, 1.13f, -2.793f)
                lineToRelative(1.758f, -1.757f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-2.936f, 2.936f)
                lineToRelative(0.246f, 0.613f)
                curveToRelative(1.641f, 4.086f, 4.482f, 6.924f, 8.446f, 8.437f)
                lineToRelative(0.605f, 0.231f)
                lineToRelative(2.927f, -2.927f)
                lineToRelative(3.437f, 3.437f)
                lineToRelative(-1.758f, 1.758f)
                close()
                moveTo(17.5f, 5.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _locationPinCall!!
    }

private var _locationPinCall: ImageVector? = null
