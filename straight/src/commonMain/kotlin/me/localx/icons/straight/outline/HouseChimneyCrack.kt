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

public val Icons.Outline.HouseChimneyCrack: ImageVector
    get() {
        if (_houseChimneyCrack != null) {
            return _houseChimneyCrack!!
        }
        _houseChimneyCrack = Builder(name = "HouseChimneyCrack", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.68f)
                lineToRelative(-0.869f, -0.68f)
                horizontalLineToRelative(0.021f)
                lineTo(22.001f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.451f)
                lineTo(13.849f, 0.637f)
                curveToRelative(-1.088f, -0.852f, -2.609f, -0.852f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.572f, -1.151f, 1.434f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                lineTo(10.287f, 24.0f)
                lineToRelative(2.306f, -6.0f)
                horizontalLineToRelative(-4.511f)
                lineToRelative(3.973f, -6.043f)
                lineToRelative(-1.231f, 4.043f)
                lineToRelative(5.155f, -0.031f)
                lineToRelative(-2.774f, 8.031f)
                horizontalLineToRelative(10.796f)
                lineTo(24.001f, 10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.791f, -1.151f, -2.363f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-5.989f)
                lineToRelative(1.906f, -5.521f)
                curveToRelative(0.178f, -0.588f, 0.069f, -1.209f, -0.297f, -1.703f)
                curveToRelative(-0.366f, -0.493f, -0.929f, -0.776f, -1.543f, -0.776f)
                horizontalLineToRelative(-2.555f)
                lineToRelative(1.827f, -6.0f)
                horizontalLineToRelative(-3.088f)
                lineToRelative(-5.942f, 9.041f)
                curveToRelative(-0.389f, 0.586f, -0.424f, 1.334f, -0.092f, 1.954f)
                curveToRelative(0.332f, 0.62f, 0.976f, 1.005f, 1.679f, 1.005f)
                horizontalLineToRelative(1.774f)
                lineToRelative(-0.769f, 2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.043f)
                curveToRelative(0.0f, -0.31f, 0.14f, -0.597f, 0.384f, -0.788f)
                lineTo(11.384f, 2.212f)
                curveToRelative(0.363f, -0.284f, 0.869f, -0.284f, 1.232f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                curveToRelative(0.244f, 0.191f, 0.384f, 0.478f, 0.384f, 0.788f)
                verticalLineToRelative(11.957f)
                close()
            }
        }
        .build()
        return _houseChimneyCrack!!
    }

private var _houseChimneyCrack: ImageVector? = null
