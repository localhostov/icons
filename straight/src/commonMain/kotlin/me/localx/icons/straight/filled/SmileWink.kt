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

public val Icons.Filled.SmileWink: ImageVector
    get() {
        if (_smileWink != null) {
            return _smileWink!!
        }
        _smileWink = Builder(name = "SmileWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.666f, -2.254f)
                lineToRelative(1.332f, -1.492f)
                arcTo(7.509f, 7.509f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(7.508f, 7.508f, 0.0f, false, false, 4.336f, -1.748f)
                lineToRelative(1.33f, 1.494f)
                arcTo(9.454f, 9.454f, 0.0f, false, true, 12.0f, 18.0f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(14.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _smileWink!!
    }

private var _smileWink: ImageVector? = null
