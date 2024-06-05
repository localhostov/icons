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
                moveTo(20.0f, 12.0f)
                lineTo(16.386f, 12.0f)
                lineToRelative(0.54f, -4.334f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 4.013f)
                lineTo(11.623f, 4.013f)
                lineTo(11.883f, 2.0f)
                lineTo(17.0f, 2.0f)
                lineTo(17.0f, 0.013f)
                lineTo(10.118f, 0.013f)
                lineToRelative(-0.515f, 4.0f)
                lineTo(3.0f, 4.013f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 0.665f, 5.134f)
                arcTo(2.93f, 2.93f, 0.0f, false, false, 0.059f, 7.569f)
                lineTo(2.121f, 24.013f)
                lineTo(20.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(24.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 12.0f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 17.0f)
                lineTo(10.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 16.0f)
                close()
                moveTo(14.0f, 6.013f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, true, 0.78f, 0.374f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, true, 0.18f, 0.937f)
                lineTo(14.873f, 8.0f)
                lineTo(11.108f, 8.0f)
                lineToRelative(0.257f, -1.987f)
                close()
                moveTo(2.224f, 6.387f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 6.013f)
                lineTo(9.346f, 6.013f)
                lineTo(9.09f, 8.0f)
                lineTo(2.124f, 8.0f)
                lineToRelative(-0.1f, -0.771f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 2.224f, 6.387f)
                close()
                moveTo(2.376f, 10.0f)
                lineTo(14.623f, 10.0f)
                lineToRelative(-0.251f, 2.0f)
                lineTo(12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, false, 0.544f, 2.013f)
                lineTo(3.885f, 22.013f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(12.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(10.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _hamburgerSoda!!
    }

private var _hamburgerSoda: ImageVector? = null
