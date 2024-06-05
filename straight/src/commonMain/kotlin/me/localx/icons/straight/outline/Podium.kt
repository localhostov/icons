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
                moveTo(24.0f, 10.0f)
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
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.153f, 12.0f)
                lineToRelative(2.0f, 12.0f)
                horizontalLineToRelative(15.694f)
                lineToRelative(2.0f, -12.0f)
                horizontalLineToRelative(2.153f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(18.153f, 22.0f)
                lineTo(5.847f, 22.0f)
                lineToRelative(-1.667f, -10.0f)
                horizontalLineToRelative(15.639f)
                lineToRelative(-1.667f, 10.0f)
                close()
            }
        }
        .build()
        return _podium!!
    }

private var _podium: ImageVector? = null
