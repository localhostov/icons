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

public val Icons.Bold.CloudHail: ImageVector
    get() {
        if (_cloudHail != null) {
            return _cloudHail!!
        }
        _cloudHail = Builder(name = "CloudHail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 9.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 12.5f)
                close()
                moveTo(8.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 10.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 16.0f)
                close()
                moveTo(7.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 9.0f, 22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 21.0f)
                close()
                moveTo(12.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 14.0f, 22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 21.0f)
                close()
                moveTo(13.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 15.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 16.0f)
                close()
                moveTo(24.0f, 12.477f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.064f, 8.064f, 0.0f, false, true, -7.0f, 7.946f)
                lineTo(17.0f, 17.274f)
                lineToRelative(1.122f, -0.254f)
                arcTo(5.061f, 5.061f, 0.0f, false, false, 21.0f, 12.477f)
                arcTo(4.516f, 4.516f, 0.0f, false, false, 16.452f, 8.0f)
                lineTo(15.37f, 7.965f)
                lineToRelative(-0.308f, -1.038f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 10.091f, 3.0f)
                arcTo(4.935f, 4.935f, 0.0f, false, false, 5.0f, 8.0f)
                arcToRelative(5.935f, 5.935f, 0.0f, false, false, 0.247f, 2.025f)
                lineToRelative(0.479f, 1.258f)
                lineToRelative(-1.2f, 0.612f)
                arcTo(2.784f, 2.784f, 0.0f, false, false, 3.0f, 14.386f)
                arcToRelative(3.16f, 3.16f, 0.0f, false, false, 1.652f, 2.777f)
                lineToRelative(0.313f, 0.159f)
                lineTo(5.0f, 17.328f)
                lineTo(5.0f, 20.42f)
                lineToRelative(-0.267f, -0.058f)
                arcTo(6.156f, 6.156f, 0.0f, false, true, 0.0f, 14.386f)
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
                moveTo(2.999f, 14.386f)
                lineTo(3.0f, 14.386f)
                curveTo(3.0f, 14.405f, 3.0f, 14.4f, 3.0f, 14.386f)
                close()
                moveTo(20.999f, 12.477f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(23.999f, 12.477f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(14.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 11.0f)
                close()
            }
        }
        .build()
        return _cloudHail!!
    }

private var _cloudHail: ImageVector? = null
