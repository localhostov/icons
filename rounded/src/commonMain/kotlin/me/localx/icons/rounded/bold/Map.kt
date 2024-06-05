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

public val Icons.Bold.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.469f, 1.146f)
                lineToRelative(-0.031f, -0.011f)
                lineTo(17.847f, 0.272f)
                arcToRelative(5.335f, 5.335f, 0.0f, false, false, -3.1f, -0.081f)
                lineTo(9.44f, 1.734f)
                arcTo(2.312f, 2.312f, 0.0f, false, true, 7.859f, 1.6f)
                lineToRelative(-0.5f, -0.23f)
                arcTo(5.318f, 5.318f, 0.0f, false, false, 0.0f, 6.277f)
                verticalLineTo(17.8f)
                arcToRelative(5.328f, 5.328f, 0.0f, false, false, 3.822f, 5.1f)
                lineToRelative(2.74f, 0.857f)
                arcTo(5.34f, 5.34f, 0.0f, false, false, 8.148f, 24.0f)
                arcToRelative(6.245f, 6.245f, 0.0f, false, false, 1.416f, -0.192f)
                lineTo(15.1f, 22.28f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 1.249f, 0.01f)
                lineToRelative(2.259f, 0.651f)
                arcTo(4.363f, 4.363f, 0.0f, false, false, 24.0f, 18.7f)
                verticalLineTo(6.154f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 20.469f, 1.146f)
                close()
                moveTo(14.0f, 3.534f)
                verticalLineTo(19.47f)
                lineToRelative(-4.0f, 1.105f)
                verticalLineTo(4.668f)
                close()
                moveTo(4.682f, 20.027f)
                arcTo(2.326f, 2.326f, 0.0f, false, true, 3.0f, 17.8f)
                verticalLineTo(6.277f)
                arcTo(2.285f, 2.285f, 0.0f, false, true, 4.032f, 4.348f)
                arcToRelative(2.337f, 2.337f, 0.0f, false, true, 1.3f, -0.4f)
                arcToRelative(2.145f, 2.145f, 0.0f, false, true, 0.823f, 0.162f)
                lineTo(7.0f, 4.464f)
                verticalLineTo(20.752f)
                close()
                moveTo(21.0f, 18.7f)
                arcToRelative(1.367f, 1.367f, 0.0f, false, true, -1.625f, 1.341f)
                lineTo(17.0f, 19.37f)
                verticalLineTo(3.153f)
                lineToRelative(2.475f, 0.823f)
                arcTo(2.323f, 2.323f, 0.0f, false, true, 21.0f, 6.154f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
