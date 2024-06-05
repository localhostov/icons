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

public val Icons.Outline.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-10.462f)
                curveToRelative(1.719f, -0.584f, 3.0f, -1.737f, 3.0f, -3.538f)
                curveToRelative(0.0f, -2.402f, -2.254f, -5.872f, -5.804f, -5.996f)
                curveToRelative(-0.963f, -0.362f, -5.632f, -2.004f, -11.196f, -2.004f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(2.934f, 0.0f, 5.641f, 0.502f, 7.589f, 0.994f)
                curveToRelative(-0.125f, 0.062f, -0.25f, 0.126f, -0.376f, 0.19f)
                curveToRelative(-1.679f, 0.852f, -3.582f, 1.816f, -7.213f, 1.816f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(2.733f, 0.0f, 4.631f, -0.498f, 6.122f, -1.099f)
                curveToRelative(-0.08f, 0.354f, -0.122f, 0.721f, -0.122f, 1.099f)
                curveToRelative(0.0f, 0.571f, 0.097f, 1.12f, 0.274f, 1.632f)
                curveTo(5.154f, 10.764f, 3.453f, 17.618f, 3.098f, 20.329f)
                curveToRelative(-0.315f, -0.208f, -0.692f, -0.329f, -1.098f, -0.329f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 1.087f, 0.867f, 1.971f, 1.948f, 1.999f)
                curveToRelative(0.017f, 0.0f, 0.035f, 0.001f, 0.052f, 0.001f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 8.0f)
                curveToRelative(0.0f, 1.468f, -2.392f, 2.0f, -4.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(2.481f, 0.0f, 4.0f, 2.59f, 4.0f, 4.0f)
                close()
                moveTo(14.362f, 10.426f)
                curveToRelative(0.912f, 0.968f, 2.206f, 1.574f, 3.638f, 1.574f)
                curveToRelative(0.334f, 0.0f, 0.669f, -0.016f, 1.0f, -0.047f)
                verticalLineToRelative(10.047f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.002f, 22.0f)
                lineToRelative(0.002f, -0.548f)
                curveToRelative(0.001f, -0.37f, 0.146f, -8.981f, 9.358f, -11.026f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
