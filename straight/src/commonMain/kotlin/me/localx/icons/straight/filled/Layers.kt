package me.localx.icons.straight.filled

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

public val Icons.Filled.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.944f, 7.662f)
                lineTo(12.0f, 0.5f)
                lineTo(0.056f, 7.662f)
                lineTo(12.0f, 14.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.965f)
                lineToRelative(-12.0f, 7.2f)
                lineToRelative(-12.0f, -7.2f)
                lineToRelative(0.0f, 2.333f)
                lineToRelative(12.0f, 7.199f)
                lineToRelative(12.0f, -7.199f)
                lineToRelative(0.0f, -2.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.634f)
                lineToRelative(-2.515f, 1.509f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-9.485f, 5.691f)
                lineToRelative(-9.485f, -5.691f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-2.515f, -1.509f)
                lineToRelative(0.0f, 2.332f)
                lineToRelative(12.0f, 7.2f)
                lineToRelative(12.0f, -7.2f)
                lineToRelative(0.0f, -2.332f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
