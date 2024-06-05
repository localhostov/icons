package me.localx.icons.straight.bold

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

public val Icons.Bold.Challenge: ImageVector
    get() {
        if (_challenge != null) {
            return _challenge!!
        }
        _challenge = Builder(name = "Challenge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 7.0f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(-3.13f, 3.12f)
                curveToRelative(-0.07f, 1.04f, -0.9f, 1.87f, -2.0f, 1.87f)
                reflectiveCurveToRelative(-2.0f, -0.93f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.82f, -1.94f, 1.87f, -2.0f)
                horizontalLineToRelative(0.01f)
                lineToRelative(3.13f, -3.12f)
                verticalLineToRelative(-1.88f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(18.74f, 15.19f)
                lineToRelative(-2.94f, 2.94f)
                curveToRelative(-0.49f, 1.65f, -2.01f, 2.87f, -3.82f, 2.87f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.81f, 1.22f, -3.32f, 2.87f, -3.82f)
                lineToRelative(2.94f, -2.94f)
                curveToRelative(-0.58f, -0.15f, -1.18f, -0.24f, -1.81f, -0.24f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -0.63f, -0.09f, -1.23f, -0.24f, -1.81f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-0.97f)
                curveToRelative(-0.581f, 1.165f, -1.402f, 2.189f, -2.406f, 3.0f)
                horizontalLineToRelative(6.376f)
                verticalLineToRelative(-12.162f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(6.162f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(6.336f)
                curveToRelative(-1.004f, -0.811f, -1.825f, -1.835f, -2.406f, -3.0f)
                horizontalLineToRelative(-0.93f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(3.336f)
                curveToRelative(1.545f, -1.248f, 3.508f, -2.0f, 5.644f, -2.0f)
                curveToRelative(0.655f, 0.0f, 1.302f, 0.072f, 1.97f, 0.222f)
                lineToRelative(3.222f, -3.222f)
                horizontalLineToRelative(2.828f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.01f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _challenge!!
    }

private var _challenge: ImageVector? = null
