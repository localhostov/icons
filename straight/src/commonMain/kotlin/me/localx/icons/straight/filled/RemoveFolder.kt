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

public val Icons.Filled.RemoveFolder: ImageVector
    get() {
        if (_removeFolder != null) {
            return _removeFolder!!
        }
        _removeFolder = Builder(name = "RemoveFolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.0f, 2.35f, 1.35f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(0.0f, 23.0f)
                lineTo(14.03f, 23.0f)
                curveToRelative(-0.65f, -1.01f, -1.03f, -2.21f, -1.03f, -3.5f)
                curveToRelative(0.0f, -3.59f, 2.91f, -6.5f, 6.5f, -6.5f)
                curveToRelative(1.75f, 0.0f, 3.33f, 0.69f, 4.5f, 1.82f)
                verticalLineToRelative(-5.82f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(21.29f, 16.29f)
                lineToRelative(-1.79f, 1.8f)
                lineToRelative(-1.79f, -1.78f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(1.79f, 1.78f)
                lineToRelative(-1.77f, 1.78f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(1.77f, -1.78f)
                lineToRelative(1.79f, 1.78f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(-1.79f, -1.78f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.42f, -1.41f)
                close()
            }
        }
        .build()
        return _removeFolder!!
    }

private var _removeFolder: ImageVector? = null
