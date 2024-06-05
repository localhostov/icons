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
                moveToRelative(24.0f, 13.149f)
                curveToRelative(0.0f, -0.592f, -0.095f, -1.177f, -0.282f, -1.74f)
                lineToRelative(-1.339f, -4.017f)
                curveToRelative(-0.478f, -1.432f, -1.812f, -2.393f, -3.32f, -2.393f)
                horizontalLineToRelative(-4.059f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 16.999f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.171f, -0.018f, -0.338f, -0.05f, -0.5f)
                horizontalLineToRelative(1.101f)
                curveToRelative(-0.033f, 0.162f, -0.05f, 0.329f, -0.05f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.171f, -0.018f, -0.338f, -0.05f, -0.5f)
                horizontalLineToRelative(6.101f)
                curveToRelative(-0.033f, 0.162f, -0.05f, 0.329f, -0.05f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.171f, -0.018f, -0.338f, -0.05f, -0.5f)
                horizontalLineToRelative(2.05f)
                verticalLineToRelative(-6.851f)
                close()
                moveTo(19.059f, 8.0f)
                curveToRelative(0.216f, 0.0f, 0.406f, 0.138f, 0.475f, 0.342f)
                lineToRelative(1.338f, 4.016f)
                curveToRelative(0.085f, 0.256f, 0.128f, 0.522f, 0.128f, 0.792f)
                verticalLineToRelative(0.351f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1.059f)
                close()
            }
        }
        .build()
        return _truckContainerEmpty!!
    }

private var _truckContainerEmpty: ImageVector? = null
