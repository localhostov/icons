package me.localx.icons.rounded.bold

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

public val Icons.Bold.Drumstick: ImageVector
    get() {
        if (_drumstick != null) {
            return _drumstick!!
        }
        _drumstick = Builder(name = "Drumstick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.49f, 2.509f)
                arcToRelative(8.575f, 8.575f, 0.0f, false, false, -12.115f, 0.0f)
                curveTo(7.137f, 4.748f, 6.312f, 9.542f, 6.015f, 13.168f)
                arcToRelative(4.456f, 4.456f, 0.0f, false, false, 0.432f, 2.264f)
                lineToRelative(-3.1f, 3.1f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 2.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.469f, -1.348f)
                lineTo(8.561f, 17.56f)
                arcToRelative(4.419f, 4.419f, 0.0f, false, false, 2.27f, 0.425f)
                curveToRelative(3.628f, -0.3f, 8.422f, -1.122f, 10.659f, -3.36f)
                arcTo(8.606f, 8.606f, 0.0f, false, false, 21.49f, 2.509f)
                close()
                moveTo(19.369f, 12.5f)
                curveToRelative(-1.208f, 1.207f, -4.491f, 2.139f, -8.784f, 2.491f)
                arcToRelative(1.457f, 1.457f, 0.0f, false, true, -1.58f, -1.581f)
                curveTo(9.357f, 9.122f, 10.289f, 5.838f, 11.5f, 4.63f)
                arcTo(5.567f, 5.567f, 0.0f, false, true, 19.369f, 12.5f)
                close()
            }
        }
        .build()
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
