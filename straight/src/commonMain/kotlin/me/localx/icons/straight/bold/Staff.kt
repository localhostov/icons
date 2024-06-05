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

public val Icons.Bold.Staff: ImageVector
    get() {
        if (_staff != null) {
            return _staff!!
        }
        _staff = Builder(name = "Staff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.128f, 23.993f)
                lineTo(0.007f, 21.872f)
                lineToRelative(10.71f, -10.71f)
                curveToRelative(0.73f, -0.73f, 1.208f, -1.696f, 1.344f, -2.72f)
                lineToRelative(0.663f, -4.971f)
                curveToRelative(0.264f, -1.979f, 1.968f, -3.471f, 3.965f, -3.471f)
                horizontalLineToRelative(3.312f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.312f)
                curveToRelative(-0.499f, 0.0f, -0.925f, 0.373f, -0.99f, 0.867f)
                lineToRelative(-0.663f, 4.971f)
                curveToRelative(-0.224f, 1.673f, -1.004f, 3.251f, -2.197f, 4.445f)
                lineTo(2.128f, 23.993f)
                close()
            }
        }
        .build()
        return _staff!!
    }

private var _staff: ImageVector? = null
