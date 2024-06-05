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

public val Icons.Outline.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 5.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(-2.0f, 0.857f)
                verticalLineToRelative(2.143f)
                curveToRelative(0.0f, 5.026f, -3.388f, 9.275f, -8.0f, 10.584f)
                verticalLineToRelative(2.416f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.046f)
                curveToRelative(-0.329f, 0.03f, -0.663f, 0.046f, -1.0f, 0.046f)
                reflectiveCurveToRelative(-0.671f, -0.016f, -1.0f, -0.046f)
                verticalLineToRelative(2.046f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.416f)
                curveTo(3.388f, 20.275f, 0.0f, 16.026f, 0.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.285f, 0.0f, 6.008f, 2.449f, 6.44f, 5.617f)
                lineToRelative(2.06f, 0.883f)
                close()
                moveTo(4.3f, 17.0f)
                horizontalLineToRelative(0.2f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.761f)
                curveToRelative(-0.952f, 0.787f, -2.172f, 1.261f, -3.5f, 1.261f)
                curveToRelative(-1.313f, 0.0f, -2.52f, -0.463f, -3.467f, -1.234f)
                curveToRelative(0.17f, 2.002f, 0.998f, 3.819f, 2.267f, 5.234f)
                close()
                moveTo(20.0f, 6.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.927f, -1.946f, 5.407f, -4.611f, 6.218f)
                curveToRelative(1.35f, 0.81f, 2.925f, 1.282f, 4.611f, 1.282f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.037f, 9.0f, -9.0f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
