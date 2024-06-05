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

public val Icons.Outline.GrinBeamSweat: ImageVector
    get() {
        if (_grinBeamSweat != null) {
            return _grinBeamSweat!!
        }
        _grinBeamSweat = Builder(name = "GrinBeamSweat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                lineTo(9.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveTo(7.0f, 9.946f, 7.0f, 11.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveTo(13.0f, 9.108f, 13.0f, 11.0f)
                close()
                moveTo(12.007f, 19.0f)
                curveToRelative(3.336f, 0.0f, 5.385f, -2.72f, 6.0f, -5.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, true, 12.0f, 15.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, true, -6.0f, -1.0f)
                curveTo(6.615f, 16.28f, 8.671f, 19.0f, 12.007f, 19.0f)
                close()
                moveTo(20.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 23.0f, 4.5f)
                curveTo(23.0f, 2.462f, 20.5f, 0.0f, 20.5f, 0.0f)
                reflectiveCurveTo(18.0f, 2.513f, 18.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 7.0f)
                close()
                moveTo(23.3f, 8.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, true, -1.8f, 0.885f)
                arcToRelative(10.046f, 10.046f, 0.0f, true, true, -5.24f, -5.917f)
                arcToRelative(8.608f, 8.608f, 0.0f, false, true, 0.834f, -1.816f)
                arcTo(11.991f, 11.991f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(11.892f, 11.892f, 0.0f, false, false, 23.3f, 8.0f)
                close()
            }
        }
        .build()
        return _grinBeamSweat!!
    }

private var _grinBeamSweat: ImageVector? = null
