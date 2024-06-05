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

public val Icons.Filled.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(1.622f, 0.0f, 2.962f, 0.246f, 4.098f, 0.753f)
                lineToRelative(2.29f, 1.021f)
                lineToRelative(-2.364f, 0.834f)
                curveToRelative(-4.136f, 1.46f, -7.023f, 5.321f, -7.023f, 9.391f)
                reflectiveCurveToRelative(2.886f, 7.928f, 7.018f, 9.389f)
                lineToRelative(2.433f, 0.86f)
                lineToRelative(-2.376f, 1.004f)
                curveToRelative(-1.239f, 0.523f, -2.458f, 0.747f, -4.074f, 0.747f)
                close()
                moveTo(19.014f, 14.415f)
                lineToRelative(2.819f, 1.948f)
                lineToRelative(0.682f, -0.476f)
                lineToRelative(-1.059f, -3.319f)
                lineToRelative(2.545f, -1.736f)
                verticalLineToRelative(-0.833f)
                horizontalLineToRelative(-3.478f)
                lineToRelative(-1.069f, -3.636f)
                horizontalLineToRelative(-0.882f)
                lineToRelative(-1.07f, 3.636f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.839f)
                lineToRelative(2.566f, 1.68f)
                lineToRelative(-0.984f, 3.351f)
                lineToRelative(0.656f, 0.494f)
                lineToRelative(2.776f, -1.948f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
