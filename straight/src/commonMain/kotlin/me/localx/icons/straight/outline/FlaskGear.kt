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

public val Icons.Outline.FlaskGear: ImageVector
    get() {
        if (_flaskGear != null) {
            return _flaskGear!!
        }
        _flaskGear = Builder(name = "FlaskGear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.079f, 22.0f)
                curveToRelative(0.437f, 0.754f, 0.992f, 1.428f, 1.642f, 2.0f)
                lineTo(3.043f, 24.0f)
                curveToRelative(-0.118f, -0.042f, -3.043f, -1.108f, -3.043f, -4.143f)
                curveToRelative(0.0f, -4.39f, 5.503f, -9.506f, 7.0f, -10.817f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.04f)
                curveToRelative(0.261f, 0.228f, 0.648f, 0.578f, 1.102f, 1.014f)
                curveToRelative(-0.803f, 0.09f, -1.57f, 0.298f, -2.284f, 0.608f)
                curveToRelative(-0.164f, -0.145f, -0.818f, -0.691f, -0.818f, -0.691f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(7.97f)
                lineToRelative(-0.362f, 0.3f)
                curveToRelative(-1.019f, 0.845f, -2.935f, 2.66f, -4.448f, 4.679f)
                horizontalLineToRelative(6.415f)
                curveToRelative(-0.26f, 0.63f, -0.437f, 1.301f, -0.529f, 2.0f)
                lineTo(2.896f, 16.949f)
                curveToRelative(-0.543f, 1.009f, -0.896f, 2.008f, -0.896f, 2.908f)
                curveToRelative(0.0f, 1.347f, 1.019f, 1.957f, 1.416f, 2.143f)
                horizontalLineToRelative(7.663f)
                close()
                moveTo(22.282f, 19.313f)
                lineToRelative(1.416f, 0.816f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(-1.411f, -0.813f)
                curveToRelative(-0.605f, 0.652f, -1.393f, 1.125f, -2.289f, 1.33f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(-0.896f, -0.205f, -1.685f, -0.678f, -2.289f, -1.33f)
                lineToRelative(-1.411f, 0.813f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(1.416f, -0.816f)
                curveToRelative(-0.129f, -0.418f, -0.218f, -0.853f, -0.218f, -1.313f)
                reflectiveCurveToRelative(0.089f, -0.895f, 0.218f, -1.313f)
                lineToRelative(-1.416f, -0.816f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(1.411f, 0.813f)
                curveToRelative(0.605f, -0.652f, 1.393f, -1.125f, 2.289f, -1.33f)
                verticalLineToRelative(-1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(0.896f, 0.205f, 1.685f, 0.678f, 2.289f, 1.33f)
                lineToRelative(1.411f, -0.813f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(-1.416f, 0.816f)
                curveToRelative(0.129f, 0.418f, 0.218f, 0.853f, 0.218f, 1.313f)
                reflectiveCurveToRelative(-0.089f, 0.895f, -0.218f, 1.313f)
                close()
                moveTo(20.5f, 18.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.122f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _flaskGear!!
    }

private var _flaskGear: ImageVector? = null
