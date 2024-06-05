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

public val Icons.Outline.PodiumStar: ImageVector
    get() {
        if (_podiumStar != null) {
            return _podiumStar!!
        }
        _podiumStar = Builder(name = "PodiumStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.184f)
                curveToRelative(0.414f, 1.161f, 1.514f, 2.0f, 2.816f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, 0.839f, -2.816f, 2.0f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.153f, 12.0f)
                lineToRelative(2.0f, 12.0f)
                horizontalLineToRelative(15.693f)
                lineToRelative(2.0f, -12.0f)
                horizontalLineToRelative(2.153f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(18.153f, 22.0f)
                lineTo(5.847f, 22.0f)
                lineToRelative(-1.666f, -10.0f)
                horizontalLineToRelative(15.639f)
                lineToRelative(-1.666f, 10.0f)
                close()
                moveTo(12.48f, 12.994f)
                lineToRelative(0.652f, 2.006f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.3f, 0.918f)
                lineToRelative(-1.707f, 1.241f)
                lineToRelative(0.652f, 2.007f)
                lineToRelative(-0.781f, 0.567f)
                lineToRelative(-1.713f, -1.237f)
                lineToRelative(-1.701f, 1.238f)
                lineToRelative(-0.781f, -0.567f)
                lineToRelative(0.652f, -2.007f)
                lineToRelative(-1.707f, -1.241f)
                lineToRelative(0.3f, -0.918f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.652f, -2.001f)
                lineToRelative(0.96f, -0.006f)
                close()
            }
        }
        .build()
        return _podiumStar!!
    }

private var _podiumStar: ImageVector? = null
