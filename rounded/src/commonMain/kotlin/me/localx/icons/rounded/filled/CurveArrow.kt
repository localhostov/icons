package me.localx.icons.rounded.filled

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

public val Icons.Filled.CurveArrow: ImageVector
    get() {
        if (_curveArrow != null) {
            return _curveArrow!!
        }
        _curveArrow = Builder(name = "CurveArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.694f, 19.261f)
                lineToRelative(-2.396f, -2.396f)
                curveToRelative(-0.479f, -0.479f, -1.298f, -0.14f, -1.298f, 0.537f)
                verticalLineToRelative(1.424f)
                curveToRelative(-0.796f, -0.482f, -1.593f, -1.964f, -2.256f, -3.209f)
                curveToRelative(-0.99f, -1.86f, -1.675f, -3.617f, -3.244f, -3.617f)
                reflectiveCurveToRelative(-2.254f, 1.757f, -3.244f, 3.617f)
                curveToRelative(-0.802f, 1.507f, -1.8f, 3.383f, -2.756f, 3.383f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.82f, -0.846f, 1.591f, -2.0f)
                curveToRelative(0.285f, -0.382f, 1.068f, -1.7f, 1.399f, -2.323f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.11f, -2.085f, 2.24f, -4.677f, 5.01f, -4.677f)
                curveToRelative(0.477f, 0.0f, 1.16f, 0.081f, 1.56f, 0.219f)
                curveToRelative(-1.18f, -3.899f, -2.218f, -6.219f, -4.06f, -6.219f)
                curveToRelative(-2.213f, 0.0f, -3.264f, 3.321f, -4.795f, 8.74f)
                curveToRelative(-0.42f, 1.487f, -1.405f, 3.455f, -2.205f, 4.8f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.559f)
                curveToRelative(0.677f, 0.0f, 1.016f, -0.819f, 0.537f, -1.298f)
                lineTo(4.7f, 0.306f)
                curveToRelative(-0.408f, -0.408f, -1.07f, -0.408f, -1.478f, 0.0f)
                lineTo(0.826f, 2.702f)
                curveToRelative(-0.479f, 0.479f, -0.14f, 1.298f, 0.537f, 1.298f)
                horizontalLineToRelative(1.636f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(1.598f)
                curveToRelative(0.0f, 0.677f, 0.819f, 1.016f, 1.298f, 0.537f)
                lineToRelative(2.396f, -2.396f)
                curveToRelative(0.408f, -0.408f, 0.408f, -1.07f, 0.0f, -1.478f)
                close()
            }
        }
        .build()
        return _curveArrow!!
    }

private var _curveArrow: ImageVector? = null
