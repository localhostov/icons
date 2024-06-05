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

public val Icons.Bold.JugBottle: ImageVector
    get() {
        if (_jugBottle != null) {
            return _jugBottle!!
        }
        _jugBottle = Builder(name = "JugBottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.145f, 5.59f)
                lineToRelative(-5.145f, -0.965f)
                verticalLineToRelative(-1.625f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.831f)
                lineToRelative(-1.729f, 0.648f)
                curveToRelative(-1.358f, 0.509f, -2.271f, 1.826f, -2.271f, 3.277f)
                verticalLineToRelative(15.244f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-14.97f)
                curveToRelative(0.0f, -1.683f, -1.201f, -3.13f, -2.855f, -3.44f)
                close()
                moveTo(17.0f, 9.5f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(5.0f, 21.0f)
                verticalLineToRelative(-12.244f)
                curveToRelative(0.0f, -0.207f, 0.13f, -0.396f, 0.325f, -0.468f)
                lineToRelative(3.675f, -1.378f)
                verticalLineToRelative(-3.91f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.116f)
                lineToRelative(3.402f, 0.638f)
                curveToRelative(-0.257f, 0.528f, -0.402f, 1.121f, -0.402f, 1.747f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.345f, 0.0f, 0.68f, -0.044f, 1.0f, -0.127f)
                verticalLineToRelative(2.127f)
                lineTo(5.0f, 21.001f)
                close()
            }
        }
        .build()
        return _jugBottle!!
    }

private var _jugBottle: ImageVector? = null
