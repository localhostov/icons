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

public val Icons.Bold.BlogPencil: ImageVector
    get() {
        if (_blogPencil != null) {
            return _blogPencil!!
        }
        _blogPencil = Builder(name = "BlogPencil", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(21.0f, 7.5f)
                curveToRelative(0.0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                lineTo(3.05f, 7.0f)
                curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 22.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 7.5f)
                curveTo(0.0f, 4.47f, 2.47f, 2.0f, 5.5f, 2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(16.55f, 13.27f)
                curveToRelative(-0.81f, -0.81f, -1.92f, -1.27f, -3.06f, -1.27f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.95f)
                curveToRelative(0.0f, 1.15f, 0.46f, 2.25f, 1.27f, 3.06f)
                lineToRelative(6.81f, 6.81f)
                curveToRelative(0.95f, 0.95f, 2.53f, 0.89f, 3.41f, -0.18f)
                curveToRelative(0.76f, -0.93f, 0.6f, -2.32f, -0.25f, -3.17f)
                lineToRelative(-6.71f, -6.71f)
                close()
            }
        }
        .build()
        return _blogPencil!!
    }

private var _blogPencil: ImageVector? = null
