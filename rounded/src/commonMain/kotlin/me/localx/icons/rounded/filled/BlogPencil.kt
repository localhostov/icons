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

public val Icons.Filled.BlogPencil: ImageVector
    get() {
        if (_blogPencil != null) {
            return _blogPencil!!
        }
        _blogPencil = Builder(name = "BlogPencil", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4f, 13.17f)
                curveToRelative(-0.74f, -0.74f, -1.73f, -1.15f, -2.77f, -1.15f)
                horizontalLineToRelative(-1.63f)
                verticalLineToRelative(1.63f)
                curveToRelative(0.0f, 1.04f, 0.41f, 2.04f, 1.15f, 2.77f)
                lineToRelative(6.84f, 6.84f)
                curveToRelative(0.85f, 0.85f, 2.24f, 1.01f, 3.17f, 0.25f)
                curveToRelative(1.07f, -0.88f, 1.13f, -2.46f, 0.18f, -3.41f)
                lineToRelative(-6.93f, -6.93f)
                close()
                moveTo(0.1f, 6.0f)
                curveTo(0.57f, 3.72f, 2.59f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.41f, 0.0f, 4.43f, 1.72f, 4.9f, 4.0f)
                lineTo(0.1f, 6.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.3f, -0.03f, 0.59f, -0.08f, 0.87f)
                lineToRelative(-6.11f, -6.11f)
                curveToRelative(-1.11f, -1.11f, -2.62f, -1.73f, -4.19f, -1.73f)
                horizontalLineToRelative(-2.62f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.63f)
                curveToRelative(0.0f, 1.57f, 0.62f, 3.08f, 1.73f, 4.19f)
                lineToRelative(4.16f, 4.16f)
                lineTo(5.0f, 22.01f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 8.0f)
                lineTo(24.0f, 8.0f)
                close()
            }
        }
        .build()
        return _blogPencil!!
    }

private var _blogPencil: ImageVector? = null
