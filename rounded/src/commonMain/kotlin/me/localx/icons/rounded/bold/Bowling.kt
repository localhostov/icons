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

public val Icons.Bold.Bowling: ImageVector
    get() {
        if (_bowling != null) {
            return _bowling!!
        }
        _bowling = Builder(name = "Bowling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 15.5f)
                close()
                moveTo(17.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 18.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 15.5f)
                close()
                moveTo(18.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 12.5f)
                close()
                moveTo(24.0f, 15.5f)
                arcToRelative(8.488f, 8.488f, 0.0f, false, true, -13.484f, 6.874f)
                arcTo(4.146f, 4.146f, 0.0f, false, true, 7.251f, 24.0f)
                horizontalLineToRelative(-2.5f)
                arcTo(4.19f, 4.19f, 0.0f, false, true, 0.93f, 21.457f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 0.0f, 16.773f)
                arcTo(10.433f, 10.433f, 0.0f, false, true, 1.825f, 11.42f)
                arcTo(6.542f, 6.542f, 0.0f, false, false, 3.0f, 8.5f)
                arcToRelative(19.136f, 19.136f, 0.0f, false, false, -0.548f, -2.381f)
                arcTo(9.61f, 9.61f, 0.0f, false, true, 2.0f, 4.0f)
                arcTo(3.827f, 3.827f, 0.0f, false, true, 6.0f, 0.0f)
                arcToRelative(3.827f, 3.827f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(9.61f, 9.61f, 0.0f, false, true, -0.452f, 2.119f)
                arcTo(19.105f, 19.105f, 0.0f, false, false, 9.0f, 8.5f)
                arcToRelative(3.258f, 3.258f, 0.0f, false, false, 0.285f, 1.2f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 24.0f, 15.5f)
                close()
                moveTo(5.0f, 4.0f)
                curveToRelative(0.02f, 0.117f, 0.21f, 0.824f, 0.349f, 1.339f)
                curveToRelative(0.172f, 0.642f, 0.312f, 1.183f, 0.422f, 1.661f)
                horizontalLineToRelative(0.458f)
                curveToRelative(0.11f, -0.478f, 0.25f, -1.019f, 0.422f, -1.661f)
                curveTo(6.79f, 4.824f, 6.98f, 4.117f, 7.0f, 3.922f)
                curveTo(7.0f, 3.29f, 6.71f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveTo(5.0f, 3.29f, 5.0f, 4.0f)
                close()
                moveTo(8.322f, 20.255f)
                arcTo(8.631f, 8.631f, 0.0f, false, false, 9.0f, 16.773f)
                arcToRelative(7.864f, 7.864f, 0.0f, false, false, -1.423f, -3.854f)
                arcTo(12.691f, 12.691f, 0.0f, false, true, 6.216f, 10.0f)
                lineTo(5.784f, 10.0f)
                arcToRelative(12.691f, 12.691f, 0.0f, false, true, -1.361f, 2.919f)
                arcTo(7.864f, 7.864f, 0.0f, false, false, 3.0f, 16.773f)
                arcToRelative(8.623f, 8.623f, 0.0f, false, false, 0.678f, 3.481f)
                arcTo(1.179f, 1.179f, 0.0f, false, false, 4.749f, 21.0f)
                horizontalLineToRelative(2.5f)
                arcTo(1.18f, 1.18f, 0.0f, false, false, 8.322f, 20.255f)
                close()
                moveTo(21.0f, 15.5f)
                arcToRelative(5.491f, 5.491f, 0.0f, false, false, -10.163f, -2.895f)
                arcTo(8.775f, 8.775f, 0.0f, false, true, 12.0f, 16.773f)
                arcToRelative(12.443f, 12.443f, 0.0f, false, true, -0.3f, 2.7f)
                arcTo(5.494f, 5.494f, 0.0f, false, false, 21.0f, 15.5f)
                close()
            }
        }
        .build()
        return _bowling!!
    }

private var _bowling: ImageVector? = null
