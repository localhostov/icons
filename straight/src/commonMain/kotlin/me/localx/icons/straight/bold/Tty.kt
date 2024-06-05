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

public val Icons.Bold.Tty: ImageVector
    get() {
        if (_tty != null) {
            return _tty!!
        }
        _tty = Builder(name = "Tty", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 23.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 8.467f)
                verticalLineToRelative(4.533f)
                lineTo(15.0f, 13.0f)
                verticalLineToRelative(-3.449f)
                curveToRelative(-1.071f, -0.377f, -2.009f, -0.546f, -3.008f, -0.551f)
                curveToRelative(-1.013f, 0.025f, -1.953f, 0.159f, -2.992f, 0.536f)
                verticalLineToRelative(3.464f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-4.534f)
                curveToRelative(-0.001f, -1.495f, 0.596f, -2.917f, 1.681f, -4.001f)
                curveTo(3.995f, 2.151f, 7.998f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(8.005f, 1.15f, 10.319f, 3.465f)
                curveToRelative(1.085f, 1.085f, 1.682f, 2.506f, 1.681f, 4.002f)
                close()
                moveTo(21.0f, 8.467f)
                curveToRelative(0.0f, -0.695f, -0.284f, -1.362f, -0.802f, -1.88f)
                curveToRelative(-3.723f, -3.721f, -13.233f, -3.163f, -16.396f, 0.0f)
                curveToRelative(-0.518f, 0.518f, -0.802f, 1.185f, -0.802f, 1.879f)
                verticalLineToRelative(1.535f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.443f)
                lineToRelative(0.887f, -0.397f)
                curveToRelative(1.81f, -0.811f, 3.35f, -1.187f, 5.113f, -1.159f)
                curveToRelative(1.674f, 0.009f, 3.248f, 0.363f, 5.089f, 1.148f)
                lineToRelative(0.911f, 0.39f)
                verticalLineToRelative(2.462f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.534f)
                close()
            }
        }
        .build()
        return _tty!!
    }

private var _tty: ImageVector? = null
