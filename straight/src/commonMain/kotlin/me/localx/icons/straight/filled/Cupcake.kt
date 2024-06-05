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

public val Icons.Filled.Cupcake: ImageVector
    get() {
        if (_cupcake != null) {
            return _cupcake!!
        }
        _cupcake = Builder(name = "Cupcake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 2.0f)
                close()
                moveTo(19.8f, 18.66f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, true, -3.8f, -0.085f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcToRelative(4.967f, 4.967f, 0.0f, false, true, -3.795f, 0.085f)
                arcTo(4.44f, 4.44f, 0.0f, false, true, 2.518f, 19.0f)
                lineToRelative(0.45f, 2.527f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.921f, 24.0f)
                lineTo(18.08f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.953f, -2.475f)
                lineTo(21.482f, 19.0f)
                arcTo(4.44f, 4.44f, 0.0f, false, true, 19.8f, 18.66f)
                close()
                moveTo(15.14f, 4.448f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.28f, 0.0f)
                curveTo(4.072f, 5.783f, 0.0f, 9.959f, 0.0f, 14.5f)
                arcToRelative(2.509f, 2.509f, 0.0f, false, false, 4.167f, 1.851f)
                arcTo(2.971f, 2.971f, 0.0f, false, false, 8.0f, 16.22f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(2.971f, 2.971f, 0.0f, false, false, 3.833f, 0.131f)
                arcTo(2.509f, 2.509f, 0.0f, false, false, 24.0f, 14.5f)
                curveTo(24.0f, 9.959f, 19.928f, 5.783f, 15.14f, 4.448f)
                close()
            }
        }
        .build()
        return _cupcake!!
    }

private var _cupcake: ImageVector? = null
