package me.localx.icons.rounded.bold

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

public val Icons.Bold.GraphicTablet: ImageVector
    get() {
        if (_graphicTablet != null) {
            return _graphicTablet!!
        }
        _graphicTablet = Builder(name = "GraphicTablet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.0f)
                horizontalLineTo(5.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.0f, 8.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.006f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 3.0f, 11.994f)
                horizontalLineTo(3.0f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.994f, 0.993f)
                horizontalLineTo(0.0f)
                verticalLineTo(15.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 24.0f, 15.5f)
                verticalLineToRelative(-7.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 18.5f, 3.0f)
                close()
                moveTo(21.0f, 15.5f)
                arcTo(2.462f, 2.462f, 0.0f, false, true, 18.583f, 18.0f)
                horizontalLineTo(6.981f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(11.6f)
                arcTo(2.462f, 2.462f, 0.0f, false, true, 21.0f, 8.5f)
                close()
            }
        }
        .build()
        return _graphicTablet!!
    }

private var _graphicTablet: ImageVector? = null
