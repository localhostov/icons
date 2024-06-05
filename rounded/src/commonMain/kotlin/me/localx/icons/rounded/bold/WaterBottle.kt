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

public val Icons.Bold.WaterBottle: ImageVector
    get() {
        if (_waterBottle != null) {
            return _waterBottle!!
        }
        _waterBottle = Builder(name = "WaterBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.707f)
                arcToRelative(3.835f, 3.835f, 0.0f, false, false, 1.0f, -2.57f)
                arcToRelative(3.879f, 3.879f, 0.0f, false, false, -2.507f, -3.616f)
                lineTo(16.0f, 3.96f)
                verticalLineTo(2.908f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 2.908f)
                verticalLineTo(3.96f)
                lineToRelative(-1.493f, 0.561f)
                arcTo(3.879f, 3.879f, 0.0f, false, false, 4.0f, 8.137f)
                arcToRelative(3.835f, 3.835f, 0.0f, false, false, 1.0f, 2.57f)
                arcTo(4.416f, 4.416f, 0.0f, false, false, 5.17f, 16.5f)
                arcTo(4.481f, 4.481f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(4.481f, 4.481f, 0.0f, false, false, 3.33f, -7.5f)
                arcTo(4.416f, 4.416f, 0.0f, false, false, 19.0f, 10.707f)
                close()
                moveTo(15.5f, 15.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(7.56f, 7.33f)
                lineTo(10.026f, 6.4f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.974f, 1.4f)
                lineToRelative(2.466f, 0.926f)
                arcToRelative(0.862f, 0.862f, 0.0f, false, true, -0.3f, 1.67f)
                horizontalLineTo(7.862f)
                arcToRelative(0.862f, 0.862f, 0.0f, false, true, -0.3f, -1.67f)
                close()
                moveTo(15.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _waterBottle!!
    }

private var _waterBottle: ImageVector? = null
