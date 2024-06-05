package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.AngleLeft: ImageVector
    get() {
        if (_angleLeft != null) {
            return _angleLeft!!
        }
        _angleLeft = Builder(name = "AngleLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.921f, 1.505f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.44f, 1.06f)
                lineTo(9.809f, 10.237f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.536f)
                lineToRelative(7.662f, 7.662f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, 2.121f)
                lineTo(7.688f, 15.9f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 0.0f, -7.779f)
                lineTo(15.36f, 0.444f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.561f, 1.061f)
                close()
            }
        }
        .build()
        return _angleLeft!!
    }

private var _angleLeft: ImageVector? = null
