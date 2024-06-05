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

public val Icons.Filled.RectanglePanoramic: ImageVector
    get() {
        if (_rectanglePanoramic != null) {
            return _rectanglePanoramic!!
        }
        _rectanglePanoramic = Builder(name = "RectanglePanoramic", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 5.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 19.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(21.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 16.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 8.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 10.5f)
                close()
            }
        }
        .build()
        return _rectanglePanoramic!!
    }

private var _rectanglePanoramic: ImageVector? = null
