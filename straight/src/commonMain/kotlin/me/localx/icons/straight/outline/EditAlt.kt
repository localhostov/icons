package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.EditAlt: ImageVector
    get() {
        if (_editAlt != null) {
            return _editAlt!!
        }
        _editAlt = Builder(name = "EditAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.979f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                horizontalLineTo(16.148f)
                lineTo(17.359f, 0.646f)
                arcTo(4.934f, 4.934f, 0.0f, false, true, 18.07f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(18.414f)
                lineTo(24.0f, 18.414f)
                verticalLineTo(7.979f)
                close()
                moveTo(18.0f, 21.586f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.729f, 11.82f)
                lineTo(20.34f, 3.313f)
                arcToRelative(0.945f, 0.945f, 0.0f, false, true, 1.372f, -0.038f)
                arcToRelative(0.943f, 0.943f, 0.0f, false, true, 0.0f, 1.335f)
                lineTo(13.68f, 12.643f)
                arcToRelative(4.964f, 4.964f, 0.0f, false, true, 1.042f, 1.785f)
                lineToRelative(8.4f, -8.4f)
                arcToRelative(2.947f, 2.947f, 0.0f, false, false, 0.0f, -4.163f)
                arcToRelative(2.943f, 2.943f, 0.0f, false, false, -4.276f, 0.118f)
                lineToRelative(-8.136f, 9.093f)
                arcTo(4.967f, 4.967f, 0.0f, false, true, 12.729f, 11.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, 6.0f, -5.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _editAlt!!
    }

private var _editAlt: ImageVector? = null
