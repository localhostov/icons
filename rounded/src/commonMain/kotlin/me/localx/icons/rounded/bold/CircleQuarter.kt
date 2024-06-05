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

public val Icons.Bold.CircleQuarter: ImageVector
    get() {
        if (_circleQuarter != null) {
            return _circleQuarter!!
        }
        _circleQuarter = Builder(name = "CircleQuarter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 13.0f)
                horizontalLineTo(3.36f)
                curveToRelative(-1.03f, 0.0f, -1.98f, -0.46f, -2.62f, -1.26f)
                curveToRelative(-0.64f, -0.81f, -0.88f, -1.85f, -0.65f, -2.86f)
                horizontalLineTo(0.09f)
                curveTo(1.08f, 4.53f, 4.53f, 1.08f, 8.87f, 0.09f)
                curveToRelative(1.01f, -0.23f, 2.05f, 0.0f, 2.86f, 0.65f)
                curveToRelative(0.8f, 0.64f, 1.26f, 1.6f, 1.26f, 2.62f)
                verticalLineTo(11.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(3.01f, 9.54f)
                curveToRelative(-0.04f, 0.16f, 0.03f, 0.27f, 0.07f, 0.32f)
                curveToRelative(0.05f, 0.06f, 0.14f, 0.13f, 0.28f, 0.13f)
                horizontalLineToRelative(6.64f)
                verticalLineTo(3.36f)
                curveToRelative(0.0f, -0.14f, -0.07f, -0.23f, -0.13f, -0.28f)
                curveToRelative(-0.05f, -0.04f, -0.17f, -0.11f, -0.32f, -0.07f)
                curveToRelative(-3.23f, 0.74f, -5.79f, 3.31f, -6.53f, 6.53f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _circleQuarter!!
    }

private var _circleQuarter: ImageVector? = null
