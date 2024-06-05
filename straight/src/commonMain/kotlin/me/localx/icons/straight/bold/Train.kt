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

public val Icons.Bold.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.5f)
                arcToRelative(3.224f, 3.224f, 0.0f, false, false, -2.2f, -3.049f)
                arcTo(19.043f, 19.043f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(19.054f, 19.054f, 0.0f, false, false, 5.2f, 1.451f)
                arcTo(3.225f, 3.225f, 0.0f, false, false, 3.0f, 4.5f)
                lineTo(3.0f, 18.084f)
                lineToRelative(0.232f, 0.367f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 4.678f, 19.9f)
                lineTo(3.0f, 24.0f)
                lineTo(6.077f, 24.0f)
                lineToRelative(1.132f, -2.767f)
                arcTo(14.05f, 14.05f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(14.05f, 14.05f, 0.0f, false, false, 4.791f, -0.767f)
                lineTo(17.923f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineToRelative(-1.678f, -4.1f)
                arcToRelative(6.143f, 6.143f, 0.0f, false, false, 1.447f, -1.447f)
                lineTo(21.0f, 18.084f)
                close()
                moveTo(6.312f, 4.238f)
                arcTo(19.692f, 19.692f, 0.0f, false, true, 9.0f, 3.388f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 3.388f)
                arcToRelative(19.692f, 19.692f, 0.0f, false, true, 2.688f, 0.85f)
                arcToRelative(0.493f, 0.493f, 0.0f, false, true, 0.306f, 0.443f)
                curveTo(17.927f, 8.64f, 15.7f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(6.073f, 8.64f, 6.006f, 4.681f)
                arcTo(0.493f, 0.493f, 0.0f, false, true, 6.312f, 4.238f)
                close()
                moveTo(6.0f, 17.113f)
                lineTo(6.0f, 11.935f)
                arcTo(8.943f, 8.943f, 0.0f, false, false, 12.0f, 14.0f)
                arcToRelative(8.943f, 8.943f, 0.0f, false, false, 6.0f, -2.065f)
                verticalLineToRelative(5.174f)
                curveTo(17.41f, 17.7f, 15.694f, 19.0f, 12.0f, 19.0f)
                curveTo(8.288f, 19.0f, 6.574f, 17.689f, 6.0f, 17.113f)
                close()
                moveTo(13.5f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 16.5f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
