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

public val Icons.Outline.HouseCrack: ImageVector
    get() {
        if (_houseCrack != null) {
            return _houseCrack!!
        }
        _houseCrack = Builder(name = "HouseCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.681f)
                lineTo(13.849f, 0.637f)
                curveToRelative(-1.089f, -0.85f, -2.608f, -0.851f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                lineTo(10.287f, 24.0f)
                lineToRelative(2.304f, -6.0f)
                horizontalLineToRelative(-4.509f)
                lineToRelative(3.972f, -6.043f)
                lineToRelative(-1.231f, 4.043f)
                lineToRelative(5.155f, -0.031f)
                lineToRelative(-2.774f, 8.031f)
                horizontalLineToRelative(10.796f)
                lineTo(24.0f, 10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-5.989f)
                lineToRelative(1.906f, -5.521f)
                curveToRelative(0.178f, -0.588f, 0.07f, -1.209f, -0.296f, -1.702f)
                curveToRelative(-0.367f, -0.494f, -0.93f, -0.777f, -1.544f, -0.777f)
                horizontalLineToRelative(-2.554f)
                lineToRelative(1.827f, -6.0f)
                horizontalLineToRelative(-3.089f)
                lineToRelative(-5.942f, 9.042f)
                curveToRelative(-0.388f, 0.586f, -0.423f, 1.335f, -0.091f, 1.954f)
                reflectiveCurveToRelative(0.976f, 1.004f, 1.679f, 1.004f)
                horizontalLineToRelative(1.774f)
                lineToRelative(-0.768f, 2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.043f)
                curveToRelative(0.0f, -0.31f, 0.14f, -0.597f, 0.384f, -0.788f)
                lineTo(11.384f, 2.213f)
                curveToRelative(0.362f, -0.285f, 0.87f, -0.284f, 1.232f, 0.0f)
                lineToRelative(9.0f, 7.044f)
                curveToRelative(0.244f, 0.19f, 0.384f, 0.478f, 0.384f, 0.787f)
                verticalLineToRelative(11.957f)
                close()
            }
        }
        .build()
        return _houseCrack!!
    }

private var _houseCrack: ImageVector? = null
