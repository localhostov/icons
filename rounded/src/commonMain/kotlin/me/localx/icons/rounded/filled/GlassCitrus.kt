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

public val Icons.Filled.GlassCitrus: ImageVector
    get() {
        if (_glassCitrus != null) {
            return _glassCitrus!!
        }
        _glassCitrus = Builder(name = "GlassCitrus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.406f, 6.137f)
                curveToRelative(-0.572f, -0.713f, -1.425f, -1.122f, -2.339f, -1.122f)
                lineTo(3.005f, 5.015f)
                curveToRelative(-0.914f, 0.0f, -1.767f, 0.409f, -2.339f, 1.122f)
                curveTo(0.094f, 6.851f, -0.121f, 7.771f, 0.062f, 8.583f)
                lineToRelative(0.331f, 2.419f)
                horizontalLineToRelative(9.612f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(0.667f, 13.002f)
                lineToRelative(0.906f, 6.623f)
                curveToRelative(0.313f, 2.496f, 2.446f, 4.378f, 4.961f, 4.378f)
                horizontalLineToRelative(7.004f)
                curveToRelative(2.516f, 0.0f, 4.648f, -1.882f, 4.959f, -4.367f)
                lineToRelative(1.499f, -10.973f)
                curveToRelative(0.197f, -0.893f, -0.018f, -1.813f, -0.591f, -2.526f)
                close()
                moveTo(17.489f, 12.09f)
                curveToRelative(-0.088f, 0.482f, -0.509f, 0.82f, -0.983f, 0.82f)
                curveToRelative(-0.06f, 0.0f, -0.12f, -0.005f, -0.181f, -0.016f)
                curveToRelative(-2.416f, -0.441f, -4.41f, -2.254f, -5.08f, -4.619f)
                curveToRelative(-0.151f, -0.532f, 0.158f, -1.084f, 0.689f, -1.235f)
                curveToRelative(0.534f, -0.149f, 1.084f, 0.158f, 1.235f, 0.689f)
                curveToRelative(0.464f, 1.637f, 1.844f, 2.892f, 3.516f, 3.197f)
                curveToRelative(0.543f, 0.099f, 0.903f, 0.62f, 0.804f, 1.164f)
                close()
                moveTo(24.0f, 6.498f)
                curveToRelative(0.0f, 2.023f, -0.925f, 3.831f, -2.375f, 5.022f)
                lineToRelative(0.344f, -2.514f)
                curveToRelative(0.295f, -1.459f, -0.068f, -2.957f, -1.003f, -4.121f)
                curveToRelative(-0.954f, -1.188f, -2.375f, -1.869f, -3.898f, -1.869f)
                horizontalLineToRelative(-5.051f)
                curveToRelative(1.153f, -1.813f, 3.179f, -3.016f, 5.486f, -3.016f)
                curveToRelative(3.588f, 0.0f, 6.497f, 2.909f, 6.497f, 6.497f)
                close()
            }
        }
        .build()
        return _glassCitrus!!
    }

private var _glassCitrus: ImageVector? = null
