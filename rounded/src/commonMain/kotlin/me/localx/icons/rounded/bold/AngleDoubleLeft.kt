package me.localx.icons.rounded.bold

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

public val Icons.Bold.AngleDoubleLeft: ImageVector
    get() {
        if (_angleDoubleLeft != null) {
            return _angleDoubleLeft!!
        }
        _angleDoubleLeft = Builder(name = "AngleDoubleLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, true, -1.06f, -0.439f)
                lineTo(3.264f, 15.889f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -7.778f)
                lineTo(10.936f, 0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.121f, 2.122f)
                lineTo(5.385f, 10.232f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.536f)
                lineToRelative(7.672f, 7.671f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.542f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.061f, -0.439f)
                lineTo(11.4f, 14.475f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, 0.0f, -4.95f)
                lineTo(20.481f, 0.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.6f, 2.561f)
                lineToRelative(-9.086f, 9.085f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.708f)
                lineTo(22.6f, 21.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.542f, 24.0f)
                close()
            }
        }
        .build()
        return _angleDoubleLeft!!
    }

private var _angleDoubleLeft: ImageVector? = null
