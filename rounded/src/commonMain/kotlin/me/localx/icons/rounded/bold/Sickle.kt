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

public val Icons.Bold.Sickle: ImageVector
    get() {
        if (_sickle != null) {
            return _sickle!!
        }
        _sickle = Builder(name = "Sickle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.745f, 8.382f)
                curveTo(21.586f, 3.544f, 17.462f, 0.098f, 12.717f, 0.002f)
                curveToRelative(-2.841f, -0.039f, -5.534f, 1.007f, -7.566f, 2.998f)
                curveToRelative(-2.032f, 1.991f, -3.151f, 4.655f, -3.151f, 7.5f)
                curveToRelative(0.0f, 2.763f, 1.119f, 5.398f, 3.033f, 7.346f)
                lineToRelative(-3.594f, 3.594f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(5.062f, -5.062f)
                curveToRelative(0.817f, -0.817f, 1.09f, -2.06f, 0.695f, -3.165f)
                curveToRelative(-0.337f, -0.944f, -0.407f, -1.933f, -0.208f, -2.94f)
                curveToRelative(0.427f, -2.163f, 2.237f, -3.934f, 4.4f, -4.307f)
                curveToRelative(2.801f, -0.485f, 5.423f, 1.133f, 6.235f, 3.844f)
                curveToRelative(0.19f, 0.635f, 0.755f, 1.07f, 1.697f, 1.07f)
                curveToRelative(0.788f, 0.0f, 1.41f, -0.579f, 1.492f, -1.341f)
                curveToRelative(0.085f, -0.803f, 0.142f, -1.902f, -0.189f, -3.276f)
                close()
                moveTo(13.0f, 5.13f)
                curveToRelative(-3.414f, 0.589f, -6.16f, 3.274f, -6.834f, 6.682f)
                curveToRelative(-0.163f, 0.823f, -0.205f, 1.659f, -0.126f, 2.486f)
                curveToRelative(-0.671f, -1.139f, -1.041f, -2.449f, -1.041f, -3.797f)
                curveToRelative(0.0f, -2.032f, 0.799f, -3.935f, 2.25f, -5.357f)
                curveToRelative(1.414f, -1.385f, 3.272f, -2.143f, 5.249f, -2.143f)
                curveToRelative(3.295f, 0.0f, 4.453f, 1.163f, 5.826f, 2.934f)
                curveToRelative(-1.592f, -0.81f, -3.447f, -1.128f, -5.325f, -0.804f)
                close()
            }
        }
        .build()
        return _sickle!!
    }

private var _sickle: ImageVector? = null
