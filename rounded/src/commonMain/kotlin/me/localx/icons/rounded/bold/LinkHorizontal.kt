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

public val Icons.Bold.LinkHorizontal: ImageVector
    get() {
        if (_linkHorizontal != null) {
            return _linkHorizontal!!
        }
        _linkHorizontal = Builder(name = "LinkHorizontal", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.914f, 11.545f)
                curveToRelative(0.527f, 0.639f, 0.437f, 1.584f, -0.202f, 2.111f)
                curveToRelative(-0.638f, 0.528f, -1.584f, 0.438f, -2.112f, -0.201f)
                curveToRelative(-1.032f, -1.25f, -1.601f, -2.832f, -1.601f, -4.455f)
                curveTo(0.0f, 5.141f, 3.14f, 2.0f, 7.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.118f, -2.094f, 5.888f, -5.091f, 6.736f)
                curveToRelative(-0.137f, 0.039f, -0.274f, 0.057f, -0.41f, 0.057f)
                curveToRelative(-0.654f, 0.0f, -1.255f, -0.431f, -1.442f, -1.092f)
                curveToRelative(-0.226f, -0.797f, 0.238f, -1.626f, 1.035f, -1.852f)
                curveToRelative(1.713f, -0.484f, 2.909f, -2.067f, 2.909f, -3.85f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(7.0f, 4.999f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.941f, 0.316f, 1.821f, 0.914f, 2.545f)
                close()
                moveTo(22.399f, 10.545f)
                curveToRelative(-0.528f, -0.639f, -1.473f, -0.729f, -2.112f, -0.201f)
                curveToRelative(-0.639f, 0.527f, -0.729f, 1.473f, -0.202f, 2.111f)
                curveToRelative(0.598f, 0.724f, 0.914f, 1.604f, 0.914f, 2.545f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.782f, 1.196f, -3.365f, 2.909f, -3.85f)
                curveToRelative(0.797f, -0.226f, 1.26f, -1.055f, 1.035f, -1.852f)
                curveToRelative(-0.226f, -0.798f, -1.054f, -1.261f, -1.852f, -1.035f)
                curveToRelative(-2.998f, 0.849f, -5.091f, 3.618f, -5.091f, 6.736f)
                curveToRelative(0.0f, 3.859f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -1.623f, -0.568f, -3.205f, -1.601f, -4.455f)
                close()
            }
        }
        .build()
        return _linkHorizontal!!
    }

private var _linkHorizontal: ImageVector? = null
