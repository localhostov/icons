package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.7f)
                lineTo(12.0f, 1.5f)
                lineTo(0.0f, 8.7f)
                lineTo(0.0f, 9.8f)
                lineTo(12.0f, 17.0f)
                lineTo(24.0f, 9.8f)
                close()
                moveTo(4.916f, 9.25f)
                lineTo(12.0f, 5.0f)
                lineToRelative(7.084f, 4.251f)
                lineTo(12.0f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.802f)
                lineToRelative(-12.0f, 7.2f)
                lineToRelative(-12.0f, -7.2f)
                lineToRelative(0.0f, 3.499f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                lineToRelative(0.0f, -3.499f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
