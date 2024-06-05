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

public val Icons.Bold.HighlighterLine: ImageVector
    get() {
        if (_highlighterLine != null) {
            return _highlighterLine!!
        }
        _highlighterLine = Builder(name = "HighlighterLine", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.02f, 19.0f)
                curveToRelative(1.78f, 0.0f, 3.48f, -0.76f, 4.7f, -2.13f)
                lineToRelative(7.1f, -8.52f)
                curveToRelative(1.65f, -1.9f, 1.55f, -4.79f, -0.23f, -6.58f)
                lineToRelative(-0.37f, -0.37f)
                curveToRelative(-1.78f, -1.78f, -4.67f, -1.88f, -6.55f, -0.25f)
                lineTo(4.09f, 8.31f)
                curveToRelative(-1.33f, 1.18f, -2.09f, 2.88f, -2.09f, 4.66f)
                verticalLineToRelative(3.9f)
                lineToRelative(-1.56f, 1.56f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(1.56f, -1.56f)
                horizontalLineToRelative(3.9f)
                close()
                moveTo(6.05f, 10.59f)
                lineTo(14.61f, 3.45f)
                curveToRelative(0.72f, -0.62f, 1.81f, -0.59f, 2.49f, 0.09f)
                lineToRelative(0.37f, 0.37f)
                curveToRelative(0.67f, 0.67f, 0.71f, 1.77f, 0.07f, 2.51f)
                lineToRelative(-7.09f, 8.5f)
                curveToRelative(-0.23f, 0.25f, -0.49f, 0.47f, -0.78f, 0.64f)
                lineToRelative(-4.22f, -4.22f)
                curveToRelative(0.16f, -0.28f, 0.37f, -0.53f, 0.6f, -0.74f)
                close()
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(22.5f, 21.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _highlighterLine!!
    }

private var _highlighterLine: ImageVector? = null
