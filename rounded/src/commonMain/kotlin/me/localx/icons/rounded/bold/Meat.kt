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

public val Icons.Bold.Meat: ImageVector
    get() {
        if (_meat != null) {
            return _meat!!
        }
        _meat = Builder(name = "Meat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.16f, 2.84f)
                curveTo(17.929f, -0.392f, 13.21f, -0.93f, 10.639f, 1.64f)
                curveToRelative(-2.642f, 2.659f, -4.216f, 6.556f, -4.624f, 11.529f)
                curveToRelative(-0.065f, 0.791f, 0.103f, 1.562f, 0.432f, 2.262f)
                lineToRelative(-3.099f, 3.1f)
                curveToRelative(-0.356f, -0.327f, -0.827f, -0.531f, -1.348f, -0.531f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.521f, -0.204f, -0.992f, -0.531f, -1.348f)
                lineToRelative(3.092f, -3.093f)
                curveToRelative(1.17f, 0.633f, 2.27f, 0.426f, 2.27f, 0.426f)
                curveToRelative(3.427f, -0.281f, 8.33f, -1.426f, 11.53f, -4.625f)
                curveToRelative(2.569f, -2.57f, 2.031f, -7.29f, -1.201f, -10.521f)
                close()
                moveTo(10.586f, 14.995f)
                curveToRelative(-0.433f, 0.04f, -0.856f, -0.117f, -1.159f, -0.42f)
                curveToRelative(-0.304f, -0.305f, -0.458f, -0.728f, -0.422f, -1.16f)
                curveToRelative(0.128f, -1.565f, 0.382f, -2.989f, 0.755f, -4.276f)
                curveToRelative(0.474f, 1.071f, 1.164f, 2.106f, 2.079f, 3.021f)
                curveToRelative(0.888f, 0.888f, 1.905f, 1.587f, 2.979f, 2.073f)
                curveToRelative(-1.595f, 0.456f, -3.13f, 0.672f, -4.233f, 0.762f)
                close()
                moveTo(20.239f, 11.239f)
                curveToRelative(-0.62f, 0.62f, -1.573f, 0.872f, -2.679f, 0.715f)
                curveToRelative(-1.267f, -0.181f, -2.545f, -0.861f, -3.6f, -1.916f)
                curveToRelative(-2.027f, -2.027f, -2.576f, -4.902f, -1.2f, -6.278f)
                curveToRelative(0.514f, -0.515f, 1.238f, -0.76f, 2.048f, -0.76f)
                curveToRelative(1.358f, 0.0f, 2.961f, 0.69f, 4.23f, 1.959f)
                curveToRelative(2.027f, 2.027f, 2.576f, 4.902f, 1.2f, 6.278f)
                close()
                moveTo(17.4f, 6.6f)
                curveToRelative(0.663f, 0.663f, 0.797f, 1.603f, 0.3f, 2.1f)
                reflectiveCurveToRelative(-1.437f, 0.363f, -2.1f, -0.3f)
                reflectiveCurveToRelative(-0.797f, -1.603f, -0.3f, -2.1f)
                curveToRelative(0.497f, -0.497f, 1.437f, -0.363f, 2.1f, 0.3f)
                close()
            }
        }
        .build()
        return _meat!!
    }

private var _meat: ImageVector? = null
