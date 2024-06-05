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

public val Icons.Outline.BlogPencil: ImageVector
    get() {
        if (_blogPencil != null) {
            return _blogPencil!!
        }
        _blogPencil = Builder(name = "BlogPencil", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.24f, 2.0f, 0.0f, 4.24f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 7.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(16.41f, 12.17f)
                curveToRelative(-0.76f, -0.76f, -1.76f, -1.17f, -2.83f, -1.17f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.59f)
                curveToRelative(0.0f, 1.07f, 0.42f, 2.07f, 1.17f, 2.83f)
                lineToRelative(6.71f, 6.71f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                reflectiveCurveToRelative(0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                lineToRelative(-6.71f, -6.71f)
                close()
                moveTo(21.7f, 21.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0.0f)
                lineToRelative(-6.71f, -6.71f)
                curveToRelative(-0.38f, -0.38f, -0.59f, -0.88f, -0.59f, -1.41f)
                verticalLineToRelative(-0.59f)
                horizontalLineToRelative(0.59f)
                curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.41f, 0.59f)
                lineToRelative(6.71f, 6.71f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
            }
        }
        .build()
        return _blogPencil!!
    }

private var _blogPencil: ImageVector? = null
