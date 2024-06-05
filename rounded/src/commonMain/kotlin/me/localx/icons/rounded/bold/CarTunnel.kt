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

public val Icons.Bold.CarTunnel: ImageVector
    get() {
        if (_carTunnel != null) {
            return _carTunnel!!
        }
        _carTunnel = Builder(name = "CarTunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -4.962f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-10.5f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(18.539f, 16.358f)
                curveToRelative(0.306f, 0.85f, 0.461f, 1.738f, 0.461f, 2.642f)
                curveToRelative(0.0f, 1.309f, -0.847f, 2.412f, -2.018f, 2.821f)
                curveToRelative(0.007f, 0.059f, 0.018f, 0.117f, 0.018f, 0.179f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.061f, 0.011f, -0.119f, 0.018f, -0.179f)
                curveToRelative(-1.171f, -0.409f, -2.018f, -1.513f, -2.018f, -2.821f)
                curveToRelative(0.0f, -0.903f, 0.155f, -1.792f, 0.461f, -2.642f)
                lineToRelative(1.22f, -3.385f)
                curveToRelative(0.642f, -1.779f, 2.343f, -2.974f, 4.233f, -2.974f)
                horizontalLineToRelative(2.17f)
                curveToRelative(1.89f, 0.0f, 3.591f, 1.195f, 4.233f, 2.973f)
                lineToRelative(1.22f, 3.385f)
                close()
                moveTo(15.0f, 17.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7.5f, 19.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(15.22f, 16.0f)
                lineToRelative(-0.724f, -2.009f)
                curveToRelative(-0.214f, -0.593f, -0.781f, -0.991f, -1.411f, -0.991f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-0.63f, 0.0f, -1.197f, 0.398f, -1.411f, 0.992f)
                lineToRelative(-0.724f, 2.008f)
                horizontalLineToRelative(6.44f)
                close()
            }
        }
        .build()
        return _carTunnel!!
    }

private var _carTunnel: ImageVector? = null
