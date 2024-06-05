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

public val Icons.Outline.ArrowLeftFromArc: ImageVector
    get() {
        if (_arrowLeftFromArc != null) {
            return _arrowLeftFromArc!!
        }
        _arrowLeftFromArc = Builder(name = "ArrowLeftFromArc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.951f, 13.0f)
                lineToRelative(4.759f, 4.796f)
                lineToRelative(-1.42f, 1.408f)
                lineTo(0.613f, 13.483f)
                curveToRelative(-0.816f, -0.816f, -0.816f, -2.15f, 0.002f, -2.97f)
                lineToRelative(5.675f, -5.718f)
                lineToRelative(1.42f, 1.408f)
                lineToRelative(-4.759f, 4.796f)
                horizontalLineToRelative(14.049f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.951f)
                close()
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowLeftFromArc!!
    }

private var _arrowLeftFromArc: ImageVector? = null
