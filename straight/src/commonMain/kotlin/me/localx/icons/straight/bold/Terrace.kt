package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Terrace: ImageVector
    get() {
        if (_terrace != null) {
            return _terrace!!
        }
        _terrace = Builder(name = "Terrace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.6f, 6.9f)
                lineTo(14.006f, 0.652f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -4.011f, 0.0f)
                lineTo(1.4f, 6.9f)
                arcTo(3.416f, 3.416f, 0.0f, false, false, 0.0f, 9.657f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.657f)
                arcTo(3.416f, 3.416f, 0.0f, false, false, 22.6f, 6.9f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.972f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.053f, -0.223f)
                lineTo(12.0f, 4.854f)
                lineToRelative(1.947f, 3.9f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 8.972f)
                close()
                moveTo(3.0f, 9.657f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, 0.168f, -0.331f)
                lineToRelative(5.094f, -3.7f)
                lineTo(7.369f, 7.407f)
                arcTo(3.53f, 3.53f, 0.0f, false, false, 7.0f, 8.972f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.972f)
                arcToRelative(3.53f, 3.53f, 0.0f, false, false, -0.369f, -1.565f)
                lineToRelative(-0.893f, -1.786f)
                lineToRelative(5.094f, 3.705f)
                arcTo(0.411f, 0.411f, 0.0f, false, true, 21.0f, 9.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                horizontalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 21.5f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _terrace!!
    }

private var _terrace: ImageVector? = null
