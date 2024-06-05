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

public val Icons.Filled.Debt: ImageVector
    get() {
        if (_debt != null) {
            return _debt!!
        }
        _debt = Builder(name = "Debt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.735f, 7.575f)
                curveToRelative(-0.21f, -1.468f, -1.486f, -2.575f, -2.97f, -2.575f)
                horizontalLineToRelative(-3.617f)
                curveToRelative(0.219f, -0.456f, 0.351f, -0.961f, 0.351f, -1.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.539f, 0.133f, 1.044f, 0.351f, 1.5f)
                horizontalLineToRelative(-3.617f)
                curveToRelative(-1.483f, 0.0f, -2.76f, 1.107f, -2.969f, 2.575f)
                lineTo(0.01f, 23.358f)
                lineToRelative(-0.01f, 0.642f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-2.265f, -15.925f)
                close()
                moveTo(10.5f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(10.644f, 13.761f)
                lineToRelative(3.041f, 0.506f)
                curveToRelative(1.342f, 0.224f, 2.315f, 1.374f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.379f, -0.271f, -0.698f, -0.645f, -0.761f)
                lineToRelative(-3.04f, -0.506f)
                curveToRelative(-1.342f, -0.224f, -2.315f, -1.374f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.644f, 0.761f)
                close()
            }
        }
        .build()
        return _debt!!
    }

private var _debt: ImageVector? = null
