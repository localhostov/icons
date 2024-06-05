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

public val Icons.Bold.FireFlameCurved: ImageVector
    get() {
        if (_fireFlameCurved != null) {
            return _fireFlameCurved!!
        }
        _fireFlameCurved = Builder(name = "FireFlameCurved", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.917f, 5.628f)
                curveToRelative(-1.141f, -1.385f, -2.321f, -2.817f, -3.077f, -4.335f)
                curveTo(14.422f, 0.452f, 13.57f, -0.07f, 12.655f, -0.007f)
                curveToRelative(-0.901f, 0.051f, -1.658f, 0.624f, -1.974f, 1.495f)
                curveToRelative(-0.339f, 0.934f, -0.681f, 2.635f, -0.681f, 4.328f)
                curveToRelative(0.0f, 2.276f, 0.738f, 3.692f, 1.332f, 4.829f)
                curveToRelative(0.49f, 0.94f, 0.743f, 1.466f, 0.674f, 2.22f)
                curveToRelative(-0.058f, 0.646f, -0.661f, 1.148f, -1.354f, 1.148f)
                curveToRelative(-1.345f, -0.016f, -2.099f, -0.757f, -2.233f, -4.624f)
                curveToRelative(-0.039f, -1.102f, -0.779f, -2.029f, -1.842f, -2.308f)
                curveToRelative(-1.063f, -0.28f, -2.157f, 0.166f, -2.728f, 1.104f)
                curveToRelative(-0.86f, 1.411f, -1.849f, 3.336f, -1.849f, 5.717f)
                curveToRelative(0.0f, 5.562f, 4.462f, 10.087f, 9.946f, 10.087f)
                curveToRelative(5.509f, -0.034f, 10.053f, -4.56f, 10.053f, -10.062f)
                curveToRelative(0.055f, -3.275f, -2.048f, -5.829f, -4.082f, -8.3f)
                close()
                moveTo(18.999f, 13.902f)
                curveToRelative(0.0f, 3.884f, -3.188f, 7.062f, -7.053f, 7.087f)
                curveToRelative(-3.83f, 0.0f, -6.946f, -3.179f, -6.946f, -7.087f)
                curveToRelative(0.0f, -0.808f, 0.175f, -1.618f, 0.552f, -2.511f)
                curveToRelative(0.293f, 2.405f, 1.294f, 5.578f, 5.066f, 5.622f)
                curveToRelative(2.233f, 0.0f, 4.178f, -1.694f, 4.375f, -3.878f)
                curveToRelative(0.151f, -1.666f, -0.461f, -2.841f, -1.002f, -3.877f)
                curveToRelative(-0.51f, -0.978f, -0.992f, -1.901f, -0.992f, -3.442f)
                curveToRelative(0.0f, -0.516f, 0.042f, -1.047f, 0.109f, -1.541f)
                curveToRelative(0.759f, 1.155f, 1.636f, 2.22f, 2.493f, 3.26f)
                curveToRelative(1.843f, 2.238f, 3.435f, 4.172f, 3.398f, 6.367f)
                close()
            }
        }
        .build()
        return _fireFlameCurved!!
    }

private var _fireFlameCurved: ImageVector? = null
