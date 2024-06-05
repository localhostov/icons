package me.localx.icons.straight.bold

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

public val Icons.Bold.TachometerFastest: ImageVector
    get() {
        if (_tachometerFastest != null) {
            return _tachometerFastest!!
        }
        _tachometerFastest = Builder(name = "TachometerFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, true, -5.112f, 9.818f)
                lineToRelative(-0.937f, 0.659f)
                lineToRelative(-3.408f, -2.822f)
                lineToRelative(1.914f, -2.31f)
                lineToRelative(1.587f, 1.313f)
                arcTo(9.0f, 9.0f, 0.0f, true, false, 5.95f, 19.653f)
                lineToRelative(1.553f, -1.3f)
                lineToRelative(1.928f, 2.3f)
                lineTo(6.056f, 23.48f)
                lineToRelative(-0.944f, -0.662f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 13.0f)
                close()
                moveTo(17.221f, 16.878f)
                lineTo(18.406f, 14.122f)
                lineTo(13.806f, 12.145f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 12.623f, 14.9f)
                close()
            }
        }
        .build()
        return _tachometerFastest!!
    }

private var _tachometerFastest: ImageVector? = null
