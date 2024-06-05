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

public val Icons.Outline.Debt: ImageVector
    get() {
        if (_debt != null) {
            return _debt!!
        }
        _debt = Builder(name = "Debt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.735f, 7.576f)
                curveToRelative(-0.21f, -1.469f, -1.486f, -2.576f, -2.97f, -2.576f)
                horizontalLineToRelative(-3.617f)
                curveToRelative(0.219f, -0.456f, 0.351f, -0.961f, 0.351f, -1.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.539f, 0.133f, 1.044f, 0.351f, 1.5f)
                horizontalLineToRelative(-3.616f)
                curveToRelative(-1.483f, 0.0f, -2.76f, 1.107f, -2.969f, 2.567f)
                lineTo(0.011f, 22.35f)
                lineToRelative(-0.011f, 1.65f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-2.265f, -14.924f)
                close()
                moveTo(10.5f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(2.088f, 22.0f)
                lineToRelative(2.157f, -14.141f)
                curveToRelative(0.07f, -0.49f, 0.496f, -0.859f, 0.99f, -0.859f)
                horizontalLineToRelative(13.531f)
                curveToRelative(0.494f, 0.0f, 0.92f, 0.369f, 0.991f, 0.868f)
                lineToRelative(2.155f, 14.132f)
                lineTo(2.088f, 22.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.645f, 0.761f)
                lineToRelative(3.04f, 0.507f)
                curveToRelative(1.342f, 0.224f, 2.315f, 1.373f, 2.315f, 2.732f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.697f, -0.645f, -0.76f)
                lineToRelative(-3.04f, -0.507f)
                curveToRelative(-1.342f, -0.224f, -2.315f, -1.373f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _debt!!
    }

private var _debt: ImageVector? = null
