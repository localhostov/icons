package me.localx.icons.rounded.outline

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

public val Icons.Outline.Podium: ImageVector
    get() {
        if (_podium != null) {
            return _podium!!
        }
        _podium = Builder(name = "Podium", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                horizontalLineToRelative(-1.981f)
                curveToRelative(-0.013f, 0.0f, -0.026f, 0.0f, -0.039f, 0.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.172f)
                curveToRelative(0.413f, 1.164f, 1.524f, 2.0f, 2.828f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                horizontalLineToRelative(-0.172f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 10.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.153f)
                lineToRelative(1.304f, 7.821f)
                curveToRelative(0.403f, 2.422f, 2.478f, 4.179f, 4.932f, 4.179f)
                horizontalLineToRelative(7.223f)
                curveToRelative(2.455f, 0.0f, 4.529f, -1.757f, 4.932f, -4.179f)
                lineToRelative(1.304f, -7.821f)
                horizontalLineToRelative(1.153f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(18.571f, 19.493f)
                curveToRelative(-0.242f, 1.452f, -1.487f, 2.507f, -2.959f, 2.507f)
                horizontalLineToRelative(-7.223f)
                curveToRelative(-1.473f, 0.0f, -2.717f, -1.055f, -2.959f, -2.507f)
                lineToRelative(-1.249f, -7.493f)
                horizontalLineToRelative(15.639f)
                lineToRelative(-1.249f, 7.493f)
                close()
            }
        }
        .build()
        return _podium!!
    }

private var _podium: ImageVector? = null
