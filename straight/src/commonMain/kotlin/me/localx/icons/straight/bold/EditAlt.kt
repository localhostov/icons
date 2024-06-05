package me.localx.icons.straight.bold

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

public val Icons.Bold.EditAlt: ImageVector
    get() {
        if (_editAlt != null) {
            return _editAlt!!
        }
        _editAlt = Builder(name = "EditAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.126f, 1.861f)
                arcToRelative(2.943f, 2.943f, 0.0f, false, false, -4.276f, 0.118f)
                lineToRelative(-8.136f, 9.093f)
                arcToRelative(4.982f, 4.982f, 0.0f, false, true, 4.008f, 3.356f)
                lineToRelative(8.4f, -8.4f)
                arcTo(2.947f, 2.947f, 0.0f, false, false, 23.126f, 1.861f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                reflectiveCurveToRelative(1.0f, -6.0f, 5.0f, -6.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.979f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.409f)
                arcTo(0.41f, 0.41f, 0.0f, false, true, 3.409f, 3.0f)
                horizontalLineTo(15.253f)
                lineTo(17.359f, 0.646f)
                arcTo(4.934f, 4.934f, 0.0f, false, true, 18.07f, 0.0f)
                horizontalLineTo(3.409f)
                arcTo(3.413f, 3.413f, 0.0f, false, false, 0.0f, 3.409f)
                verticalLineTo(24.0f)
                horizontalLineTo(18.348f)
                lineTo(24.0f, 18.348f)
                verticalLineTo(7.979f)
                close()
            }
        }
        .build()
        return _editAlt!!
    }

private var _editAlt: ImageVector? = null
