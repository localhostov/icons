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

public val Icons.Bold.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 24.0f)
                arcToRelative(1.488f, 1.488f, 0.0f, false, true, -0.771f, -0.214f)
                lineToRelative(-5.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.729f, -1.286f)
                verticalLineToRelative(-5.165f)
                lineToRelative(-5.966f, -7.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.034f, -2.782f)
                arcToRelative(4.258f, 4.258f, 0.0f, false, true, 4.253f, -4.253f)
                horizontalLineToRelative(13.494f)
                arcToRelative(4.254f, 4.254f, 0.0f, false, true, 3.179f, 7.079f)
                lineToRelative(-5.926f, 7.303f)
                verticalLineToRelative(8.118f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
                moveTo(11.0f, 18.65f)
                lineTo(13.0f, 19.85f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.335f, -0.946f)
                lineToRelative(6.305f, -7.767f)
                arcToRelative(1.309f, 1.309f, 0.0f, false, false, 0.36f, -0.884f)
                arcToRelative(1.255f, 1.255f, 0.0f, false, false, -1.253f, -1.253f)
                horizontalLineToRelative(-13.494f)
                arcToRelative(1.254f, 1.254f, 0.0f, false, false, -0.937f, 2.086f)
                lineToRelative(6.346f, 7.765f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.338f, 0.949f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
