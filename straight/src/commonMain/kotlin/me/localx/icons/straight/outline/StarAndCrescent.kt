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

public val Icons.Outline.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(0.0f, -4.07f, 2.888f, -7.931f, 7.023f, -9.391f)
                lineToRelative(2.364f, -0.834f)
                lineToRelative(-2.29f, -1.021f)
                curveToRelative(-1.136f, -0.507f, -2.476f, -0.753f, -4.098f, -0.753f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.616f, 0.0f, 2.835f, -0.223f, 4.074f, -0.747f)
                lineToRelative(2.376f, -1.004f)
                lineToRelative(-2.433f, -0.86f)
                curveToRelative(-4.132f, -1.461f, -7.018f, -5.322f, -7.018f, -9.389f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.239f, 0.0f, 0.469f, 0.006f, 0.69f, 0.018f)
                curveToRelative(-3.49f, 2.214f, -5.69f, 5.951f, -5.69f, 9.982f)
                reflectiveCurveToRelative(2.201f, 7.769f, 5.691f, 9.983f)
                curveToRelative(-0.22f, 0.012f, -0.449f, 0.017f, -0.691f, 0.017f)
                close()
                moveTo(24.0f, 10.833f)
                lineToRelative(-2.545f, 1.736f)
                lineToRelative(1.059f, 3.319f)
                lineToRelative(-0.682f, 0.476f)
                lineToRelative(-2.819f, -1.948f)
                lineToRelative(-2.776f, 1.948f)
                lineToRelative(-0.656f, -0.494f)
                lineToRelative(0.984f, -3.351f)
                lineToRelative(-2.566f, -1.68f)
                verticalLineToRelative(-0.839f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.07f, -3.636f)
                horizontalLineToRelative(0.882f)
                lineToRelative(1.069f, 3.636f)
                horizontalLineToRelative(3.478f)
                verticalLineToRelative(0.833f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
