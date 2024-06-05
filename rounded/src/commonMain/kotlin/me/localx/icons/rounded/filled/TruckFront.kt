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

public val Icons.Filled.TruckFront: ImageVector
    get() {
        if (_truckFront != null) {
            return _truckFront!!
        }
        _truckFront = Builder(name = "TruckFront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.501f, 14.0f)
                lineTo(2.678f, 14.0f)
                curveToRelative(0.12f, -0.302f, 0.261f, -0.596f, 0.423f, -0.88f)
                lineToRelative(2.058f, -3.601f)
                curveToRelative(0.888f, -1.554f, 2.551f, -2.52f, 4.341f, -2.52f)
                horizontalLineToRelative(5.179f)
                curveToRelative(1.79f, 0.0f, 3.453f, 0.966f, 4.341f, 2.52f)
                lineToRelative(2.058f, 3.601f)
                curveToRelative(0.162f, 0.284f, 0.303f, 0.578f, 0.423f, 0.88f)
                close()
                moveTo(21.974f, 16.0f)
                horizontalLineToRelative(-3.974f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.821f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.974f)
                curveToRelative(-0.017f, 0.197f, -0.026f, 0.395f, -0.026f, 0.594f)
                verticalLineToRelative(1.406f)
                curveToRelative(0.0f, 1.478f, 0.805f, 2.771f, 2.0f, 3.463f)
                verticalLineToRelative(0.537f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                horizontalLineToRelative(7.821f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-0.537f)
                curveToRelative(1.195f, -0.693f, 2.0f, -1.985f, 2.0f, -3.463f)
                verticalLineToRelative(-1.406f)
                curveToRelative(0.0f, -0.199f, -0.009f, -0.397f, -0.026f, -0.594f)
                close()
                moveTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.791f, 0.0f, 0.0f, 1.791f, 0.0f, 4.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.34f, 0.044f, 0.676f, 0.128f, 1.0f)
                lineToRelative(0.103f, -0.789f)
                curveToRelative(0.063f, -0.483f, 0.191f, -0.952f, 0.381f, -1.4f)
                curveToRelative(0.263f, -0.618f, 0.629f, -1.466f, 0.754f, -1.684f)
                lineToRelative(2.057f, -3.6f)
                curveToRelative(1.246f, -2.181f, 3.565f, -3.527f, 6.077f, -3.527f)
                horizontalLineToRelative(5.179f)
                curveToRelative(2.511f, 0.0f, 4.83f, 1.346f, 6.077f, 3.526f)
                lineToRelative(2.058f, 3.602f)
                curveToRelative(0.14f, 0.245f, 0.492f, 1.051f, 0.694f, 1.522f)
                curveToRelative(0.1f, 0.233f, 0.171f, 0.473f, 0.216f, 0.722f)
                lineToRelative(0.227f, 1.259f)
                curveToRelative(0.033f, -0.207f, 0.05f, -0.418f, 0.05f, -0.63f)
                lineTo(24.001f, 4.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _truckFront!!
    }

private var _truckFront: ImageVector? = null
