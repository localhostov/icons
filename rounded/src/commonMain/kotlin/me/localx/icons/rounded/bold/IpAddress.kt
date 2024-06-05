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

public val Icons.Bold.IpAddress: ImageVector
    get() {
        if (_ipAddress != null) {
            return _ipAddress!!
        }
        _ipAddress = Builder(name = "IpAddress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.78f, 3.238f)
                curveToRelative(-2.078f, -2.088f, -4.841f, -3.238f, -7.78f, -3.238f)
                reflectiveCurveToRelative(-5.703f, 1.15f, -7.781f, 3.238f)
                curveTo(-0.065f, 7.543f, -0.065f, 14.548f, 4.262f, 18.894f)
                lineToRelative(3.734f, 3.466f)
                curveToRelative(1.076f, 1.057f, 2.498f, 1.64f, 4.004f, 1.64f)
                reflectiveCurveToRelative(2.928f, -0.583f, 3.973f, -1.61f)
                lineToRelative(3.808f, -3.537f)
                curveToRelative(4.284f, -4.305f, 4.284f, -11.31f, 0.0f, -15.615f)
                close()
                moveTo(17.696f, 16.696f)
                lineToRelative(-3.796f, 3.525f)
                curveToRelative(-1.021f, 1.005f, -2.748f, 1.034f, -3.832f, -0.029f)
                lineToRelative(-3.723f, -3.455f)
                curveToRelative(-3.124f, -3.138f, -3.124f, -8.245f, 0.0f, -11.383f)
                curveToRelative(1.511f, -1.518f, 3.519f, -2.354f, 5.654f, -2.354f)
                reflectiveCurveToRelative(4.144f, 0.836f, 5.653f, 2.354f)
                curveToRelative(3.124f, 3.138f, 3.124f, 8.245f, 0.043f, 11.342f)
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
