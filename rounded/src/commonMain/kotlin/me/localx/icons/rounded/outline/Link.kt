package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.845f, 17.267f)
                lineToRelative(-3.262f, 3.262f)
                arcTo(5.028f, 5.028f, 0.0f, false, true, 3.472f, 13.42f)
                lineToRelative(3.262f, -3.265f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.319f, 8.741f)
                lineTo(2.058f, 12.006f)
                arcTo(7.027f, 7.027f, 0.0f, false, false, 12.0f, 21.943f)
                lineToRelative(3.262f, -3.262f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.944f, 2.061f)
                arcTo(6.979f, 6.979f, 0.0f, false, false, 16.975f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.983f, 6.983f, 0.0f, false, false, -4.968f, 2.057f)
                lineTo(8.74f, 5.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.415f)
                lineToRelative(3.265f, -3.262f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 16.973f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.028f, 5.028f, 0.0f, false, true, 3.554f, 8.583f)
                lineToRelative(-3.262f, 3.262f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 18.68f, 15.26f)
                lineTo(21.942f, 12.0f)
                arcTo(7.037f, 7.037f, 0.0f, false, false, 21.944f, 2.061f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.293f, 8.293f)
                lineToRelative(-6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
