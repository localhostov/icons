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

public val Icons.Bold.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.324f, 23.982f)
                lineTo(18.681f, 23.982f)
                arcToRelative(5.31f, 5.31f, 0.0f, false, false, 4.8f, -7.587f)
                lineToRelative(-6.661f, -13.3f)
                arcTo(5.27f, 5.27f, 0.0f, false, false, 12.0f, 0.019f)
                horizontalLineToRelative(0.0f)
                arcTo(5.251f, 5.251f, 0.0f, false, false, 7.2f, 3.054f)
                lineTo(0.5f, 16.434f)
                arcToRelative(5.311f, 5.311f, 0.0f, false, false, 4.823f, 7.548f)
                close()
                moveTo(3.214f, 17.716f)
                lineTo(9.9f, 4.358f)
                arcToRelative(2.321f, 2.321f, 0.0f, false, true, 4.224f, 0.039f)
                lineToRelative(6.662f, 13.3f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, true, -2.1f, 3.284f)
                lineTo(16.659f, 20.981f)
                lineToRelative(-2.952f, -5.895f)
                arcToRelative(1.882f, 1.882f, 0.0f, false, false, -3.412f, 0.0f)
                lineToRelative(-2.95f, 5.9f)
                lineTo(5.324f, 20.986f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, true, -2.11f, -3.266f)
                close()
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
