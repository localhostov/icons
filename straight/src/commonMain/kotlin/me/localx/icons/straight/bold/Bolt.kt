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

public val Icons.Bold.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.307f, 24.0f)
                horizontalLineTo(8.073f)
                lineTo(10.1f, 16.0f)
                horizontalLineTo(6.965f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 4.1f, 12.144f)
                lineTo(8.443f, 0.0f)
                horizontalLineToRelative(9.626f)
                lineTo(15.228f, 7.0f)
                horizontalLineToRelative(2.808f)
                arcTo(2.962f, 2.962f, 0.0f, false, true, 20.5f, 11.6f)
                close()
                moveTo(13.95f, 13.0f)
                lineToRelative(-1.259f, 4.979f)
                lineTo(18.0f, 9.943f)
                lineTo(10.772f, 10.0f)
                lineToRelative(2.842f, -7.0f)
                horizontalLineTo(10.557f)
                lineTo(6.951f, 13.083f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
