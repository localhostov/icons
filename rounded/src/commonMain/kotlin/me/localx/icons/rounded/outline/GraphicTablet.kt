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

public val Icons.Outline.GraphicTablet: ImageVector
    get() {
        if (_graphicTablet != null) {
            return _graphicTablet!!
        }
        _graphicTablet = Builder(name = "GraphicTablet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 4.0f)
                close()
                moveTo(4.0f, 15.0f)
                lineTo(4.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(4.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 6.0f)
                lineTo(7.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 15.0f)
                close()
                moveTo(22.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(9.0f, 18.0f)
                lineTo(9.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _graphicTablet!!
    }

private var _graphicTablet: ImageVector? = null
