package me.localx.icons.straight.filled

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
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 7.0f)
                close()
                moveTo(23.26f, 23.26f)
                curveToRelative(0.99f, -0.99f, 0.99f, -2.6f, 0.0f, -3.59f)
                lineToRelative(-6.67f, -6.67f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(3.59f)
                lineToRelative(6.67f, 6.67f)
                curveToRelative(0.48f, 0.48f, 1.12f, 0.74f, 1.8f, 0.74f)
                reflectiveCurveToRelative(1.32f, -0.26f, 1.79f, -0.74f)
                close()
                moveTo(11.0f, 17.42f)
                verticalLineToRelative(-6.42f)
                horizontalLineToRelative(6.42f)
                lineToRelative(6.58f, 6.58f)
                lineTo(24.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(13.0f)
                lineTo(15.58f, 22.0f)
                lineToRelative(-4.58f, -4.58f)
                close()
            }
        }
        .build()
        return _blogPencil!!
    }

private var _blogPencil: ImageVector? = null
