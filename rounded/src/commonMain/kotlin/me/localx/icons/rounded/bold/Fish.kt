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

public val Icons.Bold.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.654f, 5.249f)
                arcToRelative(4.529f, 4.529f, 0.0f, false, false, -3.083f, -1.82f)
                arcTo(4.529f, 4.529f, 0.0f, false, false, 18.751f, 0.346f)
                arcTo(1.718f, 1.718f, 0.0f, false, false, 16.0f, 1.715f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(25.64f, 25.64f, 0.0f, false, false, -4.5f, 0.379f)
                lineTo(11.0f, 7.2f)
                arcTo(2.178f, 2.178f, 0.0f, false, false, 8.491f, 5.031f)
                arcToRelative(6.748f, 6.748f, 0.0f, false, false, -5.483f, 6.483f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, false, -3.0f, 7.9f)
                arcToRelative(4.276f, 4.276f, 0.0f, false, false, 1.257f, 3.336f)
                arcToRelative(3.932f, 3.932f, 0.0f, false, false, 3.0f, 1.247f)
                curveToRelative(4.2f, -0.325f, 8.771f, -1.923f, 11.124f, -7.0f)
                horizontalLineToRelative(1.334f)
                curveToRelative(2.484f, 0.077f, 3.283f, -3.876f, 0.474f, -4.0f)
                horizontalLineToRelative(-0.587f)
                arcTo(25.226f, 25.226f, 0.0f, false, false, 17.0f, 8.5f)
                lineTo(17.0f, 8.0f)
                horizontalLineToRelative(5.285f)
                arcTo(1.718f, 1.718f, 0.0f, false, false, 23.654f, 5.249f)
                close()
                moveTo(4.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 21.0f)
                close()
                moveTo(9.3f, 19.572f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -4.893f, -4.879f)
                curveToRelative(1.682f, -2.846f, 4.842f, -4.384f, 9.549f, -4.651f)
                curveTo(13.689f, 14.728f, 12.15f, 17.881f, 9.3f, 19.572f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
