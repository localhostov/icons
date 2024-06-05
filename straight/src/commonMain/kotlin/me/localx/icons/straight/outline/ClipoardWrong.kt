package me.localx.icons.straight.outline

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

public val Icons.Outline.ClipoardWrong: ImageVector
    get() {
        if (_clipoardWrong != null) {
            return _clipoardWrong!!
        }
        _clipoardWrong = Builder(name = "ClipoardWrong", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.414f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 7.586f)
                lineTo(14.414f, 0.0f)
                close()
                moveTo(15.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                lineTo(15.0f, 3.414f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(13.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(12.0f, 14.086f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.793f, -2.793f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(-2.793f, -2.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.793f, 2.793f)
                close()
            }
        }
        .build()
        return _clipoardWrong!!
    }

private var _clipoardWrong: ImageVector? = null
