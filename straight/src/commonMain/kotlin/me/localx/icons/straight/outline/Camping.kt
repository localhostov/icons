package me.localx.icons.straight.outline

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

public val Icons.Outline.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, -0.013f)
                lineTo(0.408f, 19.6f)
                arcTo(2.914f, 2.914f, 0.0f, false, false, 2.917f, 24.0f)
                lineTo(21.083f, 24.0f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, 2.509f, -4.4f)
                close()
                moveTo(9.0f, 22.0f)
                lineToRelative(3.0f, -5.081f)
                lineTo(15.0f, 22.0f)
                close()
                moveTo(21.88f, 21.539f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.794f, 0.461f)
                lineTo(17.326f, 22.0f)
                lineTo(12.0f, 12.987f)
                lineTo(6.674f, 22.0f)
                lineTo(2.917f, 22.0f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, true, -0.787f, -1.378f)
                lineTo(12.0f, 3.919f)
                lineToRelative(9.87f, 16.7f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 21.877f, 21.539f)
                close()
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
