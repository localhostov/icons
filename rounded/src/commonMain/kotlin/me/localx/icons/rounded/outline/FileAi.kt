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

public val Icons.Outline.FileAi: ImageVector
    get() {
        if (_fileAi != null) {
            return _fileAi!!
        }
        _fileAi = Builder(name = "FileAi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.515f, 5.008f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, false, -0.687f, -0.464f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, -0.695f, 0.477f)
                lineTo(4.156f, 10.208f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.362f, 0.807f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.222f, 0.041f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, 0.584f, -0.4f)
                lineToRelative(0.339f, -0.889f)
                horizontalLineTo(7.974f)
                lineToRelative(0.335f, 0.887f)
                arcToRelative(0.625f, 0.625f, 0.0f, true, false, 1.17f, -0.441f)
                close()
                moveTo(6.139f, 8.514f)
                lineToRelative(0.684f, -1.8f)
                lineToRelative(0.679f, 1.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.232f, 4.544f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, -0.625f, 0.625f)
                verticalLineToRelative(5.262f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 1.25f, 0.0f)
                verticalLineTo(5.169f)
                arcTo(0.625f, 0.625f, 0.0f, false, false, 11.232f, 4.544f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(16.343f, 24.0f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, false, 3.536f, -1.464f)
                lineToRelative(2.656f, -2.658f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 24.0f, 16.343f)
                lineTo(24.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 0.0f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 2.0f)
                lineTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(22.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 19.0f)
                close()
                moveTo(18.465f, 21.122f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, true, -1.465f, 0.8f)
                lineTo(17.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.925f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, -0.8f, 1.464f)
                close()
            }
        }
        .build()
        return _fileAi!!
    }

private var _fileAi: ImageVector? = null
