package me.localx.icons.straight.outline

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

public val Icons.Outline.Jam: ImageVector
    get() {
        if (_jam != null) {
            return _jam!!
        }
        _jam = Builder(name = "Jam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.076f)
                verticalLineTo(0.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.076f)
                arcTo(4.838f, 4.838f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineToRelative(0.376f)
                lineToRelative(0.248f, 0.282f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 2.0f, 10.862f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(10.862f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 1.752f, -1.2f)
                lineTo(24.0f, 9.376f)
                verticalLineTo(9.0f)
                arcTo(4.838f, 4.838f, 0.0f, false, false, 20.0f, 4.076f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.768f, 2.768f, 0.0f, false, true, 2.974f, 2.624f)
                arcTo(1.3f, 1.3f, 0.0f, false, true, 21.0f, 9.0f)
                arcToRelative(1.979f, 1.979f, 0.0f, false, true, -1.221f, -0.416f)
                arcToRelative(2.944f, 2.944f, 0.0f, false, false, -3.557f, 0.0f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, -2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, -2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                arcTo(1.984f, 1.984f, 0.0f, false, true, 3.0f, 9.0f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.974f, -0.375f)
                arcTo(2.768f, 2.768f, 0.0f, false, true, 5.0f, 6.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(10.875f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, 1.445f, -0.709f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, true, 1.111f, 0.0f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, false, 4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, true, 1.111f, 0.0f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, false, 4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, true, 1.111f, 0.0f)
                arcTo(3.968f, 3.968f, 0.0f, false, false, 20.0f, 10.875f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _jam!!
    }

private var _jam: ImageVector? = null
