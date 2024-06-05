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

public val Icons.Bold.TruckFlatbed: ImageVector
    get() {
        if (_truckFlatbed != null) {
            return _truckFlatbed!!
        }
        _truckFlatbed = Builder(name = "TruckFlatbed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.322f, 13.224f)
                lineToRelative(-1.487f, -4.463f)
                curveToRelative(-0.75f, -2.249f, -2.847f, -3.761f, -5.218f, -3.761f)
                horizontalLineToRelative(-2.117f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                lineTo(1.5f, 17.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.746f, -1.118f, -3.23f, -2.678f, -3.776f)
                close()
                moveTo(14.0f, 13.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(0.617f)
                curveToRelative(1.077f, 0.0f, 2.031f, 0.688f, 2.372f, 1.71f)
                lineToRelative(1.096f, 3.29f)
                horizontalLineToRelative(-4.085f)
                close()
            }
        }
        .build()
        return _truckFlatbed!!
    }

private var _truckFlatbed: ImageVector? = null
