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

public val Icons.Outline.TreesAlt: ImageVector
    get() {
        if (_treesAlt != null) {
            return _treesAlt!!
        }
        _treesAlt = Builder(name = "TreesAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.299f, 15.0f)
                horizontalLineToRelative(2.641f)
                lineToRelative(-4.212f, -6.0f)
                horizontalLineToRelative(2.342f)
                lineTo(16.339f, 0.992f)
                curveToRelative(-0.496f, -0.631f, -1.265f, -0.992f, -2.108f, -0.992f)
                reflectiveCurveToRelative(-1.61f, 0.361f, -2.107f, 0.991f)
                lineToRelative(-0.254f, 0.426f)
                lineToRelative(-0.261f, -0.425f)
                curveToRelative(-0.496f, -0.631f, -1.265f, -0.992f, -2.108f, -0.992f)
                reflectiveCurveToRelative(-1.612f, 0.361f, -2.108f, 0.992f)
                lineTo(2.662f, 9.0f)
                horizontalLineToRelative(2.153f)
                lineTo(0.858f, 15.0f)
                horizontalLineToRelative(2.44f)
                lineTo(0.053f, 21.0f)
                horizontalLineToRelative(8.447f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.529f)
                lineToRelative(-3.73f, -6.0f)
                close()
                moveTo(19.092f, 13.0f)
                horizontalLineToRelative(-2.269f)
                lineToRelative(-2.638f, -4.0f)
                horizontalLineToRelative(2.099f)
                lineToRelative(2.808f, 4.0f)
                close()
                moveTo(13.726f, 2.192f)
                curveToRelative(0.234f, -0.242f, 0.776f, -0.241f, 1.009f, 0.0f)
                lineToRelative(2.835f, 4.809f)
                horizontalLineToRelative(-2.41f)
                lineToRelative(-2.133f, -3.62f)
                lineToRelative(0.7f, -1.188f)
                close()
                moveTo(10.5f, 19.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                lineTo(3.408f, 19.0f)
                lineToRelative(3.246f, -6.0f)
                horizontalLineToRelative(-2.081f)
                lineToRelative(3.957f, -6.0f)
                horizontalLineToRelative(-2.368f)
                lineToRelative(2.834f, -4.809f)
                curveToRelative(0.232f, -0.24f, 0.775f, -0.24f, 1.008f, 0.0f)
                lineToRelative(2.834f, 4.809f)
                horizontalLineToRelative(-2.368f)
                lineToRelative(3.957f, 6.0f)
                horizontalLineToRelative(-2.139f)
                lineToRelative(3.477f, 6.0f)
                horizontalLineToRelative(-5.265f)
                close()
                moveTo(18.076f, 19.0f)
                lineToRelative(-2.318f, -4.0f)
                horizontalLineToRelative(2.186f)
                lineToRelative(2.487f, 4.0f)
                horizontalLineToRelative(-2.355f)
                close()
            }
        }
        .build()
        return _treesAlt!!
    }

private var _treesAlt: ImageVector? = null
