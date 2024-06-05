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

public val Icons.Bold.CompressAlt: ImageVector
    get() {
        if (_compressAlt != null) {
            return _compressAlt!!
        }
        _compressAlt = Builder(name = "CompressAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.293f, 2.091f)
                lineTo(5.753f, 3.632f)
                lineTo(2.56f, 0.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.439f, 2.56f)
                lineTo(3.632f, 5.753f)
                lineTo(2.091f, 7.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.8f, 9.0f)
                horizontalLineTo(7.564f)
                arcTo(1.436f, 1.436f, 0.0f, false, false, 9.0f, 7.564f)
                verticalLineTo(2.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.293f, 2.091f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.707f, 21.909f)
                lineToRelative(1.54f, -1.541f)
                lineToRelative(3.193f, 3.193f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.121f, -2.121f)
                lineToRelative(-3.193f, -3.193f)
                lineToRelative(1.541f, -1.54f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.2f, 15.0f)
                horizontalLineTo(16.436f)
                arcTo(1.436f, 1.436f, 0.0f, false, false, 15.0f, 16.436f)
                verticalLineTo(21.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.707f, 21.909f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.091f, 16.707f)
                lineToRelative(1.541f, 1.54f)
                lineTo(0.439f, 21.44f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 2.56f, 23.561f)
                lineToRelative(3.193f, -3.193f)
                lineToRelative(1.54f, 1.541f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 21.2f)
                verticalLineTo(16.436f)
                arcTo(1.436f, 1.436f, 0.0f, false, false, 7.564f, 15.0f)
                horizontalLineTo(2.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.091f, 16.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.909f, 7.293f)
                lineToRelative(-1.541f, -1.54f)
                lineTo(23.561f, 2.56f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 21.44f, 0.439f)
                lineTo(18.247f, 3.632f)
                lineToRelative(-1.54f, -1.541f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 2.8f)
                verticalLineTo(7.564f)
                arcTo(1.436f, 1.436f, 0.0f, false, false, 16.436f, 9.0f)
                horizontalLineTo(21.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.909f, 7.293f)
                close()
            }
        }
        .build()
        return _compressAlt!!
    }

private var _compressAlt: ImageVector? = null
