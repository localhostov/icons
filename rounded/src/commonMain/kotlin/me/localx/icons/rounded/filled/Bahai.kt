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

public val Icons.Filled.Bahai: ImageVector
    get() {
        if (_bahai != null) {
            return _bahai!!
        }
        _bahai = Builder(name = "Bahai", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.215f)
                lineToRelative(3.025f, 2.415f)
                curveToRelative(0.688f, 0.549f, 1.713f, 0.176f, 1.887f, -0.687f)
                lineToRelative(0.765f, -3.795f)
                lineToRelative(3.87f, -0.095f)
                curveToRelative(0.88f, -0.022f, 1.425f, -0.966f, 1.004f, -1.739f)
                lineToRelative(-1.853f, -3.399f)
                lineToRelative(2.904f, -2.56f)
                curveToRelative(0.66f, -0.582f, 0.471f, -1.656f, -0.349f, -1.977f)
                lineToRelative(-3.604f, -1.412f)
                lineToRelative(0.579f, -3.827f)
                curveToRelative(0.132f, -0.87f, -0.704f, -1.571f, -1.538f, -1.291f)
                lineToRelative(-3.669f, 1.235f)
                lineTo(13.004f, 0.78f)
                curveTo(12.545f, 0.029f, 11.455f, 0.029f, 10.996f, 0.78f)
                lineToRelative(-2.017f, 3.304f)
                lineToRelative(-3.669f, -1.235f)
                curveToRelative(-0.834f, -0.281f, -1.67f, 0.42f, -1.538f, 1.291f)
                lineToRelative(0.579f, 3.827f)
                lineToRelative(-3.604f, 1.412f)
                curveToRelative(-0.819f, 0.321f, -1.009f, 1.395f, -0.349f, 1.977f)
                lineToRelative(2.904f, 2.56f)
                lineToRelative(-1.853f, 3.399f)
                curveToRelative(-0.421f, 0.773f, 0.124f, 1.717f, 1.004f, 1.739f)
                lineToRelative(3.87f, 0.095f)
                lineToRelative(0.765f, 3.795f)
                curveToRelative(0.174f, 0.863f, 1.199f, 1.236f, 1.887f, 0.687f)
                lineToRelative(3.025f, -2.415f)
                close()
            }
        }
        .build()
        return _bahai!!
    }

private var _bahai: ImageVector? = null
