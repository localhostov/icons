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

public val Icons.Outline.HamburgerSoda: ImageVector
    get() {
        if (_hamburgerSoda != null) {
            return _hamburgerSoda!!
        }
        _hamburgerSoda = Builder(name = "HamburgerSoda", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                lineTo(16.386f, 12.0f)
                lineToRelative(0.54f, -4.331f)
                arcTo(3.017f, 3.017f, 0.0f, false, false, 14.0f, 4.017f)
                lineTo(11.631f, 4.017f)
                curveToRelative(0.109f, -0.771f, 0.043f, -2.007f, 1.134f, -2.012f)
                lineTo(16.0f, 2.005f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(12.765f, 0.005f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.79f, 2.633f)
                lineTo(9.617f, 4.017f)
                lineTo(3.0f, 4.017f)
                arcTo(3.021f, 3.021f, 0.0f, false, false, 0.059f, 7.572f)
                lineTo(1.572f, 19.63f)
                arcToRelative(5.005f, 5.005f, 0.0f, false, false, 4.959f, 4.376f)
                lineTo(19.0f, 23.994f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.0f, 12.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(10.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 17.0f)
                close()
                moveTo(14.0f, 6.016f)
                arcToRelative(1.011f, 1.011f, 0.0f, false, true, 0.96f, 1.311f)
                lineTo(14.873f, 8.0f)
                horizontalLineToRelative(-3.74f)
                lineToRelative(0.248f, -1.986f)
                close()
                moveTo(2.224f, 6.39f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 6.016f)
                lineTo(9.367f, 6.016f)
                lineTo(9.118f, 8.0f)
                lineTo(2.124f, 8.0f)
                lineToRelative(-0.1f, -0.77f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 2.224f, 6.39f)
                close()
                moveTo(3.556f, 19.382f)
                lineTo(2.376f, 10.0f)
                lineTo(14.623f, 10.0f)
                lineToRelative(-0.251f, 2.0f)
                lineTo(13.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                curveToRelative(-0.042f, 1.634f, -0.1f, 3.74f, 1.036f, 5.01f)
                lineTo(6.531f, 22.01f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.556f, 19.382f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                horizontalLineToRelative(3.7f)
                curveToRelative(0.387f, 0.186f, 2.875f, 2.111f, 3.3f, 2.0f)
                curveToRelative(0.416f, 0.118f, 2.93f, -1.823f, 3.3f, -2.0f)
                lineTo(22.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _hamburgerSoda!!
    }

private var _hamburgerSoda: ImageVector? = null
