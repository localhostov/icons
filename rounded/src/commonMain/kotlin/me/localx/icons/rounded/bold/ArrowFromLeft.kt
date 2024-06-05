package me.localx.icons.rounded.bold

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

public val Icons.Bold.ArrowFromLeft: ImageVector
    get() {
        if (_arrowFromLeft != null) {
            return _arrowFromLeft!!
        }
        _arrowFromLeft = Builder(name = "ArrowFromLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.141f, 9.941f)
                lineTo(18.409f, 5.209f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 2.122f)
                lineToRelative(3.249f, 3.184f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.28f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(17.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(13.515f)
                horizontalLineTo(19.473f)
                lineTo(16.288f, 16.7f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.121f, 2.121f)
                lineToRelative(4.733f, -4.732f)
                arcTo(2.938f, 2.938f, 0.0f, false, false, 23.141f, 9.941f)
                close()
            }
        }
        .build()
        return _arrowFromLeft!!
    }

private var _arrowFromLeft: ImageVector? = null
