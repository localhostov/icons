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

public val Icons.Filled.Donate: ImageVector
    get() {
        if (_donate != null) {
            return _donate!!
        }
        _donate = Builder(name = "Donate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.486f, 2.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.644f, 8.761f)
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
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.379f, -0.271f, -0.698f, -0.644f, -0.761f)
                lineToRelative(-3.041f, -0.506f)
                curveToRelative(-1.342f, -0.224f, -2.315f, -1.374f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.644f, 0.761f)
                close()
                moveTo(24.0f, 20.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.55f, 1.014f, -2.849f, 2.409f, -3.309f)
                curveToRelative(2.189f, 2.915f, 5.664f, 4.809f, 9.591f, 4.809f)
                reflectiveCurveToRelative(7.401f, -1.894f, 9.591f, -4.809f)
                curveToRelative(1.396f, 0.46f, 2.409f, 1.76f, 2.409f, 3.309f)
                close()
            }
        }
        .build()
        return _donate!!
    }

private var _donate: ImageVector? = null
