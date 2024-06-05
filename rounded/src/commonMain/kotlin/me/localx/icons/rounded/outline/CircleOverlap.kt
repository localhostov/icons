package me.localx.icons.rounded.outline

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

public val Icons.Outline.CircleOverlap: ImageVector
    get() {
        if (_circleOverlap != null) {
            return _circleOverlap!!
        }
        _circleOverlap = Builder(name = "CircleOverlap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.878f, 7.122f)
                curveTo(16.216f, 3.09f, 12.717f, 0.0f, 8.5f, 0.0f)
                curveTo(3.813f, 0.0f, 0.0f, 3.813f, 0.0f, 8.5f)
                curveToRelative(0.0f, 4.217f, 3.09f, 7.716f, 7.122f, 8.378f)
                curveToRelative(0.662f, 4.032f, 4.161f, 7.122f, 8.378f, 7.122f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -4.217f, -3.09f, -7.716f, -7.122f, -8.378f)
                close()
                moveTo(2.0f, 8.5f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.079f, 0.0f, 5.66f, 2.155f, 6.327f, 5.034f)
                curveToRelative(-4.15f, 0.328f, -7.465f, 3.643f, -7.793f, 7.793f)
                curveToRelative(-2.879f, -0.667f, -5.034f, -3.248f, -5.034f, -6.327f)
                close()
                moveTo(15.5f, 22.0f)
                curveToRelative(-3.079f, 0.0f, -5.66f, -2.155f, -6.327f, -5.034f)
                curveToRelative(4.15f, -0.328f, 7.465f, -3.643f, 7.793f, -7.793f)
                curveToRelative(2.879f, 0.667f, 5.034f, 3.248f, 5.034f, 6.327f)
                curveToRelative(0.0f, 3.584f, -2.916f, 6.5f, -6.5f, 6.5f)
                close()
            }
        }
        .build()
        return _circleOverlap!!
    }

private var _circleOverlap: ImageVector? = null
