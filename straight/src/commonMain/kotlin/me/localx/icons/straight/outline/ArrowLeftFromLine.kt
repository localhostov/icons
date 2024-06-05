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

public val Icons.Outline.ArrowLeftFromLine: ImageVector
    get() {
        if (_arrowLeftFromLine != null) {
            return _arrowLeftFromLine!!
        }
        _arrowLeftFromLine = Builder(name = "ArrowLeftFromLine", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.59f, 13.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(6.09f, 5.09f)
                lineToRelative(1.41f, 1.41f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(22.0f, 0.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _arrowLeftFromLine!!
    }

private var _arrowLeftFromLine: ImageVector? = null
