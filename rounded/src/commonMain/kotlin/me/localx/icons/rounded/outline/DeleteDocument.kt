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

public val Icons.Outline.DeleteDocument: ImageVector
    get() {
        if (_deleteDocument != null) {
            return _deleteDocument!!
        }
        _deleteDocument = Builder(name = "DeleteDocument", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.207f, 14.207f)
                lineTo(13.414f, 16.0f)
                lineToRelative(1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineTo(12.0f, 17.414f)
                lineToRelative(-1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineTo(10.586f, 16.0f)
                lineTo(8.793f, 14.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineTo(12.0f, 14.586f)
                lineToRelative(1.793f, -1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
                moveTo(22.0f, 10.485f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineTo(7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 7.0f, 0.0f)
                horizontalLineToRelative(4.515f)
                arcToRelative(6.958f, 6.958f, 0.0f, false, true, 4.95f, 2.05f)
                lineToRelative(3.484f, 3.486f)
                arcTo(6.951f, 6.951f, 0.0f, false, true, 22.0f, 10.485f)
                close()
                moveTo(15.051f, 3.464f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 14.0f, 2.684f)
                verticalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.316f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, -0.781f, -1.05f)
                close()
                moveTo(20.0f, 10.485f)
                curveToRelative(0.0f, -0.165f, -0.032f, -0.323f, -0.047f, -0.485f)
                horizontalLineTo(15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(2.047f)
                curveTo(11.838f, 2.032f, 11.679f, 2.0f, 11.515f, 2.0f)
                horizontalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _deleteDocument!!
    }

private var _deleteDocument: ImageVector? = null
