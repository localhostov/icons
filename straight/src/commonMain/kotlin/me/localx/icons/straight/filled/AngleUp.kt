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

public val Icons.Filled.AngleUp: ImageVector
    get() {
        if (_angleUp != null) {
            return _angleUp!!
        }
        _angleUp = Builder(name = "AngleUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.586f, 18.148f)
                lineTo(12.707f, 8.269f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(1.42f, 18.142f)
                lineTo(0.006f, 16.728f)
                lineTo(9.879f, 6.855f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, true, 4.243f, 0.0f)
                lineTo(24.0f, 16.734f)
                close()
            }
        }
        .build()
        return _angleUp!!
    }

private var _angleUp: ImageVector? = null
