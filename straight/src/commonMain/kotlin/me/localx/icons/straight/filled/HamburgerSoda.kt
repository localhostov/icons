package me.localx.icons.straight.filled

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
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(14.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(24.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                close()
                moveTo(6.0f, 16.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, false, 1.551f, 4.013f)
                lineTo(2.121f, 24.013f)
                lineTo(0.059f, 7.569f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 0.665f, 5.134f)
                arcTo(2.986f, 2.986f, 0.0f, false, true, 3.0f, 4.013f)
                lineTo(9.6f, 4.013f)
                lineToRelative(0.515f, -4.0f)
                lineTo(17.0f, 0.013f)
                lineTo(17.0f, 2.0f)
                lineTo(11.883f, 2.0f)
                lineToRelative(-0.26f, 2.013f)
                lineTo(14.0f, 4.013f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.928f, 3.653f)
                lineTo(16.634f, 10.0f)
                lineTo(12.0f, 10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 16.0f)
                close()
                moveTo(11.363f, 6.013f)
                lineTo(11.108f, 8.0f)
                horizontalLineToRelative(3.765f)
                lineToRelative(0.085f, -0.676f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, false, -0.18f, -0.937f)
                arcTo(0.992f, 0.992f, 0.0f, false, false, 14.0f, 6.013f)
                close()
                moveTo(9.09f, 8.0f)
                lineToRelative(0.256f, -1.987f)
                lineTo(3.0f, 6.013f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.977f, 1.216f)
                lineToRelative(0.1f, 0.771f)
                close()
            }
        }
        .build()
        return _hamburgerSoda!!
    }

private var _hamburgerSoda: ImageVector? = null
