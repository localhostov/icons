package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.825f, 18.704f)
                curveToRelative(2.057f, -3.84f, 1.392f, -8.636f, -1.766f, -11.793f)
                lineTo(12.0f, 0.006f)
                lineToRelative(-4.991f, 4.882f)
                lineTo(2.161f, 0.039f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.801f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.136f, -3.136f)
                close()
                moveTo(12.0f, 4.203f)
                lineToRelative(4.95f, 4.841f)
                curveToRelative(1.977f, 1.976f, 2.554f, 4.881f, 1.613f, 7.398f)
                lineTo(9.131f, 7.009f)
                lineToRelative(2.869f, -2.806f)
                close()
                moveTo(15.248f, 20.198f)
                lineToRelative(2.191f, 2.191f)
                curveToRelative(-1.604f, 1.044f, -3.478f, 1.605f, -5.438f, 1.605f)
                curveToRelative(-2.672f, 0.0f, -5.184f, -1.04f, -7.072f, -2.929f)
                curveToRelative(-1.889f, -1.889f, -2.929f, -4.399f, -2.929f, -7.07f)
                curveToRelative(0.0f, -1.961f, 0.561f, -3.834f, 1.605f, -5.439f)
                lineToRelative(2.19f, 2.19f)
                curveToRelative(-0.518f, 0.988f, -0.795f, 2.098f, -0.795f, 3.25f)
                curveToRelative(0.0f, 1.869f, 0.728f, 3.627f, 2.05f, 4.949f)
                curveToRelative(1.322f, 1.322f, 3.08f, 2.05f, 4.95f, 2.05f)
                curveToRelative(1.15f, 0.0f, 2.258f, -0.276f, 3.248f, -0.795f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
