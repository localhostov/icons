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

public val Icons.Filled.IpAddress: ImageVector
    get() {
        if (_ipAddress != null) {
            return _ipAddress!!
        }
        _ipAddress = Builder(name = "IpAddress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.9f, 9.5f)
                curveToRelative(0.0f, 0.497f, -0.403f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.497f, 0.0f, 0.9f, 0.403f, 0.9f, 0.9f)
                close()
                moveTo(22.909f, 11.0f)
                curveToRelative(0.0f, 2.938f, -1.144f, 5.7f, -3.222f, 7.778f)
                lineToRelative(-3.991f, 3.689f)
                curveToRelative(-1.002f, 0.981f, -2.354f, 1.533f, -3.786f, 1.533f)
                reflectiveCurveToRelative(-2.783f, -0.551f, -3.808f, -1.552f)
                lineToRelative(-3.942f, -3.643f)
                curveToRelative(-2.106f, -2.105f, -3.25f, -4.867f, -3.25f, -7.805f)
                reflectiveCurveToRelative(1.144f, -5.701f, 3.222f, -7.778f)
                curveTo(6.21f, 1.145f, 8.972f, 0.0f, 11.91f, 0.0f)
                reflectiveCurveToRelative(5.7f, 1.145f, 7.777f, 3.222f)
                curveToRelative(2.078f, 2.077f, 3.222f, 4.839f, 3.222f, 7.778f)
                close()
                moveTo(10.0f, 7.8f)
                curveToRelative(0.0f, -0.442f, -0.358f, -0.8f, -0.8f, -0.8f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.442f, 0.0f, -0.8f, 0.358f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, 0.358f, 0.8f, 0.8f, 0.8f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.442f, 0.0f, 0.8f, -0.358f, 0.8f, -0.8f)
                verticalLineToRelative(-6.4f)
                close()
                moveTo(16.5f, 9.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.442f, 0.0f, -0.8f, 0.358f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, 0.358f, 0.8f, 0.8f, 0.8f)
                reflectiveCurveToRelative(0.8f, -0.358f, 0.8f, -0.8f)
                verticalLineToRelative(-2.2f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _ipAddress!!
    }

private var _ipAddress: ImageVector? = null
