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

public val Icons.Outline.ArrowsFromLine: ImageVector
    get() {
        if (_arrowsFromLine != null) {
            return _arrowsFromLine!!
        }
        _arrowsFromLine = Builder(name = "ArrowsFromLine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 11.0f)
                close()
                moveTo(13.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 3.0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 0.586f)
                curveToRelative(-0.779f, -0.779f, -2.049f, -0.779f, -2.828f, 0.0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _arrowsFromLine!!
    }

private var _arrowsFromLine: ImageVector? = null
