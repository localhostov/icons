package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

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
                moveTo(128.0f, 192.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.494f, 358.373f)
                curveToRelative(74.08f, -99.0f, 53.879f, -239.309f, -45.121f, -313.389f)
                reflectiveCurveTo(119.064f, -8.895f, 44.984f, 90.105f)
                reflectiveCurveTo(-8.895f, 329.414f, 90.105f, 403.494f)
                curveToRelative(79.523f, 59.506f, 188.745f, 59.506f, 268.268f, 0.0f)
                lineToRelative(108.341f, 108.341f)
                lineToRelative(45.121f, -45.036f)
                lineTo(403.494f, 358.373f)
                close()
                moveTo(225.049f, 384.375f)
                curveToRelative(-87.993f, 0.0f, -159.326f, -71.333f, -159.326f, -159.326f)
                reflectiveCurveTo(137.056f, 65.723f, 225.049f, 65.723f)
                reflectiveCurveToRelative(159.326f, 71.333f, 159.326f, 159.326f)
                curveTo(384.293f, 313.008f, 313.008f, 384.293f, 225.049f, 384.375f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
