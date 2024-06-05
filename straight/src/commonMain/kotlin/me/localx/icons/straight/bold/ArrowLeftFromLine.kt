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

public val Icons.Bold.ArrowLeftFromLine: ImageVector
    get() {
        if (_arrowLeftFromLine != null) {
            return _arrowLeftFromLine!!
        }
        _arrowLeftFromLine = Builder(name = "ArrowLeftFromLine", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.71f, 10.5f)
                horizontalLineToRelative(14.29f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.71f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.73f, 13.77f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0.0f, -3.54f)
                lineTo(6.23f, 4.73f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.65f, 3.65f)
                close()
                moveTo(21.0f, 0.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _arrowLeftFromLine!!
    }

private var _arrowLeftFromLine: ImageVector? = null
