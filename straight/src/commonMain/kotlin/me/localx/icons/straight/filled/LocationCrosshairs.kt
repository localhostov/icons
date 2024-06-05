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

public val Icons.Filled.LocationCrosshairs: ImageVector
    get() {
        if (_locationCrosshairs != null) {
            return _locationCrosshairs!!
        }
        _locationCrosshairs = Builder(name = "LocationCrosshairs", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.949f, 11.0f)
                curveToRelative(-0.471f, -4.717f, -4.232f, -8.479f, -8.949f, -8.949f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.051f)
                curveTo(6.283f, 2.521f, 2.521f, 6.283f, 2.051f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.051f, 13.0f)
                curveToRelative(0.471f, 4.717f, 4.232f, 8.479f, 8.949f, 8.949f)
                verticalLineToRelative(2.051f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.051f)
                curveToRelative(4.717f, -0.471f, 8.479f, -4.232f, 8.949f, -8.949f)
                horizontalLineToRelative(2.051f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.051f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _locationCrosshairs!!
    }

private var _locationCrosshairs: ImageVector? = null
