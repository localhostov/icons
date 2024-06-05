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

public val Icons.Outline.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.949f, 5.536f)
                lineTo(16.465f, 2.05f)
                arcTo(6.958f, 6.958f, 0.0f, false, false, 11.515f, 0.0f)
                horizontalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(10.485f)
                arcTo(6.951f, 6.951f, 0.0f, false, false, 19.949f, 5.536f)
                close()
                moveTo(18.535f, 6.95f)
                arcTo(4.983f, 4.983f, 0.0f, false, true, 19.316f, 8.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(2.684f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, true, 1.051f, 0.78f)
                close()
                moveTo(20.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 2.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.164f, 0.0f, 0.323f, 0.032f, 0.485f, 0.047f)
                verticalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.953f)
                curveToRelative(0.015f, 0.162f, 0.047f, 0.32f, 0.047f, 0.485f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
