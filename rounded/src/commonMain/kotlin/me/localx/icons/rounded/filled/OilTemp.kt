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

public val Icons.Filled.OilTemp: ImageVector
    get() {
        if (_oilTemp != null) {
            return _oilTemp!!
        }
        _oilTemp = Builder(name = "OilTemp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -3.858f)
                lineTo(11.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(14.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(4.142f)
                arcTo(3.993f, 3.993f, 0.0f, true, true, 8.0f, 14.0f)
                close()
                moveTo(22.332f, 21.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.39f, -0.822f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.884f, 0.0f)
                arcToRelative(2.279f, 2.279f, 0.0f, false, true, -4.116f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.884f, 0.0f)
                arcToRelative(2.279f, 2.279f, 0.0f, false, true, -4.116f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.884f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.39f, 0.822f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.332f, 22.978f)
                arcTo(4.185f, 4.185f, 0.0f, false, false, 6.0f, 22.774f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.336f, -1.489f)
                close()
                moveTo(21.0f, 18.0f)
                arcToRelative(3.985f, 3.985f, 0.0f, false, false, 2.668f, -1.022f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.336f, -1.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.73f, 0.032f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.2f, 1.6f)
                arcTo(4.348f, 4.348f, 0.0f, false, false, 21.0f, 18.0f)
                close()
                moveTo(3.0f, 18.0f)
                arcToRelative(4.354f, 4.354f, 0.0f, false, false, 2.6f, -0.881f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.2f, -1.6f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.73f, -0.032f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.332f, 16.978f)
                arcTo(3.985f, 3.985f, 0.0f, false, false, 3.0f, 18.0f)
                close()
            }
        }
        .build()
        return _oilTemp!!
    }

private var _oilTemp: ImageVector? = null
