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

public val Icons.Filled.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 1.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 6.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                curveToRelative(0.387f, 0.0f, 0.769f, 0.021f, 1.146f, 0.057f)
                lineToRelative(0.824f, 0.077f)
                lineToRelative(0.078f, 0.824f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 8.994f, 8.994f)
                lineToRelative(0.824f, 0.078f)
                lineToRelative(0.077f, 0.824f)
                curveTo(23.979f, 11.231f, 24.0f, 11.613f, 24.0f, 12.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 10.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 7.0f)
                close()
                moveTo(8.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 10.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 14.0f)
                close()
                moveTo(15.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 17.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 13.0f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
