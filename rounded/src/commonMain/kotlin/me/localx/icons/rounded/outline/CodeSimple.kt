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

public val Icons.Outline.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveToRelative(-0.249f, 0.0f, -0.498f, -0.093f, -0.692f, -0.278f)
                lineTo(1.187f, 14.894f)
                curveToRelative(-1.575f, -1.574f, -1.575f, -4.112f, -0.015f, -5.672f)
                lineTo(8.303f, 2.283f)
                curveToRelative(0.396f, -0.385f, 1.029f, -0.377f, 1.414f, 0.02f)
                curveToRelative(0.385f, 0.396f, 0.376f, 1.029f, -0.02f, 1.414f)
                lineTo(2.576f, 10.646f)
                curveToRelative(-0.77f, 0.77f, -0.77f, 2.04f, 0.01f, 2.819f)
                lineToRelative(7.106f, 6.813f)
                curveToRelative(0.399f, 0.382f, 0.412f, 1.016f, 0.03f, 1.414f)
                curveToRelative(-0.196f, 0.204f, -0.459f, 0.308f, -0.722f, 0.308f)
                close()
                moveTo(15.698f, 21.716f)
                lineToRelative(7.112f, -6.94f)
                curveToRelative(1.559f, -1.56f, 1.559f, -4.098f, -0.014f, -5.671f)
                lineTo(15.693f, 2.279f)
                curveToRelative(-0.398f, -0.382f, -1.031f, -0.369f, -1.414f, 0.028f)
                curveToRelative(-0.382f, 0.398f, -0.37f, 1.031f, 0.028f, 1.414f)
                lineToRelative(7.089f, 6.811f)
                curveToRelative(0.779f, 0.78f, 0.779f, 2.049f, 0.009f, 2.82f)
                lineToRelative(-7.104f, 6.932f)
                curveToRelative(-0.396f, 0.386f, -0.403f, 1.019f, -0.018f, 1.414f)
                curveToRelative(0.196f, 0.201f, 0.456f, 0.302f, 0.716f, 0.302f)
                curveToRelative(0.252f, 0.0f, 0.504f, -0.095f, 0.698f, -0.284f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
