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

public val Icons.Outline.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(name = "CrossSmall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(12.0f, 10.586f)
                lineTo(7.414f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.414f)
                lineTo(10.586f, 12.0f)
                lineTo(6.0f, 16.586f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 18.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineTo(12.0f, 13.414f)
                lineTo(16.586f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 18.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(13.414f, 12.0f)
                lineTo(18.0f, 7.414f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 6.0f)
                close()
            }
        }
        .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
