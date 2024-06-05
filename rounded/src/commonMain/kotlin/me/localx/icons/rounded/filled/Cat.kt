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

public val Icons.Filled.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.447f, 0.105f)
                curveToRelative(-0.34f, -0.17f, -0.746f, -0.133f, -1.047f, 0.095f)
                lineToRelative(-1.69f, 1.267f)
                curveToRelative(-0.677f, -0.299f, -1.424f, -0.467f, -2.21f, -0.467f)
                reflectiveCurveToRelative(-1.533f, 0.169f, -2.21f, 0.467f)
                lineToRelative(-1.69f, -1.267f)
                curveToRelative(-0.303f, -0.228f, -0.709f, -0.265f, -1.047f, -0.095f)
                curveToRelative(-0.339f, 0.169f, -0.553f, 0.516f, -0.553f, 0.895f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 1.0f)
                curveToRelative(0.0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.895f)
                close()
                moveTo(24.0f, 22.999f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.915f, -2.089f, -5.351f, -4.848f, -5.889f)
                curveToRelative(-0.601f, -0.117f, -1.152f, 0.378f, -1.152f, 0.991f)
                verticalLineToRelative(0.004f)
                curveToRelative(0.0f, 0.485f, 0.353f, 0.88f, 0.828f, 0.981f)
                curveToRelative(1.809f, 0.383f, 3.172f, 1.992f, 3.172f, 3.914f)
                verticalLineToRelative(2.0f)
                lineTo(6.558f, 24.0f)
                curveToRelative(-3.224f, 0.0f, -6.558f, -2.058f, -6.558f, -5.5f)
                curveToRelative(0.0f, -2.135f, 0.945f, -3.659f, 1.779f, -5.004f)
                curveToRelative(0.655f, -1.056f, 1.221f, -1.969f, 1.221f, -2.996f)
                curveToRelative(0.0f, -1.135f, -0.277f, -2.195f, -2.107f, -2.445f)
                curveToRelative(-0.504f, -0.069f, -0.893f, -0.482f, -0.893f, -0.99f)
                curveToRelative(0.0f, -0.593f, 0.519f, -1.074f, 1.107f, -0.997f)
                curveToRelative(3.357f, 0.44f, 3.893f, 2.905f, 3.893f, 4.432f)
                curveToRelative(0.0f, 1.597f, -0.773f, 2.844f, -1.521f, 4.051f)
                curveToRelative(-0.76f, 1.226f, -1.479f, 2.384f, -1.479f, 3.949f)
                curveToRelative(0.0f, 1.791f, 1.467f, 2.851f, 2.997f, 3.279f)
                curveToRelative(0.007f, -1.299f, 0.364f, -7.986f, 6.719f, -11.077f)
                curveToRelative(0.159f, -0.07f, 0.307f, -0.131f, 0.456f, -0.193f)
                curveToRelative(1.332f, 2.094f, 3.667f, 3.491f, 6.328f, 3.491f)
                curveToRelative(1.264f, 0.0f, 2.454f, -0.317f, 3.5f, -0.872f)
                verticalLineToRelative(8.872f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
