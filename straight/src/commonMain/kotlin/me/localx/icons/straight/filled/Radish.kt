package me.localx.icons.straight.filled

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

public val Icons.Filled.Radish: ImageVector
    get() {
        if (_radish != null) {
            return _radish!!
        }
        _radish = Builder(name = "Radish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.534f, 12.606f)
                curveToRelative(3.059f, 3.434f, 3.282f, 7.2f, 0.524f, 9.962f)
                curveTo(11.64f, 23.984f, 9.438f, 24.0f, 7.131f, 24.0f)
                horizontalLineTo(-0.011f)
                lineToRelative(0.022f, -7.09f)
                curveToRelative(0.0f, -2.291f, 0.019f, -4.533f, 1.441f, -5.955f)
                arcToRelative(6.031f, 6.031f, 0.0f, false, true, 5.43f, -1.861f)
                arcToRelative(9.264f, 9.264f, 0.0f, false, true, 4.52f, 2.379f)
                curveToRelative(2.0f, -3.6f, 5.495f, -9.84f, 5.984f, -10.329f)
                arcToRelative(3.868f, 3.868f, 0.0f, false, true, 6.6f, 2.736f)
                arcToRelative(3.841f, 3.841f, 0.0f, false, true, -1.133f, 2.736f)
                curveTo(22.294f, 7.174f, 16.116f, 10.626f, 12.534f, 12.606f)
                close()
                moveTo(14.229f, 2.464f)
                arcToRelative(2.614f, 2.614f, 0.0f, false, false, -5.215f, -0.076f)
                curveTo(8.844f, 4.323f, 10.7f, 5.222f, 11.0f, 9.0f)
                curveTo(12.428f, 5.77f, 13.5f, 3.846f, 14.229f, 2.464f)
                close()
                moveTo(21.577f, 9.77f)
                curveTo(19.625f, 10.814f, 17.229f, 12.036f, 15.0f, 13.0f)
                curveToRelative(3.774f, 0.3f, 4.667f, 2.156f, 6.6f, 1.987f)
                arcToRelative(2.617f, 2.617f, 0.0f, false, false, -0.02f, -5.217f)
                close()
            }
        }
        .build()
        return _radish!!
    }

private var _radish: ImageVector? = null
