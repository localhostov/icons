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

public val Icons.Bold.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.516f, 24.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 2.426f, -0.493f)
                arcToRelative(10.824f, 10.824f, 0.0f, false, true, -5.5f, -4.6f)
                arcToRelative(9.865f, 9.865f, 0.0f, false, true, -0.886f, -8.214f)
                arcTo(11.394f, 11.394f, 0.0f, false, true, 13.485f, 0.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -2.426f, 0.493f)
                arcToRelative(10.816f, 10.816f, 0.0f, false, true, 5.5f, 4.6f)
                arcToRelative(9.863f, 9.863f, 0.0f, false, true, 0.886f, 8.213f)
                arcTo(11.393f, 11.393f, 0.0f, false, true, 10.516f, 24.0f)
                close()
                moveTo(11.034f, 3.339f)
                arcTo(8.231f, 8.231f, 0.0f, false, false, 5.4f, 8.633f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 0.622f, 5.748f)
                arcToRelative(7.706f, 7.706f, 0.0f, false, false, 5.121f, 3.637f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 1.826f, 2.644f)
                arcTo(8.234f, 8.234f, 0.0f, false, false, 18.6f, 15.367f)
                arcToRelative(6.906f, 6.906f, 0.0f, false, false, -0.622f, -5.748f)
                arcTo(7.709f, 7.709f, 0.0f, false, false, 12.86f, 5.982f)
                horizontalLineToRelative(0.0f)
                arcTo(2.3f, 2.3f, 0.0f, false, true, 11.034f, 3.339f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
