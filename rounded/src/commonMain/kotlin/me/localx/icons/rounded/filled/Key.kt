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

public val Icons.Filled.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.989f, 12.7f)
                verticalLineToRelative(-2.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.685f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, false, 0.922f, -0.6f)
                arcToRelative(4.522f, 4.522f, 0.0f, false, false, 0.376f, -2.377f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, false, -3.506f, -3.023f)
                arcToRelative(4.537f, 4.537f, 0.0f, false, false, -3.208f, 1.329f)
                lineToRelative(-7.908f, 7.906f)
                arcToRelative(7.368f, 7.368f, 0.0f, false, false, -3.881f, 0.048f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.036f, 14.717f)
                arcToRelative(7.654f, 7.654f, 0.0f, false, false, 0.784f, -0.041f)
                arcToRelative(7.529f, 7.529f, 0.0f, false, false, 6.428f, -5.429f)
                arcToRelative(7.334f, 7.334f, 0.0f, false, false, 0.047f, -3.88f)
                lineToRelative(0.65f, -0.65f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, 0.575f, -1.3f)
                close()
                moveTo(5.5f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
