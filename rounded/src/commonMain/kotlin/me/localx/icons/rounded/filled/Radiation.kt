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

public val Icons.Filled.Radiation: ImageVector
    get() {
        if (_radiation != null) {
            return _radiation!!
        }
        _radiation = Builder(name = "Radiation", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 11.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(23.416f, 11.151f)
                curveToRelative(0.455f, -0.525f, 0.658f, -1.217f, 0.559f, -1.896f)
                curveToRelative(-0.438f, -2.998f, -2.145f, -5.834f, -4.684f, -7.778f)
                curveToRelative(-0.524f, -0.401f, -1.202f, -0.565f, -1.86f, -0.447f)
                curveToRelative(-0.677f, 0.12f, -1.275f, 0.522f, -1.644f, 1.104f)
                lineToRelative(-2.438f, 3.859f)
                curveToRelative(-0.151f, 0.24f, -0.193f, 0.533f, -0.117f, 0.806f)
                curveToRelative(0.077f, 0.273f, 0.267f, 0.501f, 0.521f, 0.626f)
                curveToRelative(1.386f, 0.682f, 2.246f, 2.051f, 2.247f, 3.573f)
                curveToRelative(0.0f, 0.552f, 0.448f, 0.999f, 1.0f, 0.999f)
                horizontalLineToRelative(4.563f)
                reflectiveCurveToRelative(0.002f, 0.0f, 0.003f, 0.0f)
                curveToRelative(0.71f, 0.0f, 1.384f, -0.309f, 1.85f, -0.847f)
                close()
                moveTo(2.436f, 11.998f)
                horizontalLineToRelative(4.564f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.522f, 0.861f, -2.892f, 2.247f, -3.573f)
                curveToRelative(0.255f, -0.125f, 0.444f, -0.353f, 0.521f, -0.626f)
                curveToRelative(0.076f, -0.272f, 0.034f, -0.565f, -0.117f, -0.806f)
                lineToRelative(-2.439f, -3.86f)
                curveToRelative(-0.367f, -0.58f, -0.966f, -0.982f, -1.643f, -1.103f)
                curveToRelative(-0.657f, -0.119f, -1.336f, 0.046f, -1.86f, 0.447f)
                curveTo(2.17f, 3.422f, 0.463f, 6.258f, 0.025f, 9.256f)
                curveToRelative(-0.1f, 0.679f, 0.104f, 1.37f, 0.559f, 1.896f)
                curveToRelative(0.466f, 0.538f, 1.14f, 0.847f, 1.849f, 0.847f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(16.565f, 22.041f)
                curveToRelative(0.623f, -0.273f, 1.102f, -0.797f, 1.315f, -1.436f)
                curveToRelative(0.209f, -0.626f, 0.143f, -1.315f, -0.165f, -1.861f)
                lineToRelative(-2.118f, -4.077f)
                curveToRelative(-0.133f, -0.256f, -0.37f, -0.442f, -0.65f, -0.511f)
                curveToRelative(-0.279f, -0.066f, -0.577f, -0.013f, -0.812f, 0.153f)
                curveToRelative(-1.289f, 0.907f, -2.996f, 0.9f, -4.271f, 0.004f)
                curveToRelative(-0.23f, -0.163f, -0.522f, -0.22f, -0.796f, -0.157f)
                curveToRelative(-0.275f, 0.062f, -0.512f, 0.239f, -0.65f, 0.485f)
                curveToRelative(-0.521f, 0.929f, -0.872f, 1.639f, -1.21f, 2.325f)
                curveToRelative(-0.285f, 0.578f, -0.554f, 1.124f, -0.904f, 1.746f)
                curveToRelative(-0.323f, 0.576f, -0.389f, 1.267f, -0.179f, 1.895f)
                curveToRelative(0.213f, 0.638f, 0.692f, 1.16f, 1.312f, 1.433f)
                curveToRelative(1.447f, 0.637f, 2.983f, 0.96f, 4.564f, 0.96f)
                reflectiveCurveToRelative(3.12f, -0.322f, 4.564f, -0.959f)
                close()
            }
        }
        .build()
        return _radiation!!
    }

private var _radiation: ImageVector? = null
