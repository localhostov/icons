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
                moveTo(20.5f, 13.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(3.5f, 13.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.62f, 1.75f, 2.29f, 3.0f, 4.24f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.96f, 0.0f, 3.62f, -1.25f, 4.24f, -3.0f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.5f, 0.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 8.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.62f, 1.75f, 2.29f, 3.0f, 4.24f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.96f, 0.0f, 3.62f, -1.25f, 4.24f, -3.0f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _inboxes!!
    }

private var _inboxes: ImageVector? = null
