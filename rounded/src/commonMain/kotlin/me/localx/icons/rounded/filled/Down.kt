package me.localx.icons.rounded.filled

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

public val Icons.Filled.Down: ImageVector
    get() {
        if (_down != null) {
            return _down!!
        }
        _down = Builder(name = "Down", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.02f, 0.0f, -2.03f, -0.39f, -2.81f, -1.16f)
                lineToRelative(-6.37f, -6.77f)
                curveToRelative(-0.85f, -0.85f, -1.1f, -2.09f, -0.63f, -3.22f)
                curveToRelative(0.47f, -1.13f, 1.52f, -1.84f, 2.75f, -1.85f)
                horizontalLineToRelative(2.06f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.06f)
                curveToRelative(1.23f, 0.0f, 2.28f, 0.71f, 2.75f, 1.85f)
                curveToRelative(0.47f, 1.13f, 0.22f, 2.38f, -0.65f, 3.24f)
                curveToRelative(0.0f, 0.0f, -6.34f, 6.74f, -6.35f, 6.75f)
                curveToRelative(-0.77f, 0.77f, -1.79f, 1.16f, -2.81f, 1.16f)
                close()
            }
        }
        .build()
        return _down!!
    }

private var _down: ImageVector? = null
