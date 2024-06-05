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

public val Icons.Bold.Condition: ImageVector
    get() {
        if (_condition != null) {
            return _condition!!
        }
        _condition = Builder(name = "Condition", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 7.761f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.761f)
                lineToRelative(-5.51f, 4.239f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.99f)
                lineToRelative(7.01f, 5.393f)
                lineToRelative(7.01f, -5.393f)
                horizontalLineToRelative(1.99f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-4.99f)
                lineToRelative(-5.51f, -4.239f)
                close()
                moveTo(12.0f, 16.607f)
                lineToRelative(-4.04f, -3.107f)
                lineToRelative(4.04f, -3.107f)
                lineToRelative(4.04f, 3.107f)
                lineToRelative(-4.04f, 3.107f)
                close()
                moveTo(22.621f, 5.5f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.439f, 1.439f)
                close()
                moveTo(3.635f, 9.621f)
                lineTo(0.074f, 6.061f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(3.074f, -3.074f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-5.195f, 5.195f)
                close()
            }
        }
        .build()
        return _condition!!
    }

private var _condition: ImageVector? = null
