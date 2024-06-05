package me.localx.icons.rounded.outline

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
                moveTo(9.288f, 13.067f)
                curveToRelative(-2.317f, 0.446f, -3.465f, 3.026f, -3.963f, 4.634f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.281f, 19.0f)
                horizontalLineTo(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.988f, -3.274f)
                arcTo(3.107f, 3.107f, 0.0f, false, false, 9.288f, 13.067f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.979f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 2.0f)
                horizontalLineTo(16.042f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(16.343f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 3.535f, -1.464f)
                lineToRelative(2.658f, -2.658f)
                arcTo(4.966f, 4.966f, 0.0f, false, false, 24.0f, 16.343f)
                verticalLineTo(9.979f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 8.979f)
                close()
                moveTo(18.464f, 21.122f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -1.464f, 0.8f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.925f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -0.8f, 1.464f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.566f, 14.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, -1.707f)
                lineTo(21.712f, 4.61f)
                arcToRelative(0.943f, 0.943f, 0.0f, false, false, 0.0f, -1.335f)
                arcTo(0.9f, 0.9f, 0.0f, false, false, 21.018f, 3.0f)
                arcToRelative(0.933f, 0.933f, 0.0f, false, false, -0.678f, 0.314f)
                lineToRelative(-7.6f, 8.407f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.484f, -1.341f)
                lineToRelative(7.6f, -8.4f)
                arcTo(2.949f, 2.949f, 0.0f, false, true, 20.963f, 1.0f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, true, 2.163f, 0.862f)
                arcToRelative(2.947f, 2.947f, 0.0f, false, true, 0.0f, 4.163f)
                lineToRelative(-7.853f, 7.853f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 14.566f, 14.17f)
                close()
            }
        }
        .build()
        return _editAlt!!
    }

private var _editAlt: ImageVector? = null
