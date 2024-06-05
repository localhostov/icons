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
                moveTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.35f, 2.0f, 0.0f, 3.35f, 0.0f, 5.0f)
                lineTo(0.0f, 22.0f)
                lineTo(14.93f, 22.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(5.93f)
                lineToRelative(2.0f, 2.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(15.24f, 11.0f)
                horizontalLineToRelative(-4.24f)
                verticalLineToRelative(4.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                reflectiveCurveToRelative(0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                lineToRelative(-7.88f, -7.88f)
                close()
                moveTo(21.7f, 21.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0.0f)
                lineToRelative(-7.29f, -7.29f)
                verticalLineToRelative(-1.41f)
                horizontalLineToRelative(1.41f)
                lineToRelative(7.29f, 7.29f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
            }
        }
        .build()
        return _blogPencil!!
    }

private var _blogPencil: ImageVector? = null
