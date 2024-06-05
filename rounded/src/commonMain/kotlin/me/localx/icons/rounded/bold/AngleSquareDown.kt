package me.localx.icons.rounded.bold

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

public val Icons.Bold.AngleSquareDown: ImageVector
    get() {
        if (_angleSquareDown != null) {
            return _angleSquareDown!!
        }
        _angleSquareDown = Builder(name = "AngleSquareDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                horizontalLineTo(5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 0.0f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 18.5f, 24.0f)
                close()
                moveTo(5.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.008f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -2.45f, -0.991f)
                lineToRelative(-3.1f, -3.05f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.1f, -2.139f)
                lineToRelative(3.1f, 3.043f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, false, 0.705f, 0.0f)
                lineToRelative(3.1f, -3.044f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.1f, 2.139f)
                lineToRelative(-3.1f, 3.052f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 12.0f, 16.008f)
                close()
            }
        }
        .build()
        return _angleSquareDown!!
    }

private var _angleSquareDown: ImageVector? = null
