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

public val Icons.Filled.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.947f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.367f, -3.0f, 3.054f, -3.0f)
                reflectiveCurveToRelative(2.946f, 1.343f, 2.946f, 3.0f)
                reflectiveCurveToRelative(-1.26f, 3.0f, -2.946f, 3.0f)
                reflectiveCurveToRelative(-3.054f, -1.343f, -3.054f, -3.0f)
                close()
                moveTo(18.281f, 14.225f)
                lineToRelative(4.171f, 2.727f)
                lineToRelative(1.095f, -1.674f)
                lineToRelative(-3.829f, -2.503f)
                lineToRelative(-2.293f, -3.439f)
                curveToRelative(-0.558f, -0.836f, -1.491f, -1.336f, -2.496f, -1.336f)
                horizontalLineToRelative(-5.859f)
                curveToRelative(-1.005f, 0.0f, -1.938f, 0.5f, -2.496f, 1.336f)
                lineToRelative(-2.293f, 3.439f)
                lineTo(0.453f, 15.278f)
                lineToRelative(1.095f, 1.674f)
                lineToRelative(4.171f, -2.727f)
                lineToRelative(2.281f, -3.422f)
                verticalLineToRelative(7.656f)
                lineToRelative(-6.0f, 3.815f)
                verticalLineToRelative(1.726f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                reflectiveCurveToRelative(5.702f, 0.0f, 5.702f, 0.0f)
                lineToRelative(3.059f, 2.0f)
                horizontalLineToRelative(-6.761f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.618f)
                lineToRelative(-6.0f, -3.923f)
                verticalLineToRelative(-7.656f)
                lineToRelative(2.281f, 3.422f)
                close()
            }
        }
        .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
