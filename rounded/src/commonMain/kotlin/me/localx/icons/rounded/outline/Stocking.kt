package me.localx.icons.rounded.outline

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

public val Icons.Outline.Stocking: ImageVector
    get() {
        if (_stocking != null) {
            return _stocking!!
        }
        _stocking = Builder(name = "Stocking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 0.0f)
                horizontalLineToRelative(-1.966f)
                curveToRelative(-0.011f, 0.0f, -0.023f, 0.0f, -0.034f, 0.0f)
                curveToRelative(-0.011f, 0.0f, -0.023f, 0.0f, -0.034f, 0.0f)
                horizontalLineToRelative(-10.961f)
                reflectiveCurveToRelative(-0.003f, 0.0f, -0.005f, 0.0f)
                reflectiveCurveToRelative(-0.003f, 0.0f, -0.005f, 0.0f)
                horizontalLineToRelative(-1.995f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.873f)
                curveToRelative(0.0f, 0.848f, -0.538f, 1.606f, -1.338f, 1.887f)
                lineToRelative(-2.915f, 1.023f)
                curveTo(1.188f, 11.895f, -0.802f, 15.694f, 0.31f, 19.254f)
                curveToRelative(0.887f, 2.839f, 3.479f, 4.746f, 6.451f, 4.746f)
                curveToRelative(0.685f, 0.0f, 1.364f, -0.104f, 2.041f, -0.317f)
                lineToRelative(7.083f, -2.396f)
                curveToRelative(3.658f, -1.238f, 6.115f, -4.664f, 6.115f, -8.525f)
                lineTo(22.0f, 2.001f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveTo(23.553f, 0.0f, 23.0f, 0.0f)
                close()
                moveTo(20.0f, 12.761f)
                curveToRelative(0.0f, 3.003f, -1.911f, 5.667f, -4.756f, 6.63f)
                lineToRelative(-7.062f, 2.39f)
                curveToRelative(-0.462f, 0.145f, -0.94f, 0.218f, -1.422f, 0.218f)
                curveToRelative(-2.092f, 0.0f, -3.918f, -1.343f, -4.543f, -3.342f)
                curveToRelative(-0.782f, -2.507f, 0.619f, -5.183f, 3.158f, -5.976f)
                lineToRelative(2.948f, -1.034f)
                curveToRelative(1.601f, -0.562f, 2.676f, -2.078f, 2.676f, -3.774f)
                lineTo(10.999f, 2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(10.762f)
                close()
            }
        }
        .build()
        return _stocking!!
    }

private var _stocking: ImageVector? = null
