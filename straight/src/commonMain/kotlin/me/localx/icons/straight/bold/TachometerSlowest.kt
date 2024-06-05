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

public val Icons.Bold.TachometerSlowest: ImageVector
    get() {
        if (_tachometerSlowest != null) {
            return _tachometerSlowest!!
        }
        _tachometerSlowest = Builder(name = "TachometerSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.623f, 1.9f)
                lineToRelative(-4.6f, 1.977f)
                lineTo(5.593f, 14.122f)
                lineToRelative(4.6f, -1.977f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(12.0f, 1.0f)
                arcTo(11.995f, 11.995f, 0.0f, false, false, 5.112f, 22.818f)
                lineToRelative(0.937f, 0.659f)
                lineToRelative(3.408f, -2.822f)
                lineToRelative(-1.914f, -2.31f)
                lineTo(5.956f, 19.659f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 12.094f, -0.006f)
                lineToRelative(-1.552f, -1.3f)
                lineToRelative(-1.929f, 2.3f)
                lineToRelative(3.375f, 2.831f)
                lineToRelative(0.944f, -0.662f)
                arcTo(11.995f, 11.995f, 0.0f, false, false, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _tachometerSlowest!!
    }

private var _tachometerSlowest: ImageVector? = null
