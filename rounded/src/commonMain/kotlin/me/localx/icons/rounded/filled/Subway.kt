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

public val Icons.Filled.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(5.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 6.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(18.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(6.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 4.278f, 4.927f)
                lineTo(4.143f, 22.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.714f, 1.03f)
                lineTo(8.566f, 19.0f)
                horizontalLineToRelative(6.868f)
                lineToRelative(2.709f, 4.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.714f, -1.03f)
                lineToRelative(-2.135f, -3.558f)
                arcTo(4.994f, 4.994f, 0.0f, false, false, 22.0f, 14.0f)
                lineTo(22.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 2.1f, 4.0f)
                lineTo(21.9f, 4.0f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 17.0f, 0.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
