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

public val Icons.Filled.Jam: ImageVector
    get() {
        if (_jam != null) {
            return _jam!!
        }
        _jam = Builder(name = "Jam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.376f)
                lineToRelative(-0.248f, 0.282f)
                arcTo(3.471f, 3.471f, 0.0f, false, true, 21.0f, 10.0f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, true, -2.444f, -0.834f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -1.111f, 0.0f)
                arcTo(3.965f, 3.965f, 0.0f, false, true, 3.0f, 10.0f)
                arcTo(3.471f, 3.471f, 0.0f, false, true, 0.248f, 8.658f)
                lineTo(0.0f, 8.376f)
                arcTo(4.975f, 4.975f, 0.0f, false, true, 4.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                arcTo(4.975f, 4.975f, 0.0f, false, true, 24.0f, 8.376f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(5.931f, 5.931f, 0.0f, false, true, -3.0f, -0.8f)
                arcToRelative(6.112f, 6.112f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(6.107f, 6.107f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(5.934f, 5.934f, 0.0f, false, true, 3.0f, 12.0f)
                arcToRelative(5.69f, 5.69f, 0.0f, false, true, -1.0f, -0.094f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(11.906f)
                arcTo(5.69f, 5.69f, 0.0f, false, true, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _jam!!
    }

private var _jam: ImageVector? = null
