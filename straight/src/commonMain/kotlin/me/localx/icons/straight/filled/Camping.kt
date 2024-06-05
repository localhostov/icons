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

public val Icons.Filled.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.919f)
                lineTo(16.184f, 24.0f)
                horizontalLineTo(7.816f)
                close()
                moveTo(23.592f, 19.6f)
                lineTo(12.0f, -0.013f)
                lineTo(0.408f, 19.6f)
                arcTo(2.914f, 2.914f, 0.0f, false, false, 2.917f, 24.0f)
                horizontalLineTo(5.492f)
                lineTo(12.0f, 12.987f)
                lineTo(18.508f, 24.0f)
                horizontalLineToRelative(2.575f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, 2.509f, -4.4f)
                close()
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
