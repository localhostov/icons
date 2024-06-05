package me.localx.icons.straight.bold

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

public val Icons.Bold.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.253f, 24.0f)
                arcTo(7.251f, 7.251f, 0.0f, false, true, 2.124f, 11.62f)
                lineTo(6.191f, 7.55f)
                lineTo(8.313f, 9.67f)
                lineTo(4.246f, 13.741f)
                arcToRelative(4.253f, 4.253f, 0.0f, true, false, 6.016f, 6.014f)
                lineToRelative(4.068f, -4.068f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-4.068f, 4.068f)
                arcTo(7.229f, 7.229f, 0.0f, false, true, 7.253f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.808f, 16.452f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(4.068f, -4.068f)
                arcTo(4.254f, 4.254f, 0.0f, false, false, 13.74f, 4.246f)
                lineTo(9.669f, 8.314f)
                lineTo(7.548f, 6.192f)
                lineToRelative(4.071f, -4.068f)
                arcToRelative(7.254f, 7.254f, 0.0f, false, true, 10.257f, 10.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5483f, 14.3313f)
                lineToRelative(6.7819f, -6.7819f)
                lineToRelative(2.1213f, 2.1213f)
                lineToRelative(-6.7819f, 6.7819f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
