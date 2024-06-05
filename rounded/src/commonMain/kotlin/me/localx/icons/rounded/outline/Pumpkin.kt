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

public val Icons.Outline.Pumpkin: ImageVector
    get() {
        if (_pumpkin != null) {
            return _pumpkin!!
        }
        _pumpkin = Builder(name = "Pumpkin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                arcToRelative(4.074f, 4.074f, 0.0f, false, false, -1.639f, 0.362f)
                arcTo(4.96f, 4.96f, 0.0f, false, false, 13.049f, 6.0f)
                curveTo(13.475f, 1.618f, 16.927f, 1.221f, 17.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                curveToRelative(-0.3f, -3.828f, -5.018f, -3.987f, -6.99f, -0.437f)
                curveToRelative(-0.582f, -1.045f, -2.8f, -3.664f, -3.9f, -2.01f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.553f, 1.9f)
                curveToRelative(1.425f, 0.712f, 2.214f, 2.062f, 2.4f, 4.105f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, false, -2.316f, 0.362f)
                curveTo(4.373f, 4.824f, 0.035f, 8.846f, 0.0f, 15.0f)
                curveToRelative(0.045f, 6.1f, 4.272f, 10.1f, 8.464f, 8.666f)
                arcToRelative(3.365f, 3.365f, 0.0f, false, false, 2.525f, 0.152f)
                arcToRelative(2.873f, 2.873f, 0.0f, false, false, 2.022f, 0.0f)
                arcToRelative(3.36f, 3.36f, 0.0f, false, false, 2.523f, -0.152f)
                curveTo(19.726f, 25.1f, 23.955f, 21.1f, 24.0f, 15.0f)
                curveTo(24.0f, 9.366f, 20.44f, 6.0f, 17.0f, 6.0f)
                close()
                moveTo(2.0f, 15.0f)
                curveToRelative(0.0f, -4.027f, 2.148f, -6.558f, 4.4f, -6.943f)
                curveToRelative(-3.1f, 3.03f, -3.107f, 10.757f, -0.182f, 13.85f)
                curveTo(4.033f, 21.42f, 2.0f, 18.918f, 2.0f, 15.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -3.446f, 1.569f, -5.66f, 2.984f, -6.552f)
                curveToRelative(-1.343f, 2.617f, -1.257f, 10.983f, 0.048f, 13.287f)
                curveTo(7.553f, 20.964f, 6.0f, 18.541f, 6.0f, 15.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-2.671f, 0.2f, -2.629f, -14.178f, 0.0f, -14.0f)
                curveTo(14.634f, 7.83f, 14.666f, 22.2f, 12.0f, 22.0f)
                close()
                moveTo(14.968f, 21.735f)
                curveToRelative(1.3f, -2.306f, 1.391f, -10.669f, 0.048f, -13.287f)
                curveToRelative(3.986f, 2.276f, 3.876f, 11.119f, -0.048f, 13.287f)
                moveToRelative(2.811f, 0.172f)
                curveToRelative(2.926f, -3.094f, 2.913f, -10.821f, -0.182f, -13.85f)
                curveTo(23.343f, 9.035f, 23.446f, 20.676f, 17.779f, 21.907f)
                close()
            }
        }
        .build()
        return _pumpkin!!
    }

private var _pumpkin: ImageVector? = null
