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

public val Icons.Bold.Scythe: ImageVector
    get() {
        if (_scythe != null) {
            return _scythe!!
        }
        _scythe = Builder(name = "Scythe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.593f, 0.0f)
                curveTo(6.136f, 0.0f, 2.185f, 7.446f, 1.769f, 8.295f)
                lineTo(-0.093f, 12.092f)
                lineToRelative(3.838f, -1.775f)
                curveToRelative(1.889f, -0.874f, 4.024f, -1.316f, 6.348f, -1.316f)
                horizontalLineToRelative(7.996f)
                lineToRelative(-1.209f, 4.0f)
                horizontalLineToRelative(-5.88f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.973f)
                lineToRelative(-2.15f, 7.113f)
                lineToRelative(2.871f, 0.868f)
                lineTo(23.943f, 0.0f)
                horizontalLineToRelative(-7.351f)
                close()
                moveTo(10.093f, 6.0f)
                curveToRelative(-0.957f, 0.0f, -1.889f, 0.064f, -2.794f, 0.192f)
                curveToRelative(1.918f, -1.615f, 4.913f, -3.192f, 9.294f, -3.192f)
                horizontalLineToRelative(3.31f)
                lineToRelative(-0.907f, 3.0f)
                horizontalLineToRelative(-8.902f)
                close()
            }
        }
        .build()
        return _scythe!!
    }

private var _scythe: ImageVector? = null
