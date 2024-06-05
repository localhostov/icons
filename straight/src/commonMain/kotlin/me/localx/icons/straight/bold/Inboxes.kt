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

public val Icons.Bold.Inboxes: ImageVector
    get() {
        if (_inboxes != null) {
            return _inboxes!!
        }
        _inboxes = Builder(name = "Inboxes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(18.74f, 16.0f)
                horizontalLineToRelative(2.26f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.62f, 1.75f, 2.29f, 3.0f, 4.24f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.96f, 0.0f, 3.62f, -1.25f, 4.24f, -3.0f)
                close()
                moveTo(16.0f, 0.0f)
                lineTo(16.0f, 1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(8.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 7.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 11.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(21.0f, 7.5f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 8.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.62f, 1.75f, 2.29f, 3.0f, 4.24f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.96f, 0.0f, 3.62f, -1.25f, 4.24f, -3.0f)
                horizontalLineToRelative(2.26f)
                lineTo(21.0f, 7.5f)
                close()
            }
        }
        .build()
        return _inboxes!!
    }

private var _inboxes: ImageVector? = null
