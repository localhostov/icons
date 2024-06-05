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

public val Icons.Filled.Tomato: ImageVector
    get() {
        if (_tomato != null) {
            return _tomato!!
        }
        _tomato = Builder(name = "Tomato", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6f, 5.005f)
                arcTo(4.9f, 4.9f, 0.0f, false, false, 18.0f, 1.0f)
                lineTo(16.0f, 1.0f)
                curveToRelative(0.0f, 1.235f, -1.127f, 2.546f, -3.0f, 2.9f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 3.9f)
                curveTo(9.127f, 3.546f, 8.0f, 2.235f, 8.0f, 1.0f)
                lineTo(6.0f, 1.0f)
                arcTo(4.9f, 4.9f, 0.0f, false, false, 8.4f, 5.005f)
                arcTo(8.774f, 8.774f, 0.0f, false, false, 0.0f, 14.0f)
                curveToRelative(0.0f, 4.721f, 3.635f, 10.0f, 8.5f, 10.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(4.865f, 0.0f, 8.5f, -5.279f, 8.5f, -10.0f)
                arcTo(8.774f, 8.774f, 0.0f, false, false, 15.6f, 5.005f)
                close()
                moveTo(16.762f, 10.97f)
                arcTo(8.414f, 8.414f, 0.0f, false, true, 12.0f, 7.976f)
                arcTo(8.415f, 8.415f, 0.0f, false, true, 7.243f, 10.97f)
                lineTo(6.757f, 9.03f)
                arcTo(6.157f, 6.157f, 0.0f, false, false, 10.909f, 6.0f)
                horizontalLineToRelative(2.182f)
                arcToRelative(6.147f, 6.147f, 0.0f, false, false, 4.151f, 3.03f)
                close()
            }
        }
        .build()
        return _tomato!!
    }

private var _tomato: ImageVector? = null
