package me.localx.icons.rounded.filled

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

public val Icons.Filled.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(17.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 14.5f)
                close()
                moveTo(12.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 14.5f)
                close()
                moveTo(7.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 2.0f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
