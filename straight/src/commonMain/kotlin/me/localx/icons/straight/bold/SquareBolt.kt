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

public val Icons.Bold.SquareBolt: ImageVector
    get() {
        if (_squareBolt != null) {
            return _squareBolt!!
        }
        _squareBolt = Builder(name = "SquareBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 11.61f)
                curveToRelative(0.35f, 0.65f, 0.33f, 1.44f, -0.04f, 2.07f)
                lineToRelative(-2.87f, 5.51f)
                lineToRelative(-2.66f, -1.39f)
                lineToRelative(2.24f, -4.31f)
                horizontalLineToRelative(-2.3f)
                curveToRelative(-0.67f, 0.0f, -1.3f, -0.32f, -1.7f, -0.85f)
                curveToRelative(-0.4f, -0.54f, -0.52f, -1.23f, -0.33f, -1.87f)
                lineToRelative(3.08f, -5.97f)
                lineToRelative(2.66f, 1.39f)
                lineToRelative(-2.24f, 4.31f)
                horizontalLineToRelative(2.31f)
                curveToRelative(0.78f, 0.0f, 1.49f, 0.42f, 1.85f, 1.11f)
                close()
                moveTo(24.0f, 3.5f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }
        .build()
        return _squareBolt!!
    }

private var _squareBolt: ImageVector? = null
