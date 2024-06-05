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

public val Icons.Filled.Branding: ImageVector
    get() {
        if (_branding != null) {
            return _branding!!
        }
        _branding = Builder(name = "Branding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.3f)
                curveToRelative(0.697f, 0.245f, 1.341f, 0.627f, 1.879f, 1.165f)
                lineToRelative(1.656f, 1.656f)
                curveToRelative(0.537f, 0.537f, 0.92f, 1.182f, 1.165f, 1.879f)
                horizontalLineToRelative(-4.7f)
                lineTo(19.0f, 0.3f)
                close()
                moveTo(10.534f, 17.62f)
                curveToRelative(0.516f, 0.516f, 1.416f, 0.516f, 1.932f, 0.0f)
                lineToRelative(4.143f, -4.143f)
                curveToRelative(-0.466f, -0.298f, -1.016f, -0.477f, -1.609f, -0.477f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.593f, 0.0f, -1.143f, 0.178f, -1.609f, 0.477f)
                lineToRelative(4.143f, 4.143f)
                close()
                moveTo(13.88f, 19.034f)
                curveToRelative(-0.656f, 0.656f, -1.518f, 0.984f, -2.38f, 0.984f)
                reflectiveCurveToRelative(-1.724f, -0.328f, -2.38f, -0.984f)
                lineToRelative(-3.959f, -3.959f)
                curveToRelative(-0.096f, 0.293f, -0.161f, 0.6f, -0.161f, 0.925f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.325f, -0.065f, -0.632f, -0.161f, -0.925f)
                lineToRelative(-3.959f, 3.959f)
                close()
                moveTo(0.0f, 2.0f)
                curveTo(0.0f, 0.895f, 0.895f, 0.0f, 2.0f, 0.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(10.437f)
                curveToRelative(0.0f, 1.0f, -0.397f, 1.96f, -1.105f, 2.667f)
                lineToRelative(-0.895f, 0.895f)
                lineToRelative(-0.895f, -0.895f)
                curveTo(0.397f, 14.397f, 0.0f, 13.438f, 0.0f, 12.437f)
                lineTo(0.0f, 2.0f)
                close()
                moveTo(19.0f, 7.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                verticalLineToRelative(7.424f)
                curveToRelative(0.614f, -0.269f, 1.288f, -0.424f, 2.0f, -0.424f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                lineTo(24.0f, 7.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _branding!!
    }

private var _branding: ImageVector? = null
