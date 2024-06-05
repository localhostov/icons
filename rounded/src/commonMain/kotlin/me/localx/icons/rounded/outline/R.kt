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

public val Icons.Outline.R: ImageVector
    get() {
        if (_r != null) {
            return _r!!
        }
        _r = Builder(name = "R", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.379f, 14.424f)
                curveTo(24.835f, 11.256f, 22.707f, 0.1f, 14.5f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                lineTo(2.0f, 23.0f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                lineTo(4.0f, 15.0f)
                lineTo(14.5f, 15.0f)
                curveToRelative(0.298f, 0.0f, 0.591f, -0.022f, 0.881f, -0.056f)
                lineToRelative(4.745f, 8.542f)
                curveToRelative(0.269f, 0.487f, 0.886f, 0.655f, 1.359f, 0.389f)
                curveToRelative(0.483f, -0.269f, 0.657f, -0.877f, 0.389f, -1.359f)
                lineToRelative(-4.495f, -8.091f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(7.27f, 0.233f, 7.265f, 10.77f, 0.0f, 11.0f)
                lineTo(4.0f, 13.0f)
                close()
            }
        }
        .build()
        return _r!!
    }

private var _r: ImageVector? = null
