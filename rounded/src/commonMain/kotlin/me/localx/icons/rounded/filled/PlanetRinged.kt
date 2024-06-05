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

public val Icons.Filled.PlanetRinged: ImageVector
    get() {
        if (_planetRinged != null) {
            return _planetRinged!!
        }
        _planetRinged = Builder(name = "PlanetRinged", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.43f, 21.33f)
                curveToRelative(2.218f, -1.512f, 4.647f, -3.552f, 6.996f, -5.901f)
                curveToRelative(4.581f, -4.581f, 5.896f, -7.002f, 5.893f, -7.011f)
                curveToRelative(2.17f, -3.167f, 3.524f, -6.294f, 2.033f, -7.784f)
                curveToRelative(-1.603f, -1.605f, -5.035f, 0.13f, -7.808f, 2.025f)
                curveToRelative(-1.106f, -0.422f, -2.3f, -0.664f, -3.552f, -0.664f)
                curveTo(6.478f, 1.993f, 1.992f, 6.479f, 1.992f, 11.993f)
                curveToRelative(0.0f, 1.252f, 0.241f, 2.446f, 0.664f, 3.552f)
                curveToRelative(-1.893f, 2.774f, -3.627f, 6.206f, -2.024f, 7.809f)
                curveToRelative(0.424f, 0.425f, 0.993f, 0.637f, 1.703f, 0.637f)
                curveToRelative(1.153f, 0.0f, 2.679f, -0.559f, 4.562f, -1.674f)
                curveToRelative(0.261f, -0.155f, 1.286f, -0.818f, 1.533f, -0.986f)
                close()
                moveTo(21.938f, 2.046f)
                curveToRelative(0.318f, 0.318f, -0.15f, 1.92f, -1.668f, 4.344f)
                curveToRelative(-0.717f, -1.055f, -1.629f, -1.967f, -2.685f, -2.683f)
                curveToRelative(3.01f, -1.894f, 4.228f, -1.785f, 4.353f, -1.661f)
                close()
                moveTo(5.878f, 20.595f)
                curveToRelative(-2.686f, 1.591f, -3.735f, 1.442f, -3.832f, 1.345f)
                curveToRelative(-0.124f, -0.124f, -0.232f, -1.344f, 1.661f, -4.353f)
                curveToRelative(0.716f, 1.057f, 1.629f, 1.971f, 2.686f, 2.688f)
                curveToRelative(-0.172f, 0.108f, -0.347f, 0.221f, -0.515f, 0.321f)
                close()
                moveTo(21.941f, 11.013f)
                curveToRelative(0.033f, 0.323f, 0.052f, 0.649f, 0.052f, 0.981f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-0.331f, 0.0f, -0.657f, -0.019f, -0.979f, -0.052f)
                curveToRelative(1.903f, -1.429f, 3.896f, -3.167f, 5.827f, -5.099f)
                curveToRelative(0.817f, -0.816f, 3.053f, -3.122f, 5.1f, -5.83f)
                close()
            }
        }
        .build()
        return _planetRinged!!
    }

private var _planetRinged: ImageVector? = null
