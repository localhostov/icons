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

public val Icons.Filled.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.92f, 13.0f)
                arcToRelative(6.966f, 6.966f, 0.0f, false, true, -0.43f, 1.612f)
                lineToRelative(4.385f, 2.553f)
                lineToRelative(-1.0f, 1.729f)
                lineToRelative(-4.388f, -2.555f)
                arcToRelative(6.994f, 6.994f, 0.0f, false, true, -1.122f, 1.127f)
                lineToRelative(2.558f, 4.4f)
                lineTo(17.19f, 22.871f)
                lineTo(14.637f, 18.48f)
                arcTo(6.914f, 6.914f, 0.0f, false, true, 13.0f, 18.92f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.92f)
                arcToRelative(6.89f, 6.89f, 0.0f, false, true, -1.623f, -0.435f)
                lineToRelative(-2.55f, 4.386f)
                lineTo(5.1f, 21.865f)
                lineToRelative(2.553f, -4.39f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.128f, -1.129f)
                lineTo(2.147f, 18.894f)
                lineTo(1.141f, 17.165f)
                lineToRelative(4.372f, -2.546f)
                arcTo(6.952f, 6.952f, 0.0f, false, true, 5.08f, 13.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.08f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, true, 0.436f, -1.627f)
                lineTo(1.134f, 6.822f)
                lineTo(2.14f, 5.094f)
                lineTo(6.527f, 7.648f)
                arcToRelative(7.028f, 7.028f, 0.0f, false, true, 1.147f, -1.14f)
                lineTo(5.126f, 2.127f)
                lineTo(6.854f, 1.121f)
                lineTo(9.4f, 5.505f)
                arcTo(6.914f, 6.914f, 0.0f, false, true, 11.0f, 5.08f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.08f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, true, 1.61f, 0.43f)
                lineToRelative(2.552f, -4.389f)
                lineTo(18.89f, 2.127f)
                lineToRelative(-2.552f, 4.39f)
                arcToRelative(7.087f, 7.087f, 0.0f, false, true, 1.14f, 1.137f)
                lineToRelative(4.4f, -2.56f)
                lineToRelative(1.006f, 1.728f)
                lineToRelative(-4.4f, 2.559f)
                arcTo(6.952f, 6.952f, 0.0f, false, true, 18.92f, 11.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
