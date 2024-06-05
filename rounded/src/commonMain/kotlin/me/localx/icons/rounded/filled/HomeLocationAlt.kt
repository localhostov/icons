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

public val Icons.Filled.HomeLocationAlt: ImageVector
    get() {
        if (_homeLocationAlt != null) {
            return _homeLocationAlt!!
        }
        _homeLocationAlt = Builder(name = "HomeLocationAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.243f, 10.764f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.486f, 8.485f)
                lineToRelative(3.507f, 3.43f)
                arcToRelative(1.053f, 1.053f, 0.0f, false, false, 1.472f, 0.0f)
                lineToRelative(3.507f, -3.43f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 16.243f, 10.764f)
                close()
                moveTo(12.0f, 16.994f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 16.994f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 5.579f)
                lineTo(14.8f, 0.855f)
                arcTo(4.981f, 4.981f, 0.0f, false, false, 9.2f, 0.855f)
                lineToRelative(-7.0f, 4.724f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 0.0f, 9.724f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(9.754f)
                lineTo(6.359f, 20.679f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 17.657f, 9.35f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.313f)
                lineTo(14.245f, 24.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(9.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.8f, 5.579f)
                close()
            }
        }
        .build()
        return _homeLocationAlt!!
    }

private var _homeLocationAlt: ImageVector? = null
