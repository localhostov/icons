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

public val Icons.Bold.Microchip: ImageVector
    get() {
        if (_microchip != null) {
            return _microchip!!
        }
        _microchip = Builder(name = "Microchip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.22f, -1.53f, -1.42f, -2.73f, -2.95f, -2.95f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 2.05f)
                curveToRelative(-1.53f, 0.22f, -2.73f, 1.42f, -2.95f, 2.95f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 13.5f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 19.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
            }
        }
        .build()
        return _microchip!!
    }

private var _microchip: ImageVector? = null
