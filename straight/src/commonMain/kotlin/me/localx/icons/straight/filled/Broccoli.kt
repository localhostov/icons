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

public val Icons.Filled.Broccoli: ImageVector
    get() {
        if (_broccoli != null) {
            return _broccoli!!
        }
        _broccoli = Builder(name = "Broccoli", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                arcToRelative(6.945f, 6.945f, 0.0f, false, false, 2.69f, -0.551f)
                arcTo(21.206f, 21.206f, 0.0f, false, false, 16.0f, 23.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 23.0f)
                arcToRelative(21.742f, 21.742f, 0.0f, false, false, -0.556f, -5.028f)
                arcToRelative(8.847f, 8.847f, 0.0f, false, false, 2.98f, -0.768f)
                curveToRelative(0.185f, 0.092f, 0.381f, 0.166f, 0.576f, 0.242f)
                lineTo(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 17.943f)
                arcTo(9.123f, 9.123f, 0.0f, false, false, 14.0f, 18.0f)
                close()
                moveTo(5.039f, 5.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(5.039f, 5.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(20.791f, 6.2f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, -4.6f, -3.194f)
                arcToRelative(5.993f, 5.993f, 0.0f, false, false, -10.417f, 0.034f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 12.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                curveToRelative(0.0f, 3.757f, 2.617f, 6.0f, 7.0f, 6.0f)
                arcToRelative(7.267f, 7.267f, 0.0f, false, false, 3.509f, -1.086f)
                arcTo(5.685f, 5.685f, 0.0f, false, false, 14.0f, 16.0f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, false, 2.0f, -0.424f)
                arcTo(5.929f, 5.929f, 0.0f, false, true, 14.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.951f, 3.951f, 0.0f, false, false, 3.734f, 4.0f)
                arcToRelative(4.494f, 4.494f, 0.0f, false, false, 1.06f, -8.794f)
                close()
            }
        }
        .build()
        return _broccoli!!
    }

private var _broccoli: ImageVector? = null
