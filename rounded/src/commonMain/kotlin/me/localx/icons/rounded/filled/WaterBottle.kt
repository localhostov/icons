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

public val Icons.Filled.WaterBottle: ImageVector
    get() {
        if (_waterBottle != null) {
            return _waterBottle!!
        }
        _waterBottle = Builder(name = "WaterBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.016f)
                curveTo(20.152f, 5.423f, 16.873f, 4.853f, 15.0f, 4.0f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(6.514f, 5.0f)
                arcTo(3.219f, 3.219f, 0.0f, false, false, 4.575f, 10.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(4.574f)
                arcToRelative(3.828f, 3.828f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(4.574f)
                arcTo(3.991f, 3.991f, 0.0f, false, false, 8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, 2.618f, -7.0f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.0f, -6.0f)
                arcTo(4.007f, 4.007f, 0.0f, false, false, 20.0f, 8.016f)
                close()
            }
        }
        .build()
        return _waterBottle!!
    }

private var _waterBottle: ImageVector? = null
