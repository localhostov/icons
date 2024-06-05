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

public val Icons.Filled.G: ImageVector
    get() {
        if (_g != null) {
            return _g!!
        }
        _g = Builder(name = "G", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.066f, 24.0f)
                curveToRelative(-5.58f, 0.0f, -10.066f, -4.486f, -10.066f, -10.0f)
                verticalLineToRelative(-4.0f)
                curveTo(2.0f, 4.486f, 6.486f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.824f, 0.0f, 7.257f, 2.128f, 8.96f, 5.554f)
                curveToRelative(0.246f, 0.495f, 0.044f, 1.095f, -0.45f, 1.341f)
                curveToRelative(-0.496f, 0.244f, -1.095f, 0.044f, -1.341f, -0.45f)
                curveToRelative(-1.363f, -2.742f, -4.109f, -4.445f, -7.169f, -4.445f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(2.984f, -0.001f, 5.639f, -1.483f, 7.167f, -3.963f)
                curveToRelative(0.38f, -0.616f, 0.394f, -1.365f, 0.038f, -2.002f)
                curveToRelative(-0.362f, -0.647f, -1.018f, -1.034f, -1.756f, -1.034f)
                horizontalLineToRelative(-4.448f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.448f)
                curveToRelative(1.473f, 0.0f, 2.782f, 0.77f, 3.502f, 2.059f)
                curveToRelative(0.714f, 1.279f, 0.685f, 2.784f, -0.081f, 4.026f)
                curveToRelative(-1.895f, 3.076f, -5.186f, 4.913f, -8.804f, 4.915f)
                close()
            }
        }
        .build()
        return _g!!
    }

private var _g: ImageVector? = null
