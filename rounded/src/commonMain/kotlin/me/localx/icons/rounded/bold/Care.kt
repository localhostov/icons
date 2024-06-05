package me.localx.icons.rounded.bold

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

public val Icons.Bold.Care: ImageVector
    get() {
        if (_care != null) {
            return _care!!
        }
        _care = Builder(name = "Care", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.75f)
                curveToRelative(0.0f, 2.163f, -2.82f, 4.851f, -4.225f, 5.978f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, true, -1.55f, 0.0f)
                curveTo(8.82f, 7.6f, 6.0f, 4.913f, 6.0f, 2.75f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 8.5f, 0.0f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 11.0f, 2.75f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 13.5f, 0.0f)
                arcTo(2.634f, 2.634f, 0.0f, false, true, 16.0f, 2.75f)
                close()
                moveTo(17.818f, 20.411f)
                lineTo(23.018f, 14.468f)
                arcToRelative(3.883f, 3.883f, 0.0f, false, false, -5.77f, -5.2f)
                lineToRelative(-2.438f, 2.679f)
                arcTo(3.629f, 3.629f, 0.0f, false, false, 12.357f, 11.0f)
                lineTo(4.5f, 11.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 15.5f)
                verticalLineToRelative(4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 24.0f)
                lineTo(9.914f, 24.0f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 17.818f, 20.411f)
                close()
                moveTo(12.357f, 14.0f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, 0.092f, 1.278f)
                lineToRelative(-5.161f, 0.737f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.424f, 2.97f)
                lineToRelative(5.162f, -0.737f)
                arcToRelative(3.665f, 3.665f, 0.0f, false, false, 3.093f, -3.116f)
                lineToRelative(3.5f, -3.843f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, true, 1.248f, -0.059f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, 0.055f, 1.252f)
                lineToRelative(-5.206f, 5.955f)
                arcTo(7.505f, 7.505f, 0.0f, false, true, 9.914f, 21.0f)
                lineTo(4.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineToRelative(-4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 14.0f)
                close()
            }
        }
        .build()
        return _care!!
    }

private var _care: ImageVector? = null
