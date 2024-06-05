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

public val Icons.Outline.N: ImageVector
    get() {
        if (_n != null) {
            return _n!!
        }
        _n = Builder(name = "N", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.37f, 24.006f)
                curveToRelative(-1.411f, 0.0f, -2.662f, -0.813f, -3.246f, -2.178f)
                lineTo(7.038f, 2.96f)
                curveToRelative(-0.375f, -0.876f, -1.163f, -1.051f, -1.773f, -0.927f)
                curveToRelative(-0.611f, 0.125f, -1.265f, 0.599f, -1.265f, 1.551f)
                verticalLineTo(23.0f)
                curveToRelative(-0.005f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineTo(3.583f)
                curveTo(2.0f, 1.835f, 3.15f, 0.425f, 4.862f, 0.074f)
                curveToRelative(1.708f, -0.353f, 3.325f, 0.491f, 4.014f, 2.098f)
                lineToRelative(8.086f, 18.869f)
                curveToRelative(0.375f, 0.874f, 1.159f, 1.049f, 1.773f, 0.927f)
                curveToRelative(0.611f, -0.126f, 1.265f, -0.6f, 1.265f, -1.551f)
                verticalLineTo(1.0f)
                curveToRelative(0.006f, -1.308f, 1.995f, -1.307f, 2.0f, 0.0f)
                verticalLineTo(20.417f)
                curveToRelative(0.0f, 1.748f, -1.15f, 3.158f, -2.862f, 3.51f)
                curveToRelative(-0.259f, 0.053f, -0.516f, 0.079f, -0.768f, 0.079f)
                close()
            }
        }
        .build()
        return _n!!
    }

private var _n: ImageVector? = null
