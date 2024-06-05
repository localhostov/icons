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

public val Icons.Bold.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                arcToRelative(6.084f, 6.084f, 0.0f, false, false, -5.246f, -5.915f)
                arcTo(5.285f, 5.285f, 0.0f, false, false, 18.0f, 5.5f)
                arcTo(5.773f, 5.773f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(5.773f, 5.773f, 0.0f, false, false, 6.0f, 5.5f)
                arcToRelative(5.258f, 5.258f, 0.0f, false, false, 0.247f, 1.585f)
                arcTo(6.084f, 6.084f, 0.0f, false, false, 1.0f, 13.0f)
                arcToRelative(6.136f, 6.136f, 0.0f, false, false, 6.25f, 6.0f)
                arcToRelative(5.558f, 5.558f, 0.0f, false, false, 3.133f, -1.0f)
                curveToRelative(-0.245f, 1.477f, -0.962f, 3.0f, -2.883f, 3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.711f, 0.0f, -2.511f, -1.53f, -2.826f, -2.967f)
                arcTo(5.529f, 5.529f, 0.0f, false, false, 16.75f, 19.0f)
                arcTo(6.136f, 6.136f, 0.0f, false, false, 23.0f, 13.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(2.787f, 2.787f, 0.0f, false, true, 3.0f, 2.5f)
                arcToRelative(3.883f, 3.883f, 0.0f, false, true, -1.725f, 2.723f)
                arcTo(16.123f, 16.123f, 0.0f, false, false, 12.0f, 9.447f)
                arcToRelative(16.022f, 16.022f, 0.0f, false, false, -1.263f, -1.213f)
                arcTo(3.833f, 3.833f, 0.0f, false, true, 9.0f, 5.5f)
                arcTo(2.787f, 2.787f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(7.25f, 16.0f)
                arcTo(3.136f, 3.136f, 0.0f, false, true, 4.0f, 13.0f)
                arcToRelative(3.136f, 3.136f, 0.0f, false, true, 3.25f, -3.0f)
                curveToRelative(2.0f, 0.0f, 3.387f, 2.728f, 3.4f, 2.749f)
                arcTo(1.45f, 1.45f, 0.0f, false, false, 10.8f, 13.0f)
                arcToRelative(1.564f, 1.564f, 0.0f, false, false, -0.151f, 0.245f)
                curveTo(10.637f, 13.273f, 9.246f, 16.0f, 7.25f, 16.0f)
                close()
                moveTo(13.35f, 13.252f)
                arcTo(1.489f, 1.489f, 0.0f, false, false, 13.2f, 13.0f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, false, 0.151f, -0.245f)
                curveToRelative(0.013f, -0.028f, 1.4f, -2.755f, 3.4f, -2.755f)
                arcTo(3.136f, 3.136f, 0.0f, false, true, 20.0f, 13.0f)
                arcToRelative(3.136f, 3.136f, 0.0f, false, true, -3.25f, 3.0f)
                curveTo(14.754f, 16.0f, 13.363f, 13.273f, 13.353f, 13.252f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
