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

public val Icons.Outline.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) {
            return _pencilSlash!!
        }
        _pencilSlash = Builder(name = "PencilSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.651f, 16.124f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-4.942f, 4.941f)
                curveToRelative(-0.979f, 0.98f, -2.283f, 1.521f, -3.67f, 1.521f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.039f)
                curveToRelative(0.0f, -1.386f, 0.54f, -2.689f, 1.521f, -3.67f)
                lineToRelative(5.049f, -5.05f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-4.799f, 4.799f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(4.691f, -4.691f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(8.406f, 8.406f)
                lineToRelative(7.624f, -7.625f)
                curveToRelative(1.43f, -1.43f, 3.758f, -1.43f, 5.189f, 0.0f)
                curveToRelative(1.43f, 1.431f, 1.43f, 3.759f, 0.0f, 5.189f)
                lineToRelative(-7.624f, 7.624f)
                lineToRelative(8.406f, 8.406f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(16.661f, 4.978f)
                lineToRelative(2.361f, 2.361f)
                lineToRelative(2.489f, -2.489f)
                curveToRelative(0.65f, -0.651f, 0.65f, -1.71f, 0.0f, -2.361f)
                curveToRelative(-0.652f, -0.651f, -1.71f, -0.649f, -2.361f, 0.0f)
                lineToRelative(-2.489f, 2.49f)
                close()
                moveTo(11.527f, 10.113f)
                lineToRelative(2.36f, 2.36f)
                lineToRelative(3.721f, -3.72f)
                lineToRelative(-2.361f, -2.361f)
                lineToRelative(-3.72f, 3.721f)
                close()
            }
        }
        .build()
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
