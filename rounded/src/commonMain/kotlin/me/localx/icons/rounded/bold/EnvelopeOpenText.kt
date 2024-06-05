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

public val Icons.Bold.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.315f, 7.836f)
                lineToRelative(-1.2f, -1.171f)
                verticalLineToRelative(-2.665f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(7.115f, 0.0f)
                curveTo(4.91f, 0.0f, 3.115f, 1.794f, 3.115f, 4.0f)
                verticalLineToRelative(2.453f)
                curveToRelative(-0.023f, 0.02f, -1.42f, 1.374f, -1.42f, 1.374f)
                curveToRelative(-1.077f, 1.032f, -1.695f, 2.48f, -1.695f, 3.972f)
                verticalLineToRelative(6.702f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-6.702f)
                curveToRelative(0.0f, -1.492f, -0.617f, -2.939f, -1.685f, -3.962f)
                close()
                moveTo(8.615f, 4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.972f, -0.033f, -1.971f, -2.967f, 0.0f, -3.0f)
                close()
                moveTo(8.615f, 9.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.972f, -0.033f, -1.971f, -2.967f, 0.0f, -3.0f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-6.338f)
                lineToRelative(5.226f, 5.227f)
                curveToRelative(2.06f, 2.137f, 5.729f, 2.135f, 7.792f, -0.014f)
                lineToRelative(4.982f, -5.109f)
                verticalLineToRelative(6.233f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
