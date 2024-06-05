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

public val Icons.Outline.BoxOpen: ImageVector
    get() {
        if (_boxOpen != null) {
            return _boxOpen!!
        }
        _boxOpen = Builder(name = "BoxOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.576f, 6.429f)
                lineToRelative(-1.91f, -3.171f)
                lineTo(12.0f, 0.036f)
                lineTo(2.334f, 3.258f)
                lineTo(0.442f, 6.397f)
                curveToRelative(-0.475f, 0.792f, -0.563f, 1.742f, -0.243f, 2.607f)
                curveToRelative(0.31f, 0.839f, 0.964f, 1.488f, 1.8f, 1.793f)
                lineToRelative(-0.008f, 9.844f)
                lineToRelative(10.0f, 3.333f)
                lineToRelative(10.0f, -3.333f)
                lineToRelative(0.008f, -9.844f)
                curveToRelative(0.846f, -0.296f, 1.507f, -0.946f, 1.819f, -1.788f)
                curveToRelative(0.317f, -0.857f, 0.229f, -1.797f, -0.242f, -2.582f)
                close()
                moveTo(17.839f, 4.091f)
                lineToRelative(-5.831f, 1.946f)
                lineToRelative(-5.833f, -1.951f)
                lineToRelative(5.825f, -1.942f)
                lineToRelative(5.839f, 1.946f)
                close()
                moveTo(2.156f, 7.428f)
                lineToRelative(1.292f, -2.145f)
                lineToRelative(7.048f, 2.357f)
                lineToRelative(-1.529f, 2.549f)
                curveToRelative(-0.239f, 0.398f, -0.735f, 0.581f, -1.173f, 0.434f)
                lineToRelative(-5.081f, -1.693f)
                curveToRelative(-0.297f, -0.099f, -0.53f, -0.324f, -0.639f, -0.618f)
                curveToRelative(-0.108f, -0.293f, -0.079f, -0.616f, 0.082f, -0.883f)
                close()
                moveTo(3.999f, 11.466f)
                lineToRelative(3.163f, 1.054f)
                curveToRelative(1.343f, 0.448f, 2.792f, -0.088f, 3.521f, -1.302f)
                lineToRelative(0.316f, -0.526f)
                lineToRelative(-0.005f, 10.843f)
                lineToRelative(-7.0f, -2.333f)
                lineToRelative(0.006f, -7.735f)
                close()
                moveTo(12.993f, 21.534f)
                lineToRelative(0.005f, -10.849f)
                lineToRelative(0.319f, 0.532f)
                curveToRelative(0.556f, 0.928f, 1.532f, 1.459f, 2.561f, 1.459f)
                curveToRelative(0.319f, 0.0f, 0.643f, -0.051f, 0.96f, -0.157f)
                lineToRelative(3.161f, -1.053f)
                lineToRelative(-0.006f, 7.734f)
                lineToRelative(-7.0f, 2.333f)
                close()
                moveTo(21.943f, 8.318f)
                curveToRelative(-0.105f, 0.285f, -0.331f, 0.503f, -0.619f, 0.599f)
                lineToRelative(-5.118f, 1.706f)
                curveToRelative(-0.438f, 0.147f, -0.934f, -0.035f, -1.173f, -0.434f)
                lineToRelative(-1.526f, -2.543f)
                lineToRelative(7.051f, -2.353f)
                lineToRelative(1.305f, 2.167f)
                curveToRelative(0.156f, 0.26f, 0.186f, 0.573f, 0.08f, 0.858f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
