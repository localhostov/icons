package me.localx.icons.rounded.filled

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

public val Icons.Filled.Sack: ImageVector
    get() {
        if (_sack != null) {
            return _sack!!
        }
        _sack = Builder(name = "Sack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.053f, 5.079f)
                curveToRelative(0.971f, -0.909f, 2.344f, -2.36f, 2.894f, -3.744f)
                curveToRelative(0.255f, -0.641f, -0.257f, -1.335f, -0.947f, -1.335f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.69f, 0.0f, -1.202f, 0.693f, -0.947f, 1.335f)
                curveToRelative(0.55f, 1.384f, 1.923f, 2.835f, 2.894f, 3.744f)
                curveTo(5.569f, 5.878f, 1.0f, 12.618f, 1.0f, 18.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -5.382f, -4.569f, -12.122f, -9.947f, -12.921f)
                close()
            }
        }
        .build()
        return _sack!!
    }

private var _sack: ImageVector? = null
