package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.BoothCurtain: ImageVector
    get() {
        if (_boothCurtain != null) {
            return _boothCurtain!!
        }
        _boothCurtain = Builder(name = "BoothCurtain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 17.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.087f)
                curveToRelative(-0.746f, 0.0f, -1.439f, -0.337f, -1.903f, -0.924f)
                curveToRelative(-0.455f, -0.577f, -0.618f, -1.314f, -0.448f, -2.023f)
                curveToRelative(0.553f, -2.309f, 2.01f, -4.15f, 3.43f, -5.474f)
                curveToRelative(-1.84f, -1.001f, -3.972f, -2.679f, -5.491f, -5.44f)
                verticalLineToRelative(10.362f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(3.0f, 5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(7.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineToRelative(-6.5f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                close()
                moveTo(21.0f, 13.493f)
                verticalLineToRelative(-7.993f)
                curveToRelative(0.0f, -1.207f, -0.86f, -2.217f, -2.0f, -2.449f)
                verticalLineToRelative(4.254f)
                curveToRelative(0.0f, 0.703f, -0.914f, 0.978f, -1.303f, 0.392f)
                curveToRelative(-0.803f, -1.208f, -1.403f, -2.756f, -1.611f, -4.697f)
                horizontalLineToRelative(-2.013f)
                curveToRelative(0.523f, 6.885f, 4.547f, 9.531f, 6.928f, 10.493f)
                close()
                moveTo(21.0f, 17.356f)
                curveToRelative(-1.05f, 0.888f, -2.203f, 2.13f, -2.786f, 3.643f)
                horizontalLineToRelative(2.286f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                verticalLineToRelative(-3.143f)
                close()
            }
        }
        .build()
        return _boothCurtain!!
    }

private var _boothCurtain: ImageVector? = null
