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

public val Icons.Bold.Loading: ImageVector
    get() {
        if (_loading != null) {
            return _loading!!
        }
        _loading = Builder(name = "Loading", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(4.0f, 10.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 10.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(23.126f, 16.732f)
                lineTo(19.668f, 14.723f)
                lineTo(18.16f, 17.316f)
                lineTo(21.618f, 19.326f)
                close()
                moveTo(19.326f, 2.378f)
                lineTo(16.729f, 0.87f)
                lineTo(14.72f, 4.329f)
                lineTo(17.313f, 5.837f)
                close()
                moveTo(23.137f, 7.254f)
                lineTo(21.627f, 4.662f)
                lineTo(18.169f, 6.676f)
                lineTo(19.679f, 9.268f)
                close()
                moveTo(19.35f, 21.613f)
                lineTo(17.336f, 18.157f)
                lineTo(14.744f, 19.667f)
                lineTo(16.758f, 23.123f)
                close()
                moveTo(5.856f, 17.313f)
                lineTo(4.349f, 14.723f)
                lineTo(0.89f, 16.732f)
                lineTo(2.4f, 19.326f)
                close()
                moveTo(9.3f, 4.329f)
                lineTo(7.287f, 0.87f)
                lineTo(4.693f, 2.378f)
                lineTo(6.7f, 5.837f)
                close()
                moveTo(5.848f, 6.676f)
                lineTo(2.392f, 4.662f)
                lineTo(0.882f, 7.254f)
                lineTo(4.338f, 9.268f)
                close()
                moveTo(9.272f, 19.668f)
                lineTo(6.681f, 18.156f)
                lineTo(4.666f, 21.612f)
                lineTo(7.258f, 23.124f)
                close()
            }
        }
        .build()
        return _loading!!
    }

private var _loading: ImageVector? = null
