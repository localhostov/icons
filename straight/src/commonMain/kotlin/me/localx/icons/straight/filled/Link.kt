package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.028f, 24.0f)
                arcToRelative(7.024f, 7.024f, 0.0f, false, true, -4.97f, -11.992f)
                lineTo(6.319f, 7.741f)
                lineTo(7.734f, 9.155f)
                lineTo(3.472f, 13.42f)
                arcToRelative(5.028f, 5.028f, 0.0f, false, false, 7.111f, 7.109f)
                lineToRelative(4.262f, -4.262f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 21.943f)
                arcTo(7.01f, 7.01f, 0.0f, false, true, 7.028f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.68f, 16.26f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(4.262f, -4.262f)
                arcTo(5.028f, 5.028f, 0.0f, false, false, 16.974f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, -3.554f, 1.472f)
                lineTo(9.154f, 7.735f)
                lineTo(7.74f, 6.32f)
                lineToRelative(4.265f, -4.262f)
                arcTo(6.983f, 6.983f, 0.0f, false, true, 16.973f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.027f, 7.027f, 0.0f, false, true, 4.967f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7407f, 14.8461f)
                lineToRelative(7.1043f, -7.1043f)
                lineToRelative(1.4142f, 1.4142f)
                lineToRelative(-7.1043f, 7.1043f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
