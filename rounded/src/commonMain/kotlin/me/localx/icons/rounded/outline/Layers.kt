package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.485f, 10.975f)
                lineTo(12.0f, 17.267f)
                lineTo(1.515f, 10.975f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 0.486f, 12.69f)
                lineToRelative(11.0f, 6.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.03f, 0.0f)
                lineToRelative(11.0f, -6.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.029f, -1.715f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.485f, 15.543f)
                lineTo(12.0f, 21.834f)
                lineTo(1.515f, 15.543f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 0.486f, 17.258f)
                lineToRelative(11.0f, 6.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.03f, 0.0f)
                lineToRelative(11.0f, -6.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.029f, -1.715f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.773f)
                arcToRelative(2.976f, 2.976f, 0.0f, false, true, -1.531f, -0.425f)
                lineTo(0.485f, 8.357f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.714f)
                lineTo(10.469f, 0.652f)
                arcToRelative(2.973f, 2.973f, 0.0f, false, true, 3.062f, 0.0f)
                lineToRelative(9.984f, 5.991f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.714f)
                lineToRelative(-9.984f, 5.991f)
                arcTo(2.976f, 2.976f, 0.0f, false, true, 12.0f, 14.773f)
                close()
                moveTo(2.944f, 7.5f)
                lineTo(11.5f, 12.633f)
                arcToRelative(0.974f, 0.974f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(21.056f, 7.5f)
                lineTo(12.5f, 2.367f)
                arcToRelative(0.974f, 0.974f, 0.0f, false, false, -1.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
