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

public val Icons.Bold.Journey: ImageVector
    get() {
        if (_journey != null) {
            return _journey!!
        }
        _journey = Builder(name = "Journey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(3.5f, 19.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.034f, 4.0f)
                lineToRelative(-1.078f, -4.0f)
                horizontalLineToRelative(-0.889f)
                lineToRelative(-1.08f, 4.0f)
                horizontalLineToRelative(-3.987f)
                verticalLineToRelative(0.845f)
                lineToRelative(3.046f, 1.694f)
                lineToRelative(-1.195f, 3.736f)
                lineToRelative(0.661f, 0.498f)
                lineToRelative(3.002f, -2.321f)
                lineToRelative(2.989f, 2.311f)
                lineToRelative(0.688f, -0.479f)
                lineToRelative(-1.215f, -3.693f)
                lineToRelative(3.025f, -1.75f)
                verticalLineToRelative(-0.841f)
                horizontalLineToRelative(-3.966f)
                close()
                moveTo(19.5f, 14.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.019f)
                lineToRelative(0.96f, -3.0f)
                horizontalLineToRelative(-1.979f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-10.851f)
                curveToRelative(0.219f, 0.456f, 0.351f, 0.961f, 0.351f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _journey!!
    }

private var _journey: ImageVector? = null
