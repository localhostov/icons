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

public val Icons.Bold.AngleDoubleRight: ImageVector
    get() {
        if (_angleDoubleRight != null) {
            return _angleDoubleRight!!
        }
        _angleDoubleRight = Builder(name = "AngleDoubleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.832f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.061f, -2.561f)
                lineToRelative(7.672f, -7.671f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -3.536f)
                lineTo(10.771f, 2.561f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.893f, 0.439f)
                lineToRelative(7.671f, 7.672f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, 7.778f)
                lineToRelative(-7.671f, 7.672f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.832f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.287f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.06f, -2.561f)
                lineToRelative(9.085f, -9.085f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.708f)
                lineTo(1.227f, 2.561f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.348f, 0.439f)
                lineToRelative(9.086f, 9.086f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, true, 0.0f, 4.949f)
                lineTo(3.348f, 23.561f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.287f, 24.0f)
                close()
            }
        }
        .build()
        return _angleDoubleRight!!
    }

private var _angleDoubleRight: ImageVector? = null
