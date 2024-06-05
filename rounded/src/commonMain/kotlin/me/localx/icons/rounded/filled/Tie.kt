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

public val Icons.Filled.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = Builder(name = "Tie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.174f, 6.0f)
                lineToRelative(3.133f, 11.028f)
                curveToRelative(0.408f, 1.225f, 0.055f, 2.575f, -0.9f, 3.444f)
                lineToRelative(-3.491f, 3.174f)
                curveToRelative(-0.519f, 0.472f, -1.312f, 0.472f, -1.831f, 0.0f)
                lineToRelative(-3.491f, -3.174f)
                curveToRelative(-0.955f, -0.869f, -1.308f, -2.219f, -0.9f, -3.444f)
                lineToRelative(3.133f, -11.028f)
                horizontalLineToRelative(4.348f)
                close()
                moveTo(9.715f, 4.0f)
                horizontalLineToRelative(4.571f)
                lineToRelative(0.665f, -2.332f)
                curveToRelative(0.271f, -0.822f, -0.341f, -1.668f, -1.206f, -1.668f)
                horizontalLineToRelative(-3.489f)
                curveToRelative(-0.865f, 0.0f, -1.477f, 0.846f, -1.206f, 1.668f)
                lineToRelative(0.665f, 2.332f)
                close()
            }
        }
        .build()
        return _tie!!
    }

private var _tie: ImageVector? = null
