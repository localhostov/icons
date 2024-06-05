package me.localx.icons.rounded.filled

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

public val Icons.Filled.ManHead: ImageVector
    get() {
        if (_manHead != null) {
            return _manHead!!
        }
        _manHead = Builder(name = "ManHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.268f, 3.492f)
                arcTo(11.037f, 11.037f, 0.0f, false, true, 16.0f, 19.954f)
                lineTo(16.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(9.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(8.0f, 19.953f)
                arcToRelative(11.264f, 11.264f, 0.0f, false, true, -4.542f, -4.572f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.776f, -0.92f)
                curveTo(6.4f, 16.717f, 9.1f, 19.0f, 12.0f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.129f, 0.0f, 6.212f, -2.779f, 7.128f, -5.376f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 1.117f, -0.651f)
                arcTo(1.606f, 1.606f, 0.0f, false, false, 20.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.27f, -2.972f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.816f, -0.878f)
                arcToRelative(7.962f, 7.962f, 0.0f, false, false, -4.013f, -6.11f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, true, -1.128f, 2.541f)
                arcToRelative(15.09f, 15.09f, 0.0f, false, true, -4.956f, 4.467f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.724f, 0.84f)
                arcToRelative(15.806f, 15.806f, 0.0f, false, true, -7.257f, 1.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.5f, 10.136f)
                arcTo(6.372f, 6.372f, 0.0f, false, false, 1.819f, 7.767f)
                curveTo(3.124f, 4.674f, 5.1f, 0.0f, 12.0f, 0.0f)
                arcToRelative(9.975f, 9.975f, 0.0f, false, true, 9.851f, 8.274f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 11.5f)
                close()
                moveTo(16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 11.5f)
                close()
            }
        }
        .build()
        return _manHead!!
    }

private var _manHead: ImageVector? = null
