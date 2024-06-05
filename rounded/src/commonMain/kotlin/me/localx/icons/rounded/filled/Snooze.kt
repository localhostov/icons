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

public val Icons.Filled.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = Builder(name = "Snooze", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 24.0f)
                lineTo(2.465f, 24.0f)
                curveToRelative(-1.082f, 0.0f, -1.998f, -0.665f, -2.335f, -1.693f)
                reflectiveCurveToRelative(0.009f, -2.107f, 0.881f, -2.748f)
                lineToRelative(7.804f, -5.729f)
                curveToRelative(0.233f, -0.172f, 0.203f, -0.396f, 0.164f, -0.515f)
                curveToRelative(-0.039f, -0.117f, -0.146f, -0.315f, -0.434f, -0.315f)
                lineTo(1.011f, 13.0f)
                curveTo(0.458f, 13.0f, 0.011f, 12.552f, 0.011f, 12.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.535f)
                curveToRelative(1.082f, 0.0f, 1.998f, 0.665f, 2.335f, 1.693f)
                curveToRelative(0.337f, 1.029f, -0.009f, 2.108f, -0.881f, 2.749f)
                lineToRelative(-7.804f, 5.729f)
                curveToRelative(-0.233f, 0.172f, -0.203f, 0.396f, -0.164f, 0.514f)
                reflectiveCurveToRelative(0.146f, 0.315f, 0.434f, 0.315f)
                horizontalLineToRelative(7.535f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(24.002f, 21.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.805f)
                lineToRelative(4.02f, -3.517f)
                curveToRelative(0.684f, -0.503f, 0.956f, -1.349f, 0.691f, -2.155f)
                reflectiveCurveToRelative(-0.983f, -1.328f, -1.832f, -1.328f)
                horizontalLineToRelative(-4.077f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-4.02f, 3.517f)
                curveToRelative(-0.684f, 0.503f, -0.956f, 1.349f, -0.691f, 2.155f)
                reflectiveCurveToRelative(0.983f, 1.328f, 1.832f, 1.328f)
                horizontalLineToRelative(4.002f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(19.0f, 9.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineToRelative(-4.995f, -0.042f)
                lineToRelative(5.155f, -4.236f)
                curveToRelative(0.731f, -0.537f, 1.021f, -1.441f, 0.739f, -2.304f)
                curveToRelative(-0.282f, -0.862f, -1.05f, -1.419f, -1.957f, -1.419f)
                horizontalLineToRelative(-4.938f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                lineToRelative(4.995f, 0.042f)
                lineToRelative(-5.156f, 4.236f)
                curveToRelative(-0.731f, 0.537f, -1.021f, 1.441f, -0.739f, 2.304f)
                curveToRelative(0.283f, 0.862f, 1.051f, 1.418f, 1.957f, 1.418f)
                horizontalLineToRelative(4.938f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _snooze!!
    }

private var _snooze: ImageVector? = null
