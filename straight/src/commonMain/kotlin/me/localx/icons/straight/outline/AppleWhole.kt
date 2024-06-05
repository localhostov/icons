package me.localx.icons.straight.outline

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

public val Icons.Outline.AppleWhole: ImageVector
    get() {
        if (_appleWhole != null) {
            return _appleWhole!!
        }
        _appleWhole = Builder(name = "AppleWhole", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.242f, 6.192f)
                arcTo(7.376f, 7.376f, 0.0f, false, false, 18.989f, 0.934f)
                lineTo(18.925f, 0.075f)
                lineTo(18.066f, 0.011f)
                arcTo(7.361f, 7.361f, 0.0f, false, false, 12.807f, 1.76f)
                arcToRelative(5.088f, 5.088f, 0.0f, false, false, -0.577f, 0.7f)
                arcTo(15.457f, 15.457f, 0.0f, false, false, 11.19f, 0.052f)
                lineTo(9.435f, 1.01f)
                arcTo(13.307f, 13.307f, 0.0f, false, true, 10.953f, 6.0f)
                horizontalLineTo(8.5f)
                arcTo(8.771f, 8.771f, 0.0f, false, false, 0.0f, 15.0f)
                curveToRelative(-0.107f, 6.331f, 6.417f, 10.953f, 12.0f, 8.2f)
                curveToRelative(5.584f, 2.752f, 12.107f, -1.869f, 12.0f, -8.2f)
                arcTo(8.9f, 8.9f, 0.0f, false, false, 17.242f, 6.192f)
                close()
                moveTo(14.221f, 3.174f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 2.738f, -1.133f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -1.133f, 2.738f)
                arcToRelative(4.781f, 4.781f, 0.0f, false, true, -2.771f, 1.166f)
                arcTo(4.781f, 4.781f, 0.0f, false, true, 14.221f, 3.174f)
                close()
                moveTo(15.5f, 22.0f)
                arcToRelative(6.063f, 6.063f, 0.0f, false, true, -3.009f, -0.8f)
                lineTo(12.0f, 20.924f)
                lineToRelative(-0.491f, 0.278f)
                curveTo(7.2f, 23.7f, 1.907f, 20.061f, 2.0f, 15.0f)
                arcTo(6.772f, 6.772f, 0.0f, false, true, 8.5f, 8.0f)
                horizontalLineToRelative(7.0f)
                curveTo(24.1f, 8.321f, 24.1f, 21.682f, 15.5f, 22.0f)
                close()
            }
        }
        .build()
        return _appleWhole!!
    }

private var _appleWhole: ImageVector? = null
