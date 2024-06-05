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

public val Icons.Filled.HammerWar: ImageVector
    get() {
        if (_hammerWar != null) {
            return _hammerWar!!
        }
        _hammerWar = Builder(name = "HammerWar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.654f, 11.155f)
                lineToRelative(-2.665f, -1.785f)
                curveToRelative(-1.037f, -0.573f, -1.773f, -1.646f, -1.948f, -2.9f)
                curveToRelative(-0.175f, -1.254f, 0.238f, -2.486f, 1.133f, -3.382f)
                lineToRelative(1.903f, -1.903f)
                curveTo(7.973f, 0.289f, 9.206f, -0.124f, 10.461f, 0.052f)
                curveToRelative(1.254f, 0.176f, 2.327f, 0.911f, 2.941f, 2.019f)
                lineToRelative(1.73f, 2.607f)
                lineToRelative(-6.478f, 6.478f)
                close()
                moveTo(12.862f, 15.363f)
                lineToRelative(1.785f, 2.665f)
                curveToRelative(0.573f, 1.037f, 1.646f, 1.773f, 2.9f, 1.948f)
                curveToRelative(1.254f, 0.175f, 2.486f, -0.238f, 3.382f, -1.133f)
                lineToRelative(1.903f, -1.903f)
                curveToRelative(0.896f, -0.896f, 1.309f, -2.128f, 1.133f, -3.383f)
                curveToRelative(-0.176f, -1.254f, -0.911f, -2.327f, -2.019f, -2.941f)
                lineToRelative(-2.607f, -1.73f)
                lineToRelative(-6.478f, 6.478f)
                close()
                moveTo(10.004f, 15.409f)
                curveToRelative(-0.494f, -0.495f, -0.973f, -0.975f, -1.413f, -1.415f)
                lineToRelative(-5.178f, 5.178f)
                curveToRelative(-0.283f, -0.111f, -0.591f, -0.173f, -0.913f, -0.173f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.322f, -0.062f, -0.63f, -0.173f, -0.913f)
                lineToRelative(5.177f, -5.177f)
                close()
                moveTo(17.707f, 6.292f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-6.287f, 6.287f)
                curveToRelative(0.399f, 0.399f, 0.866f, 0.867f, 1.413f, 1.415f)
                lineToRelative(6.288f, -6.288f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _hammerWar!!
    }

private var _hammerWar: ImageVector? = null
