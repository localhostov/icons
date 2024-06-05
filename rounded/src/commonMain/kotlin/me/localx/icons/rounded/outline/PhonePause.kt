package me.localx.icons.rounded.outline

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

public val Icons.Outline.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.981f, 7.023f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.981f, 7.023f)
                close()
                moveTo(16.981f, 8.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.981f, 8.023f)
                close()
                moveTo(23.076f, 21.139f)
                lineTo(22.164f, 22.189f)
                curveToRelative(-8.19f, 7.84f, -28.12f, -12.084f, -20.4f, -20.3f)
                lineToRelative(1.15f, -1.0f)
                arcTo(3.08f, 3.08f, 0.0f, false, true, 7.242f, 0.93f)
                curveToRelative(0.031f, 0.03f, 1.882f, 2.437f, 1.882f, 2.437f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -0.005f, 4.281f)
                lineTo(7.959f, 9.1f)
                arcToRelative(12.783f, 12.783f, 0.0f, false, false, 6.932f, 6.947f)
                lineToRelative(1.464f, -1.165f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 4.282f, -0.007f)
                reflectiveCurveToRelative(2.407f, 1.853f, 2.438f, 1.884f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 23.076f, 21.139f)
                close()
                moveTo(21.7f, 18.216f)
                reflectiveCurveToRelative(-2.4f, -1.842f, -2.425f, -1.872f)
                arcToRelative(1.121f, 1.121f, 0.0f, false, false, -1.549f, 0.0f)
                curveToRelative(-0.026f, 0.027f, -2.044f, 1.635f, -2.044f, 1.635f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.979f, 0.151f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 5.88f, 9.318f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.146f, -0.995f)
                reflectiveCurveTo(7.633f, 6.306f, 7.661f, 6.279f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, -1.55f)
                curveTo(7.629f, 4.7f, 5.788f, 2.306f, 5.788f, 2.306f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.51f, 0.038f)
                lineTo(3.127f, 3.349f)
                curveTo(-2.513f, 10.128f, 14.758f, 26.442f, 20.7f, 20.826f)
                lineToRelative(0.912f, -1.05f)
                arcTo(1.122f, 1.122f, 0.0f, false, false, 21.7f, 18.216f)
                close()
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
