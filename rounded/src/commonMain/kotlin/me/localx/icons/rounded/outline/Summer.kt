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

public val Icons.Outline.Summer: ImageVector
    get() {
        if (_summer != null) {
            return _summer!!
        }
        _summer = Builder(name = "Summer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 24.0f)
                curveToRelative(-6.078f, 0.117f, -9.334f, -7.638f, -5.0f, -11.889f)
                lineTo(12.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.111f)
                curveTo(26.335f, 16.363f, 23.077f, 24.117f, 17.0f, 24.0f)
                close()
                moveTo(17.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(7.537f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.332f, 0.744f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 6.664f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 12.537f)
                lineTo(20.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 2.0f)
                close()
                moveTo(17.0f, 20.0f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -1.0f, -5.829f)
                lineTo(16.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.171f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 17.0f, 20.0f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 16.0f)
                close()
                moveTo(5.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.863f, -1.5f)
                lineTo(5.212f, 13.65f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, true, -0.837f, -0.835f)
                lineTo(2.488f, 13.872f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.976f, -1.744f)
                lineToRelative(1.864f, -1.045f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 3.084f, 10.0f)
                lineTo(1.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 8.0f)
                lineTo(3.082f, 8.0f)
                arcToRelative(6.056f, 6.056f, 0.0f, false, true, 0.275f, -1.051f)
                lineTo(1.5f, 5.864f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 2.5f, 4.136f)
                lineTo(4.343f, 5.208f)
                arcToRelative(5.993f, 5.993f, 0.0f, false, true, 0.836f, -0.842f)
                lineTo(4.128f, 2.488f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.744f, -0.976f)
                lineTo(6.914f, 3.371f)
                arcTo(5.971f, 5.971f, 0.0f, false, true, 7.98f, 3.087f)
                lineTo(8.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(10.0f, 3.089f)
                arcTo(2.005f, 2.005f, 0.0f, false, true, 8.319f, 5.058f)
                arcToRelative(4.011f, 4.011f, 0.0f, false, false, -0.12f, 7.863f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.4f, 1.959f)
                arcToRelative(6.012f, 6.012f, 0.0f, false, true, -0.851f, -0.239f)
                lineTo(5.864f, 16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _summer!!
    }

private var _summer: ImageVector? = null
