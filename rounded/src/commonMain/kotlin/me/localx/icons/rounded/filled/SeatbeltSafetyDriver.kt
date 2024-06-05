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

public val Icons.Filled.SeatbeltSafetyDriver: ImageVector
    get() {
        if (_seatbeltSafetyDriver != null) {
            return _seatbeltSafetyDriver!!
        }
        _seatbeltSafetyDriver = Builder(name = "SeatbeltSafetyDriver", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(20.868f, 18.494f)
                curveToRelative(-0.272f, 0.479f, -0.882f, 0.646f, -1.363f, 0.375f)
                curveToRelative(-0.032f, -0.019f, -3.344f, -1.869f, -7.505f, -1.869f)
                curveToRelative(-4.186f, 0.0f, -7.471f, 1.85f, -7.504f, 1.868f)
                curveToRelative(-0.155f, 0.089f, -0.326f, 0.132f, -0.495f, 0.132f)
                curveToRelative(-0.304f, 0.0f, -0.601f, -0.137f, -0.796f, -0.393f)
                curveToRelative(-0.304f, -0.398f, -0.267f, -0.96f, 0.088f, -1.314f)
                lineToRelative(3.707f, -3.707f)
                verticalLineToRelative(-2.586f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                curveToRelative(0.732f, 0.0f, 1.451f, 0.169f, 2.109f, 0.477f)
                lineToRelative(5.184f, -5.184f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineTo(7.927f, 15.488f)
                curveToRelative(0.951f, -0.224f, 2.02f, -0.394f, 3.163f, -0.458f)
                curveToRelative(0.026f, -0.033f, 4.203f, -4.237f, 4.203f, -4.237f)
                curveToRelative(0.287f, -0.287f, 0.716f, -0.371f, 1.09f, -0.217f)
                curveToRelative(0.374f, 0.155f, 0.617f, 0.52f, 0.617f, 0.924f)
                verticalLineToRelative(4.234f)
                curveToRelative(2.065f, 0.596f, 3.405f, 1.346f, 3.496f, 1.398f)
                curveToRelative(0.479f, 0.273f, 0.646f, 0.883f, 0.372f, 1.362f)
                close()
                moveTo(9.0f, 19.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(15.0f, 19.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _seatbeltSafetyDriver!!
    }

private var _seatbeltSafetyDriver: ImageVector? = null
