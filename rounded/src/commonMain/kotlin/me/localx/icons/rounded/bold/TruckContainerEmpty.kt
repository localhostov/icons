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

public val Icons.Bold.TruckContainerEmpty: ImageVector
    get() {
        if (_truckContainerEmpty != null) {
            return _truckContainerEmpty!!
        }
        _truckContainerEmpty = Builder(name = "TruckContainerEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.615f, 10.524f)
                lineToRelative(-0.841f, -2.524f)
                curveToRelative(-0.614f, -1.841f, -2.329f, -3.077f, -4.269f, -3.077f)
                horizontalLineToRelative(-2.004f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(10.577f)
                lineTo(1.5f, 17.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.004f, 0.0f, 0.009f, 0.0f, 0.013f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(1.987f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.838f)
                curveToRelative(1.181f, -0.563f, 2.0f, -1.769f, 2.0f, -3.162f)
                verticalLineToRelative(-3.604f)
                curveToRelative(0.0f, -0.808f, -0.129f, -1.605f, -0.385f, -2.372f)
                close()
                moveTo(18.505f, 7.922f)
                curveToRelative(0.646f, 0.0f, 1.219f, 0.412f, 1.423f, 1.026f)
                lineToRelative(0.841f, 2.524f)
                curveToRelative(0.153f, 0.46f, 0.231f, 0.938f, 0.231f, 1.423f)
                verticalLineToRelative(0.046f)
                lineToRelative(-3.0f, 0.039f)
                verticalLineToRelative(-5.058f)
                horizontalLineToRelative(0.504f)
                close()
            }
        }
        .build()
        return _truckContainerEmpty!!
    }

private var _truckContainerEmpty: ImageVector? = null
