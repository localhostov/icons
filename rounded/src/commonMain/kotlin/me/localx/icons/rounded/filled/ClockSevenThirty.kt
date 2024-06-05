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

public val Icons.Filled.ClockSevenThirty: ImageVector
    get() {
        if (_clockSevenThirty != null) {
            return _clockSevenThirty!!
        }
        _clockSevenThirty = Builder(name = "ClockSevenThirty", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.0f, 18.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.057f)
                lineToRelative(-0.644f, 0.838f)
                curveToRelative(-0.337f, 0.438f, -0.965f, 0.519f, -1.402f, 0.184f)
                curveToRelative(-0.438f, -0.337f, -0.52f, -0.964f, -0.184f, -1.402f)
                lineToRelative(2.437f, -3.172f)
                curveToRelative(0.261f, -0.339f, 0.71f, -0.476f, 1.115f, -0.337f)
                curveToRelative(0.405f, 0.138f, 0.678f, 0.519f, 0.678f, 0.947f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _clockSevenThirty!!
    }

private var _clockSevenThirty: ImageVector? = null
