package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 192.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                reflectiveCurveTo(305.673f, 192.0f, 288.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.661f, 457.569f)
                lineToRelative(-99.046f, -99.067f)
                curveToRelative(74.18f, -99.06f, 54.01f, -239.499f, -45.05f, -313.678f)
                reflectiveCurveTo(119.067f, -9.187f, 44.887f, 89.873f)
                reflectiveCurveToRelative(-54.01f, 239.499f, 45.05f, 313.678f)
                curveToRelative(79.587f, 59.597f, 188.929f, 59.623f, 268.544f, 0.063f)
                lineToRelative(99.088f, 99.088f)
                curveToRelative(12.452f, 12.452f, 32.64f, 12.452f, 45.092f, 0.0f)
                curveToRelative(12.452f, -12.452f, 12.452f, -32.64f, 0.0f, -45.092f)
                lineTo(502.661f, 457.569f)
                close()
                moveTo(225.116f, 384.49f)
                curveToRelative(-88.02f, 0.0f, -159.374f, -71.354f, -159.374f, -159.374f)
                reflectiveCurveTo(137.097f, 65.742f, 225.116f, 65.742f)
                reflectiveCurveToRelative(159.374f, 71.354f, 159.374f, 159.374f)
                curveTo(384.397f, 313.097f, 313.098f, 384.397f, 225.116f, 384.49f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
