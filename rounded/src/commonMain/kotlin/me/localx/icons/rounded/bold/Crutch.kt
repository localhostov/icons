package me.localx.icons.rounded.bold

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

public val Icons.Bold.Crutch: ImageVector
    get() {
        if (_crutch != null) {
            return _crutch!!
        }
        _crutch = Builder(name = "Crutch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.213f, 8.181f)
                curveToRelative(-0.02f, -0.011f, -2.019f, -1.107f, -4.075f, -3.165f)
                curveToRelative(-2.074f, -2.074f, -3.322f, -4.238f, -3.335f, -4.259f)
                curveToRelative(-0.412f, -0.718f, -1.324f, -0.97f, -2.046f, -0.559f)
                curveToRelative(-0.719f, 0.411f, -0.97f, 1.325f, -0.561f, 2.044f)
                curveToRelative(0.015f, 0.026f, 0.115f, 0.202f, 0.296f, 0.488f)
                lineToRelative(-5.332f, 5.332f)
                curveToRelative(-2.038f, 2.038f, -3.16f, 4.747f, -3.16f, 7.629f)
                verticalLineToRelative(1.188f)
                lineTo(0.439f, 21.439f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(4.561f, -4.561f)
                horizontalLineToRelative(1.188f)
                curveToRelative(2.882f, 0.0f, 5.591f, -1.122f, 7.629f, -3.16f)
                lineToRelative(5.326f, -5.326f)
                curveToRelative(0.309f, 0.19f, 0.499f, 0.293f, 0.525f, 0.307f)
                curveToRelative(0.226f, 0.122f, 0.469f, 0.179f, 0.709f, 0.179f)
                curveToRelative(0.533f, 0.0f, 1.049f, -0.285f, 1.32f, -0.787f)
                curveToRelative(0.394f, -0.728f, 0.122f, -1.638f, -0.605f, -2.032f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(-0.309f)
                curveToRelative(0.0f, -1.572f, 0.463f, -3.072f, 1.322f, -4.346f)
                lineToRelative(3.333f, 3.332f)
                curveToRelative(-1.274f, 0.86f, -2.774f, 1.322f, -4.345f, 1.322f)
                horizontalLineToRelative(-0.31f)
                close()
                moveTo(14.878f, 12.658f)
                lineToRelative(-3.536f, -3.536f)
                lineToRelative(3.928f, -3.928f)
                curveToRelative(0.501f, 0.617f, 1.086f, 1.282f, 1.747f, 1.943f)
                curveToRelative(0.61f, 0.61f, 1.214f, 1.146f, 1.776f, 1.606f)
                lineToRelative(-3.915f, 3.915f)
                close()
            }
        }
        .build()
        return _crutch!!
    }

private var _crutch: ImageVector? = null
