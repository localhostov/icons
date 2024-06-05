package me.localx.icons.straight.filled

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

public val Icons.Filled.Vector: ImageVector
    get() {
        if (_vector != null) {
            return _vector!!
        }
        _vector = Builder(name = "Vector", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                lineTo(2.979f, 11.0f)
                lineToRelative(2.0f, 0.01f)
                lineTo(5.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.984f)
                lineTo(11.0f, 5.0f)
                lineToRelative(0.01f, -2.0f)
                lineTo(8.0f, 2.984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                lineToRelative(-2.995f, -0.016f)
                lineToRelative(-0.01f, 2.0f)
                lineTo(16.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.015f)
                lineTo(19.0f, 11.0f)
                lineToRelative(2.0f, 0.01f)
                lineTo(21.015f, 8.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.021f, 13.005f)
                lineToRelative(-2.0f, -0.01f)
                lineTo(19.005f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(3.016f)
                lineTo(13.005f, 19.0f)
                lineTo(13.0f, 21.0f)
                lineTo(16.0f, 21.016f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineTo(4.985f)
                lineTo(5.0f, 13.005f)
                lineTo(3.0f, 13.0f)
                lineTo(2.985f, 16.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.0f)
                lineTo(11.0f, 21.021f)
                lineToRelative(0.01f, -2.0f)
                lineTo(8.0f, 19.005f)
                close()
            }
        }
        .build()
        return _vector!!
    }

private var _vector: ImageVector? = null
