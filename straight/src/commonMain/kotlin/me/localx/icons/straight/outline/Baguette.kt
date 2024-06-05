package me.localx.icons.straight.outline

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

public val Icons.Outline.Baguette: ImageVector
    get() {
        if (_baguette != null) {
            return _baguette!!
        }
        _baguette = Builder(name = "Baguette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.036f, 0.964f)
                curveToRelative(-1.194f, -1.194f, -3.355f, -1.284f, -6.089f, -0.254f)
                curveToRelative(-2.464f, 0.929f, -5.098f, 2.683f, -7.228f, 4.812f)
                lineToRelative(-4.197f, 4.196f)
                curveToRelative(-2.13f, 2.13f, -3.884f, 4.765f, -4.813f, 7.228f)
                curveToRelative(-1.03f, 2.733f, -0.94f, 4.896f, 0.254f, 6.09f)
                curveToRelative(0.644f, 0.644f, 1.567f, 0.967f, 2.711f, 0.967f)
                curveToRelative(0.979f, 0.0f, 2.118f, -0.237f, 3.378f, -0.713f)
                curveToRelative(2.464f, -0.929f, 5.098f, -2.683f, 7.228f, -4.812f)
                lineToRelative(4.197f, -4.196f)
                curveToRelative(2.13f, -2.13f, 3.884f, -4.765f, 4.813f, -7.228f)
                curveToRelative(1.03f, -2.733f, 0.94f, -4.896f, -0.254f, -6.09f)
                close()
                moveTo(21.419f, 6.348f)
                curveToRelative(-0.833f, 2.207f, -2.42f, 4.584f, -4.356f, 6.52f)
                lineToRelative(-4.197f, 4.196f)
                curveToRelative(-1.936f, 1.936f, -4.312f, 3.523f, -6.519f, 4.355f)
                curveToRelative(-1.841f, 0.693f, -3.399f, 0.771f, -3.97f, 0.203f)
                curveToRelative(-0.571f, -0.571f, -0.491f, -2.129f, 0.203f, -3.97f)
                curveToRelative(0.436f, -1.156f, 1.079f, -2.358f, 1.871f, -3.519f)
                lineToRelative(2.708f, 2.708f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.904f, -2.905f)
                curveToRelative(0.401f, -0.481f, 0.825f, -0.947f, 1.268f, -1.389f)
                lineToRelative(1.391f, -1.391f)
                lineToRelative(2.965f, 2.965f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.965f, -2.965f)
                lineToRelative(1.391f, -1.391f)
                curveToRelative(0.461f, -0.461f, 0.948f, -0.903f, 1.451f, -1.319f)
                lineToRelative(2.899f, 2.899f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.696f, -2.697f)
                curveToRelative(1.14f, -0.771f, 2.318f, -1.398f, 3.451f, -1.825f)
                curveToRelative(1.023f, -0.386f, 1.959f, -0.582f, 2.686f, -0.582f)
                curveToRelative(0.582f, 0.0f, 1.03f, 0.126f, 1.284f, 0.379f)
                curveToRelative(0.571f, 0.571f, 0.491f, 2.129f, -0.203f, 3.97f)
                close()
            }
        }
        .build()
        return _baguette!!
    }

private var _baguette: ImageVector? = null
