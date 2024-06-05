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

public val Icons.Bold.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.138f, 24.012f)
                arcToRelative(9.068f, 9.068f, 0.0f, false, true, -6.46f, -2.68f)
                arcToRelative(9.162f, 9.162f, 0.0f, false, true, 0.0f, -12.93f)
                arcToRelative(66.784f, 66.784f, 0.0f, false, true, 9.19f, -6.975f)
                arcToRelative(2.682f, 2.682f, 0.0f, false, true, 4.023f, 1.506f)
                lineTo(20.179f, 0.393f)
                arcToRelative(2.461f, 2.461f, 0.0f, false, true, 3.075f, 0.351f)
                arcTo(2.485f, 2.485f, 0.0f, false, true, 23.6f, 3.877f)
                lineTo(21.075f, 8.11f)
                arcToRelative(2.687f, 2.687f, 0.0f, false, true, 1.5f, 4.023f)
                arcToRelative(66.776f, 66.776f, 0.0f, false, true, -6.978f, 9.2f)
                arcTo(9.067f, 9.067f, 0.0f, false, true, 9.138f, 24.012f)
                close()
                moveTo(13.0f, 4.268f)
                arcToRelative(61.948f, 61.948f, 0.0f, false, false, -8.2f, 6.253f)
                arcToRelative(6.139f, 6.139f, 0.0f, false, false, 8.673f, 8.692f)
                arcTo(61.986f, 61.986f, 0.0f, false, false, 19.735f, 11.0f)
                horizontalLineTo(18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.288f, -2.269f)
                lineToRelative(2.854f, -4.786f)
                lineToRelative(-4.8f, 2.846f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 5.5f)
                close()
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
