package me.localx.icons.straight.filled

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

public val Icons.Filled.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 9.731f)
                lineToRelative(-1.048f, -2.264f)
                curveToRelative(-0.579f, -1.251f, -2.067f, -1.796f, -3.319f, -1.219f)
                lineTo(5.798f, 12.931f)
                lineToRelative(-3.237f, -1.188f)
                curveToRelative(-0.47f, -0.175f, -1.0f, -0.15f, -1.457f, 0.059f)
                curveTo(0.481f, 12.089f, 0.071f, 12.669f, 0.008f, 13.352f)
                curveToRelative(-0.063f, 0.684f, 0.233f, 1.329f, 0.792f, 1.727f)
                lineToRelative(4.839f, 3.441f)
                lineTo(24.0f, 9.731f)
                close()
                moveTo(13.74f, 6.874f)
                lineToRelative(-5.353f, -3.382f)
                curveToRelative(-0.734f, -0.545f, -1.707f, -0.646f, -2.542f, -0.259f)
                lineToRelative(-2.503f, 1.143f)
                lineToRelative(5.542f, 4.816f)
                lineToRelative(4.855f, -2.319f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
