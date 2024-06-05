package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineToRelative(-0.508f)
                lineTo(16.308f, 1.168f)
                arcTo(3.023f, 3.023f, 0.0f, false, false, 13.932f, 0.0f)
                horizontalLineTo(10.068f)
                arcTo(3.023f, 3.023f, 0.0f, false, false, 7.692f, 1.168f)
                lineTo(5.508f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 4.0f)
                close()
                moveTo(9.276f, 2.39f)
                arcTo(1.006f, 1.006f, 0.0f, false, true, 10.068f, 2.0f)
                horizontalLineToRelative(3.864f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 0.792f, 0.39f)
                lineTo(15.966f, 4.0f)
                horizontalLineTo(8.034f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
