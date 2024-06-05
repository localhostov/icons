package me.localx.icons.straight.filled

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

public val Icons.Filled.LocationPinCall: ImageVector
    get() {
        if (_locationPinCall != null) {
            return _locationPinCall!!
        }
        _locationPinCall = Builder(name = "LocationPinCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 1.464f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.535f, 1.464f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                reflectiveCurveToRelative(0.523f, 2.596f, 1.482f, 3.552f)
                lineToRelative(3.518f, 3.442f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.536f)
                close()
                moveTo(19.0f, 6.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.613f, 12.848f)
                lineToRelative(6.265f, 6.266f)
                lineToRelative(-3.171f, 3.171f)
                curveToRelative(-1.105f, 1.106f, -2.6f, 1.716f, -4.207f, 1.716f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                curveToRelative(0.0f, -1.608f, 0.609f, -3.103f, 1.716f, -4.208f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.265f)
                lineToRelative(-4.125f, 4.125f)
                curveToRelative(1.373f, 3.061f, 3.493f, 5.186f, 6.453f, 6.468f)
                lineToRelative(4.133f, -4.132f)
                close()
            }
        }
        .build()
        return _locationPinCall!!
    }

private var _locationPinCall: ImageVector? = null
