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

public val Icons.Outline.RectanglePanoramic: ImageVector
    get() {
        if (_rectanglePanoramic != null) {
            return _rectanglePanoramic!!
        }
        _rectanglePanoramic = Builder(name = "RectanglePanoramic", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.0f, 5.0f)
                close()
                moveTo(22.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(5.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(2.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _rectanglePanoramic!!
    }

private var _rectanglePanoramic: ImageVector? = null
