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

public val Icons.Bold.AngleCircleLeft: ImageVector
    get() {
        if (_angleCircleLeft != null) {
            return _angleCircleLeft!!
        }
        _angleCircleLeft = Builder(name = "AngleCircleLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -9.0f, 9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(8.732f, 13.768f)
                lineToRelative(4.25f, 4.25f)
                lineTo(15.1f, 15.9f)
                lineToRelative(-3.9f, -3.9f)
                lineToRelative(3.9f, -3.9f)
                lineTo(12.982f, 5.982f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.536f)
                close()
            }
        }
        .build()
        return _angleCircleLeft!!
    }

private var _angleCircleLeft: ImageVector? = null
