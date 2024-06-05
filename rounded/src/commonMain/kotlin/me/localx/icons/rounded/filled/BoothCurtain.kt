package me.localx.icons.rounded.filled

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

public val Icons.Filled.BoothCurtain: ImageVector
    get() {
        if (_boothCurtain != null) {
            return _boothCurtain!!
        }
        _boothCurtain = Builder(name = "BoothCurtain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.791f, 0.0f, 0.0f, 1.791f, 0.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(0.028f)
                curveToRelative(0.362f, 7.35f, 4.862f, 10.602f, 7.972f, 12.0f)
                horizontalLineToRelative(4.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(10.0f, 9.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(18.355f, 9.686f)
                curveToRelative(-1.469f, -1.319f, -2.831f, -3.368f, -3.262f, -6.535f)
                curveToRelative(-0.082f, -0.606f, 0.389f, -1.152f, 1.0f, -1.152f)
                curveToRelative(0.493f, 0.0f, 0.926f, 0.356f, 0.992f, 0.844f)
                curveToRelative(0.351f, 2.617f, 1.417f, 4.3f, 2.578f, 5.366f)
                curveToRelative(0.209f, 0.192f, 0.336f, 0.453f, 0.336f, 0.737f)
                curveToRelative(0.0f, 0.853f, -1.01f, 1.309f, -1.645f, 0.739f)
                close()
                moveTo(19.743f, 16.0f)
                horizontalLineToRelative(4.256f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.436f)
                curveToRelative(-0.974f, 0.0f, -1.697f, -0.881f, -1.541f, -1.842f)
                curveToRelative(0.428f, -2.632f, 2.555f, -4.717f, 3.721f, -6.158f)
                close()
                moveTo(8.0f, 4.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _boothCurtain!!
    }

private var _boothCurtain: ImageVector? = null
