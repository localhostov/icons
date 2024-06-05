package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = Builder(name = "Clip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.983f, 24.007f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.02f, 12.054f)
                lineToRelative(10.6f, -10.585f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, true, 7.091f, 7.075f)
                lineTo(9.11f, 19.128f)
                arcToRelative(3.083f, 3.083f, 0.0f, false, true, -4.254f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.245f)
                lineTo(14.75f, 5.007f)
                lineToRelative(1.418f, 1.415f)
                lineTo(6.274f, 16.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(1.027f, 1.027f, 0.0f, false, false, 1.418f, 0.0f)
                lineTo(18.3f, 7.129f)
                arcToRelative(3.005f, 3.005f, 0.0f, true, false, -4.255f, -4.245f)
                lineTo(3.438f, 13.468f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 7.09f, 7.076f)
                lineToRelative(12.021f, -12.0f)
                lineToRelative(1.418f, 1.415f)
                lineToRelative(-12.021f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 6.983f, 24.007f)
                close()
            }
        }
        .build()
        return _clip!!
    }

private var _clip: ImageVector? = null
