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

public val Icons.Filled.MoveToFolder2: ImageVector
    get() {
        if (_moveToFolder2 != null) {
            return _moveToFolder2!!
        }
        _moveToFolder2 = Builder(name = "MoveToFolder2", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.42f, 17.59f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0.0f, 2.81f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.01f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(21.0f, 2.0f)
                lineTo(12.24f, 2.0f)
                lineTo(8.24f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(0.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.59f)
                lineToRelative(4.53f, -4.53f)
                lineToRelative(3.88f, 3.88f)
                verticalLineToRelative(-7.35f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _moveToFolder2!!
    }

private var _moveToFolder2: ImageVector? = null
