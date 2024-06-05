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

public val Icons.Outline.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.01f)
                curveToRelative(-3.812f, 0.0f, -8.125f, 2.038f, -11.539f, 5.451f)
                arcToRelative(38.467f, 38.467f, 0.0f, false, false, -8.138f, 11.851f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, 0.851f, 4.409f)
                lineToRelative(1.106f, 1.105f)
                arcToRelative(3.981f, 3.981f, 0.0f, false, false, 4.4f, 0.852f)
                arcToRelative(38.333f, 38.333f, 0.0f, false, false, 11.854f, -8.139f)
                curveToRelative(3.418f, -3.413f, 5.456f, -7.726f, 5.456f, -11.539f)
                arcToRelative(3.632f, 3.632f, 0.0f, false, false, -3.99f, -3.99f)
                close()
                moveTo(17.125f, 14.125f)
                arcToRelative(36.348f, 36.348f, 0.0f, false, true, -11.225f, 7.715f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, true, -2.026f, -0.3f)
                lineToRelative(12.833f, -12.833f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-12.836f, 12.836f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, -0.3f, -2.028f)
                arcToRelative(36.44f, 36.44f, 0.0f, false, true, 7.718f, -11.226f)
                curveToRelative(3.588f, -3.587f, 7.583f, -4.865f, 10.125f, -4.865f)
                curveToRelative(1.451f, 0.0f, 1.99f, 0.539f, 1.99f, 1.99f)
                curveToRelative(0.0f, 2.543f, -1.278f, 6.538f, -4.865f, 10.125f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
