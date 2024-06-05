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

public val Icons.Filled.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 21.0f)
                curveToRelative(-4.085f, 0.0f, -5.633f, -5.684f, -6.465f, -8.737f)
                curveToRelative(-1.027f, -3.772f, -2.288f, -7.263f, -4.535f, -7.263f)
                curveToRelative(-1.736f, 0.0f, -4.031f, 3.888f, -4.504f, 9.09f)
                curveToRelative(-0.051f, 0.55f, -0.526f, 0.953f, -1.087f, 0.906f)
                curveToRelative(-0.55f, -0.05f, -0.955f, -0.537f, -0.905f, -1.086f)
                curveTo(0.491f, 8.547f, 3.055f, 3.0f, 6.5f, 3.0f)
                curveToRelative(4.085f, 0.0f, 5.633f, 5.684f, 6.465f, 8.737f)
                curveToRelative(1.027f, 3.772f, 2.288f, 7.263f, 4.535f, 7.263f)
                curveToRelative(1.736f, 0.0f, 4.031f, -3.888f, 4.504f, -9.09f)
                curveToRelative(0.051f, -0.55f, 0.524f, -0.95f, 1.087f, -0.906f)
                curveToRelative(0.55f, 0.05f, 0.955f, 0.537f, 0.905f, 1.086f)
                curveToRelative(-0.487f, 5.363f, -3.051f, 10.91f, -6.496f, 10.91f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
