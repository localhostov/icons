package me.localx.icons.straight.outline

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

public val Icons.Outline.AngleSquareDown: ImageVector
    get() {
        if (_angleSquareDown != null) {
            return _angleSquareDown!!
        }
        _angleSquareDown = Builder(name = "AngleSquareDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, -1.414f, -0.585f)
                lineTo(5.913f, 10.741f)
                lineTo(7.327f, 9.327f)
                lineTo(12.0f, 14.0f)
                lineToRelative(4.712f, -4.711f)
                lineTo(18.126f, 10.7f)
                lineToRelative(-4.712f, 4.711f)
                arcTo(1.993f, 1.993f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(24.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _angleSquareDown!!
    }

private var _angleSquareDown: ImageVector? = null
