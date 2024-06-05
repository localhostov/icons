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

public val Icons.Bold.CloudDrizzle: ImageVector
    get() {
        if (_cloudDrizzle != null) {
            return _cloudDrizzle!!
        }
        _cloudDrizzle = Builder(name = "CloudDrizzle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                close()
                moveTo(10.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                close()
                moveTo(24.0f, 12.477f)
                lineTo(24.0f, 12.5f)
                arcToRelative(8.037f, 8.037f, 0.0f, false, true, -4.0f, 6.9f)
                verticalLineToRelative(-3.94f)
                arcTo(4.977f, 4.977f, 0.0f, false, false, 21.0f, 12.5f)
                verticalLineToRelative(-0.023f)
                horizontalLineToRelative(0.0f)
                arcTo(4.516f, 4.516f, 0.0f, false, false, 16.452f, 8.0f)
                lineTo(15.37f, 7.965f)
                lineToRelative(-0.308f, -1.038f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 10.091f, 3.0f)
                arcTo(4.935f, 4.935f, 0.0f, false, false, 5.0f, 8.0f)
                arcToRelative(5.935f, 5.935f, 0.0f, false, false, 0.247f, 2.025f)
                lineToRelative(0.479f, 1.258f)
                lineToRelative(-1.2f, 0.612f)
                arcTo(2.784f, 2.784f, 0.0f, false, false, 3.0f, 14.386f)
                lineTo(3.0f, 14.386f)
                curveToRelative(0.0f, 0.038f, 0.0f, 5.289f, 0.0f, 5.289f)
                arcToRelative(6.214f, 6.214f, 0.0f, false, true, -3.0f, -5.289f)
                verticalLineToRelative(-0.01f)
                arcTo(5.769f, 5.769f, 0.0f, false, true, 2.133f, 9.892f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 2.0f, 8.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 8.091f, -8.0f)
                arcToRelative(8.292f, 8.292f, 0.0f, false, true, 7.492f, 5.1f)
                arcTo(7.411f, 7.411f, 0.0f, false, true, 24.0f, 12.477f)
                close()
                moveTo(0.005f, 14.386f)
                lineTo(0.0f, 14.386f)
                curveTo(0.0f, 14.4f, 0.0f, 14.405f, 0.005f, 14.386f)
                close()
                moveTo(16.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _cloudDrizzle!!
    }

private var _cloudDrizzle: ImageVector? = null
