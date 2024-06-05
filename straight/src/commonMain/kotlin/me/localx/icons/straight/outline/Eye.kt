package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.821f, 11.181f)
                verticalLineToRelative(0.0f)
                curveTo(22.943f, 9.261f, 19.5f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(1.057f, 9.261f, 0.179f, 11.181f)
                arcToRelative(1.969f, 1.969f, 0.0f, false, false, 0.0f, 1.64f)
                curveTo(1.057f, 14.739f, 4.5f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(10.943f, -6.261f, 11.821f, -8.181f)
                arcTo(1.968f, 1.968f, 0.0f, false, false, 23.821f, 11.181f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-6.307f, 0.0f, -9.25f, -5.366f, -10.0f, -6.989f)
                curveTo(2.75f, 10.366f, 5.693f, 5.0f, 12.0f, 5.0f)
                curveToRelative(6.292f, 0.0f, 9.236f, 5.343f, 10.0f, 7.0f)
                curveTo(21.236f, 13.657f, 18.292f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
