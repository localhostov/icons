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

public val Icons.Bold.Vector: ImageVector
    get() {
        if (_vector != null) {
            return _vector!!
        }
        _vector = Builder(name = "Vector", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 0.0f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 2.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.99f)
                lineToRelative(-0.01f, 1.993f)
                lineToRelative(3.0f, 0.014f)
                lineTo(5.99f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.01f)
                lineToRelative(1.992f, 0.01f)
                lineToRelative(0.016f, -3.0f)
                lineTo(9.0f, 3.01f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 0.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.99f)
                lineToRelative(-1.992f, -0.01f)
                lineToRelative(-0.016f, 3.0f)
                lineTo(15.0f, 5.99f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.99f)
                lineToRelative(-0.01f, 1.993f)
                lineToRelative(3.0f, 0.014f)
                lineTo(20.99f, 9.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 0.0f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.02f, 13.007f)
                lineToRelative(-3.0f, -0.014f)
                lineTo(18.01f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(2.99f)
                lineToRelative(-1.992f, -0.01f)
                lineToRelative(-0.016f, 3.0f)
                lineTo(15.0f, 20.99f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 21.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.01f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                horizontalLineTo(6.01f)
                lineToRelative(0.01f, -1.993f)
                lineToRelative(-3.0f, -0.014f)
                lineTo(3.01f, 15.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.01f)
                lineToRelative(1.992f, 0.01f)
                lineToRelative(0.016f, -3.0f)
                lineTo(9.0f, 18.01f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _vector!!
    }

private var _vector: ImageVector? = null
