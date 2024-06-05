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

public val Icons.Filled.Garlic: ImageVector
    get() {
        if (_garlic != null) {
            return _garlic!!
        }
        _garlic = Builder(name = "Garlic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                arcToRelative(5.983f, 5.983f, 0.0f, false, false, 0.539f, 2.481f)
                arcTo(4.779f, 4.779f, 0.0f, false, true, 4.433f, 23.0f)
                arcTo(4.725f, 4.725f, 0.0f, false, true, 0.014f, 17.934f)
                curveTo(0.309f, 11.919f, 5.158f, 7.6f, 7.379f, 5.919f)
                arcTo(8.235f, 8.235f, 0.0f, false, true, 9.259f, 9.68f)
                curveTo(7.859f, 12.117f, 6.0f, 15.956f, 6.0f, 20.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(1.967f, 1.967f, 0.0f, false, true, 1.3f, 0.488f)
                arcToRelative(14.735f, 14.735f, 0.0f, false, true, 2.7f, -3.9f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 8.0f, 3.589f)
                arcTo(14.359f, 14.359f, 0.0f, false, true, 10.7f, 7.5f)
                arcTo(1.97f, 1.97f, 0.0f, false, true, 12.0f, 7.0f)
                close()
                moveTo(16.632f, 5.925f)
                arcToRelative(8.079f, 8.079f, 0.0f, false, false, -1.891f, 3.751f)
                curveToRelative(1.587f, 2.825f, 4.45f, 8.59f, 2.72f, 12.813f)
                curveToRelative(3.089f, 1.738f, 6.832f, -1.148f, 6.528f, -4.556f)
                curveTo(23.691f, 11.926f, 18.853f, 7.606f, 16.629f, 5.925f)
                close()
                moveTo(12.0f, 8.995f)
                curveTo(10.414f, 11.167f, 3.916f, 23.307f, 12.0f, 24.0f)
                curveTo(20.09f, 23.3f, 13.579f, 11.173f, 12.0f, 8.995f)
                close()
            }
        }
        .build()
        return _garlic!!
    }

private var _garlic: ImageVector? = null
