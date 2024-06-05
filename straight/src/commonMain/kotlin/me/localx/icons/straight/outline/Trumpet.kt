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

public val Icons.Outline.Trumpet: ImageVector
    get() {
        if (_trumpet != null) {
            return _trumpet!!
        }
        _trumpet = Builder(name = "Trumpet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 3.0f)
                curveToRelative(-1.45f, 5.017f, -5.278f, 7.114f, -8.0f, 7.706f)
                verticalLineToRelative(-1.706f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.985f)
                curveToRelative(-0.106f, 0.007f, -0.205f, 0.011f, -0.296f, 0.015f)
                horizontalLineToRelative(-1.704f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.003f)
                curveToRelative(-0.629f, 0.836f, -1.003f, 1.875f, -1.003f, 3.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                curveToRelative(0.0f, -0.817f, -0.197f, -1.588f, -0.546f, -2.27f)
                curveToRelative(2.496f, 0.875f, 5.351f, 3.14f, 6.546f, 7.27f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.0f, 0.0f, 4.042f, 0.002f, 4.093f, 0.002f)
                curveToRelative(1.611f, 0.05f, 2.907f, 1.375f, 2.907f, 2.998f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(22.0f, 16.091f)
                curveToRelative(-1.555f, -2.126f, -3.592f, -3.367f, -5.494f, -4.09f)
                curveToRelative(1.901f, -0.723f, 3.938f, -1.965f, 5.494f, -4.092f)
                verticalLineToRelative(8.181f)
                close()
            }
        }
        .build()
        return _trumpet!!
    }

private var _trumpet: ImageVector? = null
