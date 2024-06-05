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

public val Icons.Filled.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveToRelative(4.276f, 0.0f, 7.634f, -6.292f, 8.665f, -10.055f)
                arcTo(4.966f, 4.966f, 0.0f, false, false, 17.525f, 0.957f)
                arcTo(18.329f, 18.329f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(18.367f, 18.367f, 0.0f, false, false, 6.475f, 0.956f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, -3.14f, 2.989f)
                curveTo(4.366f, 7.708f, 7.724f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(21.0f, 8.585f)
                curveTo(19.109f, 12.323f, 15.971f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(4.891f, 12.323f, 3.0f, 8.585f)
                verticalLineToRelative(7.592f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.325f, 3.39f)
                lineTo(3.076f, 22.621f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.851f, 0.757f)
                lineTo(6.0f, 20.745f)
                arcTo(13.583f, 13.583f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(13.573f, 13.573f, 0.0f, false, false, 6.0f, -1.255f)
                lineToRelative(1.077f, 2.633f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.852f, -0.757f)
                lineToRelative(-1.25f, -3.054f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.0f, 16.177f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
