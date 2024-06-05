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

public val Icons.Bold.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) {
            return _lighthouse!!
        }
        _lighthouse = Builder(name = "Lighthouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 9.125f)
                lineToRelative(-5.0f, 1.875f)
                verticalLineToRelative(-3.203f)
                lineToRelative(5.0f, -1.875f)
                verticalLineToRelative(3.204f)
                close()
                moveTo(5.0f, 1.875f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(3.203f)
                lineToRelative(5.0f, 1.875f)
                lineTo(5.0f, 1.875f)
                close()
                moveTo(17.0f, 8.365f)
                lineToRelative(2.0f, 11.135f)
                verticalLineToRelative(4.5f)
                lineTo(5.0f, 24.0f)
                lineToRelative(0.024f, -4.769f)
                lineToRelative(1.976f, -10.866f)
                lineTo(7.0f, 2.5f)
                lineTo(12.0f, 0.0f)
                lineToRelative(5.0f, 2.5f)
                verticalLineToRelative(5.865f)
                close()
                moveTo(9.993f, 5.0f)
                lineToRelative(-0.009f, 2.0f)
                horizontalLineToRelative(4.016f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.007f)
                close()
                moveTo(16.0f, 19.635f)
                lineToRelative(-1.731f, -9.635f)
                horizontalLineToRelative(-4.518f)
                lineToRelative(-1.752f, 9.635f)
                verticalLineToRelative(1.365f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.365f)
                close()
                moveTo(19.0f, 9.125f)
                lineToRelative(5.0f, 1.875f)
                verticalLineToRelative(-3.203f)
                lineToRelative(-5.0f, -1.875f)
                verticalLineToRelative(3.204f)
                close()
                moveTo(19.0f, 1.875f)
                verticalLineToRelative(3.204f)
                lineToRelative(5.0f, -1.875f)
                lineTo(24.0f, 0.0f)
                lineToRelative(-5.0f, 1.875f)
                close()
            }
        }
        .build()
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
