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

public val Icons.Bold.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.773f, 2.9f)
                curveToRelative(-0.747f, -0.634f, -1.53f, -1.3f, -2.327f, -2.024f)
                arcTo(3.354f, 3.354f, 0.0f, false, false, 11.731f, 0.031f)
                arcTo(3.264f, 3.264f, 0.0f, false, false, 9.4f, 1.516f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.708f, 18.708f, 0.0f, false, false, -2.126f, 5.02f)
                arcToRelative(2.458f, 2.458f, 0.0f, false, false, -3.795f, -0.163f)
                arcToRelative(9.159f, 9.159f, 0.0f, false, false, -2.61f, 6.493f)
                arcTo(11.024f, 11.024f, 0.0f, false, false, 9.133f, 23.64f)
                arcTo(11.667f, 11.667f, 0.0f, false, false, 11.99f, 24.0f)
                arcTo(11.122f, 11.122f, 0.0f, false, false, 23.127f, 12.874f)
                curveTo(23.127f, 8.3f, 20.183f, 5.8f, 16.773f, 2.9f)
                close()
                moveTo(16.991f, 19.286f)
                arcToRelative(7.974f, 7.974f, 0.0f, false, true, -0.9f, 0.6f)
                arcToRelative(4.486f, 4.486f, 0.0f, false, false, 0.44f, -1.919f)
                curveToRelative(0.0f, -1.927f, -1.343f, -4.164f, -3.0f, -6.125f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, -3.079f, 0.0f)
                curveTo(8.1f, 14.6f, 6.627f, 17.582f, 8.0f, 20.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.129f, -7.127f)
                arcToRelative(5.951f, 5.951f, 0.0f, false, true, 1.345f, -3.9f)
                quadToRelative(0.212f, 0.348f, 0.455f, 0.673f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 2.375f, 0.87f)
                arcToRelative(2.364f, 2.364f, 0.0f, false, false, 1.8f, -1.826f)
                arcToRelative(17.255f, 17.255f, 0.0f, false, true, 2.091f, -5.567f)
                arcTo(0.259f, 0.259f, 0.0f, false, true, 12.132f, 3.0f)
                arcToRelative(0.367f, 0.367f, 0.0f, false, true, 0.295f, 0.093f)
                curveToRelative(0.824f, 0.749f, 1.633f, 1.437f, 2.405f, 2.091f)
                curveToRelative(3.189f, 2.708f, 5.295f, 4.5f, 5.295f, 7.686f)
                arcTo(8.081f, 8.081f, 0.0f, false, true, 16.991f, 19.288f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
