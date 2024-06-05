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

public val Icons.Outline.Picture: ImageVector
    get() {
        if (_picture != null) {
            return _picture!!
        }
        _picture = Builder(name = "Picture", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 0.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineTo(19.0f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, true, -0.3f, 1.285f)
                lineToRelative(-9.163f, -9.163f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.072f, 0.0f)
                lineTo(2.0f, 14.586f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 2.0f)
                close()
                moveTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(17.414f)
                lineToRelative(4.878f, -4.878f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.244f, 0.0f)
                lineTo(20.285f, 21.7f)
                arcTo(2.951f, 2.951f, 0.0f, false, true, 19.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 12.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.0f, 10.5f)
                close()
                moveTo(16.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 5.5f)
                close()
            }
        }
        .build()
        return _picture!!
    }

private var _picture: ImageVector? = null
