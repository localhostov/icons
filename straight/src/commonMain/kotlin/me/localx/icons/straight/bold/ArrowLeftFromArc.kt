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

public val Icons.Bold.ArrowLeftFromArc: ImageVector
    get() {
        if (_arrowLeftFromArc != null) {
            return _arrowLeftFromArc!!
        }
        _arrowLeftFromArc = Builder(name = "ArrowLeftFromArc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.65f, 13.5f)
                lineToRelative(3.415f, 3.443f)
                lineToRelative(-2.13f, 2.113f)
                lineTo(0.758f, 13.836f)
                curveToRelative(-1.009f, -1.011f, -1.009f, -2.661f, 0.004f, -3.676f)
                lineToRelative(5.173f, -5.217f)
                lineToRelative(2.13f, 2.113f)
                lineToRelative(-3.415f, 3.443f)
                horizontalLineToRelative(12.35f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.65f)
                close()
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(4.962f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowLeftFromArc!!
    }

private var _arrowLeftFromArc: ImageVector? = null
