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

public val Icons.Filled.Entertainment: ImageVector
    get() {
        if (_entertainment != null) {
            return _entertainment!!
        }
        _entertainment = Builder(name = "Entertainment", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, -6.0f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(9.0f, 12.0f)
                lineTo(12.0f, 8.0f)
                lineTo(15.0f, 12.0f)
                close()
                moveTo(16.391f, 0.843f)
                arcToRelative(12.054f, 12.054f, 0.0f, false, true, 6.766f, 6.766f)
                lineToRelative(-3.847f, 1.154f)
                arcToRelative(8.048f, 8.048f, 0.0f, false, false, -4.073f, -4.073f)
                close()
                moveTo(9.522f, 0.26f)
                arcToRelative(11.939f, 11.939f, 0.0f, false, true, 4.956f, 0.0f)
                lineToRelative(-1.158f, 3.858f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, -2.64f, 0.0f)
                close()
                moveTo(19.882f, 13.32f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 0.0f, -2.64f)
                lineToRelative(3.858f, -1.158f)
                arcToRelative(11.939f, 11.939f, 0.0f, false, true, 0.0f, 4.956f)
                close()
                moveTo(4.118f, 13.32f)
                lineTo(0.26f, 14.478f)
                arcToRelative(11.939f, 11.939f, 0.0f, false, true, 0.0f, -4.956f)
                lineToRelative(3.858f, 1.158f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 0.0f, 2.64f)
                close()
                moveTo(14.478f, 23.74f)
                arcToRelative(11.939f, 11.939f, 0.0f, false, true, -4.956f, 0.0f)
                lineToRelative(1.158f, -3.858f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 2.64f, 0.0f)
                close()
                moveTo(23.157f, 16.391f)
                arcToRelative(12.054f, 12.054f, 0.0f, false, true, -6.766f, 6.766f)
                lineToRelative(-1.154f, -3.847f)
                arcToRelative(8.048f, 8.048f, 0.0f, false, false, 4.073f, -4.073f)
                close()
                moveTo(0.844f, 7.609f)
                arcToRelative(12.049f, 12.049f, 0.0f, false, true, 6.765f, -6.766f)
                lineToRelative(1.154f, 3.847f)
                arcToRelative(8.042f, 8.042f, 0.0f, false, false, -4.072f, 4.073f)
                close()
                moveTo(7.609f, 23.157f)
                arcToRelative(12.049f, 12.049f, 0.0f, false, true, -6.765f, -6.766f)
                lineToRelative(3.847f, -1.154f)
                arcToRelative(8.042f, 8.042f, 0.0f, false, false, 4.072f, 4.073f)
                close()
            }
        }
        .build()
        return _entertainment!!
    }

private var _entertainment: ImageVector? = null
