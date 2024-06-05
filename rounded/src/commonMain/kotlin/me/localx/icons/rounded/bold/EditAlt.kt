package me.localx.icons.rounded.bold

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
                moveTo(21.0f, 15.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 3.0f)
                horizontalLineToRelative(10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 1.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 0.0f)
                horizontalLineTo(4.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 4.5f, 24.0f)
                horizontalLineTo(16.485f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.181f, -1.318f)
                lineToRelative(3.016f, -3.016f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 24.0f, 16.485f)
                verticalLineTo(11.506f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.963f, 1.0f)
                arcToRelative(2.956f, 2.956f, 0.0f, false, false, -2.113f, 0.98f)
                lineToRelative(-8.136f, 9.093f)
                arcToRelative(4.982f, 4.982f, 0.0f, false, true, 4.008f, 3.356f)
                lineToRelative(8.4f, -8.4f)
                arcToRelative(2.947f, 2.947f, 0.0f, false, false, 0.0f, -4.163f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 20.963f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.288f, 13.067f)
                curveToRelative(-2.317f, 0.446f, -3.465f, 3.026f, -3.963f, 4.634f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.281f, 19.0f)
                horizontalLineTo(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.988f, -3.274f)
                arcTo(3.107f, 3.107f, 0.0f, false, false, 9.288f, 13.067f)
                close()
            }
        }
        .build()
        return _editAlt!!
    }

private var _editAlt: ImageVector? = null
