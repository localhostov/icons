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

public val Icons.Outline.LiveAlt: ImageVector
    get() {
        if (_liveAlt != null) {
            return _liveAlt!!
        }
        _liveAlt = Builder(name = "LiveAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 4.0f)
                curveToRelative(1.87f, 0.0f, 3.627f, 0.728f, 4.949f, 2.05f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-0.944f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.591f, 0.52f, -3.535f, 1.464f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(1.322f, -1.322f, 3.079f, -2.05f, 4.949f, -2.05f)
                close()
                moveTo(18.364f, 4.636f)
                lineToRelative(1.414f, -1.414f)
                curveTo(15.489f, -1.067f, 8.511f, -1.067f, 4.222f, 3.222f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(3.51f, -3.509f, 9.219f, -3.509f, 12.729f, 0.0f)
                close()
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(11.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 12.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(7.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(14.0f, 13.36f)
                lineToRelative(-1.0f, 3.5f)
                lineToRelative(-1.0f, -3.5f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                lineToRelative(2.115f, 7.5f)
                horizontalLineToRelative(1.783f)
                lineToRelative(2.065f, -7.225f)
                lineToRelative(0.038f, -0.775f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.36f)
                close()
            }
        }
        .build()
        return _liveAlt!!
    }

private var _liveAlt: ImageVector? = null
