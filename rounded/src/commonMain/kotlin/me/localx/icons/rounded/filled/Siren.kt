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

public val Icons.Filled.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.194f, 16.9f)
                lineToRelative(-1.26f, -12.598f)
                curveToRelative(-0.245f, -2.453f, -2.289f, -4.302f, -4.754f, -4.302f)
                horizontalLineToRelative(-6.361f)
                curveToRelative(-2.465f, 0.0f, -4.509f, 1.85f, -4.754f, 4.302f)
                lineToRelative(-1.26f, 12.598f)
                curveToRelative(-0.028f, 0.281f, 0.064f, 0.561f, 0.254f, 0.771f)
                curveToRelative(0.189f, 0.209f, 0.458f, 0.329f, 0.741f, 0.329f)
                horizontalLineToRelative(16.398f)
                curveToRelative(0.283f, 0.0f, 0.552f, -0.12f, 0.741f, -0.329f)
                curveToRelative(0.19f, -0.209f, 0.282f, -0.489f, 0.254f, -0.771f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(-1.075f)
                lineToRelative(-0.11f, 1.1f)
                curveToRelative(-0.052f, 0.516f, -0.486f, 0.9f, -0.994f, 0.9f)
                curveToRelative(-0.033f, 0.0f, -0.067f, -0.001f, -0.101f, -0.005f)
                curveToRelative(-0.549f, -0.055f, -0.95f, -0.545f, -0.896f, -1.095f)
                lineToRelative(0.2f, -2.0f)
                curveToRelative(0.051f, -0.511f, 0.481f, -0.9f, 0.995f, -0.9f)
                horizontalLineToRelative(1.979f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
