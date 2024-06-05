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

public val Icons.Filled.Floor: ImageVector
    get() {
        if (_floor != null) {
            return _floor!!
        }
        _floor = Builder(name = "Floor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.375f, 12.062f)
                lineToRelative(-2.774f, -1.713f)
                lineToRelative(5.1f, -3.131f)
                lineToRelative(2.782f, 1.708f)
                lineToRelative(-5.109f, 3.136f)
                close()
                moveTo(2.526f, 5.926f)
                lineTo(-0.017f, 7.497f)
                lineToRelative(2.712f, 1.675f)
                lineToRelative(2.558f, -1.571f)
                lineToRelative(-2.728f, -1.675f)
                close()
                moveTo(16.654f, 2.949f)
                lineToRelative(-5.042f, 3.095f)
                lineToRelative(2.782f, 1.708f)
                lineToRelative(5.033f, -3.09f)
                lineToRelative(-2.774f, -1.713f)
                close()
                moveTo(24.016f, 7.496f)
                lineToRelative(-2.683f, -1.657f)
                lineToRelative(-2.564f, 1.574f)
                lineToRelative(2.699f, 1.657f)
                lineToRelative(2.548f, -1.574f)
                close()
                moveTo(16.858f, 8.586f)
                lineToRelative(-7.579f, 4.652f)
                lineToRelative(2.72f, 1.68f)
                lineToRelative(7.563f, -4.672f)
                lineToRelative(-2.705f, -1.661f)
                close()
                moveTo(7.165f, 6.428f)
                lineTo(14.749f, 1.772f)
                lineTo(12.0f, 0.075f)
                lineToRelative(-7.569f, 4.675f)
                lineToRelative(2.734f, 1.679f)
                close()
                moveTo(0.0f, 9.66f)
                verticalLineToRelative(2.35f)
                lineToRelative(12.0f, 7.412f)
                lineToRelative(12.0f, -7.412f)
                verticalLineToRelative(-2.35f)
                lineToRelative(-12.0f, 7.412f)
                lineTo(0.0f, 9.66f)
                close()
                moveTo(0.0f, 14.157f)
                verticalLineToRelative(2.35f)
                lineToRelative(12.0f, 7.412f)
                lineToRelative(12.0f, -7.412f)
                verticalLineToRelative(-2.35f)
                lineToRelative(-12.0f, 7.412f)
                lineTo(0.0f, 14.156f)
                close()
            }
        }
        .build()
        return _floor!!
    }

private var _floor: ImageVector? = null
