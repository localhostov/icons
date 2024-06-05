package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.762f, 11.587f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 13.0f, 12.223f)
                verticalLineTo(23.874f)
                arcToRelative(4.922f, 4.922f, 0.0f, false, false, 1.5f, -0.557f)
                lineToRelative(6.027f, -3.479f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, false, 2.5f, -4.331f)
                verticalLineTo(8.547f)
                arcToRelative(4.959f, 4.959f, 0.0f, false, false, -0.265f, -1.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.242f, 9.857f)
                arcToRelative(3.531f, 3.531f, 0.0f, false, false, 3.521f, 0.0f)
                lineToRelative(8.0f, -4.61f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, -1.238f, -1.027f)
                lineTo(14.5f, 0.737f)
                arcToRelative(5.015f, 5.015f, 0.0f, false, false, -5.0f, 0.0f)
                lineTo(3.473f, 4.217f)
                arcToRelative(4.974f, 4.974f, 0.0f, false, false, -1.2f, 0.983f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.223f)
                arcToRelative(5.493f, 5.493f, 0.0f, false, true, -1.763f, -0.636f)
                lineTo(1.257f, 6.923f)
                arcTo(4.956f, 4.956f, 0.0f, false, false, 0.973f, 8.547f)
                verticalLineToRelative(6.96f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, false, 2.5f, 4.331f)
                lineTo(9.5f, 23.317f)
                arcToRelative(4.922f, 4.922f, 0.0f, false, false, 1.5f, 0.557f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
