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

public val Icons.Outline.SpeedometerArrow: ImageVector
    get() {
        if (_speedometerArrow != null) {
            return _speedometerArrow!!
        }
        _speedometerArrow = Builder(name = "SpeedometerArrow", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.914f, 19.45f)
                curveToRelative(0.051f, 0.176f, 0.086f, 0.358f, 0.086f, 0.55f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.164f, 0.0f, 0.321f, 0.025f, 0.474f, 0.062f)
                lineToRelative(3.795f, -3.795f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.768f, 3.769f)
                close()
                moveTo(21.0f, 12.089f)
                verticalLineToRelative(-6.089f)
                lineToRelative(1.539f, 1.538f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.672f, -2.673f)
                curveToRelative(-0.706f, -0.702f, -1.854f, -0.704f, -2.561f, 0.0f)
                lineToRelative(-2.672f, 2.672f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.539f, -1.538f)
                verticalLineToRelative(4.273f)
                curveToRelative(-1.718f, -1.24f, -3.771f, -2.037f, -6.0f, -2.222f)
                lineTo(13.001f, 3.0f)
                lineToRelative(1.539f, 1.538f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.28f, 0.451f)
                curveToRelative(-0.705f, -0.702f, -1.854f, -0.704f, -2.561f, 0.0f)
                lineToRelative(-2.672f, 2.672f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.539f, -1.538f)
                verticalLineToRelative(5.051f)
                curveToRelative(-2.229f, 0.185f, -4.282f, 0.982f, -6.0f, 2.222f)
                verticalLineToRelative(-4.273f)
                lineToRelative(1.539f, 1.538f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.672f, -2.673f)
                curveToRelative(-0.705f, -0.702f, -1.854f, -0.704f, -2.561f, 0.0f)
                lineTo(0.047f, 6.124f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.539f, -1.538f)
                verticalLineToRelative(6.089f)
                curveToRelative(-1.861f, 2.115f, -3.0f, 4.879f, -3.0f, 7.911f)
                curveToRelative(0.0f, 1.088f, 0.156f, 2.188f, 0.463f, 3.272f)
                lineToRelative(0.206f, 0.728f)
                horizontalLineToRelative(6.332f)
                verticalLineToRelative(-2.0f)
                lineTo(2.208f, 22.0f)
                curveToRelative(-0.139f, -0.668f, -0.208f, -1.338f, -0.208f, -2.0f)
                curveToRelative(0.0f, -5.514f, 4.486f, -10.0f, 10.0f, -10.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.662f, -0.07f, 1.332f, -0.208f, 2.0f)
                horizontalLineToRelative(-4.792f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.332f)
                lineToRelative(0.206f, -0.728f)
                curveToRelative(0.307f, -1.084f, 0.463f, -2.185f, 0.463f, -3.272f)
                curveToRelative(0.0f, -3.032f, -1.139f, -5.796f, -3.0f, -7.911f)
                close()
            }
        }
        .build()
        return _speedometerArrow!!
    }

private var _speedometerArrow: ImageVector? = null
