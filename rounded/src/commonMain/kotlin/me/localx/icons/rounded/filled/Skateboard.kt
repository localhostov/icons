package me.localx.icons.rounded.filled

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

public val Icons.Filled.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.835f, 2.165f)
                arcToRelative(7.389f, 7.389f, 0.0f, false, false, -10.451f, 0.0f)
                lineToRelative(-9.219f, 9.219f)
                arcToRelative(7.39f, 7.39f, 0.0f, true, false, 10.451f, 10.451f)
                lineToRelative(9.219f, -9.219f)
                arcToRelative(7.389f, 7.389f, 0.0f, false, false, 0.0f, -10.451f)
                close()
                moveTo(12.707f, 16.707f)
                lineTo(9.707f, 19.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(0.793f, -0.793f)
                lineToRelative(-2.586f, -2.586f)
                lineToRelative(-0.793f, 0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-0.793f, 0.793f)
                lineToRelative(2.586f, 2.586f)
                lineToRelative(0.793f, -0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
                moveTo(19.707f, 9.707f)
                lineTo(16.707f, 12.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(0.793f, -0.793f)
                lineToRelative(-2.586f, -2.586f)
                lineToRelative(-0.793f, 0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineToRelative(-0.793f, 0.793f)
                lineToRelative(2.586f, 2.586f)
                lineToRelative(0.793f, -0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
