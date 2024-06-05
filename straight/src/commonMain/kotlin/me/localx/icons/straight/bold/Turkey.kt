package me.localx.icons.straight.bold

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

public val Icons.Bold.Turkey: ImageVector
    get() {
        if (_turkey != null) {
            return _turkey!!
        }
        _turkey = Builder(name = "Turkey", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.885f, 10.672f)
                curveToRelative(0.079f, -0.668f, 0.106f, -1.194f, 0.114f, -1.434f)
                lineToRelative(0.022f, -0.651f)
                lineToRelative(-0.244f, -0.243f)
                lineToRelative(0.875f, -0.875f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 22.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.469f, 1.348f)
                lineToRelative(-0.875f, 0.875f)
                lineToRelative(-0.244f, -0.244f)
                lineTo(16.762f, 6.0f)
                arcToRelative(15.744f, 15.744f, 0.0f, false, false, -5.447f, 1.147f)
                arcTo(18.012f, 18.012f, 0.0f, false, false, 9.137f, 7.0f)
                arcTo(9.063f, 9.063f, 0.0f, false, false, 0.0f, 15.967f)
                verticalLineToRelative(6.874f)
                lineToRelative(1.258f, 0.206f)
                arcTo(77.633f, 77.633f, 0.0f, false, false, 9.137f, 24.0f)
                curveTo(14.688f, 24.0f, 24.0f, 23.2f, 24.0f, 17.833f)
                curveTo(24.0f, 15.394f, 22.461f, 12.743f, 19.885f, 10.672f)
                close()
                moveTo(16.962f, 9.772f)
                curveToRelative(-0.135f, 1.583f, -0.578f, 3.69f, -1.32f, 4.433f)
                arcToRelative(2.786f, 2.786f, 0.0f, false, true, -3.846f, 0.0f)
                arcToRelative(2.722f, 2.722f, 0.0f, false, true, 0.0f, -3.845f)
                curveToRelative(0.738f, -0.739f, 2.849f, -1.183f, 4.434f, -1.32f)
                close()
                moveTo(9.137f, 21.0f)
                arcTo(61.128f, 61.128f, 0.0f, false, true, 3.0f, 20.285f)
                lineTo(3.0f, 15.967f)
                arcToRelative(6.038f, 6.038f, 0.0f, false, true, 5.469f, -5.93f)
                arcToRelative(5.714f, 5.714f, 0.0f, false, false, 9.294f, 6.288f)
                arcToRelative(6.347f, 6.347f, 0.0f, false, false, 1.365f, -2.3f)
                arcTo(5.966f, 5.966f, 0.0f, false, true, 21.0f, 17.833f)
                curveTo(21.0f, 19.668f, 16.011f, 21.0f, 9.137f, 21.0f)
                close()
                moveTo(9.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                close()
                moveTo(14.0f, 4.0f)
                lineTo(11.0f, 4.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(4.0f, 4.0f)
                lineTo(1.0f, 4.0f)
                lineTo(1.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _turkey!!
    }

private var _turkey: ImageVector? = null
