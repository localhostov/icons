package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Dashboard: ImageVector
    get() {
        if (_dashboard != null) {
            return _dashboard!!
        }
        _dashboard = Builder(name = "Dashboard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 1.0f)
                arcToRelative(11.945f, 11.945f, 0.0f, false, false, -6.859f, 21.728f)
                lineToRelative(0.387f, 0.272f)
                horizontalLineToRelative(12.944f)
                lineToRelative(0.387f, -0.272f)
                arcToRelative(11.945f, 11.945f, 0.0f, false, false, -6.859f, -21.728f)
                close()
                moveTo(17.5f, 20.0f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(8.95f, 8.95f, 0.0f, true, true, 11.0f, 0.0f)
                close()
                moveTo(13.989f, 13.079f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.182f, -2.06f)
                lineToRelative(3.6f, -3.605f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(9.706f, 16.272f)
                lineTo(7.981f, 18.728f)
                arcToRelative(6.986f, 6.986f, 0.0f, false, true, 5.2f, -12.62f)
                lineToRelative(-4.172f, 4.263f)
                arcToRelative(3.965f, 3.965f, 0.0f, false, false, 0.7f, 5.9f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(7.013f, 7.013f, 0.0f, false, true, -2.981f, 5.728f)
                lineToRelative(-1.725f, -2.456f)
                curveToRelative(0.316f, -0.222f, 4.584f, -4.544f, 4.584f, -4.544f)
                arcToRelative(6.926f, 6.926f, 0.0f, false, true, 0.122f, 1.272f)
                close()
            }
        }
        .build()
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
