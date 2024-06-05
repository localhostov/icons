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

public val Icons.Outline.FollowFolder: ImageVector
    get() {
        if (_followFolder != null) {
            return _followFolder!!
        }
        _followFolder = Builder(name = "FollowFolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(12.24f, 2.0f)
                lineTo(8.24f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(13.18f, 22.0f)
                curveToRelative(-0.6f, -0.6f, -1.2f, -1.27f, -1.73f, -2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 8.0f)
                lineTo(22.0f, 8.0f)
                verticalLineToRelative(2.26f)
                curveToRelative(0.75f, 0.24f, 1.43f, 0.66f, 2.0f, 1.18f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(7.76f, 2.0f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(20.35f, 12.0f)
                curveToRelative(-1.0f, 0.0f, -1.87f, 0.37f, -2.5f, 0.99f)
                curveToRelative(-0.63f, -0.62f, -1.5f, -0.99f, -2.5f, -0.99f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.66f, -3.5f, 3.7f)
                curveToRelative(0.0f, 3.26f, 4.87f, 6.74f, 5.43f, 7.12f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.56f, -0.39f, 5.43f, -3.86f, 5.43f, -7.12f)
                curveToRelative(0.0f, -2.04f, -1.57f, -3.7f, -3.5f, -3.7f)
                close()
                moveTo(17.85f, 20.76f)
                curveToRelative(-1.74f, -1.33f, -4.0f, -3.56f, -4.0f, -5.06f)
                curveToRelative(0.0f, -0.94f, 0.67f, -1.7f, 1.5f, -1.7f)
                curveToRelative(0.75f, 0.0f, 1.5f, 0.45f, 1.5f, 1.45f)
                verticalLineToRelative(0.55f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0.0f, -1.0f, 0.75f, -1.45f, 1.5f, -1.45f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.76f, 1.5f, 1.7f)
                curveToRelative(0.0f, 1.5f, -2.26f, 3.73f, -4.0f, 5.06f)
                close()
            }
        }
        .build()
        return _followFolder!!
    }

private var _followFolder: ImageVector? = null
