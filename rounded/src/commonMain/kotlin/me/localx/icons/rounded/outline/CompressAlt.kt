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

public val Icons.Outline.CompressAlt: ImageVector
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
                lineTo(5.4f, 3.985f)
                lineTo(1.707f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.293f, 1.707f)
                lineTo(3.985f, 5.4f)
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
                moveTo(20.015f, 18.6f)
                lineToRelative(1.894f, -1.894f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.2f, 15.0f)
                horizontalLineTo(16.436f)
                arcTo(1.436f, 1.436f, 0.0f, false, false, 15.0f, 16.436f)
                verticalLineTo(21.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.707f, 0.708f)
                lineTo(18.6f, 20.015f)
                lineToRelative(3.692f, 3.692f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.436f, 9.0f)
                horizontalLineTo(21.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.708f, -1.707f)
                lineTo(20.015f, 5.4f)
                lineToRelative(3.692f, -3.692f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.293f, 0.293f)
                lineTo(18.6f, 3.985f)
                lineTo(16.707f, 2.091f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 2.8f)
                verticalLineTo(7.564f)
                arcTo(1.436f, 1.436f, 0.0f, false, false, 16.436f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.564f, 15.0f)
                horizontalLineTo(2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.708f, 1.707f)
                lineTo(3.985f, 18.6f)
                lineTo(0.293f, 22.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(5.4f, 20.015f)
                lineToRelative(1.894f, 1.894f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 21.2f)
                verticalLineTo(16.436f)
                arcTo(1.436f, 1.436f, 0.0f, false, false, 7.564f, 15.0f)
                close()
            }
        }
        .build()
        return _compressAlt!!
    }

private var _compressAlt: ImageVector? = null
