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

public val Icons.Filled.NetworkCloud: ImageVector
    get() {
        if (_networkCloud != null) {
            return _networkCloud!!
        }
        _networkCloud = Builder(name = "NetworkCloud", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 20.0f)
                horizontalLineToRelative(-8.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, -1.816f)
                verticalLineToRelative(-4.164f)
                curveToRelative(1.344f, 0.0f, 2.52f, -0.012f, 3.1f, -0.023f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, false, 1.065f, -0.131f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, 3.7f, -3.7f)
                arcToRelative(5.012f, 5.012f, 0.0f, false, false, -3.56f, -6.0f)
                lineToRelative(-0.176f, -0.043f)
                curveToRelative(-0.3f, -0.067f, -0.452f, -0.1f, -0.588f, -0.428f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.367f, 0.855f)
                arcToRelative(6.369f, 6.369f, 0.0f, false, false, -0.056f, 2.733f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.448f, 6.588f)
                arcToRelative(3.684f, 3.684f, 0.0f, false, false, 0.834f, 0.129f)
                curveToRelative(0.653f, 0.018f, 2.549f, 0.026f, 4.521f, 0.026f)
                horizontalLineToRelative(0.079f)
                verticalLineToRelative(4.161f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, 1.813f)
                horizontalLineToRelative(-8.184f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.184f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 5.632f, 0.0f)
                horizontalLineToRelative(8.184f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _networkCloud!!
    }

private var _networkCloud: ImageVector? = null
