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

public val Icons.Bold.LocationPinCall: ImageVector
    get() {
        if (_locationPinCall != null) {
            return _locationPinCall!!
        }
        _locationPinCall = Builder(name = "LocationPinCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.327f, 14.89f)
                curveToRelative(-2.327f, -1.097f, -4.042f, -2.818f, -5.207f, -5.227f)
                lineToRelative(2.964f, -2.963f)
                lineTo(5.442f, 0.058f)
                lineTo(1.798f, 3.702f)
                curveTo(0.659f, 4.838f, 0.032f, 6.374f, 0.032f, 8.025f)
                curveTo(0.032f, 15.177f, 8.823f, 23.968f, 15.975f, 23.968f)
                curveToRelative(1.651f, 0.0f, 3.187f, -0.627f, 4.322f, -1.765f)
                lineToRelative(3.646f, -3.645f)
                lineToRelative(-6.642f, -6.641f)
                lineToRelative(-2.974f, 2.973f)
                close()
                moveTo(18.175f, 20.083f)
                curveToRelative(-0.57f, 0.571f, -1.352f, 0.885f, -2.2f, 0.885f)
                curveToRelative(-4.993f, 0.0f, -12.942f, -7.067f, -12.942f, -12.942f)
                curveToRelative(0.0f, -0.849f, 0.314f, -1.63f, 0.886f, -2.201f)
                lineToRelative(1.524f, -1.524f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-2.269f, 2.268f)
                lineToRelative(0.369f, 0.919f)
                curveToRelative(1.59f, 3.959f, 4.348f, 6.712f, 8.195f, 8.18f)
                lineToRelative(0.908f, 0.347f)
                lineToRelative(2.255f, -2.255f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-1.525f, 1.525f)
                close()
                moveTo(19.5f, 10.795f)
                lineToRelative(3.182f, -3.113f)
                curveToRelative(0.85f, -0.85f, 1.318f, -1.98f, 1.318f, -3.182f)
                reflectiveCurveToRelative(-0.468f, -2.332f, -1.318f, -3.182f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.318f, -3.182f, -1.318f)
                reflectiveCurveToRelative(-2.332f, 0.468f, -3.182f, 1.318f)
                curveToRelative(-0.85f, 0.85f, -1.318f, 1.98f, -1.318f, 3.182f)
                reflectiveCurveToRelative(0.468f, 2.332f, 1.329f, 3.192f)
                lineToRelative(3.171f, 3.103f)
                close()
                moveTo(19.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _locationPinCall!!
    }

private var _locationPinCall: ImageVector? = null
