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

public val Icons.Outline.OilTemp: ImageVector
    get() {
        if (_oilTemp != null) {
            return _oilTemp!!
        }
        _oilTemp = Builder(name = "OilTemp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -7.858f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(14.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(7.142f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(23.744f, 21.565f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.076f, 1.413f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, true, -5.668f, -0.2f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, true, -5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.336f, -1.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 3.39f, -0.822f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.884f, 0.0f)
                arcToRelative(2.279f, 2.279f, 0.0f, false, false, 4.116f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.884f, 0.0f)
                arcToRelative(2.279f, 2.279f, 0.0f, false, false, 4.116f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.884f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 3.39f, 0.822f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.744f, 21.565f)
                close()
                moveTo(18.4f, 17.119f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.2f, -1.6f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 2.73f, -0.032f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.336f, 1.489f)
                arcTo(4.15f, 4.15f, 0.0f, false, true, 18.4f, 17.119f)
                close()
                moveTo(0.332f, 16.978f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.336f, -1.489f)
                arcToRelative(2.193f, 2.193f, 0.0f, false, false, 2.73f, 0.032f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.2f, 1.6f)
                arcTo(4.149f, 4.149f, 0.0f, false, true, 0.332f, 16.978f)
                close()
            }
        }
        .build()
        return _oilTemp!!
    }

private var _oilTemp: ImageVector? = null
