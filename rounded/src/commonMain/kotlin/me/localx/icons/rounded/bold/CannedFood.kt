package me.localx.icons.rounded.bold

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

public val Icons.Bold.CannedFood: ImageVector
    get() {
        if (_cannedFood != null) {
            return _cannedFood!!
        }
        _cannedFood = Builder(name = "CannedFood", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.092f)
                verticalLineTo(8.908f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 6.0f)
                horizontalLineTo(19.724f)
                arcTo(4.445f, 4.445f, 0.0f, false, false, 20.0f, 4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 15.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 8.908f)
                verticalLineTo(21.092f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 24.0f)
                horizontalLineToRelative(21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.5f, -2.908f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _cannedFood!!
    }

private var _cannedFood: ImageVector? = null
