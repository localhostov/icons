package me.localx.icons.rounded.outline

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

public val Icons.Outline.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.962f, 12.875f)
                arcTo(10.03f, 10.03f, 0.0f, true, true, 19.122f, 5.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.143f)
                arcTo(1.858f, 1.858f, 0.0f, false, false, 22.0f, 5.143f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(3.078f)
                arcTo(11.985f, 11.985f, 0.0f, true, false, 23.95f, 13.1f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -1.0f, -1.1f)
                horizontalLineToRelative(0.0f)
                arcTo(0.982f, 0.982f, 0.0f, false, false, 21.962f, 12.875f)
                close()
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
