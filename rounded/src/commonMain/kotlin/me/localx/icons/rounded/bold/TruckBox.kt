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

public val Icons.Bold.TruckBox: ImageVector
    get() {
        if (_truckBox != null) {
            return _truckBox!!
        }
        _truckBox = Builder(name = "TruckBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.682f, 6.0f)
                horizontalLineToRelative(-1.868f)
                curveToRelative(-0.215f, -0.836f, -0.612f, -1.62f, -1.205f, -2.27f)
                curveToRelative(-0.559f, -0.611f, -1.507f, -0.654f, -2.119f, -0.096f)
                reflectiveCurveToRelative(-0.655f, 1.507f, -0.097f, 2.119f)
                curveToRelative(0.392f, 0.429f, 0.607f, 0.984f, 0.607f, 1.564f)
                verticalLineToRelative(10.682f)
                lineTo(4.364f, 17.999f)
                curveToRelative(-0.752f, 0.0f, -1.364f, -0.611f, -1.364f, -1.363f)
                verticalLineToRelative(-3.137f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(3.137f)
                curveToRelative(0.0f, 1.934f, 1.274f, 3.559f, 3.02f, 4.13f)
                curveToRelative(-0.006f, 0.078f, -0.02f, 0.154f, -0.02f, 0.234f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.08f, -0.014f, -0.156f, -0.02f, -0.234f)
                curveToRelative(1.746f, -0.57f, 3.02f, -2.195f, 3.02f, -4.13f)
                verticalLineToRelative(-5.364f)
                curveToRelative(0.0f, -2.907f, -2.386f, -5.272f, -5.318f, -5.272f)
                close()
                moveTo(21.0f, 11.272f)
                verticalLineToRelative(0.728f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.682f)
                curveToRelative(1.3f, 0.0f, 2.318f, 0.998f, 2.318f, 2.272f)
                close()
                moveTo(19.636f, 18.0f)
                horizontalLineToRelative(-2.636f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.637f)
                curveToRelative(0.0f, 0.752f, -0.612f, 1.363f, -1.364f, 1.363f)
                close()
                moveTo(3.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(11.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(4.5f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _truckBox!!
    }

private var _truckBox: ImageVector? = null
