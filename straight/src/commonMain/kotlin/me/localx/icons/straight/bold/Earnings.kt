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

public val Icons.Bold.Earnings: ImageVector
    get() {
        if (_earnings != null) {
            return _earnings!!
        }
        _earnings = Builder(name = "Earnings", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.546f, 0.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(5.879f)
                lineTo(0.0f, 21.879f)
                lineTo(2.121f, 24.0f)
                lineTo(21.0f, 5.121f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.454f)
                arcTo(2.457f, 2.457f, 0.0f, false, false, 21.546f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 11.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 2.0f, 6.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 6.5f, 11.0f)
                close()
                moveTo(6.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 13.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 22.0f, 17.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 17.5f, 13.0f)
                close()
                moveTo(17.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 19.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 19.0f)
                close()
            }
        }
        .build()
        return _earnings!!
    }

private var _earnings: ImageVector? = null
