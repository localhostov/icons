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

public val Icons.Filled.KipSign: ImageVector
    get() {
        if (_kipSign != null) {
            return _kipSign!!
        }
        _kipSign = Builder(name = "KipSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                horizontalLineTo(8.85f)
                lineToRelative(12.5f, 10.0f)
                horizontalLineToRelative(-3.2f)
                lineTo(7.0f, 15.08f)
                verticalLineToRelative(8.92f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.7f)
                lineTo(18.46f, 0.0f)
                horizontalLineToRelative(2.93f)
                lineTo(8.54f, 12.0f)
                horizontalLineToRelative(13.46f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _kipSign!!
    }

private var _kipSign: ImageVector? = null
