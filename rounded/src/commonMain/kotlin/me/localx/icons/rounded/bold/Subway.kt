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

public val Icons.Bold.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 0.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 2.0f, 5.5f)
                verticalLineToRelative(9.0f)
                arcToRelative(5.509f, 5.509f, 0.0f, false, false, 3.523f, 5.132f)
                lineTo(4.228f, 21.705f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.772f, 23.3f)
                lineTo(8.832f, 20.0f)
                horizontalLineToRelative(6.336f)
                lineToRelative(2.06f, 3.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.544f, -1.59f)
                lineToRelative(-1.295f, -2.073f)
                arcTo(5.509f, 5.509f, 0.0f, false, false, 22.0f, 14.5f)
                verticalLineToRelative(-9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 16.5f, 0.0f)
                close()
                moveTo(13.5f, 10.0f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(5.45f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.05f, 0.5f)
                lineTo(19.0f, 10.0f)
                close()
                moveTo(5.0f, 10.0f)
                lineTo(5.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.05f, 5.0f)
                lineTo(10.5f, 5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.5f, 17.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 14.5f)
                lineTo(5.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(10.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
