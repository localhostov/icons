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

public val Icons.Bold.AngleSquareRight: ImageVector
    get() {
        if (_angleSquareRight != null) {
            return _angleSquareRight!!
        }
        _angleSquareRight = Builder(name = "AngleSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 18.5f, 24.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 24.0f, 5.5f)
                close()
                moveTo(3.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 3.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                close()
                moveTo(14.779f, 9.04f)
                lineTo(12.233f, 6.449f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.139f, 2.1f)
                lineToRelative(2.554f, 2.6f)
                arcToRelative(1.223f, 1.223f, 0.0f, false, true, -0.009f, 1.707f)
                lineToRelative(-2.545f, 2.591f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.139f, 2.1f)
                lineTo(14.77f, 14.97f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.009f, -5.93f)
                close()
            }
        }
        .build()
        return _angleSquareRight!!
    }

private var _angleSquareRight: ImageVector? = null
