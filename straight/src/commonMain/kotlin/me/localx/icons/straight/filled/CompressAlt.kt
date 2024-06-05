package me.localx.icons.straight.filled

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

public val Icons.Filled.CompressAlt: ImageVector
    get() {
        if (_compressAlt != null) {
            return _compressAlt!!
        }
        _compressAlt = Builder(name = "CompressAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.414f, 0.0f)
                lineTo(0.0f, 1.414f)
                lineTo(4.293f, 5.707f)
                lineTo(2.0f, 8.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 7.0f)
                verticalLineTo(2.0f)
                lineTo(5.707f, 4.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(2.293f, -2.293f)
                lineTo(22.586f, 24.0f)
                lineTo(24.0f, 22.586f)
                lineToRelative(-4.293f, -4.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(19.707f, 5.707f)
                lineTo(24.0f, 1.414f)
                lineTo(22.586f, 0.0f)
                lineTo(18.293f, 4.293f)
                lineTo(16.0f, 2.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                horizontalLineTo(2.0f)
                lineToRelative(2.293f, 2.293f)
                lineTo(0.0f, 22.586f)
                lineTo(1.414f, 24.0f)
                lineToRelative(4.293f, -4.293f)
                lineTo(8.0f, 22.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _compressAlt!!
    }

private var _compressAlt: ImageVector? = null
