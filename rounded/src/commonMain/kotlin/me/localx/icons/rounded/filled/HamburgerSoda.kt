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

public val Icons.Filled.HamburgerSoda: ImageVector
    get() {
        if (_hamburgerSoda != null) {
            return _hamburgerSoda!!
        }
        _hamburgerSoda = Builder(name = "HamburgerSoda", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.5f)
                lineTo(24.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                arcToRelative(4.554f, 4.554f, 0.0f, false, true, 4.5f, -5.0f)
                horizontalLineToRelative(6.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 24.0f, 16.5f)
                close()
                moveTo(18.2f, 20.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.109f, 0.0f)
                lineTo(14.343f, 19.0f)
                lineTo(9.0f, 19.0f)
                arcToRelative(4.555f, 4.555f, 0.0f, false, false, 4.5f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcTo(4.554f, 4.554f, 0.0f, false, false, 24.0f, 19.0f)
                horizontalLineToRelative(-3.05f)
                close()
                moveTo(7.0f, 16.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(6.469f, 6.469f, 0.0f, false, false, 1.832f, 4.51f)
                horizontalLineToRelative(-2.3f)
                arcTo(5.005f, 5.005f, 0.0f, false, true, 1.572f, 19.63f)
                lineTo(0.059f, 7.572f)
                arcTo(3.02f, 3.02f, 0.0f, false, true, 3.0f, 4.017f)
                lineTo(9.617f, 4.017f)
                lineTo(9.79f, 2.633f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.765f, 0.006f)
                lineTo(16.0f, 0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(12.765f, 2.006f)
                curveToRelative(-1.09f, 0.0f, -1.027f, 1.245f, -1.134f, 2.012f)
                lineTo(14.0f, 4.018f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, 2.928f, 3.652f)
                lineTo(16.635f, 10.0f)
                lineTo(13.5f, 10.0f)
                arcTo(6.506f, 6.506f, 0.0f, false, false, 7.0f, 16.5f)
                close()
                moveTo(11.38f, 6.018f)
                lineTo(11.133f, 8.0f)
                horizontalLineToRelative(3.74f)
                lineToRelative(0.085f, -0.675f)
                arcTo(1.011f, 1.011f, 0.0f, false, false, 14.0f, 6.016f)
                close()
                moveTo(9.118f, 8.0f)
                lineToRelative(0.249f, -1.986f)
                lineTo(3.0f, 6.014f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.977f, 1.216f)
                lineToRelative(0.1f, 0.77f)
                close()
            }
        }
        .build()
        return _hamburgerSoda!!
    }

private var _hamburgerSoda: ImageVector? = null
