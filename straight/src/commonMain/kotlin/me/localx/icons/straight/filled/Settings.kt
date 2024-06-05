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

public val Icons.Filled.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                arcToRelative(9.143f, 9.143f, 0.0f, false, false, -0.15f, -1.645f)
                lineTo(23.893f, 8.6f)
                lineToRelative(-3.0f, -5.2f)
                lineTo(17.849f, 5.159f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 15.0f, 3.513f)
                lineTo(15.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 3.513f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 6.151f, 5.159f)
                lineTo(3.107f, 3.4f)
                lineToRelative(-3.0f, 5.2f)
                lineTo(3.15f, 10.355f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, false, 0.0f, 3.29f)
                lineTo(0.107f, 15.4f)
                lineToRelative(3.0f, 5.2f)
                lineToRelative(3.044f, -1.758f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 9.0f, 20.487f)
                lineTo(9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 20.487f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.849f, -1.646f)
                lineTo(20.893f, 20.6f)
                lineToRelative(3.0f, -5.2f)
                lineTo(20.85f, 13.645f)
                arcTo(9.143f, 9.143f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
