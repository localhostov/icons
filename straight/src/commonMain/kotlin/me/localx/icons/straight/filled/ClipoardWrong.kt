package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.ClipoardWrong: ImageVector
    get() {
        if (_clipoardWrong != null) {
            return _clipoardWrong!!
        }
        _clipoardWrong = Builder(name = "ClipoardWrong", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(16.207f, 18.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.793f, -2.793f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(-2.793f, -2.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(2.793f, 2.793f)
                close()
            }
        }
        .build()
        return _clipoardWrong!!
    }

private var _clipoardWrong: ImageVector? = null
