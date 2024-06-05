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

public val Icons.Outline.IpAddress: ImageVector
    get() {
        if (_ipAddress != null) {
            return _ipAddress!!
        }
        _ipAddress = Builder(name = "IpAddress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.777f, 3.222f)
                curveToRelative(-2.077f, -2.078f, -4.84f, -3.222f, -7.777f, -3.222f)
                reflectiveCurveToRelative(-5.7f, 1.145f, -7.778f, 3.222f)
                curveToRelative(-2.078f, 2.077f, -3.222f, 4.839f, -3.222f, 7.778f)
                reflectiveCurveToRelative(1.144f, 5.7f, 3.25f, 7.805f)
                lineToRelative(3.942f, 3.643f)
                curveToRelative(1.024f, 1.0f, 2.376f, 1.552f, 3.808f, 1.552f)
                reflectiveCurveToRelative(2.784f, -0.551f, 3.786f, -1.533f)
                lineToRelative(3.991f, -3.689f)
                curveToRelative(2.078f, -2.078f, 3.222f, -4.84f, 3.222f, -7.778f)
                reflectiveCurveToRelative(-1.144f, -5.701f, -3.222f, -7.778f)
                close()
                moveTo(18.391f, 17.336f)
                lineToRelative(-3.983f, 3.682f)
                curveToRelative(-1.294f, 1.266f, -3.501f, 1.287f, -4.838f, -0.02f)
                lineToRelative(-3.935f, -3.635f)
                curveToRelative(-1.7f, -1.7f, -2.636f, -3.96f, -2.636f, -6.364f)
                reflectiveCurveToRelative(0.936f, -4.664f, 2.636f, -6.364f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.636f, 6.364f, -2.636f)
                reflectiveCurveToRelative(4.663f, 0.936f, 6.363f, 2.636f)
                curveToRelative(1.7f, 1.7f, 2.636f, 3.959f, 2.636f, 6.364f)
                reflectiveCurveToRelative(-0.936f, 4.664f, -2.607f, 6.336f)
                close()
                moveTo(10.0f, 7.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, -0.358f, 0.8f, -0.8f, 0.8f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.442f, 0.0f, -0.8f, -0.358f, -0.8f, -0.8f)
                verticalLineToRelative(-6.4f)
                curveToRelative(0.0f, -0.442f, 0.358f, -0.8f, 0.8f, -0.8f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.442f, 0.0f, 0.8f, 0.358f, 0.8f, 0.8f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.442f, 0.0f, -0.8f, 0.358f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 0.442f, 0.358f, 0.8f, 0.8f, 0.8f)
                reflectiveCurveToRelative(0.8f, -0.358f, 0.8f, -0.8f)
                verticalLineToRelative(-2.2f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(14.0f, 10.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.497f, 0.0f, 0.9f, 0.403f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.403f, 0.9f, -0.9f, 0.9f)
                close()
            }
        }
        .build()
        return _ipAddress!!
    }

private var _ipAddress: ImageVector? = null
