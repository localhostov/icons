package me.localx.icons.straight.outline

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

public val Icons.Outline.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.0f, 5.274f)
                verticalLineToRelative(8.226f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.062f, 1.952f)
                lineToRelative(1.938f, -1.552f)
                lineToRelative(1.938f, 1.55f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.062f, -1.95f)
                verticalLineToRelative(-8.226f)
                arcToRelative(7.957f, 7.957f, 0.0f, false, false, 2.0f, -5.274f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.0f, 6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, 6.0f, -6.0f)
                close()
                moveTo(15.717f, 21.948f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, true, -0.529f, -0.06f)
                lineToRelative(-3.188f, -2.551f)
                lineToRelative(-3.187f, 2.551f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.813f, -0.388f)
                verticalLineToRelative(-6.582f)
                arcToRelative(7.935f, 7.935f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(6.582f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, true, -0.283f, 0.448f)
                close()
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
