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

public val Icons.Bold.SquareStar: ImageVector
    get() {
        if (_squareStar != null) {
            return _squareStar!!
        }
        _squareStar = Builder(name = "SquareStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.74f, 17.39f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.3f, -4.08f)
                lineToRelative(-3.32f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.18f, -4.5f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4.5f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(0.92f)
                lineToRelative(-3.3f, 1.91f)
                lineToRelative(1.33f, 4.03f)
                lineToRelative(-0.75f, 0.52f)
                lineToRelative(-3.26f, -2.52f)
                lineToRelative(-3.27f, 2.53f)
                close()
                moveTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(20.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _squareStar!!
    }

private var _squareStar: ImageVector? = null
