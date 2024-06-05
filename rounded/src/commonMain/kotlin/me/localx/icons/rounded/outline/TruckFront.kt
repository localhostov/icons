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

public val Icons.Outline.TruckFront: ImageVector
    get() {
        if (_truckFront != null) {
            return _truckFront!!
        }
        _truckFront = Builder(name = "TruckFront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.978f, 0.36f, 1.919f, 1.0f, 2.645f)
                verticalLineToRelative(0.355f)
                curveToRelative(0.0f, 1.478f, 0.805f, 2.771f, 2.0f, 3.463f)
                verticalLineToRelative(0.537f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-0.537f)
                curveToRelative(1.195f, -0.693f, 2.0f, -1.985f, 2.0f, -3.463f)
                verticalLineToRelative(-0.355f)
                curveToRelative(0.64f, -0.726f, 1.0f, -1.667f, 1.0f, -2.645f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(3.723f, 14.0f)
                lineToRelative(1.993f, -3.488f)
                curveToRelative(0.533f, -0.933f, 1.531f, -1.512f, 2.604f, -1.512f)
                horizontalLineToRelative(7.357f)
                curveToRelative(1.073f, 0.0f, 2.071f, 0.579f, 2.604f, 1.512f)
                lineToRelative(1.993f, 3.488f)
                lineTo(3.723f, 14.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.985f)
                lineToRelative(-1.98f, -3.466f)
                curveToRelative(-0.888f, -1.554f, -2.551f, -2.52f, -4.341f, -2.52f)
                horizontalLineToRelative(-7.357f)
                curveToRelative(-1.79f, 0.0f, -3.453f, 0.966f, -4.341f, 2.52f)
                lineToRelative(-1.98f, 3.466f)
                verticalLineToRelative(-7.985f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(21.0f, 18.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-1.406f)
                curveToRelative(0.0f, -0.199f, 0.013f, -0.397f, 0.036f, -0.594f)
                horizontalLineToRelative(1.964f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.964f)
                curveToRelative(0.024f, 0.197f, 0.036f, 0.395f, 0.036f, 0.594f)
                verticalLineToRelative(1.406f)
                close()
            }
        }
        .build()
        return _truckFront!!
    }

private var _truckFront: ImageVector? = null
