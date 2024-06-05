package me.localx.icons.straight.filled

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

public val Icons.Filled.Democrat: ImageVector
    get() {
        if (_democrat != null) {
            return _democrat!!
        }
        _democrat = Builder(name = "Democrat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.987f, 8.574f)
                lineToRelative(-2.746f, -2.573f)
                curveToRelative(-0.569f, -0.632f, -1.367f, -1.0f, -2.222f, -1.0f)
                horizontalLineToRelative(-7.686f)
                lineToRelative(-2.333f, -1.75f)
                lineTo(9.0f, 1.0f)
                curveToRelative(-0.803f, 0.0f, -1.491f, 0.477f, -1.809f, 1.16f)
                curveToRelative(-0.33f, -0.101f, -0.674f, -0.16f, -1.021f, -0.16f)
                curveToRelative(-0.143f, 0.0f, -0.281f, 0.03f, -0.422f, 0.047f)
                curveToRelative(-0.339f, -0.621f, -0.991f, -1.047f, -1.748f, -1.047f)
                verticalLineToRelative(1.767f)
                curveToRelative(-0.197f, 0.158f, -0.384f, 0.336f, -0.552f, 0.539f)
                lineTo(0.683f, 7.0f)
                curveToRelative(-0.91f, 0.91f, -0.91f, 2.387f, 0.0f, 3.297f)
                curveToRelative(0.488f, 0.488f, 1.148f, 0.678f, 1.801f, 0.678f)
                curveToRelative(0.402f, 0.0f, 1.396f, -0.415f, 2.331f, -0.851f)
                lineToRelative(0.92f, 3.876f)
                lineTo(22.0f, 14.0f)
                verticalLineToRelative(-4.531f)
                lineToRelative(0.617f, 0.562f)
                lineToRelative(1.37f, -1.457f)
                close()
                moveTo(10.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-5.977f)
                lineToRelative(-0.01f, -3.0f)
                horizontalLineToRelative(-4.02f)
                lineToRelative(0.006f, 3.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _democrat!!
    }

private var _democrat: ImageVector? = null
